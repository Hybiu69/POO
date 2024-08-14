package orient_obj;

public class Aviao {

	String cor;
	String modelo;
	String nomeEmp;
	String porte;
	int assentos;

	public String getCor(){
		return cor;
	}
	public void setCor(String cor){
		this.cor =cor;
	}

	public String getModelo (){
		return modelo;
	}
	public void setModelo(String modelo){
		this.modelo =modelo;
	}

	public String getNomeEmp(){
		return nomeEmp;
	}
	public void setNomeEmp(String nomeEmp){
		this.nomeEmp =nomeEmp;
	}

	public String getPorte(){
		return porte;
	}
	public void setPorte(String porte){
		this.porte =porte;
	}

	public int getAssentos(){
		return assentos;
	}
	public void setAssentos(int assentos){
		this.assentos =assentos;
	}

	public String voar() {
		return "Voando";
	}
	public String pousar() {
		return "Pousando";
	}
	public String planar() {
		return "Planando";
	}
	public String estacionar() {
		return "Estacionando";
	}

}
