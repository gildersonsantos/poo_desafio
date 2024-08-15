package dispositivos.smartphone;

import dispositivos.navegadordeinternet.NavegadorDeInternet;
import dispositivos.reprodutormusical.ReprodutorMusical;
import dispositivos.telefone.Telefone;

public class Smartphone implements Telefone, ReprodutorMusical, NavegadorDeInternet {
	
	@Override
	public void ligar() {
		System.out.println("- Ligando.");
	}

	@Override
	public void atender() {
		System.out.println("- Atendendo chamada.");
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("- Iniciando Correio de Voz.");
	}

	@Override
	public void tocar() {
		System.out.println("- Tocando música.");
	}

	@Override
	public void pausar() {
		System.out.println("- Pausando música.");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("- Selecionando música.");
	}

	@Override
	public void exibirPagina() {
		System.out.println("- Exibindo pagina.");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("- Adicionando nova aba.");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("- Atualizando pagina.");
	}

}
