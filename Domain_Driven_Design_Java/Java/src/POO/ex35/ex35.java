package POO.ex35;

import java.util.Scanner;

public class ex35 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Produto[] produtos = new Produto[10];

        for(int i = 0;i<10;i++){
            Produto p = new Produto();

            p.id = i + 1;

            System.out.print("Digite a descricao do produto: ");
            p.descricao = sc.next();

            System.out.printf("Digite o valor de %s: ", p.descricao);
            p.valor = sc.nextDouble();

            System.out.printf("Digite a quantidade de %s no estoque: \n", p.descricao);
            p.quantidade = sc.nextDouble();

            produtos[i] = p;
        }


        for(int i = 0;i<produtos.length;i++){
            if(produtos[i].valor <= 100 && produtos[i].quantidade >= 10){
                System.out.printf("O ID do produto eh: %d\n" ,produtos[i].id);
                System.out.printf("A descricao do produto eh: %s\n" ,produtos[i].descricao);
                System.out.printf("O valor do produto eh: %.2f\n" ,produtos[i].valor);
                System.out.printf("A quantidade de estoque do produto eh: %f\n" ,produtos[i].quantidade);
            }
        }

        sc.close();
    }
}
