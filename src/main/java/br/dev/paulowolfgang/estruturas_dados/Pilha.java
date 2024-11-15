package br.dev.paulowolfgang.estruturas_dados;

import java.util.Stack;

/**
 * Exemplos de Pilha
 * @author Paulo Victor Silva
 */
public class Pilha {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        
        // Empilhando elementos
        pilha.push("J");
        pilha.push("A");
        pilha.push("V");
        pilha.push("A");
        
        System.out.println("Valor: " + pilha);
        
        // Verificando o elemento do topo
        System.out.println("Elemento no topo: " + pilha.peek());
        
        // Desempilhando um elemento
        System.out.println("Desempilhando um elemento: " + pilha.pop());
        System.out.println("Valor: " + pilha);
        
        // Verificando a quantidade de elementos
        System.out.println("Total de elementos: " + pilha.size());
        
        // Verificando se a pilha está vazia
        System.out.println("A pilha esta vazia? " + pilha.empty());
        
        // Buscando um elemento na pilha
        // Essa busca retorna a distância do elemento até o topo (não é base 0)
        // Se não encontra o elemento, retorna '-1'
        System.out.println("Distancia ate o elemento 'J': " + pilha.search("J"));
    }
}
