package br.dev.paulowolfgang.estruturas_dados.Arvore;

/**
 * Arquivo Main
 * @author Paulo Victor Silva
 */
public class Main {
    public static void main(String[] args) {
        
        ArvoreBinaria arvore = new ArvoreBinaria();
        LeitoraDados leitoraDados = new LeitoraDados();
        
        System.out.println("Exemplo de arvore binaria ordenada.");
        
        String opcao = "";
        
        while(!opcao.equals("0")){
            System.out.println("\n");
            System.out.println("Selecione uma opcao:");
            System.out.println("1 - Criar raiz");
            System.out.println("2 - INSERT");
            System.out.println("3 - DELETE");
            System.out.println("4 - SEARCH");
            System.out.println("5 - Exibir Pre-ordem");
            System.out.println("6 - Exibir Em-ordem");
            System.out.println("7 - Exibir Pos-ordem");
            System.out.println("8 - Sair");

            opcao = leitoraDados.lerTexto();
            
            switch(opcao) {
            case "1":
                System.out.println("Digite o valor (numerico e inteiro) da raiz:");
                String raiz = leitoraDados.lerTexto();
                arvore.criarRaiz(Integer.parseInt(raiz));
                break;
            case "2":
                System.out.println("Digite o valor (numerico e inteiro) a ser inserido:");
                String novoValor = leitoraDados.lerTexto();
                arvore.adicionar(Integer.parseInt(novoValor));
                break;
            case "3":
                System.out.println("Digite o valor (numerico e inteiro) a ser pesquisado:");
                String valorPesquisado = leitoraDados.lerTexto();
                boolean resultadoPesqusa = arvore.pesquisar(Integer.parseInt(valorPesquisado));
                if (resultadoPesqusa)
                {
                    System.out.println("O valor pertence a arvore.");
                } else {
                    System.out.println("O valor nao pertence a arvore.");
                }
                break;
            case "4":
                System.out.println("Digite o valor(numerico e inteiro) a ser excluido:");
                String valorPesquisa = leitoraDados.lerTexto();
                boolean resultadoDelete = arvore.remover(Integer.parseInt(valorPesquisa));
                System.out.println("O valor foi excluido da arvore.");
                break;

            case "5":
                System.out.println("Exibindo Pre-ordem");
                arvore.exibir("Pre");
                break;
            case "6":
                System.out.println("Exibindo Em-ordem");
                arvore.exibir("Em");
                break;
            case "7":
                System.out.println("Exibindo Pos-ordem");
                arvore.exibir("Pos");
                break;
            case "8":
                System.out.println("Volte sempre e bons estudos!");
                System.exit(0);
                break;
            default:
                throw new IllegalArgumentException("Opcao desconhecida");
            }
        }
    }   
}
