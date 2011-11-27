package br.com.gonow.example.model;

public class Time {
	
	private String nome;
	
	private int picture;

	public Time(String nome, int picture) {
		super();
		this.nome = nome;
		this.picture = picture;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPicture() {
		return picture;
	}

	public void setPicture(int picture) {
		this.picture = picture;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
	
}
