package orient_obj;

import java.util.Scanner;

public class ObjetoCarros {

	public static void main(String[] args) {
		
		Carros carro1 = new Carros();

		Scanner l = new Scanner(System.in);

		System.out.println("Insira sem espaçamentos e com letras maiscúlas no ínico de cada palavra");
		System.out.println("");
		System.out.println("----- OBJETO 1 -----");

		System.out.println("Cor: ");
		carro1.setCor(l.next());

		System.out.println("Placa: ");
		carro1.setPlaca(l.nextInt());

		System.out.println("Motor: ");
		carro1.setMotor(l.next());

		System.out.println("Classe: ");
		carro1.setClasse(l.next());

		System.out.println("Portas: ");
		carro1.setPortas(l.nextInt());

		System.out.println("Marcha: ");
		carro1.setMarcha(l.next());

		System.out.println("Direção: ");
		carro1.setDirecao(l.next());
		
		System.out.println("Ano: ");
		carro1.setAno(l.nextInt());
		
		System.out.println("Marca: ");
		carro1.setMarca(l.next());
		
		System.out.println("Modelo");
		carro1.setModelo(l.next());

		System.out.println("----- OBJETO 1 -----");
		System.out.println("Cor: " + carro1.getCor());
		System.out.println("Placa: " + carro1.getPlaca());
		System.out.println("Motor: " + carro1.getMotor());
		System.out.println("Classe: " + carro1.getClasse());
		System.out.println("Portas: " + carro1.getPortas());
		System.out.println("Marcha: " + carro1.getMarcha());
		System.out.println("Direção: " + carro1.getDirecao());
		System.out.println("Ano: " + carro1.getAno());
		System.out.println("Marca: " + carro1.getMarca());
		System.out.println("Modelo: " + carro1.getModelo());
	


	}

}
