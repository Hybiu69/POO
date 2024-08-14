package orient_obj;

public class ObjetoCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente ();
		Cliente cliente2 = new Cliente ();
		
		cliente1.setId (666);
		cliente1.setNome ("Guilherme Vieira Bicudo");
		cliente1.setTelefone ("(55)+15999635210");
		cliente1.setCpf ("32158914235");
		cliente1.setRg("357159842");
		
		cliente2.setId (987);
		cliente2.setNome ("Wandherley Valter Thómaz Ribeiro ");
		cliente2.setTelefone ("(55)+1599571307");
		cliente2.setCpf ("52398714502");
		cliente2.setRg("147369852");
		
		System.out.println("ID: "+cliente1.getId());
		System.out.println("Nome: "+cliente1.getNome());
		System.out.println("Telefone: "+cliente1.getTelefone());
		System.out.println("Cpf: "+cliente1.getCpf());
		System.out.println("Rg: "+cliente1.getRg());
		System.out.println(cliente1.Roubar());
		
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx");

		System.out.println("ID: "+cliente2.getId());
		System.out.println("Nome: "+cliente2.getNome());
		System.out.println("Telefone: "+cliente2.getTelefone());
		System.out.println("Cpf: "+cliente2.getCpf());
		System.out.println("Rg: "+cliente2.getRg());
		System.out.println(cliente2.Procurar());
		

	}

}
