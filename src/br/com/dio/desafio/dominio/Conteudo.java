	//todo bootcamp vai ter conteúdos, e mentoria
	//e curso são conteúdos;

package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public abstract class Conteudo {
	//não consigo estanciar o conteúdo
	
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
