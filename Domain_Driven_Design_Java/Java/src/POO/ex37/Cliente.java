package POO.ex37;

public class Cliente {
    public String agencia;
    public String conta;
    public double saldo;
    public String nome;

    public Cliente(){

    }

    public Cliente(String agencia, String conta, double saldo, String nome){
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.nome = nome;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if(this.saldo > valor){
            System.out.println("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

    public Double emitirSaldo(){
        return this.saldo;
    }
}
