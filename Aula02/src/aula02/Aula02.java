package aula02;

public class Aula02 {

	public static void main(String[] args) {
		
		
		// INSTACIANDO OBJETOS
		Caneta c1 = new Caneta();
		c1.ponta =0.5f;
		c1.cor = "Azul";
		c1.tampada = true;
		 
		c1.status();
		c1.rabiscar();
		
		System.out.println("-------------------");
		
		
		Caneta c2 = new Caneta();
		c2.ponta =0.5f;
		c2.cor = "Azul";
		c2.tampada = false;
		 
		c2.status();
		c2.rabiscar();

		
		
	}

}
