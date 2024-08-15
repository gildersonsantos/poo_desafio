package estabelecimento;

import dispositivos.smartphone.Iphone;

public class Fabrica {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		iphone.atender();
		iphone.ligar();
		iphone.iniciarCorreioDeVoz();
		
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica();
		
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
	}

}
