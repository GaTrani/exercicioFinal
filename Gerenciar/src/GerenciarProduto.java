import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarProduto {



    public static void main(String[] args) {
        GerenciarProduto gp = new GerenciarProduto();
        Scanner sc = new Scanner(System.in);

        List<Contato> ListaProdutos = new ArrayList<>();

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
                    Fornecedor f1 = new Fornecedor();
                    System.out.println("Digite o Codigo do fornecedor: ");
                    int codigo = Integer.parseInt(sc.nextLine());
                    f1.setCodigo(codigo);
                    System.out.println("Digite a Razao Social do fornecedor: ");
                    String rs =  sc.nextLine();
                    f1.setRazaoSocial(rs);
                    System.out.println("Digite o Enderedo do fornecedor: ");
                    String endereco =  sc.nextLine();
                    f1.setEndereco(endereco);
                    System.out.println("Digite a Cidade do fornecedor: ");
                    String cidade =  sc.nextLine();
                    f1.setCidade(cidade);
                    System.out.println("Digite o Estado do fornecedor [UF]: ");
                    String uf =  sc.nextLine();
                    f1.setEstado(uf);
                    System.out.println("Criar Contato ou atribuir um existente? [S/N]: ");
                    String criarContato = sc.nextLine().toUpperCase();

                    if(criarContato.equals("S")){
                        //Contato
                        Contato c1 = new Contato();
                        System.out.println("Digite o Nome do Contato do fornecedor: ");
                        String contato =  sc.nextLine();
                        c1.setContato(contato);
                        System.out.println("Digite o Telefone do fornecedor: ");
                        String telefone =  sc.nextLine();
                        c1.setTelefone(telefone);
                        System.out.println("Digite o Email do fornecedor: ");
                        String email = sc.nextLine();
                        c1.setEmail(email);
                        Contato.contatos.add(c1);
                        f1.setContato(c1);
                    }else{
                        System.out.println("Listar contatos existentes e dar a opcao de escolher.");
                    }

                    Fornecedor.fornecedores.add(f1);

                    f1.listarFornecedores();
                    break;
                case 2:
                    Produto produto = new Produto();
                    System.out.println("Digite o Codigo do Produto: ");
                    int codigoProd = Integer.parseInt(sc.nextLine());
                    produto.setCodigo(codigoProd);
                    System.out.println("Digite a Descricao do Produto: ");
                    String desc =  sc.nextLine();
                    produto.setDescricao(desc);

                    //Terminar



                    break;
                case 3:
                    Contato c1 = new Contato();
                    System.out.println("Digite o Nome do Contato do fornecedor: ");
                    String contato =  sc.nextLine();
                    c1.setContato(contato);
                    System.out.println("Digite o Telefone do fornecedor: ");
                    String telefone =  sc.nextLine();
                    c1.setTelefone(telefone);
                    System.out.println("Digite o Email do fornecedor: ");
                    String email = sc.nextLine();
                    c1.setEmail(email);
                    Contato.contatos.add(c1);
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
    public Contato cadastrarContato(Scanner sc){
        //Contato
        Contato c1 = new Contato();
        System.out.println("Digite o Nome do Contato do fornecedor: ");
        String contato =  sc.nextLine();
        c1.setContato(contato);
        System.out.println("Digite o Telefone do fornecedor: ");
        String telefone =  sc.nextLine();
        c1.setTelefone(telefone);
        System.out.println("Digite o Email do fornecedor: ");
        String email = sc.nextLine();
        c1.setEmail(email);
        Contato.contatos.add(c1);
        return c1;
    }
}