package igor.ifpr.oo;

public class Galinha extends SemPelos {

    public Galinha(String nome, double peso, int codigo) {
        super(nome, peso, codigo);
    }

    @Override
    public void mover() {
        System.out.println("A galinha está se movendo");
    }

    @Override
    public void emetirSom() {
        System.out.println("Cocóóó...Cocóóó...");
    }

}
