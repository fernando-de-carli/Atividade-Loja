import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Produto> produtos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int op = 0;

        while (op != 3) {

            System.out.println("----- MENU -----\n1- Cadrastar produto \n2- Mostrar produtos \n3- Sair \n----------");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    cadrastar();
                    break;
                case 2:
                    mostrarProdutos();
                    break;
            }
        }
    }

    public static void cadrastar() {
        System.out.println("Digite o nome do produto: ");
        String nome = sc.next();

        System.out.println("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        System.out.println("Digite o quantidade do produto: ");
        int quantidade = sc.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);
        produtos.add(produto);

    }

    public static void mostrarProdutos() {
        System.out.println("------LISTA DE PRODUTOS------");

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
        System.out.println("------FIM------");
    }
}