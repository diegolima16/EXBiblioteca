package org.java;

public class Livros {

	private String nomeTitulo;
	private String nomeAutor;

	public String getNomeTitulo() {
		return nomeTitulo;
	}

	public  void setNomeTitulo(String nomeTitulo) {
		this.nomeTitulo = nomeTitulo;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public String setNomeAutor(String nomeAutor) {
		return this.nomeAutor = nomeAutor;
	
	}

	public void Status() {
		System.out.println("SOBRE OS LIVROS");
		System.out.println("Titulo: " + this.nomeTitulo);
		System.out.println("Autor: " + this.nomeAutor);
	}
	
}
