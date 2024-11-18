package br.dev.paulowolfgang.estruturas_dados.Arvore;

import java.util.Scanner;

/**
 * Leitora de Dados
 * @author Paulo Victor Silva
 */
public final class LeitoraDados {
    
    private Scanner scanner;
    
    public LeitoraDados()
    {
        scanner = new Scanner(System.in);
    }
    
    public String lerTexto()
    {
        String texto = scanner.nextLine();
        return texto;
    }
}
