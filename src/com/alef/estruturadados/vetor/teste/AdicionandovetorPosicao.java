package com.alef.estruturadados.vetor.teste;

import com.alef.estruturadados.vetor.Vetor;

public class AdicionandovetorPosicao {

	public static void main(String[] args) {
		Vetor vet = new Vetor(10);
			 
		try {
			vet.Adiciona("1");
			vet.Adiciona("2");
			vet.Adiciona("3");
		} catch(Exception e) {
			e.printStackTrace();
		}
			
		System.out.println(vet);
		
		vet.adicionaPosicao(0, "5");
		
		System.out.println(vet);
		
		vet.adicionaPosicao(3, "10");
		
		System.out.println(vet);
	}
}
