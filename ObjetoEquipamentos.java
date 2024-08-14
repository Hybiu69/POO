package orient_obj;

public class ObjetoEquipamentos {

	public static void main(String[] args) {
		
		Equipamentos cadeira1 = new Equipamentos ();
		Equipamentos cadeira2 = new Equipamentos ();
		
		cadeira1.setCor("Cor: Preto");
		cadeira1.setMaterial("Material: Plástico");
		cadeira1.setTipo("Tipo: Escritório");
		cadeira1.setTamanho("Tamanho: Pequena");
		
		cadeira2.setCor("Cor: Vermelho");
		cadeira2.setMaterial("Material: Tecido");
		cadeira2.setTipo("Tipo: Gamer");
		cadeira2.setTamanho("Tamanho: Grande");
		
		System.out.println(cadeira1.getCor());
		System.out.println(cadeira1.getMaterial());
		System.out.println(cadeira1.getTipo());
		System.out.println(cadeira1.getTamanho());
		
		System.out.println("");
		
		System.out.println(cadeira2.getCor());
		System.out.println(cadeira2.getMaterial());
		System.out.println(cadeira2.getTipo());
		System.out.println(cadeira2.getTamanho());
	}

}
