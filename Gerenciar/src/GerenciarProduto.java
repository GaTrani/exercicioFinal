import java.util.Scanner;

public class GerenciarProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = 0;
        System.out.println("Cesta de Compras");
        do{
            System.out.println("1. Cadastrar Fornecedor.");
            System.out.println("2. Cadastrar Produto.");
            System.out.println("3. Cadastrar Contato.");
            System.out.println("4. Abrir Cesta.");
            System.out.println("5. Sair.");
            System.out.print("Digite a opcao desejada: ");
            op = Integer.parseInt(sc.nextLine());
            switch(op){
                case 1:
                    System.out.println("Caso 1");
                    break;
                case 2:
                    System.out.println("Caso 2");
                    break;
                case 3:
                    System.out.println("Caso 3");
                    break;
                case 4:
                    int op2 = 0;
                    do{
                        System.out.println("1. Adicionar Produto no Carrinho.");
                        System.out.println("2. Fechar Carrinho.");
                        System.out.print("Digite a opcao desejada: ");
                        op2 = Integer.parseInt(sc.nextLine());
                        switch(op2){
                            case 1:
                                System.out.println("Caso 1.1");
                                break;
                            case 2:
                                System.out.println("Voltando...");
                                break;
                            default:
                                System.out.println("Opcao Invalida.");
                                break;
                        }
                    }while(op2 != 2);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao Invalida.");
                    break;
            }

        }while(op!=5);
    }
}