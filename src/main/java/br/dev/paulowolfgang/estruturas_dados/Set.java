package br.dev.paulowolfgang.estruturas_dados;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Exemplos de Set
 * @author Paulo Victor Silva
 */
public class Set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        
        set.add(1990);
        set.add(1991);
        set.add(1992);
        set.add(1993);
        set.add(1991); // Não adicionado pois essa estrutura não aceita duplicação.
        set.add(2000);
        
        System.out.println("Valores: " + set);
        
        // Busca um elemento na estrutura
        System.out.println("Buscando 1992: " + set.contains(1992));
        
        // Removendo um elemento da estrutura
        System.out.println("Removendo 2000: " + set.remove(2009));
        
        // Verificando a quantidade de elementos
        System.out.println("Total de elementos: " + set.size());
        
        // Verificando se a estrutura está vazia
        System.out.println("A estrutura esta vazia? " + set.isEmpty());
        
        // Navegando pelos elementos
        for (Integer elemento : set) {
            System.out.println("Elemento: " + elemento);
        }
        
        /* OU
        for(Iterator<Integer> iterator = set.iterator(); iterator.hasNext();)
        {
            Integer elemento = iterator.next();
            System.out.println("Elemento: " + elemento);
        }*/
    }
}
