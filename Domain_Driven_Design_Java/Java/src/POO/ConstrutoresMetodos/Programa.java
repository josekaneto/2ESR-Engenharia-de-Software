package POO.ConstrutoresMetodos;

public class Programa {
    static void main() {
        Pessoa p1 = new Pessoa(1, "Leandro", 0);
        p1.id = 1;
        p1.nome = "leandrinho";
        p1.saldo = 0;

        Pessoa p2 = new Pessoa(2, "José", 10);

        p1.depositar(30);
        p2.depositar(10);

        System.out.println(p1.getNomeFormatado());
    }
}
