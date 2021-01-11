package igor.ifpr.oo;

public class Leao extends ComPelos {

    public Leao(String nome, double peso, int codigo) {
        super(nome, peso, codigo);
    }

    @Override
    public void mover() {
        System.out.println("O leao está se movendo.");
    }

    @Override
    public void emetirSom() {
        System.out.println("Grrrrrr.");
    }

    @Override
    public void apararPelos() {
        System.out.println("O leao está com a juba cortada...");
    }
}


