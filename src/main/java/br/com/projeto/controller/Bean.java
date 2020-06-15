package br.com.projeto.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named @RequestScoped
public class Bean {
	
	private String entrada;
	private String saida;
	
	public void enviar() {
		this.saida = "Sua configuração está perfeita.: " + this.entrada;
	}
	
	public String getEntrada() {
		return entrada;
	}
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	public String getSaida() {
		return saida;
	}
	public void setSaida(String saida) {
		this.saida = saida;
	}
	
	

}
