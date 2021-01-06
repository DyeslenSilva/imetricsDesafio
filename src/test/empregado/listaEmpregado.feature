@ListaDeEmpregados
@tag


Feature: Lista de empregadoss

  @tag1
  Scenario: Listar todos os empregados da empresa
		When eu clico no botao <listar>
		And aparece todos os empregados cadastrados

		
		
  @tag2
  Scenario Outline: Não existe empregados cadastrados 
    When eu verifico a lista e ela está vazia.

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
