package igor.ifpr.oo;

public class Baleia extends Aquaticos {

    public Baleia(String nome, double peso, int codigo, int numeroBarbatanas) {
        super(nome, peso, codigo, numeroBarbatanas);

    }

    @Override
    public void mover() {
        System.out.println("A baleia esta nadando.");
    }

    @Override
    public void emetirSom() {
        System.out.println("Barulho da Baleia.");
    }
}
