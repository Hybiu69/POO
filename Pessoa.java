package orient_obj;

public class Pessoa {
	
	String cpf;
	String rg;
	String nome;
	int idade;
	String sexo;
	String endereco;
	String profissao;
	
	public String getCpf(){
		return cpf;
	}
	public void setCpf(String cpf){
		this.cpf =cpf;
	}
	
	public String getRg(){
		return rg;
	}
	public void setRg(String rg){
		this.rg =rg;
	}

	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome =nome;
	}
	
	public int getIdade(){
		return idade;
	}
	public void setIdade(int idade){
		this.idade =idade;
	}
	
	public String getSexo(){
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getEndereco(){
		return endereco;
	}
	public void setEndereco(String endereco){
		this.endereco =endereco;
	}
	
	public String getProfissao(){
		return profissao;
	}
	public void setProfissao(String profissao){
		this.profissao =profissao;
	}


}