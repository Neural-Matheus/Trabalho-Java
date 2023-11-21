package Teste;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Solicitar informações da pessoa
            System.out.println("Digite as informações da Pessoa:");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            System.out.print("Endereço - Rua: ");
            String rua = scanner.nextLine();
            System.out.print("Endereço - Número: ");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            scanner.close();
            // Criar endereço
            Endereco endereco = new Endereco(rua, numero, "", "", "");

            // Criar pessoa
            Pessoa pessoa = new Cliente(nome, cpf, endereco, "", 0);

            // Exibir informações da pessoa
            System.out.println("\nInformações da Pessoa Cadastrada:");
            System.out.println(pessoa);
            	
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
