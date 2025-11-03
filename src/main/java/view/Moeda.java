package view;

public class Moeda {

    private String nome; // Ex: "Real Brasileiro", "Euro", "Peso Argentino"
    private double valorEmReal; // O valor que esta moeda representa em Reais


    public Moeda(String nome, double valorEmReal) {
        this.nome = nome;
        this.valorEmReal = valorEmReal;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorEmReal() {
        return valorEmReal;
    }

    public void setValorEmReal(double valorEmReal) {
        this.valorEmReal = valorEmReal;
    }


    public double converterParaDolar(double cotacaoDolar) {
        if (cotacaoDolar <= 0) {
            System.out.println("Erro: Cotação do dólar deve ser positiva.");
            return 0;
        }
        return this.valorEmReal / cotacaoDolar;
    }
}
