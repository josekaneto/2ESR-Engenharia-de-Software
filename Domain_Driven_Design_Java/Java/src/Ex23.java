import java.util.Scanner;

public class Ex23 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int num = 0, nunw = 0, x = 0;

        for(int i=1;i<=100;i++){
            num += i;
        }
        System.out.print("(For) A soma dos numeros de 1 a 100 é: " + num);

        while(x<=100){
            nunw += x;
            x++;
        }
        System.out.print("\n(While) A soma dos numeros de 1 a 100 é: " + nunw);

        sc.close();
    }
}
