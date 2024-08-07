package orient_obj;

public class ObjetoPessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		
		pessoa1.setCpf("XXXXX");
		pessoa1.setRg("XXXXX");
		pessoa1.setNome("Tom Cruise");
		pessoa1.setIdade(60);
		pessoa1.setSexo("Masculino");
		pessoa1.setEndereco("California, USA");
		pessoa1.setProfissao("Ator");
		
		pessoa2.setCpf("YYYYYY");
		pessoa2.setRg("YYYYYY");
		pessoa2.setNome("Messi");
		pessoa2.setIdade(35);
		pessoa2.setSexo("Masculino");
		pessoa2.setEndereco("Miami, USA");
		pessoa2.setProfissao("Jogador de Futebol");

		System.out.println("----- OBJETO 1 -----");
		System.out.println(pessoa1.getCpf());
		System.out.println(pessoa1.getRg());
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getSexo());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getProfissao());

		System.out.println("----- OBJETO 2 -----");
		System.out.println(pessoa2.getCpf());
		System.out.println(pessoa2.getRg());
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getSexo());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProfissao());
	}

}