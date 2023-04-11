package aula07;

public class Lutador {
	//atributos
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias,derrotas,empates;
	
	//metodos publicos
	public void apresentar() {
		System.out.println("--------------------------------");
		System.out.println("CHEGOU A HORA!");
		System.out.println("Apresentamos o Lutador: "+ this.getNome());
		System.out.println("Diretamente de: " + this.getNacionalidade());
		System.out.println("Com "+ this.getIdade()+ " anos");
		System.out.println("Pesando " + this.getPeso()+" Kg e "+ this.getAltura()+" De Altura");
		System.out.println("Com "+ this.getVitorias()+" Vitórias");
		System.out.println("Com "+ this.getEmpates()+ " Empates");
		System.out.println("E "+ this.getDerrotas()+"Derrotas");
		System.out.println("---------------------------------");
	}
	public void ganharLuta() {
		this.setVitorias(this.getVitorias()+1);
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas()+1);		
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates()+1);
		
	}
	
	public void status() {
		System.out.println(this.getNome() + " é um  Peso " + this.getCategoria());
		System.out.println("Vitórias: "+ this.getVitorias());
		System.out.println("Empates: "+ this.getEmpates());
		System.out.println("Derrotas: "+ this.getDerrotas());
		
	}
	
	
	
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
			int empates) {
		
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the nacionalidade
	 */
	public String getNacionalidade() {
		return nacionalidade;
	}
	/**
	 * @param nacionalidade the nacionalidade to set
	 */
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}
	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	/**
	 * @return the altura
	 */
	public float getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}
	/**
	 * @return the peso
	 */
	public float getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	private void setCategoria() {
		if(this.peso < 50.2) {
			this.categoria="inválido.";
		}else if(this.peso <=70.3) {
			this.categoria="Leve.";
		}else if(this.peso <=83.9) {
			this.categoria="Médio.";
		}else if (this.peso <= 120.2) {
			this.categoria="Pesado.";
		}
		
	}
	/**
	 * @return the vitorias
	 */
	public int getVitorias() {
		return vitorias;
	}
	/**
	 * @param vitorias the vitorias to set
	 */
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	/**
	 * @return the derrotas
	 */
	public int getDerrotas() {
		return derrotas;
	}
	/**
	 * @param derrotas the derrotas to set
	 */
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	/**
	 * @return the empates
	 */
	public int getEmpates() {
		return empates;
	}
	/**
	 * @param empates the empates to set
	 */
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	//metodos privados
	
	
	

}
