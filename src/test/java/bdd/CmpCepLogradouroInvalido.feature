# language: pt
@Enderecos
Funcionalidade: Validar se a tela exibe a mensagem de alerta "Não há dados a serem exibidos"

  Esquema do Cenário: Tentar realizar uma busca preencher o campo - Digite um CEP ou um Endereco com dados invalidos
    Dado a abertura da pagina Busca Cep
    E preencher o campo Digite um CEP ou um Endereco com cep - <cep> invalido
    E clicar no botao Buscar
    Então exibir menssagem de CEP ou Logradouro nao encontrado <msg>

    Exemplos: 
      | cep      | msg                             |
      | "123456" | "Não há dados a serem exibidos" |
