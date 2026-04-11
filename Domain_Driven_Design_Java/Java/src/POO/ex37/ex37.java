package POO.ex37;

import java.sql.SQLClientInfoException;
import java.util.Scanner;

public class ex37 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Cliente[] clientes = new Cliente[20];

        int id = 0;

        while(true){
            System.out.println("=== Java Banking - Menu ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Emitir saldo");
            System.out.println("5 - Sair");
            System.out.print("Digite a opção desejada: ");
            var opcao = sc.nextInt();

            if (opcao == 1){
                System.out.print("Digite o nome do cliente: ");
                var nome = sc.next();

                System.out.print("Digite a agencia do cliente: ");
                var agencia = sc.next();

                System.out.print("Digite a conta do cliente: ");
                var conta = sc.next();

                Cliente c = new Cliente(agencia, conta, 0, nome);

                clientes[id] = c;
                id++;

                System.out.println("Cliente cadastrado com sucesso!");
            }
            else if(opcao == 2){
                System.out.println("Lista dos cliente:");
                for (int i = 0;i<id;i++){
                    System.out.println("ID:" + i + "| Agencia:" + clientes[i].agencia + "| Conta:" + clientes[i].conta + "| Nome:" + clientes[i].nome + "| Saldo:" + clientes[i].saldo);
                }

                System.out.print("Digite o ID do cliente que voce deseja realizar o deposito:" );
                var id_cliente = sc.nextInt();

                System.out.print("Digite o valor do deposito:" );
                var valor_deposito = sc.nextDouble();

                clientes[id_cliente].depositar(valor_deposito);

                System.out.println("Deposito na conta de " + clientes[id_cliente].nome + "realizado com sucesso!");
            }
            else if(opcao == 3){
                System.out.println("Lista dos cliente:");
                for (int i = 0;i<id;i++){
                    System.out.println("ID:" + i + "| Agencia:" + clientes[i].agencia + "| Conta:" + clientes[i].conta + "| Nome:" + clientes[i].nome + "| Saldo:" + clientes[i].saldo);
                }

                System.out.print("Digite o ID do cliente que voce deseja realizar o saque:" );
                var id_cliente_saque = sc.nextInt();

                System.out.print("Digite o valor do saque:" );
                var valor_saque = sc.nextDouble();

                clientes[id_cliente_saque].sacar(valor_saque);

                System.out.println("Saque na conta de " + clientes[id_cliente_saque].nome + "realizado com sucesso!");
            }
            else if(opcao == 4){
                System.out.println("Lista dos cliente:");
                for (int i = 0;i<id;i++){
                    System.out.println("ID:" + i + "| Nome:" + clientes[i].nome + "| Saldo:" + clientes[i].saldo);
                }
            }
            else{
                System.out.println("Encerrando...");
                break;
            }
        }
    }
}
