package igor.ifpr.oo;

public class Vaca extends ComPelos {

    public Vaca(String nome, double peso, int codigo) {
        super(nome, peso, codigo);
    }

    @Override
    public void mover() {
        System.out.println("A Vaca esta se movendo.");
    }

    @Override
    public void emetirSom() {
        System.out.println("Muuuuuuuuuuu.");
    }

    @Override
    public void apararPelos() {
        System.out.println("A vaca esta com os pelos cortados.");
    }

}
