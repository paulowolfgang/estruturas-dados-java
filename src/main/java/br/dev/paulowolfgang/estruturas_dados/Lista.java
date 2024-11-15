package br.dev.paulowolfgang.estruturas_dados;

import java.util.ArrayList;

/**
 * Exemplos de Lista
 * @author Paulo Victor Silva
 */
public class Lista {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        
        // Adicionando elementos
        lista.add("Java");
        lista.add("PHP");
        lista.add("JavaScript");
        
        System.out.println("Valor: " + lista);
        
        // Obtendo um elemento da lista
        System.out.println("Elemento na posicao [0]: " + lista.get(0));
        
        // Excluindo um elemento da lista (passando a posição a ser removida como parâmetro)
        lista.remove(1);
        System.out.println("Valor: " + lista);
        
        // Verificando a quantidade de elementos
        System.out.println("Total de elementos: " + lista.size());
        
        // Verificando se a lista está vazia
        System.out.println("A lista esta vazia? " + lista.isEmpty());
    }
}
