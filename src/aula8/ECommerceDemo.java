package aula8;
import java.util.*;
public class ECommerceDemo {
    public static void main(String[] args) {
        System.out.println("\n---Sistema E-Commerce: Demonstrção de TAD interiva---");
        Scanner ler = new Scanner(System.in);

        ProdutoFisico livro = new ProdutoFisico("Livro de receitas JAVA avançado", 80.00, 100.0);
        ProdutoDigital eCurso = new ProdutoDigital("curso de spring boot e aws", 250.00);
        
        livro.exibirDetalhes();
        eCurso.exibirDetalhes();

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem(livro);
        carrinho.adicionarItem(eCurso);

    }
}