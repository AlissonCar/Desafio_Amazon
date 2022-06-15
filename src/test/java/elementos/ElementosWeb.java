package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	private By pesquisar = By.xpath("//input[@id='twotabsearchtextbox']");
	private By lupa = By.xpath("//input[@id='nav-search-submit-button']");
	private By addCarrinho = By.xpath("//input[@id='add-to-cart-button']");

	public By getPesquisar() {
		return pesquisar;
	}

	public By getLupa() {
		return lupa;
	}
	
	public By getAddCarrinho() {
		return addCarrinho;
	}

}
