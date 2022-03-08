	//todo bootcamp vai ter conte�dos, e mentoria
	//e curso s�o conte�dos;

package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public abstract class Conteudo {
	//n�o consigo estanciar o conte�do
	
	protected static final double XP_PADRAO = 10;
	
	private String titulo;
	private String descricao;
	
	public abstract double calcularXp();
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "Mentoria [titulo = " + titulo + ", descricao = " + descricao + "]";
	}


}
