package igor.ifpr.oo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Random;

public class MegaUtils {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    Set<Integer> ApostarNumeros = new HashSet<>();
    Set<Integer> SortearNumeros = new HashSet<>();
    int numerosAcertos;

    public void ApostarNumeros(int numero){
        do {
            if (numero >= 1 && numero <= 60) {
                ApostarNumeros.add(numero);
            }
            else {
                System.out.println("Numero Invalido, Tente Novamente");
            }

        } while (ApostarNumeros.size() < 6);
    }

    public void SortearNumeros(){
        do {
            int numero = random.nextInt(59) + 1;

            SortearNumeros.add(numero);

        } while(SortearNumeros.size() < 6);
    }

    public void VerificarAcertos(){
        for(Integer i : SortearNumeros) {
            for(Integer j : ApostarNumeros) {
                if(i == j) {
                    numerosAcertos += 1;
                }
            }
        }
    }


    public Set<Integer> getApostarNumeros() {
        return ApostarNumeros;
    }

    public void setApostarNumeros(Set<Integer> apostarNumeros) {
        ApostarNumeros = apostarNumeros;
    }

    public Set<Integer> getSortearNumeros() {
        return SortearNumeros;
    }

    public void setSortearNumeros(Set<Integer> sortearNumeros) {
        SortearNumeros = sortearNumeros;
    }

}
