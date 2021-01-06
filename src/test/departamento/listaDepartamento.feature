@ListaDeDepartamentos

@tag
Feature: Listar todos os departamentos
		Teste que retorna todas as listas de departamentos da empresa
		
  @tag1
  Scenario: Consulta realizada com sucesso
		When eu clico no botao <listar>
		And aparece todos os departamentos cadastrados
		
  @tag2
  Scenario Outline: Não existe empregados cadastrados
        When eu verifico a lista e ela está vazia.