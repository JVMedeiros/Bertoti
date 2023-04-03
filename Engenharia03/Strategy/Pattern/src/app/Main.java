package app;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banda SeuCuca = new Banda();
		SeuCuca.setTocar(new Nacional());
		SeuCuca.executar();
		
		Banda OneDirection = new Banda();
		OneDirection.setTocar(new Internacional());
		OneDirection.executar();
		
		Pista CharlotteDeWitte = new Pista();
		CharlotteDeWitte.setAssistir(new Premium());
		CharlotteDeWitte.assistir();
		
		Pista NiallHoran = new Pista();
		NiallHoran.setAssistir(new Arquibancada());
		NiallHoran.assistir();
		
		Pista LouisTomlinson = new Pista();
		LouisTomlinson.setAssistir(new Normal());
		LouisTomlinson.assistir();
	}

}
