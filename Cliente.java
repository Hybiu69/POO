package orient_obj;

public class Cliente {

	String nome,cpf,rg,telefone;
	int id;
	
	public String getNome () {
		return nome;
	}
	public void setNome (String nome) {
		this.nome=nome;
	}
	
	public int getId () {
		return id;
	}
	public void setId (int id) {
		this.id=id;
	}
	
	public String getCpf () {
		return cpf;
	}
	public void setCpf (String cpf) {
		this.cpf=cpf;
	}
	
	public String getTelefone () {
		return telefone;
	}
	public void setTelefone (String telefone) {
		this.telefone=telefone;
	}
	
	public String getRg () {
		return rg;
	}
	public void setRg (String rg) {
		this.rg=rg;
	}
	
	public String Comprar () {
		return "Comprando";
	}
	
	public String Roubar () {
		return "Roubando";
	}
	public String Experimentar() {
		return "Experimentando";
	}

	public String Procurar() {
		return "Procurar";
	}
	
	public String Perguntar() {
		return "Perguntando";
	}
}