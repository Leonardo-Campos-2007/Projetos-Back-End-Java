package main.java.model;

public class Cliente extends Saldo {

    private String nome;
    private String cpf;
    private int idade;

    public Cliente(String nome, String cpf, int idade) {
        super(0.0); // Inicializa o saldo com 0.0
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    
    public void adicionardados() {
        System.out.println("Nome do cliente: " + getNome());
        System.out.println("CPF do cliente: " + getCpf());
        System.out.println("Idade do cliente: " + getIdade());
        System.out.println("Saldo do cliente: " + getSaldo());
    }
}