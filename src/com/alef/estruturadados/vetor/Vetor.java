package com.alef.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
	private String[] elementos;
	/*Propriedade tamanhoVetor serve para guardar o tamanho do vetor e para saber qual o último item adicionado, ele é iniciado em 0, primeira posição do vetor.*/
	private int tamanhoVetor;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanhoVetor = 0;
	}
	/*Método para adicionar elemento no fim de um vetor:
	 * 1 -> Percorrer o vetor para verificar as posições, depois verifica se determinada posição que queremos adicionar, é nula. 
	 * 2 -> Assim que encontrar um espaço vazio ou nulo, atribui o elemento ao endereço dessa posição.*/
	/*public void Adiciona(String elemento) {
		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/
	/*Método para adicionar, de uma forma mais eficiente:*/
	/*Para adicionar exceções em Java, tem que chamar o throws Exception na assinatura do método.*/
	public void Adiciona(String elemento) throws Exception {
		if (this.tamanhoVetor < this.elementos.length) {
			this.elementos[this.tamanhoVetor] = elemento;
			this.tamanhoVetor++;
		} else {
			throw new Exception("Vetor cheio!");
		}
	}
	/*Método para adicionar feito retornando um booleano:*/
	/*public boolean Adiciona(String elemento) throws Exception {
		if (this.tamanhoVetor < this.elementos.length) {
			this.elementos[this.tamanhoVetor] = elemento;
			this.tamanhoVetor++;
			return true;
		} 
		return false;
	}*/
	public int tamanhoDoVetor() {
		return this.tamanhoVetor;
	}
	/*Formatando a exibição da string com o Stringbuilder:*/
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder(); 
		s.append("[");
		
		for (int i = 0; i < this.tamanhoVetor - 1; i++) {
			s.append(this.elementos[i]);
			s.append(",");
		}
		
		if (this.tamanhoVetor > 0) {
			s.append(this.elementos[this.tamanhoVetor - 1]);
		}
		
		s.append("]");
		return s.toString();
	}
	/*Método para buscar elemento dentro do array:*/
	public String busca(int posicao) {
		if(!(posicao >= 0 && posicao < tamanhoVetor)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		return this.elementos[posicao];
	}
	
	/*Método para verificar se o elemento existe:
	 * Método booleano.*/
	/*public Boolean verificaExistencia(String elemento) {
		for (int i = 0; i < this.tamanhoVetor; i++) {
			if (this.elementos[i].equals(elemento)) {
				return true;
			}
		}
		return false;
	}*/
	/*Método para verificar se o elemento existe:
	 * Método retornando o indice encontrado.*/
	public int verificaExistencia(String elemento) {
		for (int i = 0; i < this.tamanhoVetor; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	} 
	/*Método para inserir elemento em qualquer posição.*/
	public void adicionaPosicao(int posicao, String elemento) {
		if (!(posicao >= 0 && posicao < tamanhoVetor)) {
			throw new IllegalArgumentException("Posição inválida");	
		}	
		//Mover elementos para livrar espaço e o novo elemento ser inserido.
		for (int i = this.tamanhoVetor - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		} 
		//Adicionando elemento ao vetor:
		this.elementos[posicao] = elemento;
		//Iterando a variável do tamanho, para receber o novo tamanho do vetor.
		this.tamanhoVetor++;
	}
}