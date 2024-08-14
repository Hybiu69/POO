package orient_obj;

public class ObjetoAnimal {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal ();
		Animal animal2 = new Animal ();
		Animal animal3 = new Animal ();
		Animal animal4 = new Animal ();
		Animal animal5 = new Animal ();
		Animal animal6 = new Animal ();
		Animal animal7 = new Animal ();
		Animal animal8 = new Animal ();
		
		animal1.setNome("Raposa-Vermelha");
		animal1.setReino("Animalia");
		animal1.setFilo("Chordata");
		animal1.setClasse("Mammalia");
		animal1.setOrdem("Carnivora");
		animal1.setFamilia("Canidae");
		animal1.setGenero("Vulpes");
		animal1.setEspecies("Vulpes pallida");
		
		animal2.setNome("Vaca");
		animal2.setReino("Animalia");
		animal2.setFilo("Chordata");
		animal2.setClasse("Mammalia");
		animal2.setOrdem("Artiodactyla");
		animal2.setFamilia("Bovidae");
		animal2.setGenero("Bos");
		animal2.setEspecies("Bos taurus");
		
		animal3.setNome("Bezerro");
		animal3.setReino("Animalia");
		animal3.setFilo("Chordata");
		animal3.setClasse("Mammalia");
		animal3.setOrdem("Artiodactyla");
		animal3.setFamilia("Bovidae");
		animal3.setGenero("Bos");
		animal3.setEspecies("Bos taurus");
		
		animal4.setNome("Cabra-Doméstica");
		animal4.setReino("Animalia");
		animal4.setFilo("Chordata");
		animal4.setClasse("Mammalia");
		animal4.setOrdem("Artiodactyla");
		animal4.setFamilia("Bovidae");
		animal4.setGenero("Capra");
		animal4.setEspecies("C. aegagrus");
		
		animal5.setNome("Cão");
		animal5.setReino("Animalia");
		animal5.setFilo("Chordata");
		animal5.setClasse("Mammalia");
		animal5.setOrdem("Carnivora");
		animal5.setFamilia("Canidae");
		animal5.setGenero("Canis");
		animal5.setEspecies("C. lupus");
		
		animal6.setNome("Coelho-doméstico");
		animal6.setReino("Animalia");
		animal6.setFilo("Chordata");
		animal6.setClasse("Mammalia");
		animal6.setOrdem("Lagomorpha");
		animal6.setFamilia("Leporidae");
		animal6.setGenero("Oryctolagus");
		animal6.setEspecies("O. cuniculus");

		animal7.setNome("Galinha");
		animal7.setReino("Animalia");
		animal7.setFilo("Chordata");
		animal7.setClasse("Aves");
		animal7.setOrdem("Galliformes");
		animal7.setFamilia("	Phasianidae");
		animal7.setGenero("Gallus");
		animal7.setEspecies("G. gallus");
		
		animal8.setNome("Pintinho");
		animal8.setReino("Animalia");
		animal8.setFilo("Chordata");
		animal8.setClasse("Aves");
		animal8.setOrdem("Galliformes");
		animal8.setFamilia("	Phasianidae");
		animal8.setGenero("Gallus");
		animal8.setEspecies("G. gallus");
		
		
		
		
		System.out.println("Nome: "+animal1.getNome());
		System.out.println("Reino: "+animal1.getReino());
		System.out.println("Filo: "+animal1.getFilo());
		System.out.println("Classe: "+animal1.getClasse());
		System.out.println("Ordem: "+animal1.getOrdem());
		System.out.println("Família: "+animal1.getFamilia());
		System.out.println("Gênero: "+animal1.getGenero());
		System.out.println("Especies: "+animal1.getEspecies());
		System.out.println(animal1.Sons());
		
		System.out.println("xxxxxxxxxxxxxxxx");
		
