@tag
Feature: Listar empregado por Id
 	Quando o usuario querer vizualizr um usuário especifico
 	
  @tag1
  Scenario: Listar um empregado
   	When eu digito o Id do empregado
   	Then aparece todos os dados do funcionario cadastrado
   
  @tag2
  Scenario Outline: Empregado não encontrado
    When eu digito um determinado Id
    Then não aparece nenhum empregado cadastrado
    	

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
