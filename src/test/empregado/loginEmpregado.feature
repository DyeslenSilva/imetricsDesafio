@LoginEmpregado

@tag
Feature: Login do Empregado
		Descrição de como se realiza o login no sistema
	
  @tag1
  Scenario: Login realizado com sucesso
		Given Eu quero entrar na conta como empregado
		When Eu digito o "dyeslen"
		And Eu digito a "1234"
		
		Then o usuario é redirecionado para a sua pagina inicial
		

  @tag2
  Scenario Outline: Erro ao entrar
    Given Eu quero entrar na conta como empregado
    When Eu digito o usuario <usuario>
    And Eu digito a senha <senha>

		Then o usuario é redirecionado para a pagina "Usuario nao encontrado"
