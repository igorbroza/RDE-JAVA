package igor.ifpr.oo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int opcao = 0;

        Animal[] animais = new Animal[7];

        Cavalo cavalo = new Cavalo("Cavalo", 160, 1);
        Leao leao = new Leao("Leao", 250, 2);
        Vaca vaca = new Vaca("Vaca", 450, 3);
        Cascavel cascavel = new Cascavel("Cascavel", 1, 4);
        Galinha galinha = new Galinha("Galinha", 10, 5);
        Peixe peixe = new Peixe("Peixe", 1, 6, 2);
        Baleia baleia = new Baleia("Baleia", 500, 7, 5);

        animais[0] = cavalo;
        animais[1] = leao;
        animais[2] = vaca;
        animais[3] = cascavel;
        animais[4] = galinha;
        animais[5] = peixe;
        animais[6] = baleia;

        do {
            System.out.println();
            System.out.println("\n         =========================");
            System.out.println("          |    1 - Mover            |");
            System.out.println("          |    2 - Emetir Som       |");
            System.out.println("          |    3 - Aparar Pelos     |");
            System.out.println("          |    4 - Sair             |");
            System.out.println("           =========================");

            opcao = scan.nextInt();
            System.out.println();
            switch (opcao) {
                case 1:

                System.out.println("Os Animais Vao se mover:");
                for (int i = 0; i < 7; i++) {
                    animais[i].mover();
                }
                break;

                case 2:

                System.out.println("Os animais Vao emetir sons:");
                for (int i = 0; i < 7; i++) {
                    animais[i].emetirSom();
                }
                break;

                case 3:

                System.out.println("Os animais Apararam seus pelos:");
                for (int i = 0; i < animais.length; i++) {
                    if (animais[i] instanceof ComPelos) {
                        ((ComPelos) animais[i]).apararPelos();
                    }
                }
                break;

            }
        } while (opcao != 4);

    }
}
