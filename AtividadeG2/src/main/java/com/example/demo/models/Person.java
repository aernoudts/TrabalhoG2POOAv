package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
	
	@GeneratedValue
	@Id
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "idade")
	private int idade;	
	
	public Person() {
		
	}
	public Person(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}

