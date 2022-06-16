package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.ElementosWeb;
import metodos.MetodosDeTestes;

public class Amazon {

	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Before
	public void setUp() throws Exception {
		metodos.iniciarTeste();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void validarProdutoCarrinho() {
		metodos.preencher(el.getPesquisar(), "iphone 13");
		metodos.clicar(el.getLupa());
		metodos.clicarPorPosicao(3);
		metodos.clicar(el.getAddCarrinho());
		metodos.validarSeguro("nao");
		metodos.validarSeContemTexto("Adicionado ao carrinho");
		metodos.clicar(el.getIrParaOCarrinho());
		metodos.fecharNavegador();

	}

	@Test
	public void excluirProdutoCarrinho() {
		metodos.preencher(el.getPesquisar(), "iphone 13");
		metodos.clicar(el.getLupa());
		metodos.clicarPorPosicao(3);
		metodos.clicar(el.getAddCarrinho());
		metodos.validarSeguro("nao");
		metodos.validarSeContemTexto("Adicionado ao carrinho");
		metodos.clicar(el.getIrParaOCarrinho());
		metodos.clicar(el.getExcluirDoCarrinho());
		metodos.fecharNavegador();

	}
	
	@Test
	public void verificarSeEstoque() {

		metodos.preencher(el.getPesquisar(), "iphone 13");
		metodos.clicar(el.getLupa());
		metodos.clicarPorPosicao(3);
		metodos.verificarEstoque("Em estoque.");
		metodos.fecharNavegador();

	}

}
