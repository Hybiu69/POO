package orient_obj;

import java.util.Scanner;

public class ObjetoPessoa_scan {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();

		Scanner l = new Scanner(System.in);

		System.out.println("Insira sem espaçamentos e com letras maiscúlas no ínico de cada palavra");
		System.out.println("");
		System.out.println("----- OBJETO 1 -----");

		System.out.println("CPF: ");
		pessoa1.setCpf(l.next());

		System.out.println("RG: ");
		pessoa1.setRg(l.next());

		System.out.println("NOME: ");
		pessoa1.setNome(l.next());

		System.out.println("IDADE: ");
		pessoa1.setIdade(l.nextInt());

		System.out.println("SEXO: ");
		pessoa1.setSexo(l.next());

		System.out.println("ENDEREÇO: ");
		pessoa1.setEndereco(l.next());

		System.out.println("PROFISSÃO: ");
		pessoa1.setProfissao(l.next());

		System.out.println("----- OBJETO 1 -----");
		System.out.println("CPF: " + pessoa1.getCpf());
		System.out.println("RG: " + pessoa1.getRg());
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Idade: " + pessoa1.getIdade());
		System.out.println("Sexo: " + pessoa1.getSexo());
		System.out.println("Endereço: " + pessoa1.getEndereco());
		System.out.println("Profissão: " + pessoa1.getProfissao());

		System.out.println("----- OBJETO 2 -----");

		System.out.println("CPF: ");
		pessoa2.setCpf(l.next());

		System.out.println("RG: ");
		pessoa2.setRg(l.next());

		System.out.println("NOME: ");
		pessoa2.setNome(l.next());

		System.out.println("IDADE: ");
		pessoa2.setIdade(l.nextInt());

		System.out.println("SEXO: ");
		pessoa2.setSexo(l.next());

		System.out.println("ENDEREÇO: ");
		pessoa2.setEndereco(l.next());

		System.out.println("PROFISSÃO: ");
		pessoa2.setProfissao(l.next());

		
		System.out.println("CPF: " + pessoa2.getCpf());
		System.out.println("RG: " + pessoa2.getRg());
		System.out.println("Nome: " + pessoa2.getNome());
		System.out.println("Idade: " + pessoa2.getIdade());
		System.out.println("Sexo: " + pessoa2.getSexo());
		System.out.println("Endereço: " + pessoa2.getEndereco());
		System.out.println("Profissão: " + pessoa2.getProfissao());



		l.close();
	}
}