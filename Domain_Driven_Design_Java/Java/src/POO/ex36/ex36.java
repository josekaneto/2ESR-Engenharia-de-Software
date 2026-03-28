package POO.ex36;

import java.util.Objects;
import java.util.Scanner;

public class ex36 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Aluno[] alunos = new Aluno[5];

        for(int i = 0; i < 5; i++){
            Aluno a = new Aluno();

            System.out.print("Digite o RA do aluno: ");
            a.ra = sc.next();

            System.out.print("Digite o nome do aluno: ");
            a.nome = sc.next();

            System.out.println("O aluno possui 6 materias");

            a.materias = new String[6];
            for(int j = 0; j < 6; j++){
                System.out.print("Digite a sigla da materia: ");
                a.materias[j] = sc.next();
            }

            System.out.print("Digite o periodo do aluno\n");
            System.out.print("Exemplo: Manha, Tarde, Noite: ");
            a.periodo = sc.next().toLowerCase();

            alunos[i] = a;
        }

        System.out.println("Os alunos que estudam a noite sao: \n");

        for (int i=0;i<alunos.length;i++){
            if(Objects.equals(alunos[i].periodo, "noite")){
                System.out.printf("RA do aluno: %s\n", alunos[i].ra);
                System.out.printf("Nome do aluno: %s\n\n", alunos[i].nome);
            }
        }
    }
}
