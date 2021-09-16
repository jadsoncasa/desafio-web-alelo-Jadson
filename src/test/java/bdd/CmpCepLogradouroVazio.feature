# language: pt
@Enderecos
Funcionalidade: Validar se a tela exibe a mensagem de alerta "Informe o Endereço com no minimo 2(dois) caracteres!" ao nao informar o CEP ou ENDERECO

  Esquema do Cenário: Tentar realizar uma busca sem preencher o campo - Digite um CEP ou um Endereço
    Dado a abertura da pagina Busca Cep
    E nao preencher o campo Digite um CEP ou um Endereco <cep>
    E clicar no botao Buscar
    Então exibir menssagem de alerta <msg>

    Exemplos: 
      | cep | msg                                                    |
      | ""  | "Informe o Endereço com no mínimo 2(dois) caracteres!" |
