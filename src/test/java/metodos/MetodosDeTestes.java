package metodos;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MetodosDeTestes {

	WebDriver driver;
	//102.0.1245.41

	public void iniciarTeste() {

		String url = "https://www.amazon.com.br/";
		String navegador = "Edge";

		if (navegador.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (navegador.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if(navegador.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("Escolha um Navegador");
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

	}

	// FECHAR NAVEGADOR
	public void fecharNavegador() {
		driver.quit();
	}

	// POSICÃO DA TABELA
	public void clicarPorPosicao(int posicao) {

		driver.findElement(By.xpath("//*[@id='search']/div[1]/div[1]/div/span[3]/div[2]/div\r\n" + "[" + posicao + "]"))
				.click();
	}

	 //VALIDAR ESTOQUE
	public void validarSeTemEstoque() {
		By msgEstoque = By.xpath("//span[text()='    Em estoque.   ']");
	}

	// VALIDAR SEGURO
	public void validarSeguro(String opcao) {

		By sim = By.xpath("//input[@aria-labelledby='attachSiAddCoverage-announce']");
		By nao = By.xpath("//input[@aria-labelledby='attachSiNoCoverage-announce']");

		if (opcao.equalsIgnoreCase("nao")) {
			clicar(nao);
		} else if (opcao.equalsIgnoreCase("sim")) {
			clicar(sim);
		}
	}

	// VALIDAR TEXTO CARRINHO
	public void validarSeContemTexto(String texto) {

		String textoCaptura = driver
				.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']"))
				.getText();
		assertEquals(textoCaptura, texto);
	}

	public void verificarEstoque(String texto) {
		String estoque = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-success']")).getText();
		assertEquals(estoque, texto);
	}
	
	//Metodo escrever
	
	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
	
	//Metodo Clicar

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

}
