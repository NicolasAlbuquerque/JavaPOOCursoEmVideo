package aula04;

public class Caneta {
	
	public String modelo;
	private Float ponta;
	private Boolean tampada;
	private String cor;

	
	
	public Caneta(String modelo, Float ponta, Boolean tampada, String cor) {
		super();
		this.modelo = modelo;
		this.ponta = ponta;
		this.tampada = tampada;
		this.cor = cor;
	}
	
	
	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public Float getPonta() {
		return ponta;
	}


	public void setPonta(Float ponta) {
		this.ponta = ponta;
	}


	public Boolean getTampada() {
		return tampada;
	}


	public void setTampada(Boolean tampada) {
		this.tampada = tampada;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public void tampar() {
		this.tampada=true;
	}
	public void destampar() {
			this.tampada=false;
	}
	
	
	public void status() {
		System.out.println("Sobre a Caneta:");
		System.out.println("Modelo: "+this.getModelo());
		System.out.println("Ponta: "+ this.ponta);
		System.out.println("Cor: "+ this.cor);
	}
	
}
