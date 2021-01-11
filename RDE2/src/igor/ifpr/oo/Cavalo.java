package igor.ifpr.oo;

public class Cavalo extends ComPelos {

    public Cavalo(String nome, double peso, int codigo) {
        super(nome, peso, codigo);
    }

    @Override
    public void mover() {
        System.out.println("O cavalo está galopando...");
    }

    @Override
    public void emetirSom() {
        System.out.println("Som do Cavalo...");
    }

    @Override
    public void apararPelos() {
        System.out.println("O pelo do cavalo esta cortado.");
    }

}
