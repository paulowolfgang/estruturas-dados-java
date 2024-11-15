package br.dev.paulowolfgang.estruturas_dados;

import java.util.LinkedList;

/**
 * Exemplos de Fila
 * @author Paulo Victor Silva
 */
public class Fila {
    public static void main(String[] args) {
        LinkedList<Integer> fila = new LinkedList<>();
        
        // Enfileirando elementos
        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        
        System.out.println("Valor: " + fila);
        
        // Verificando o valor da cabeça
        System.out.println("Valor da cabeca: " + fila.peek());
        
        // Desenfileirando um elemento
        fila.poll();
        System.out.println("Valor: " + fila);
        
        // Verificando a quantidade de elementos
        System.out.println("Total de elementos: " + fila.size());
        
        // Verificando se a fila está vazia
        System.out.println("A fila esta vazia? " + fila.isEmpty());
    }
}
