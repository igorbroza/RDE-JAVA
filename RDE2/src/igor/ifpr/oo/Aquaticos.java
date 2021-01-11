package igor.ifpr.oo;

public abstract class Aquaticos extends Animal{

    protected int numeroBarbatanas;

    public Aquaticos(String nome, double peso, int codigo, int numeroBarbatanas){
        super(nome, peso, codigo);

        this.numeroBarbatanas = numeroBarbatanas;
    }

    public int getNumeroBarbatanas() {
        return numeroBarbatanas;
    }

    public void setNumeroBarbatanas(int numeroBarbatanas) {
        this.numeroBarbatanas = numeroBarbatanas;
    }
}
