package promocaopizzahut;

public class Supreme extends Pizza {

    public Supreme() {
        preco = (float) 50.00;
        nome = "Supreme";
    }

    @Override
    public void mostraIngredientes() {
        System.out.println("Ingredientes: Mussarela, Cebola, Pimentão e Azeitona");
    }

    @Override
    public void mostraBrinde() {
        System.out.println("Brinde: Caneca");
    }

}
