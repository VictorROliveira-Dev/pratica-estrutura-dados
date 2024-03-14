package com.alef.estruturadados.vetor.teste;

import com.alef.estruturadados.vetor.Vetor;

public class Praticandovetores2 {

	public static void main(String[] args) {
		Vetor vet = new Vetor(2);
		
		try {
			vet.Adiciona("elemento 1");
			vet.Adiciona("elemento 2");
			vet.Adiciona("elemento 3");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
