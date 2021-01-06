@AlterarEmpregado


@tag
Feature: Alterar Empregado
  	Alterar uma determinada informação de um determinado funcionario
  
  @tag1
  Scenario: Alterando uma informacao de um empregado
    Given Eu quero alterar o nome do empregado
    When Eu digito outro nome dentro do campo <nome>
		Given Eu quero alterar o  cpf do empregado
		When Eu digito outro cpf no campo <cpf>
		Given Eu quero alterar o sexo do empregado
		When Eu digito outro sexo no campo <sexo>
		Given Eu quero alterar o cargo do empregado
		When Eu digito outro cargo no campo <cargo>
		Given Eu quero alterar a data de admissao do empregado
		When Eu digito outra data de admissao no campo <dataDeAdmissao>
		Given Eu quero alterar o salario do empregado
		When Eu digito outro valor de salario no campo <salario>
		Given Eu quero alterar a comissao do empregado
		When Eu digito outro valor de comissao no campo <comissao>
		Given Eu quero alterar o tipo de contratacao 
		When Eu digito outro tipo de contratacao no campo <tipoDeContratacao>
		
		Then o usuario é redirecionado para a pagina "Cadastrado com sucesso"
		And volta para a pagina inicial
		
  @tag2
  Scenario Outline: O dado nao pode ser alterado
  		When o dado digitado ja esta cadastrado
  		When o dado digitado for invalido
  		Then o usuario é redirecionado para a pagina "Erro ao atualizar"
			And volta para a pagina inicial  		

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
