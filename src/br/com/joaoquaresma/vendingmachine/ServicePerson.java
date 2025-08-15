package br.com.joaoquaresma.vendingmachine;

// Classe que representa um técnico de manutenção da máquina de vendas
public class ServicePerson {
    private int accessKey = 123; // Chave de acesso para entrar no modo de serviço/manutenção
    private boolean accessed; // Indica se o técnico conseguiu acesso com a chave correta

    // Metodo que verifica se a chave fornecida está correta
    public boolean verifyAccess(int accessKey) {
        accessed = false;
        if (accessKey == this.accessKey) {
            accessed = true;
        }
        return accessed;
    }
}
