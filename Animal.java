package orient_obj;

public class Animal {

	String nome,reino,filo,classe,ordem,familia,genero,especies;

	public String getNome () {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}

	public String getReino () {
		return reino;
	}
	public void setReino(String reino) {
		this.reino=reino;
	}

	public String getFilo () {
		return filo;
	}
	public void setFilo(String filo) {
		this.filo=filo;
	}

	public String getClasse () {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe=classe;
	}

	public String getOrdem () {
		return ordem;
	}
	public void setOrdem(String ordem) {
		this.ordem=ordem;
	}

	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia=familia;
	}

	public String getGenero () {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero=genero;
	}

	public String getEspecies() {
		return especies;
	}
	public void setEspecies(String especies) {
		this.especies=especies;
	}

	public String Sons() {
		return "Emitindo Som";
	}
	public String Dormir() {
		return "Dormindo";
	}
	public String Andar() {
		return "Andando";
	}
	public String Comer() {
		return "Comendo";
	}

}
