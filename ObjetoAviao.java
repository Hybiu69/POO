package orient_obj;

import java.util.Scanner;

public class ObjetoAviao {

	public static void main(String[] args) {
		
		Scanner l=new Scanner (System.in);
		
		Aviao aviao1 = new Aviao();
		Aviao aviao2 = new Aviao();
		
		aviao1.setCor("Branco");
		aviao1.setModelo("Boing747");
		aviao1.setNomeEmp("Airlines");
		aviao1.setPorte("Grande Porte");
		aviao1.setAssentos(467);
		
		aviao2.setCor("Preto");
		aviao2.setModelo("B-2");
		aviao2.setNomeEmp("Government");
		aviao2.setPorte("Médio Porte");
		aviao2.setAssentos(1);
		
		System.out.println(aviao1.getCor());
		System.out.println(aviao1.getModelo());
		System.out.println(aviao1.getNomeEmp());
		System.out.println(aviao1.getPorte());
		System.out.println(aviao1.getAssentos());
		System.out.println(aviao1.voar());
		
		System.out.println("");
		
		System.out.println(aviao2.getCor());
		System.out.println(aviao2.getModelo());
		System.out.println(aviao2.getNomeEmp());
		System.out.println(aviao2.getPorte());
		System.out.println(aviao2.getAssentos());
		System.out.println(aviao2.planar());
		
	}

}
