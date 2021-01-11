package igor.ifpr.oo;

public class Cascavel extends SemPelos {

    public Cascavel(String nome, double peso, int codigo) {
        super(nome, peso, codigo);
    }

    @Override
    public void mover() {
        System.out.println("A cascavel esta se movendo.");
    }

    @Override
    public void emetirSom() {
        System.out.println("pshii pshii.");
    }

}
