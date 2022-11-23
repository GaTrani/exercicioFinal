
//b) Para fornecedores: O campo código não pode ser negativo e o campo estado deve conter
//apenas dois caracteres em maiúsculos.
//c) Sobrescreva o método toString() para cada Classe, de maneiras que, quando invocados
//apresentem as informações sobre o respectivo objeto.
//d) Fornecedor deve possui dois construtores: o default e outro cuja cidade seja definida por
//padrão: “Mogi Mirim” e o Estado: “SP”.


public class Fornecedor {

    private int codigo;
    private String razaoSocial;
    private String endereco;
    private String cidade;
    private String estado;
    private Contato contato;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "codigo=" + codigo +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", contato=" + contato +
                '}';
    }
}
