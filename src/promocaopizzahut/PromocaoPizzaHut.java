package promocaopizzahut;

public class PromocaoPizzaHut {

    public static void main(String[] args) {
        
        Unidade bh = new BH();
        Unidade rj = new RJ();
        Unidade sp = new SP();
        
        sp.mostraPizzas();
        bh.mostraPizzas();
        rj.mostraPizzas();
    }
    
}
