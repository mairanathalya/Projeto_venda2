public class Produto {
    private int codigo;
    private String descricao;
    private float valorVenda;
    private float valorCusto;
    private boolean promocao;
    private static int incremento = 0;



    public Produto( String descricao, float valorVenda, float valorCusto, boolean promocao) {
        this.descricao = descricao;
        this.valorVenda = valorVenda;
        this.valorCusto = valorCusto;
        this.promocao = promocao;
        this.codigo = ++incremento;

    }

    public Produto(){

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

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public float getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(float valorCusto) {
        this.valorCusto = valorCusto;
    }

    public boolean isPromocao() {
        return promocao;

    }

    public void setPromocao( boolean promocao) {
        this.promocao = promocao;
    }

    @Override
    public String toString() {
        return "\n################################################\n" +
                "Produto : \n" +
                "\n Código = " + codigo +
                "\n Descricao = '" + descricao + '\'' +
                "\n Valor Venda = " + valorVenda +
                "\n Valor Custo = " + valorCusto +
                "\n Promoção = " + promocao +
                "\n################################################\n";
    }
}
