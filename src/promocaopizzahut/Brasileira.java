package promocaopizzahut;

public class Brasileira extends Pizza {

    public Brasileira() {
        preco = (float) 30.00;
        nome = "Brasileira";
    }

    
    
    @Override
    public void mostraIngredientes() {
        System.out.println("Ingredientes: Pepperoni e Mussarela");
    }

    @Override
    public void mostraBrinde() {
        System.out.println("Brinde: Caneta");
    }

}
