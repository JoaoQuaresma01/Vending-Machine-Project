package br.com.joaoquaresma.vendingmachine;

// Classe que representa um produto na máquina de vendas
public class Product {
    private final double price;
    private final String name;
    private int quantity;


    Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Retorna o preço do produto
    public double getPrice() {
        return price;
    }

    // Retorna o nome do produto
    public String getName(){
        return name;
    }

    // Retorna a quantidade disponível do produto
    public int getQuantity() {
        return quantity;
    }

    // Atualiza a quantidade do produto (usado ao vender ou reabastecer)
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Representação em texto do produto, usada ao exibir no console
    @Override
    public String toString() {
        return "\n"+name +" price: "+ price +" quantity: "+ quantity+"\n";
    }
}