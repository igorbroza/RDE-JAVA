package igor.ifpr.oo;

public class Main {

    public static void main(String[] args) {
        Pilha pilha;
        pilha = new Pilha();
        pilha.push(11);
        pilha.push(44);
        pilha.push(49);
        pilha.print(pilha.getTop());

    }
}
