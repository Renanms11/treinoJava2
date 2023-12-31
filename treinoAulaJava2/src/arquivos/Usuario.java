package arquivos;

import java.io.Serializable;
import java.util.Objects;

public class Usuario implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private String login;
	private String nome;
	private String senha;
	private String cpf;
	
	public Usuario(){
		
	}
	
	
	
	public Usuario(String login,String nome, String senha, String cpf) {
		super();
		this.login = login;
		this.nome= nome;
		this.senha = senha;
		this.cpf = cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	@Override
	public int hashCode() {
		return Objects.hash(cpf, login, senha);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(login, other.login)
				&& Objects.equals(senha, other.senha);
	}



	@Override
	public String toString() {
		return "Usuario [login=" + login + ", nome=" + nome + ", senha=" + senha + ", cpf=" + cpf + "]";
	}
	
	
	
	
	
	
	
	
}
