package POO.ex34;

import java.util.Scanner;

public class ex34 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Cliente[] clientes = new Cliente[5];

        for (int i = 0;i<5;i++){
            Cliente c = new Cliente();
            c.id = i + 1;

            System.out.print("Digite o Nome do cliente: ");
            c.nome = sc.next();

            System.out.print("Digite a Idade do cliente: ");
            c.idade = sc.nextInt();

            System.out.print("Digite o Email do cliente: ");
            c.email = sc.next();

            clientes[i] = c;
        }

        System.out.println("Clientes com mais de 18 anos: ");

        for(int i=0;i<clientes.length;i++){
            if (clientes[i].idade >= 18){
                System.out.println(clientes[i].nome);
            }
        }

        sc.close();
    }
}
