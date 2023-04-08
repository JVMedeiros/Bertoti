package app;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banda TomorrowLand = new Banda();
		TomorrowLand.setTocar(new Nacional());
		TomorrowLand.executar();
		
		Banda Mochakk = new Banda();
		Mochakk.setTocar(new Internacional());
		Mochakk.executar();
		
		Pista CharlotteDeWitte = new Pista();
		CharlotteDeWitte.setAssistir(new Premium());
		CharlotteDeWitte.assistir();
		
		Pista mainStage = new Pista();
		mainStage.setAssistir(new Arquibancada());
		mainStage.assistir();
		
		Pista Youphoria = new Pista();
		Youphoria.setAssistir(new Normal());
		Youphoria.assistir();
	}

}
