package Aula05;

public class Aula05 {

	public static void main(String[] args) {

		ContaBanco p1 =new ContaBanco();
		p1.setNumConta(1);
		p1.setDono("Jubileu");
		p1.abrirConta("CC");
		p1.estadoAtual();
		ContaBanco p2 =new ContaBanco();
		p2.setNumConta(2);
		p2.setDono("Amanda");
		p2.abrirConta("CP");
		p2.estadoAtual();
		
		
		p1.depositar(100);
		p2.depositar(2500);
		//p2.sacar();
	
		//
		p2.sacar(2650);	
		p2.fecharConta();
		p2.estadoAtual();
	}

}
