@ListaDepartamentoPorID

@tag
Feature: Lista de departamentos por ID
  Teste que retorna um departamento especifico
  
  @tag1
  Scenario: Departamento encontrado
			Given Eu preciso digitar o ID de um departamento especifico
			Then a lista retornara o departamento com o codigo indicato 


  @tag2
  Scenario Outline: Departamento não encontrado
    When eu digito um ID invalido
    Then a lista não retornara nenhum departamento

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
