package Teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            // Inserir Enderecos
            Endereco endereco1 = new Endereco("Rua A", 123, "Bairro1", "Cidade1", "12345-678");
            // Adicione mais enderecos conforme necessário

            // Inserir Tipos de Imoveis
            TipoImovel tipo1 = new TipoImovel("Casa");
            // Adicione mais tipos de imoveis conforme necessário

            // Inserir Clientes
            Cliente cliente1 = new Cliente("Cliente1", "111.111.111-11", endereco1, "1234-5678", 100);
            // Adicione mais clientes conforme necessário

            // Inserir Proprietarios
            Proprietario proprietario1 = new Proprietario("Proprietario1", "222.222.222-22", endereco1, "9876-5432", "pix1");
            // Adicione mais proprietarios conforme necessário

            // Inserir Corretores
            Corretor corretor1 = new Corretor("Corretor1", "333.333.333-33", endereco1, "8765-4321", "creci1");
            // Adicione mais corretores conforme necessário

            // Inserir Imoveis
            Imovel imovel1 = new Imovel(tipo1, endereco1, 120.5, 150000.0, proprietario1);
            // Adicione mais imoveis conforme necessário

            // Inserir Contratos de Aluguel
            ContratoAluguel<String> contratoAluguel1 = new ContratoAluguel<>(imovel1, corretor1, cliente1, "12 meses", 1200.0);
            // Adicione mais contratos de aluguel conforme necessário

            // Inserir Contrato de Aluguel Comercial
            ContratoAluguelComercial contratoComercial1 = new ContratoAluguelComercial(
                    imovel1, corretor1, cliente1, "24 meses", 2500.0, "Empresa XYZ", "123.456.789/0001-01");
            // Adicione mais contratos comerciais conforme necessário

            // Criar uma coleção contendo uma lista de imóveis disponíveis
            List<Imovel> imoveisDisponiveis = new ArrayList<>();
            imoveisDisponiveis.add(imovel1);
            // Adicione mais imoveis disponiveis conforme necessário

            // Criar uma coleção contendo uma lista dos imóveis que precisam de manutenção
            List<Imovel> imoveisManutencao = new ArrayList<>();
            // Adicione os imoveis que precisam de manutencao conforme necessário

            // Ordenar os imoveis disponiveis pelo tipo do imovel
            Collections.sort(imoveisDisponiveis);

            // Listar informações
            System.out.println("1- Listar informações das classes Cliente, Corretor e Proprietários Cadastrados:");
            listarInformacoes(cliente1, corretor1, proprietario1);

            System.out.println("\n2- Listar os Contratos de Aluguéis e Contratos de Aluguéis Comerciais:");
            listarContratos(contratoAluguel1, contratoComercial1);

            System.out.println("\n3- Listar os Imóveis disponíveis para aluguel ordenados pelo tipo do Imóvel:");
            listarImoveis(imoveisDisponiveis);

            System.out.println("\n4- Listar os Imóveis que precisam de manutenção pelo tipo do Imóvel:");
            listarImoveis(imoveisManutencao);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void listarInformacoes(Cliente cliente, Corretor corretor, Proprietario proprietario) {
        System.out.println("Cliente:\n" + cliente);
        System.out.println("\nCorretor:\n" + corretor);
        System.out.println("\nProprietário:\n" + proprietario);
    }

    private static void listarContratos(ContratoAluguel<?>... contratos) {
        for (ContratoAluguel<?> contrato : contratos) {
            System.out.println(contrato);
            System.out.println("Comissão do Corretor: R$ " + contrato.calcularComissao());
            System.out.println("-----------");
        }
    }

    private static void listarImoveis(List<Imovel> imoveis) {
        for (Imovel imovel : imoveis) {
            System.out.println(imovel);
            System.out.println("-----------");
        }
    }
}
