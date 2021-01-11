package igor.ifpr.oo;

public class Peixe extends Aquaticos {

    public Peixe(String nome, double peso, int codigo, int numeroBarbatanas) {
        super(nome, peso, codigo, numeroBarbatanas);

    }

    @Override
    public void mover() {
        System.out.println("O peixe esta se movendo.");
    }

    @Override
    public void emetirSom() {
        System.out.println("glup glup.");
    }
}
