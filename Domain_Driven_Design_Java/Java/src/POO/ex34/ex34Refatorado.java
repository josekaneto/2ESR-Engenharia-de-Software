package POO.ex34;

import java.util.Scanner;

public class ex34Refatorado {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Cliente[] clientes = new Cliente[5];

        String nome, email;
        int id, idade;

        for (int i = 0;i<5;i++){
            Cliente c = new Cliente();
            id = i + 1;

            System.out.print("Digite o Nome do cliente: ");
            nome = sc.next();

            System.out.print("Digite a Idade do cliente: ");
            idade = sc.nextInt();

            System.out.print("Digite o Email do cliente: ");
            email = sc.next();

            clientes[Cliente] c = new Cliente(id, nome, idade, email);
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
