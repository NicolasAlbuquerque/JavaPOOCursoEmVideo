package aula03;

public class Caneta {
	
	
//		ATRIBUTOS CARACTERÍSTICAS.	
public String modelo;
public String cor;
private Float ponta1;
protected int carga1;
private boolean tampada;
public float ponta;



//	        CRIANDO METODOS.

public void status () {
System.out.println("Uma Caneta "+this.modelo);
System.out.println("Uma Caneta "+this.cor);
System.out.println("Ponta " + this.ponta);
System.out.println("carga "+this.carga1);
System.out.println("Está tampada? "+ this.tampada);
}public void rabiscar() {
if (tampada==true) {
	System.out.println("Erro não posso rabiscar");
	
}else
	System.out.println("Estou Rabiscando");

}
public void tampar() {
this.tampada=true;
}
public void destampar (){
this.tampada=false;
}

}


