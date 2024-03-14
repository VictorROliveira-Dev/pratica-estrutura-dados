package com.alef.estruturadados.vetor.teste;

import com.alef.estruturadados.vetor.Vetor;

public class Buscaelemento {

	public static void main(String[] args) {
		Vetor vet = new Vetor(10);
		 
		try {
			vet.Adiciona("elemento 1");
			vet.Adiciona("elemento 2");
			vet.Adiciona("elemento 3");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(vet.busca(1));
		System.out.println(vet.busca(0));
	}

}
