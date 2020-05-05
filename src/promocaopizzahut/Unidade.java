package promocaopizzahut;

import java.text.DecimalFormat;

public abstract class Unidade {

    DecimalFormat form = new DecimalFormat("0.00");
    protected String nome;
    protected String endereco;
    protected String nomeResponsavel;
    protected Pizza[] pizzas = new Pizza[5];

    public void mostraPizzas() {
        System.out.println("\nPizzas da Unidade " + nome + ":"
                + "\n ");
        for (int i = 0; i < pizzas.length; i++) {
            if (pizzas[i] != null) {
                System.out.println(pizzas[i].getNome() + " R$ " + form.format(pizzas[i].getPreco()));
                pizzas[i].mostraIngredientes();
                pizzas[i].mostraBrinde();
                System.out.println("\n");
            }
        }
        System.out.println("---------------------------------");
    }

}
