package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

	public static WebDriver driver;
	
	public static String url = "https://buscacepinter.correios.com.br/app/endereco/index.php";
	public static String urlAPI = "http://localhost:8080/students";
	public static String msg = null;
	public static String errorlMsg = null;
	public static String valor;
	public static int x;
	

	public void AcessaPagina() {
		try {
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("disable-infobars");
			chromeOptions.addArguments("start-maximized");
			driver = new ChromeDriver(chromeOptions);
			driver.get(url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
