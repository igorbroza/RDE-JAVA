package igor.ifpr.oo;

public class Lista {

    private Nodo primeiro;

    public void criaLista(){
        primeiro = null;
    }

    public void add(int i){
        Nodo novo = new Nodo();
        novo.setInfo(i);
        novo.setProx(primeiro);
        primeiro = novo;
    }

    public void print(){
        for(Nodo n = primeiro; n != null; n= n.getProx()){
            System.out.println(n.getInfo());
        }
    }


}
