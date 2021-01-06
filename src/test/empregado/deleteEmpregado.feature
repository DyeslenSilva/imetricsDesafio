@DeleteEmpregado


@tag
Feature: Deletar Empregado
  Cenario para descricao de exclusão de um empregado

  @tag1
  Scenario: Apagar um empregado
    Given: Eu quero apagar o cadastro de um empregado
    When Eu digito o codigo do empregado na caixa de texto <idEmpregado>
    And Eu clico no botão <apagar>
    
    Then O usuario e redirecionado para a pagina "Apagado com sucesso"
    And volta para a pagina inicial
    
  @tag2
  Scenario Outline: Empregado Não encontrado
  	When eu digito um codigo de um empregado que não está cadastrado
  	And Eu clico no botao <apagar> 
  	
  	Then O usuario permanece na pagina até digitar um valor valido
  	And permanece na mesma pagina
    

   
