package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso C");
		curso2.setDescricao("Descrição curso C");
		curso2.setCargaHoraria(6);
		
		Conteudo conteudo1 = new Curso();
		Conteudo conteudo2 = new Mentoria();
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());

		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcap Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devGabi = new Dev();
		devGabi.setNome("Gabriella");
		devGabi.inscreverBootcaamp(bootcamp);
		System.out.println("Conteúdos Inscritos Gabriella: " + devGabi.getConteudosInscritos());
		devGabi.progredir();
		devGabi.progredir();
		System.out.println("--");
		System.out.println("Conteúdos Inscritos Gabriella: " + devGabi.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Gabriella: " + devGabi.getConteudosConcluidos());
		System.out.println("XP: " + devGabi.calcularTotalXp());
		
		System.out.println("............");
		
		Dev devJon = new Dev();
		devJon.setNome("Jonathan");
		devJon.inscreverBootcaamp(bootcamp);
		System.out.println("Conteúdos Inscritos Jonathan: " + devJon.getConteudosInscritos());
		devJon.progredir();
		devJon.progredir();
		devJon.progredir();
		System.out.println("--");
		System.out.println("Conteúdos Concluídos Jonathan: " + devJon.getConteudosConcluidos());
		System.out.println("XP: " + devJon.calcularTotalXp());
		
		
		
	}

}
