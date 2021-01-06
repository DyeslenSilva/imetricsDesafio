@DeleteDepartamento

@tag
Feature: Title of your feature
		Cenario para descricão para apagar um departamento
  @tag1
  Scenario: Title of your scenario
	  Given: Eu quero apagar o cadastro de um departamento
    When Eu digito o codigo do departamento na caixa de texto <idDepartamento>
    And Eu clico no botão <apagar>
    
    Then O usuario e redirecionado para a pagina "Apagado com sucesso"
    And volta para a pagina inicial
    
    
  @tag2
  Scenario Outline: Title of your scenario outline
  	When eu digito um codigo de um departamento que não está cadastrado
  	And Eu clico no botao <apagar> 
  	
  	Then O usuario permanece na pagina até digitar um valor valido
  	And permanece na mesma pagina
