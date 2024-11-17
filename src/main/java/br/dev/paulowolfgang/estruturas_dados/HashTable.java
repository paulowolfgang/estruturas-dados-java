package br.dev.paulowolfgang.estruturas_dados;

import java.util.HashMap;
// import java.util.Iterator;

/**
 * Exemplos de HashTable
 * @author Paulo Victor Silva
 */
public class HashTable {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Adicionando elementos
        hashMap.put("Brasil", 5);
        hashMap.put("Alemanha", 4);
        hashMap.put("Italia", 4);
        hashMap.put("Argentina", 2);
        hashMap.put("Franca", 2);
        hashMap.put("Uruguai", 2);
        hashMap.put("Espanha", 1);
        hashMap.put("Inglaterra", 1);
        hashMap.put("Colombia", 0);
        
        System.out.println("Chave/Valor: " + hashMap);
        
        // Verificando se uma chave está contida
        System.out.println("Buscando a chave 'Brasil': " + hashMap.containsKey("Brasil"));
        
        // Verificando se um valor está contido
        System.out.println("Buscando o valor '10': " + hashMap.containsValue(10));
        System.out.println("Buscando o valor da chave 'Brasil': " + hashMap.get("Brasil"));
        
        // Alterando um elemento
        hashMap.put("Argentina", 3);
        
        // Removendo um elemento
        hashMap.remove("Colombia");
        
        // Quantidade de elementos
        System.out.println("Total de elementos: " + hashMap.size());
        
        // Verificando se a estrutura está vazia
        System.out.println("A estrutura esta vazia? " + hashMap.isEmpty());
        
        // Navegando pelos elementos (valor)
        for (Integer valor : hashMap.values()) {
            System.out.println("Valor: " + valor);
        }
        /* OU
        for(Iterator<Integer> iterator = hashMap.values().iterator(); iterator.hasNext();)
        {
        Integer valor = iterator.next();
        System.out.println("Valor: " + valor);
        }*/
        
        // Navegando pelos elementos (chave)
        for (String chave : hashMap.keySet()) {
            System.out.println("Chave: " + chave);
        }
        /* OU
        for(Iterator<String> iterator = hashMap.keySet().iterator(); iterator.hasNext();)
        {
        String chave = iterator.next();
        System.out.println("Chave: " + chave);
        }*/
    }
}
