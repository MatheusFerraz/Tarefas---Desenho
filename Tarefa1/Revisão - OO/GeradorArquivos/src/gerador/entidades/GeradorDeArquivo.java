package gerador.entidades;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GeradorDeArquivo {

	public static void main(String[] args) throws IOException {
		ArrayList<Aluno> listaAlunos = new ArrayList<>();

		listaAlunos = gerarListaAlunos();

		gerarArquivo(listaAlunos);

	}

	private static ArrayList<Aluno> gerarListaAlunos() {
		ArrayList<Aluno> listaAlunos = new ArrayList<>();
		int quantidadeAlunos = 0;
		String nomeAluno;
		String emailALuno;

		Scanner entradaQtdAlunos = new Scanner(System.in);
		Scanner entradaNome = new Scanner(System.in);
		Scanner entradaEmail = new Scanner(System.in);

		System.out
				.println("Informe a quantidade de alunos a serem registrados: "
						+ "\n");
		quantidadeAlunos = entradaQtdAlunos.nextInt();

		for (int i = 0; i < quantidadeAlunos; i++) {
			Aluno aluno = new Aluno();
			System.out.println("Informe o nome do aluno: " + "\n");
			nomeAluno = entradaNome.next();
			System.out.println("Informe o email do aluno: " + "\n");
			emailALuno = entradaEmail.next();
			aluno.setNomeAluno(nomeAluno);
			aluno.setEmailAluno(emailALuno);
			listaAlunos.add(aluno);
		}

		entradaQtdAlunos.close();
		entradaNome.close();
		entradaEmail.close();

		return listaAlunos;
	}

	private static void gerarArquivo(ArrayList<Aluno> listaAlunos)
			throws IOException {
		File arquivoInformacoes = new File(
				"/home/matheus/Documentos/UNB/UNB - 6º SEMESTRE/Desenho/Arquivos/Alunos.txt");

		FileWriter fwriter = new FileWriter(arquivoInformacoes, false);

		PrintWriter pwriter = new PrintWriter(fwriter);

		for (Aluno aluno : listaAlunos) {
			pwriter.println("Nome: " + aluno.getNomeAluno() + " Email: "
					+ aluno.getEmailAluno());
		}

		pwriter.close();
		
		System.out.println("Informações dos alunos escritas no arquivo Alunos.txt.");
	}

}
