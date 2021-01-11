package igor.ifpr.oo;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        MegaUtils megaUtils = new MegaUtils();

        System.out.println("Aposte 6 números de 1 a 60");


        megaUtils.ApostarNumeros(scanner.nextInt());

        megaUtils.SortearNumeros();

        megaUtils.VerificarAcertos();

        System.out.println(megaUtils.getApostarNumeros());
        System.out.println(megaUtils.getSortearNumeros());


        if(megaUtils.numerosAcertos == 6) {
            System.out.println("Voce fez uma SENAAAAA!!");
        }

        else if(megaUtils.numerosAcertos == 5) {
            System.out.println("Voce fez uma QUINAAA!!");
        }

        else if(megaUtils.numerosAcertos == 4) {
            System.out.println("Voce fez uma QUADRAA!!");
        }

        else if(megaUtils.numerosAcertos < 4) {
            System.out.println("Menos de 4 acertos :(");
        }

    }
}
