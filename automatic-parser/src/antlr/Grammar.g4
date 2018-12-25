grammar Grammar;

gram returns [Grammar g]
    : GRAMMAR name=(TERMINAL | NONTERMINAL) ';' parserRules lexerRules
    {$g = new Grammar($name.text, $parserRules.rulesList, $lexerRules.rulesList, $parserRules.start); }
    ;

parserRules returns [List<ParserRule> rulesList, String start]
    : {$rulesList = new ArrayList<>();}
    (
        {boolean b = false;}
        ('!' {b = true;})? NONTERMINAL arguments ret ':' expand ';'
        {$rulesList.add(new ParserRule($NONTERMINAL.text, $arguments.args, $ret.rets, $expand.expandList));
         if (b) $start = $NONTERMINAL.text;}
    )*
    ;

arguments returns [List<Argument> args]
    : {$args = new ArrayList<>();}
        '(' typeName=(TERMINAL | NONTERMINAL) variableName=(TERMINAL | NONTERMINAL) {$args.add(new Argument($typeName.text, $variableName.text));}
        (',' typeName1=(TERMINAL | NONTERMINAL) variableName1=(TERMINAL | NONTERMINAL) {$args.add(new Argument($typeName1.text, $variableName1.text));})*
        ')'
    | {$args = new ArrayList<>();}
    ;

ret returns [List<Argument> rets]
    : {$rets = new ArrayList<>();}
        '[returns' typeName=(TERMINAL | NONTERMINAL) variableName=(TERMINAL | NONTERMINAL) {$rets.add(new Argument($typeName.text, $variableName.text));}
        (',' typeName1=(TERMINAL | NONTERMINAL) variableName1=(TERMINAL | NONTERMINAL) {$rets.add(new Argument($typeName1.text, $variableName1.text));})*
        ']'
    | {$rets = new ArrayList<>();}
    ;

expand returns [List<List<RuleNode>> expandList]
    : {$expandList = new ArrayList<>();}
        ruleNode {$expandList.add($ruleNode.list);}
        ('|' ruleNode {$expandList.add($ruleNode.list);})*
    ;

ruleNode returns [List<RuleNode> list]
    : simpleRuleNode ruleNode {$list = new ArrayList<>(); $list.add($simpleRuleNode.node); $list.addAll($ruleNode.list);}
    | {$list = new ArrayList<>();}
    ;

simpleRuleNode returns [RuleNode node]
    : CODEBLOCK {$node = new CodeBlock($CODEBLOCK.text);}
    | {$node = new Terminal();} (name=(TERMINAL | NONTERMINAL) '=' {((Terminal)$node).name = $name.text;})? TERMINAL
        {((Terminal)$node).terminalName = $TERMINAL.text;}
    | {$node = new NonTerminal();} (name=(TERMINAL | NONTERMINAL) '=' {((NonTerminal)$node).name = $name.text;})? NONTERMINAL
        {((NonTerminal)$node).nonTerminalName = $NONTERMINAL.text;}
        ('(' CODEBLOCK {((NonTerminal)$node).args = $CODEBLOCK.text.substring(1, $CODEBLOCK.text.length() - 1);} ')')?
    ;

lexerRules returns [List<LexerRule> rulesList]
    : {$rulesList = new ArrayList<>();}
        (lexerRule ';' {$rulesList.add($lexerRule.rule);})*
    ;

lexerRule returns [LexerRule rule]
    : TERMINAL '=' RANDOMSTRING {$rule = new SimpleRule($TERMINAL.text, $RANDOMSTRING.text);}
    | TERMINAL ':' RANDOMSTRING {$rule = new RegexRule($TERMINAL.text, $RANDOMSTRING.text);}
    | 'WS ->' RANDOMSTRING {$rule = new WhitespaceRule($RANDOMSTRING.text);}
    ;

GRAMMAR
    : 'grammar'
    ;

TERMINAL
    : [A-Z][a-zA-Z0-9<>_]*
    ;

NONTERMINAL
    : [a-z][a-zA-Z0-9<>_]*
    ;

CODEBLOCK
    : '{' (~[{}]+ CODEBLOCK?)* '}'
    ;

WS : [ \t\r\n] -> skip ;

RANDOMSTRING
    : '\'' ~[']+ '\''
    ;