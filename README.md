# Vending Machine - Máquina de Vendas Automática em Java

##  Descrição do Projeto

Este projeto simula uma máquina de vendas automática (Vending Machine) desenvolvida em Java.  
Ele permite:  
- Comprar produtos inserindo moedas válidas;  
- Calcular e devolver troco;  
- Gerenciar estoque de produtos e moedas;  
- Área de manutenção para reabastecer produtos e moedas (acesso restrito por chave);  
- Interface de texto simples para interação pelo terminal.

---

##  Como Rodar o Projeto

### Pré-requisitos

- Java JDK instalado (versão 8 ou superior)  
- IDE de sua preferência (exemplos abaixo) ou terminal configurado com `java` e `javac` no PATH

---

### Rodando em IDEs populares

#### IntelliJ IDEA

1. Abra o IntelliJ IDEA e selecione **Open** ou **Import Project**.  
2. Navegue até a pasta do projeto e abra-a.  
3. Aguarde a indexação do projeto pelo IntelliJ.  
4. Configure a classe principal para executar: `br.com.joaoquaresma.vendingmachine.VendingMachine` (ou crie uma classe `Main` que instancie e chame `start()`).  
5. Clique no botão **Run** para iniciar o programa.

#### Eclipse

1. Abra o Eclipse e selecione **File > Import > Existing Projects into Workspace**.  
2. Selecione a pasta raiz do projeto.  
3. Clique em **Finish** para importar.  
4. Configure a classe principal para executar ou crie uma classe `Main` que chame `start()`.  
5. Clique em **Run** para rodar.

#### VS Code

1. Abra a pasta do projeto no VS Code.  
2. Instale a extensão **Java Extension Pack** se ainda não tiver.  
3. Crie um arquivo `Main.java` na pasta `src` ou equivalente que instancie e execute a classe `VendingMachine`.  
4. Use o painel de execução para rodar ou compile e execute via terminal integrado.

---

### Rodando pelo terminal (prompt de comando)

1. Abra o terminal (CMD, PowerShell, Terminal do Linux ou macOS).  
2. Navegue até a pasta onde estão os arquivos `.java`.  
3. Compile o projeto usando:  
   ```bash
   javac -d bin src/br/com/joaoquaresma/vendingmachine/*.java

(Ajuste os caminhos conforme sua estrutura de pastas)
4. Execute o programa:
java -cp bin br.com.joaoquaresma.vendingmachine.VendingMachine
(Ou a classe Main que chama start() caso tenha criado uma)

