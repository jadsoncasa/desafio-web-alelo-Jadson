# language: pt
@Enderecos
Funcionalidade: Validar se a tela exibe as informações do endereço de um CEP valido

  Esquema do Cenário: Realizar uma busca pelo CEP valido
    Dado a abertura da pagina Busca Cep
    E preencher o campo Digite um CEP ou um Endereco com valor <cep> valido
    E clicar no botao Buscar
    Então retorna Logradouro <logradouro>, Bairro <bairro>, UF <uf> e cep <cep>.

    Exemplos: 
      | logradouro          | bairro           | uf            | cep         |
      | "Rua Edmundo Sousa" | "Nova República" | "São Luís/MA" | '65090-617' |