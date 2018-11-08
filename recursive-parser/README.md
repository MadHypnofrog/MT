# Построение нисходящих парсеров

Вариант 6: Описание переменных в Си.

## Построение грамматики

S -> (type_declaration) (variables)

(type_declaration) -> name

(variables) -> (variable_name)(next_variables)

(variable_name) -> *(variable_name)

(variable_name) -> name

(next_variables) -> , (variables)

(next_variables) -> ;

Нетерминал | Описание
--- | ---
S | Стартовое состояние
(type_declaration) | Название типа
(variables) | Непустой список переменных
(variable_name) | Одна отдельная переменная
(next_variables) | Список переменных, возможно, пустой

Терминал | Описание
--- | ---
name | Возможное имя типа/переменной (alphanumeric + _)

Заметим, что в данной грамматике отсутствуют как левая рекурсия, так и правое ветвление.

## Построение лексера

Множество терминалов: name, ',', ';', '*', ' ', '$' (конец строки).

Терминал | Лексема
--- | ---
name | NAME
',' | COMMA
';' | SEMICOLON
'*' | ASTERISK
' ' | SPACE
'$' | END

## Построение парсера

### Построение множеств FIRST и FOLLOW

Нетерминал | FIRST | FOLLOW
--- | --- | ---
S | name | '$'
(type_declaration) | name | ' '
(variables) | '*', name | '$'
(variable_name) | '*', name | ',', ';' 
(next_variables) | ',', ';'| '$'

Заметим, что по теореме о связи LL(1)-грамматики с множествами FIRST и FOLLOW данная грамматика действительно является 
LL(1) (т.к. у нас нигде нет eps, то достаточно проверить первое свойство для двух пар правил из variable_name и 
next_variables)