public class Vendedor {
    private String nome;
    private int codigo;
    private static int incremento =0;
    private float comissao;
    private String endereco;
    private float valor;

    public  Vendedor(){
        this.codigo =++ incremento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }



    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Vendedor :  " +
                "\n Nome = " + nome + '\'' +
                "\n Código = " + codigo +
                "\n Comissão = " + valor +
                "\n Endereço = " + endereco + '\''
                ;
    }
}
