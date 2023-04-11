package aula07;

public class UltraEmojiCombat {

	public static void main(String[] args) {
		
	//Declarando um Array para armazenar os Objetos.
		Lutador l[] = new Lutador[6];
		
		//Instaciando um objeto a partir da posição inicial do aerray
		
		l[0]= new Lutador("Pretty Boy", "França", 31,1.75f , 68.9f, 11, 2, 1);
			
		l[1]= new Lutador("PutScript", "Brasil", 29, 1.78f, 57.8f,23,8,4);
		l[2]= new Lutador("SnapShadoww", "Brasil", 35, 1.80f, 80.9f,8,8,1);
		l[3]= new Lutador("UFOCobol", "Brasil", 32, 1.90f, 81.6f,15,3,1);
		l[4]= new Lutador("Nerdaart", "Brasil", 27, 1.93f, 119.3f,5,0,0);
		l[5]= new Lutador("Dead Code", "Brasil", 30, 1.90f, 105.8f,25,0,0);
		
		l[5].perderLuta();
		l[5].ganharLuta();
		l[5].empatarLuta();
		l[5].status();
		


}
	}
	
