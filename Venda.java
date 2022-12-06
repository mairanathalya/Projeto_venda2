public class Venda {
    private Produto produto;
    private Vendedor vendedor;
    private Venda venda;
    private int codigo;
    private static int incremento = 0;
    private float desconto ;
    private int quantidadeItens;
    private float valor;
    private float comissaoV;
    private float valorDesconto = 0;
    private float valorTotal = 0;

    public Venda() {
        this.codigo = ++incremento;
    }

    public float efetuarDesconto() {
        if (produto.isPromocao()) {
            return valorDesconto =  produto.getValorVenda() * 0.10f;
        }
        return valorDesconto;
}

    public float calcularValor() {
        if (produto.getValorVenda() < produto.getValorCusto()) {
                System.out.println("Valor do produto venda é maior que o valor custo.");
        }  else if (produto.isPromocao()){
            return valorTotal = quantidadeItens * (produto.getValorVenda() - valorDesconto);
        }else {
            return valor = produto.getValorVenda() * quantidadeItens;
        }
        return valor;

    }

    public float calcularComissao() {
        if (produto.isPromocao()){
            comissaoV = (valor * vendedor.getComissao() / 100) /2;
        } else {
            comissaoV = valor * vendedor.getComissao() / 100;
        }
        return comissaoV;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\n################################################\n" +
                "Vendedor:\n" +
                "Codigo: " + vendedor.getCodigo() +
                "\nNome: " + vendedor.getNome() +
                "\nComissão: " + calcularComissao() +
                "\n################################################\n" +
                "\n\nProdutos:" +
                "\nQuantidade de itens vendidos: " + quantidadeItens +
                "\nCodigo do produto: " + produto.getCodigo() +
                "\nDescricao do produto: " + produto.getDescricao() +
                "\nValor da venda: " + produto.getValorVenda() +
                "\nProduto em promoção: " + produto.isPromocao() +
                "\nValor do desconto sobre o produto: " + efetuarDesconto() +
                "\nValor total da venda: " + calcularValor() +
                "\n################################################\n";
    }
}






