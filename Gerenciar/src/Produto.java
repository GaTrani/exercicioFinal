/*
    a) Para produtos: Os campos: código, quantidade e preço não aceitam valores negativos.
    c) Sobrescreva o método toString() para cada Classe, de maneiras que, quando invocados
    apresentem as informações sobre o respectivo objeto.
*/

public class Produto {

    private int codigo;
    private String descricao;
    private double preco;
    private int quantidade;
    private Fornecedor fornecedor;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo < 0){
            throw new IllegalArgumentException("Valor do codigo deve ser positivo");
        }
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
        if(preco < 0){
            throw new IllegalArgumentException("Valor do preco deve ser positivo");
        }
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade < 0){
            throw new IllegalArgumentException("Valor da quantidade deve ser positivo");
        }
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "Produto" + "\n" +
                "codigo=" + codigo +
                "descricao='" + descricao + "\n" +
                "preco=" + preco +
                "quantidade=" + quantidade + "\n" +
                "fornecedor=" + fornecedor + "\n";
    }
}