		System.out.println("Nome: "+animal2.getNome());
		System.out.println("Reino: "+animal2.getReino());
		System.out.println("Filo: "+animal2.getFilo());
		System.out.println("Classe: "+animal2.getClasse());
		System.out.println("Ordem: "+animal2.getOrdem());
		System.out.println("Família: "+animal2.getFamilia());
		System.out.println("Gênero: "+animal2.getGenero());
		System.out.println("Especies: "+animal2.getEspecies());
		System.out.println(animal2.Comer());
		
		System.out.println("xxxxxxxxxxxxxxxx");
		
		System.out.println("Nome: "+animal3.getNome());
		System.out.println("Reino: "+animal3.getReino());
		System.out.println("Filo: "+animal3.getFilo());
		System.out.println("Classe: "+animal3.getClasse());
		System.out.println("Ordem: "+animal3.getOrdem());
		System.out.println("Família: "+animal3.getFamilia());
		System.out.println("Gênero: "+animal3.getGenero());
		System.out.println("Especies: "+animal3.getEspecies());
		System.out.println(animal3.Dormir());
		
		System.out.println("xxxxxxxxxxxxxxxx");
		
		System.out.println("Nome: "+animal4.getNome());
		System.out.println("Reino: "+animal4.getReino());
		System.out.println("Filo: "+animal4.getFilo());
		System.out.println("Classe: "+animal4.getClasse());
		System.out.println("Ordem: "+animal4.getOrdem());
		System.out.println("Família: "+animal4.getFamilia());
		System.out.println("Gênero: "+animal4.getGenero());
		System.out.println("Especies: "+animal4.getEspecies());
		System.out.println(animal4.Sons());
		
		System.out.println("xxxxxxxxxxxxxxxx");
		
		System.out.println("Nome: "+animal5.getNome());
		System.out.println("Reino: "+animal5.getReino());
		System.out.println("Filo: "+animal5.getFilo());
		System.out.println("Classe: "+animal5.getClasse());
		System.out.println("Ordem: "+animal5.getOrdem());
		System.out.println("Família: "+animal5.getFamilia());
		System.out.println("Gênero: "+animal5.getGenero());
		System.out.println("Especies: "+animal5.getEspecies());
		System.out.println(animal5.Sons());
		
		System.out.println("xxxxxxxxxxxxxxxx");
		
		System.out.println("Nome: "+animal6.getNome());
		System.out.println("Reino: "+animal6.getReino());
		System.out.println("Filo: "+animal6.getFilo());
		System.out.println("Classe: "+animal6.getClasse());
		System.out.println("Ordem: "+animal6.getOrdem());
		System.out.println("Família: "+animal6.getFamilia());
		System.out.println("Gênero: "+animal6.getGenero());
		System.out.println("Especies: "+animal6.getEspecies());
		System.out.println(animal6.Comer());
		
		System.out.println("xxxxxxxxxxxxxxxx");
		
		System.out.println("Nome: "+animal7.getNome());
		System.out.println("Reino: "+animal7.getReino());
		System.out.println("Filo: "+animal7.getFilo());
		System.out.println("Classe: "+animal7.getClasse());
		System.out.println("Ordem: "+animal7.getOrdem());
		System.out.println("Família: "+animal7.getFamilia());
		System.out.println("Gênero: "+animal7.getGenero());
		System.out.println("Especies: "+animal7.getEspecies());
		System.out.println(animal7.Dormir());
		
		System.out.println("xxxxxxxxxxxxxxxx");
		
		System.out.println("Nome: "+animal8.getNome());
		System.out.println("Reino: "+animal8.getReino());
		System.out.println("Filo: "+animal8.getFilo());
		System.out.println("Classe: "+animal8.getClasse());
		System.out.println("Ordem: "+animal8.getOrdem());
		System.out.println("Família: "+animal8.getFamilia());
		System.out.println("Gênero: "+animal8.getGenero());
		System.out.println("Especies: "+animal8.getEspecies());
		System.out.println(animal8.Andar());
	}

}
