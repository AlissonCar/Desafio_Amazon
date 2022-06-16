package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	private By pesquisar = By.xpath("//input[@id='twotabsearchtextbox']");
	private By lupa = By.xpath("//input[@id='nav-search-submit-button']");
	private By addCarrinho = By.xpath("//input[@id='add-to-cart-button']");
	private By IrParaOCarrinho = By.xpath("//div[@id='nav-cart-text-container']");
	private By excluirDoCarrinho = By.xpath("//input[@aria-label='Excluir Apple iPhone 13 (512&nbsp;GB) - Rosa']");

	public By getPesquisar() {
		return pesquisar;
	}

	public By getLupa() {
		return lupa;
	}

	public By getAddCarrinho() {
		return addCarrinho;
	}

	public By getIrParaOCarrinho() {
		return IrParaOCarrinho;
	}
	
	public By getExcluirDoCarrinho() {
		return excluirDoCarrinho;
	}

}
