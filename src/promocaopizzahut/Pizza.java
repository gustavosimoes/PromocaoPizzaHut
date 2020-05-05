package promocaopizzahut;

public abstract class Pizza {
    protected float preco;
    protected String nome;

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract void mostraIngredientes();
    public abstract void mostraBrinde();
    
}
