package br.com.joaoquaresma.vendingmachine;

import java.util.ArrayList;
import java.util.List;

// Classe responsável por gerenciar o processo de pagamento da máquina de vendas
public class Checkout {
    // Lista com todas as moedas aceitas pela máquina com suas quantidades em estoque
    private List<Coin> coinList;

    // Lista de moedas inseridas pelo usuário durante a pré-compra
    private List<Coin> totalInPreOrder;

    public Checkout() {
        this.coinList = new ArrayList<>();
        this.totalInPreOrder = new ArrayList<>();
        // Adiciona moedas aceitas a máquina com quantidade inicial de 10 unidades
        coinList.add(new Coin(0.05, 10));
        coinList.add(new Coin(0.10, 10));
        coinList.add(new Coin(0.25, 10));
        coinList.add(new Coin(0.50, 10));
        coinList.add(new Coin(1.00, 10));
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    // Calcula o valor total das moedas inseridas pelo usuário durante a pré-compra
    public double getTotalInPreOrder() {
        double total = 0;
        for (Coin coin: totalInPreOrder){
            total = total + coin.getValue();
        }
        return total;
    }

    public List<Coin> getCoinInPreOrder() {
        return totalInPreOrder;
    }

    // Verifica se uma moeda com determinado valor é aceita pela máquina
    public boolean isValidCoin(double value) {
        for (Coin coin : coinList) {
            if (coin.getValue() == value) {
                return true; // Se encontrar, retorna true
            }
        }
        return false; //Se não retorna false
    }

    // Adiciona uma moeda à lista de pré-compra (moedas inseridas pelo usuário)
    public void insertCoinInPreOrder(double value, int amount) {
        for (Coin coin : coinList) {
            if (coin.getValue() == value) {
                totalInPreOrder.add(new Coin(value,amount));
                return;
            }
        }
        // Caso o valor não seja encontrado, mostra mensagem de erro
        System.out.println("Coin not found: " + value);
    }

    // Cancela a compra e devolve as moedas inseridas e limpa a pré-compra
    public void returnCoinInPreOrder() {
        totalInPreOrder.clear();
    }

    // Aumenta a quantidade de uma moeda no estoque da máquina
    public void insertCoinQuantity(double value, int amount) {
        for (Coin coin : coinList) {
            if (coin.getValue() == value) {
                coin.setQuantity(coin.getQuantity() + amount);
                return;
            }
        }
        // Caso o valor não seja encontrado
        System.out.println("Coin not found: " + value);
    }

    // Reduz a quantidade de uma moeda no estoque da máquina (ex: ao dar troco)
    public void returnCoinQuantity(double value, int amount) {
        for (Coin coin : coinList) {
            if (coin.getValue() == value) {
                coin.setQuantity(coin.getQuantity() - amount);
                return;
            }
        }
        System.out.println("Coin not found: " + value);
    }

    // Exibe todas as moedas aceitas pela máquina
    public void acceptedCoins(){
        System.out.println(coinList.toString());
    }

}