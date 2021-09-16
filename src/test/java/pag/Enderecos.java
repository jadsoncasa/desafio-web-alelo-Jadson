package pag;

import static org.junit.Assert.assertEquals;

//import java.io.Console;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;

import config.Base;
import cucumber.annotation.pt.Dado;
import cucumber.annotation.pt.E;
import cucumber.annotation.pt.Então;
import pageObject.EnderecoPage;

public class Enderecos extends Base {

	EnderecoPage correios = new EnderecoPage();

	// CepComSucesso
	@Dado("a abertura da pagina Busca Cep")
	public void PagCorreios() {
		correios.AcessaPagina();
	}

	@Dado("preencher o campo Digite um CEP ou um Endereco com valor {string} valido")
	public void PreencherCampoCepEnderecoValido(String valor) {
		correios.logradouroValido(valor);
	}
	@E("clicar no botao Buscar")
	public void clicarBuscar() {
		correios.clicarBtnBuscar();
	}

	@Então("retorna Logradouro {string}, Bairro {string}, UF {string} e cep {string}.")
	public void retornaEndereco(String logradouro, String bairro, String uf, String cep) throws InterruptedException {

		for (x = 1; x <= 4; x++) {
			correios.retornoMsgCepLogradouroSucesso(logradouro, bairro, uf, cep, x);
			if (x == 1)
				assertEquals(valor,logradouro);
			if (x == 2)
				assertEquals(valor, bairro);
			if (x == 3)
				assertEquals(valor, uf);
			if (x == 4)
				assertEquals(valor, cep);
		}
		correios.closePage();
	}

	// CmpCepLogradouroInvalido
	@Dado("preencher o campo Digite um CEP ou um Endereco com cep - {string} invalido")
	public void PreencherCampoCepEnderecoInvalido(String cep) throws InterruptedException {
		correios.Cep_logradouroInvalido(cep);
	}

	@Então("exibir menssagem de alerta {string}")
	public void ValidarMenssagemAlerta(String msgBdd) {
		correios.retornoMsg();
		assertEquals(msg, msgBdd);
		correios.closePage();
	}

	// CmpCepLogradouroVazio
	@Dado("nao preencher o campo Digite um CEP ou um Endereco {string}")
	public void naoPreencherCampoCepEndereco(String cep) {
	}

	// ListaLogradouro
	@Então("retorna a lista de logradouro {string}")
	public void ValidarListaLogradouro(String logradouro) throws InterruptedException {
		correios.listEndereco();
		msg.contains(logradouro);
		correios.closePage();
	}

	@Então("exibir menssagem de CEP ou Logradouro nao encontrado {string}")
	public void exibirMenssagemCpfLogradouroNaoEncontrado(String msgBDD) throws InterruptedException {
		correios.retornoMsgNaoEncontrado();
		assertEquals(msg,msgBDD);
		correios.closePage();
	}
}
