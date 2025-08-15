package br.com.joaoquaresma.vendingmachine;

public class Coin {
    private double value;
    private int quantity;

    // Classe que representa uma moeda na máquina de vendas
    public Coin(double value, int quantity){
        this.value = value;
        this.quantity = quantity;
    }

    // Retorna a quantidade de moedas disponíveis desse tipo
    public int getQuantity() {
        return quantity;
    }

    // Define (atualiza) a quantidade de moedas disponíveis
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    // Retorna o valor da moeda
    public double getValue() {
        return value;
    }

    // Define (atualiza) o valor da moeda
    public void setValue(double value) {
        this.value = value;
    }

    // Representação em texto da moeda (usado, por exemplo, em System.out.println)
    @Override
    public String toString() {
        return "coin: "+ value;
    }
}