# ���������� ���������� ��������

������� 6: �������� ���������� � ��.

## ���������� ����������

S -> (type_declaration) (variables)

(type_declaration) -> name

(variables) -> (variable_name)(next_variables)

(variable_name) -> *(variable_name)

(variable_name) -> name

(next_variables) -> , (variables)

(next_variables) -> ;

���������� | ��������
--- | ---
S | ��������� ���������
(type_declaration) | �������� ����
(variables) | �������� ������ ����������
(variable_name) | ���� ��������� ����������
(next_variables) | ������ ����������, ��������, ������

�������� | ��������
--- | ---
name | ��������� ��� ����/���������� (alphanumeric + _)

�������, ��� � ������ ���������� ����������� ��� ����� ��������, ��� � ������ ���������.

## ���������� �������

��������� ����������: name, ',', ';', '*', ' ', '$' (����� ������).

�������� | �������
--- | ---
name | NAME
',' | COMMA
';' | SEMICOLON
'*' | ASTERISK
' ' | SPACE
'$' | END

## ���������� �������

### ���������� �������� FIRST � FOLLOW

���������� | FIRST | FOLLOW
--- | --- | ---
S | name | '$'
(type_declaration) | name | ' '
(variables) | '*', name | '$'
(variable_name) | '*', name | ',', ';' 
(next_variables) | ',', ';'| '$'

�������, ��� �� ������� � ����� LL(1)-���������� � ����������� FIRST � FOLLOW ������ ���������� ������������� �������� 
LL(1) (�.�. � ��� ����� ��� eps, �� ���������� ��������� ������ �������� ��� ���� ��� ������ �� variable_name � 
next_variables)