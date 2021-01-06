@AlterarDepartamento

@tag
Feature: Alterar Departamento
		Feature para descrever a alteracao de um departamento
	
  @tag1
  Scenario: Departamento alterado com sucesso
   Given Eu quero alterar o nome do departamento
   When Eu digito outro nome dentro do campo <nomeDepartamento>
 		Given eu quero alterar o local.
 		When eu digito outro local dentro do campo <local>
 		Given eu quero alterar o orcamento
 		When eu digito outro orcamento no campo <orcamento>

  @tag2
  Scenario Outline: Title of your scenario outline
			When o dado digitado ja esta cadastrado
  		When o dado digitado for invalido
  		Then o usuario é redirecionado para a pagina "Erro ao atualizar"
			And volta para a pagina inicial  
    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
