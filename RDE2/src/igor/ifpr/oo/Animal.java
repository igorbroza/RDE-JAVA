package igor.ifpr.oo;

public abstract class Animal {

    protected static String nome;
    protected static double peso;
    protected static int codigo;

    public Animal(String nome, double peso, int codigo){
        this.nome = nome;
        this.peso = peso;
        this.codigo = codigo;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Animal.nome = nome;
    }

    public static double getPeso() {
        return peso;
    }

    public static void setPeso(double peso) {
        Animal.peso = peso;
    }

    public static int getCodigo() {
        return codigo;
    }

    public static void setCodigo(int codigo) {
        Animal.codigo = codigo;
    }

    public abstract void mover();

    public abstract void emetirSom();

}
