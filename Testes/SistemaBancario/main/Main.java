package main;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.DAO.ClienteDAO;
import main.java.model.Cliente;
import main.java.model.Saldo;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cliente> listaClientes = new ArrayList<>();

        System.out.println("Sistema Bancario Iniciado");

        Scanner scanner = new Scanner(System.in);

        ClienteDAO clienteDAO = new ClienteDAO();

        do {
            System.out.println("===========Sistema Bancario===========");
            System.out.println("1-Adicionar cliente ao banco ");
            System.out.println("2-Remover cliente do banco ");
            System.out.println("3-Listar clientes do banco ");
            System.out.println("4-Fazer transferencia entre contas ");
            System.out.println("5-Adicionar saldo a conta ");
            System.out.println("6-Remover saldo da conta ");
            System.out.println("7-Sair ");

            System.out.print("Escolha uma opcao: ");
            int escolha = scanner.nextInt();

            System.out.println("=====================================");

            switch (escolha) {
                case 1:
                    System.out.println("Adicionando cliente ao banco ");

                    System.out.print("Digite o nome do cliente: ");
                    scanner.nextLine(); // Consumir a quebra de linha
                    String nome = scanner.nextLine();

                    System.out.print("Digite o CPF do cliente: ");
                    String cpf = scanner.nextLine();

                    System.out.print("Digite a idade do cliente: ");
                    int idade = scanner.nextInt();

                    Cliente listacliente = new Cliente(nome, cpf, idade);
                    listaClientes.add(listacliente);

                    System.out.println("Cliente adicionado com sucesso!");

                    break;
                case 2:
                    System.out.println("Removendo cliente do banco ");
                    System.out.println("Selecione o cliente a ser removido: ");
                    for (int i = 0; i < listaClientes.size(); i++) {
                        System.out.println(i + " - " + listaClientes.get(i).getNome());
                    }
                    System.out.println("Sua escolha: ");
                    int clienteRemover = scanner.nextInt();
                    listaClientes.remove(clienteRemover);
                    System.out.println("Cliente removido com sucesso!");
                    break;
                case 3:
                    System.out.println("===========Listando clientes do banco===========");
                    for (Cliente cliente : listaClientes) {
                        cliente.adicionardados();
                    }

                    System.out.println("===============================================");

                    break;
                case 4:
                    System.out.println("Fazer transferencia entre contas ");
                    System.out.println("Selecione a conta de origem: ");
                    for (int i = 0; i < listaClientes.size(); i++) {
                        System.out.println(i + " - " + listaClientes.get(i).getNome());
                    }
                    System.out.println("Sua escolha: ");
                    int contaOrigem = scanner.nextInt();
                    System.out.println("Selecione a conta de destino: ");
                    for (int i = 0; i < listaClientes.size(); i++) {
                        System.out.println(i + " - " + listaClientes.get(i).getNome());
                    }
                    System.out.println("Sua escolha: ");
                    int contaDestino = scanner.nextInt();
                    System.out.println("Digite o valor a ser transferido: ");
                    double valorTransferencia = scanner.nextDouble();
                    double saldoOrigem = listaClientes.get(contaOrigem).getSaldo();
                    if (saldoOrigem >= valorTransferencia) {
                        double novoSaldoOrigem = saldoOrigem - valorTransferencia;
                        listaClientes.get(contaOrigem).setSaldo(novoSaldoOrigem);
                        double saldoDestino = listaClientes.get(contaDestino).getSaldo();
                        double novoSaldoDestino = saldoDestino + valorTransferencia;
                        listaClientes.get(contaDestino).setSaldo(novoSaldoDestino);
                        System.out.println("Transferencia realizada com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente para a transferencia.");
                    }
                    break;
                case 5:

                    System.out.println("Adicionar saldo a conta ");

                    System.out.println("Selecione o cliente para adicionar saldo: ");
                    for (int i = 0; i < listaClientes.size(); i++) {
                        System.out.println(i + " - " + listaClientes.get(i).getNome());
                    }

                    System.out.println("Sua escolha: ");
                    int cliente = scanner.nextInt();

                    System.out.println("Digite o valor a ser adicionado: ");
                    double valorAdicionar = scanner.nextDouble();

                    double saldoAtual = listaClientes.get(cliente).getSaldo();
                    double novoSaldo = saldoAtual + valorAdicionar;
                    listaClientes.get(cliente).setSaldo(novoSaldo);

                    break;
                case 6:
                    System.out.println("Remover saldo da conta ");
                    break;
                case 7:
                    System.out.println("Saindo do sistema bancario ");
                    break;

                default:
                    break;
            }

        } while (true);

    }

}
