import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variaveis para adicionar os valores
        int num = 0;
        Vendedor vendedor;
        Venda venda;
        Produto produto;

        Scanner leitor = new Scanner(System.in);

        venda = new Venda();
        vendedor = new Vendedor();
        produto = new Produto();
        //Menu com opções para registrar a venda
        try {
            while (true) {
                System.out.println("\n Digite '1' para Vendedor.\n Digite '2' para registrar venda.\n Digite '3' para exibir o resumo da venda.\n Digite '100' para encerrar o programa.");
                num = Integer.parseInt(leitor.nextLine());
                //condições para caso o usuário no menu escolher uma opção fazer certa ação
                if (num == 1) {
                    vendedor = new Vendedor();
                    System.out.println("Informe o nome do vendedor: ");
                    vendedor.setNome(leitor.nextLine());

                } else if (num == 2) {
                    venda = new Venda();
                    System.out.println("Informe o valor da venda: ");
                    produto.setValorVenda(Float.parseFloat(leitor.nextLine()));
                    System.out.println("Informe o valor do custo: ");
                    produto.setValorCusto(Float.parseFloat(leitor.nextLine()));

                    System.out.println("Informe a quantidade de itens: ");
                    venda.setQuantidadeItens(Integer.parseInt(leitor.nextLine()));

                    System.out.println("Informe o código do produto selecionado: ");
                    produto.setCodigo(Integer.parseInt(leitor.nextLine()));

                    System.out.println("Informe a descrição do produto: ");
                    produto.setDescricao(leitor.nextLine());

                    System.out.println("O produto está em promoção? ");
                    produto.setPromocao(Boolean.parseBoolean(leitor.nextLine()));

                    venda.setVendedor(vendedor);
                    venda.setProduto(produto);
                    venda.efetuarDesconto();
                    venda.calcularComissao();
                    venda.calcularValor();

                } else if (num == 3) {
                    System.out.println("Resumo da venda: " + venda );
                } else if (num == 100) {
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                }
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e);
            e.printStackTrace();
        }

    }
}
