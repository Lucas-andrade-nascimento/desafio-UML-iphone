import models.IPhone;

public class App {
    public static void main(String[] args) throws Exception {
    	IPhone iPhone1 = new IPhone();
    	
    	String numero = "99887-5511";
    	
    	iPhone1.ligar(numero);
    	iPhone1.atender();
    	iPhone1.iniciarCorreioVoz();
    	
    	iPhone1.tocar();
    	iPhone1.pausar();
    	iPhone1.selecionarMusica("bohemian rhapsody");
    	
    	iPhone1.exibirPagina("www.google.com");
    	iPhone1.adicionarNovaAba();
    	iPhone1.atualizarPagina();
    	
    	
    }
}
