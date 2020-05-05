package promocaopizzahut;

public class Pepperoni extends Pizza {

    public Pepperoni() {
        preco = (float) 35.00;
        nome = "Pepperoni";
    }
    
    
    @Override
    public void mostraIngredientes() {
        System.out.println("Ingredientes: Mussarela, Requeijão, Presunto e Azeitona");
    }

    @Override
    public void mostraBrinde() {
        System.out.println("Brinde: Chaveiro");
    }

}
