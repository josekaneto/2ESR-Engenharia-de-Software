package POO.ex34;

public class Cliente {
    public int id;
    public String nome;
    public int idade;
    public String email;

    public Cliente(){

    }

    public Cliente(int id, String nome, int idade, String email){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String menor(){
        return "RG falso liberado, pode passar!!";
    }

    public void senha(int numero){
        String password = this.id + this.nome + this.idade + numero;
    }
}
