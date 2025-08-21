// Classe Lampada
public class Lampada {
    private String tipo;
    private int voltagem;
    private String cor;
    private String marca;
    private double preco;
    private int potencia;
    private boolean status;

    // Construtor padrão
    public Lampada() {
    }

    // Construtor com parâmetros
    public Lampada(String tipo, int voltagem, String cor, String marca, double preco, int potencia, boolean status) {
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
        this.potencia = potencia;
        this.status = status;
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Métodos ascender e apagar
    public void ascender() {
        this.status = true;
    }

    public void apagar() {
        this.status = false;
    }

    // toString
    @Override
    public String toString() {
        return "Lampada [Tipo=" + tipo + ", Voltagem=" + voltagem + "V, Cor=" + cor + ", Marca=" + marca +
                ", Preço=R$" + preco + ", Potência=" + potencia + "W, Status=" + (status ? "Ligada" : "Desligada") + "]";
    }
}