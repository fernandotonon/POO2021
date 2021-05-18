public abstract class Produto implements Tributavel{
    private int codigo;
    private String descricao;
    private double preco;
    public String toString(){
        return "Código: " + codigo + " - Descrição: " +
        descricao + " - Preço: " + String.format("%.2f",(preco + calcularICMS())) + " - Imposto: " + String.format("%.2f",calcularICMS());
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
