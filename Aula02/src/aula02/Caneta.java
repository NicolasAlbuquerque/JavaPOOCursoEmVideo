package aula02;

public class Caneta {  //NOME DA CLASSE, que será utilizada par aa criação do OBJETO CANETA.
	
	
// 			ATRIBUTOS CARACTERÍSTICAS.	
	public String modelo;
	public String cor;
	public Float ponta1;
	public int carga1;
	public boolean tampada;
	public float ponta;
	
	
	
	//	        CRIANDO METODOS.
	
	void status () {
		System.out.println("Uma Caneta "+this.cor);
		
		System.out.println("Ponta " + this.ponta);
		System.out.println("carga "+this.carga1);
		System.out.println("Está tampada? "+ this.tampada);
	}
	void rabiscar() {
		if (tampada==true) {
			System.out.println("Erro não posso rabiscar");
			
		}else
			System.out.println("Estou Rabiscando");
		
	}
	void tampar() {
		this.tampada=true;
	}
	void destampar (){
		this.tampada=false;
	}
	
}
