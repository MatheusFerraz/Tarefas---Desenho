package gerador.entidades;

public class Aluno {
	
	private String nomeAluno;
	private String emailAluno;
	
	public Aluno() {
		
	}
	
	public Aluno(String nomeAluno, String emailAluno, float mediaAluno) {
		this.nomeAluno = nomeAluno;
		this.emailAluno = emailAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getEmailAluno() {
		return emailAluno;
	}

	public void setEmailAluno(String emailAluno) {
		this.emailAluno = emailAluno;
	}

}
