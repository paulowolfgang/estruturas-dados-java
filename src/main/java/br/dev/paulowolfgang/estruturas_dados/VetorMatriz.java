package br.dev.paulowolfgang.estruturas_dados;

import java.util.Arrays;

/**
 * Exemplos de Vetores e Matrizes
 * @author Paulo Victor Silva
 */
public class VetorMatriz {
    
    public static void main(String[] args) {
        // Formas mais usuais de criação de Vetores e Matrizes
        int[] vetor01 = new int[3];

        int[][] matriz01 = new int[3][3];

        /* Outras formas para criar Vetores e Matrizes
        int[] vetor02 = {10, 20};
        int[] vetor03 = new int[] {1, 2, 3};

        int[][] matriz02 = new int[][] {{1, 2}, {3, 4}};
        int[][] matriz03 = {{1, 2}, {3, 4}};

        int[][][] matriz04 = new int[][][] {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        int[][][] matriz05 = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        */
        
        // Adicionando elementos
        vetor01[0] = 10;
        vetor01[1] = 20;
        vetor01[2] = 30;
        
        matriz01[0][0] = 10;
        matriz01[0][1] = 20;
        matriz01[0][2] = 30;
        
        matriz01[1][0] = 10;
        matriz01[1][1] = 20;
        matriz01[1][2] = 30;
        
        matriz01[2][0] = 10;
        matriz01[2][1] = 20;
        matriz01[2][2] = 30;
        
        System.out.println("Vetor 01: " + Arrays.toString(vetor01));
        System.out.println("Matriz 01: " + Arrays.toString(matriz01));
        
        // Acessando elementos
        int indiceVetor01 = vetor01[0];
        System.out.println("Valor na posicao [0] do Vetor 01: " + indiceVetor01);
        
        int indiceMatriz01 = matriz01[0][0];
        System.out.println("Valor na posicao [0][0] da Matriz 01: " + indiceMatriz01);
        
        // Verificando a quantidade de elementos
        int tamanhoVetor01 = vetor01.length;
        System.out.println("Tamanho do Vetor 01: " + tamanhoVetor01);
        
        int tamanhoMatriz01 = (matriz01[0].length + matriz01[1].length + matriz01[2].length);
        System.out.println("Tamanho da Matriz 01: " + tamanhoMatriz01);
    }
}
