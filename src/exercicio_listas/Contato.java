package exercicio_listas;

//Para este programa, os atributos da classe Contato são:  
//⦁	Nome 
//⦁	Telefone 
//⦁	Celular 
//⦁	Email  


public class Contato {

	private String nome = "";
	private String telefone = "";
	private String celular = "";
	private String email  = "";
	
	public Contato(String nome, String telefone, String celular, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		
	}

	public String getTelefone() {
		return telefone;
	}

	public static void setTelefone(String telefone) {

	}

	public String getCelular() {
		return celular;
	}

	public static void setCelular(String celular) {
		
	}

	public String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		
	}
}
