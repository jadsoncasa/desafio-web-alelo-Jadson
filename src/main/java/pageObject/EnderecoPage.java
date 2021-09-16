package pageObject;

import org.openqa.selenium.By;

import config.Base;

public class EnderecoPage extends Base {

	public EnderecoPage() {
	}

	public EnderecoPage acessarPaginaCorreios() {
		AcessaPagina();
		return this;
	}

	public EnderecoPage clicarBtnBuscar() {
		driver.findElement(By.name("btn_pesquisar")).click();
		return this;
	}

	public EnderecoPage retornoMsg() {
		msg = driver.findElement(By.className("msg")).getText();
		return this;
	}

	public EnderecoPage Cep_logradouroInvalido(String cep) throws InterruptedException {
		driver.findElement(By.name("endereco")).click();
		driver.findElement(By.name("endereco")).sendKeys(cep);
		return this;
	}

	public EnderecoPage logradouroValido(String valor) {
		driver.findElement(By.name("endereco")).click();
		driver.findElement(By.name("endereco")).sendKeys(valor);
		return this;
	}

	public EnderecoPage retornoMsgNaoEncontrado() throws InterruptedException {
		Thread.sleep(2000);
		msg = driver.findElement(By.id("mensagem-resultado")).getText();
		return this;
	}

	public EnderecoPage closePage() {
		driver.quit();
		return this;
	}

	public EnderecoPage retornoMsgCepLogradouroSucesso(String logradouro,String bairro,String uf,String cep, int x) throws InterruptedException {
		Thread.sleep(2000);		
			valor = driver.findElement(By.xpath("//*[@id=\"resultado-DNEC\"]/tbody/tr/td["+x+"]")).getText();
		return this;
	}

	public EnderecoPage listEndereco() throws InterruptedException {
		int i=1;
		Thread.sleep(5000);		
		while (i != 100000) {
			try {
				msg = driver.findElement(By.xpath("//*[@id=\"resultado-DNEC\"]/tbody/tr[" + i + "]/td[1]")).getText();
			} catch (Exception e) {
				i = 100000;continue;
			}
			i++;
		}
		return this;
	}
}
