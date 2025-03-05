
import java.util.ArrayList;
import java.util.Scanner;

public class desafioGerenciamento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nome = new ArrayList<>();
        ArrayList<String> email = new ArrayList<>();
        ArrayList<String> senha = new ArrayList<>();

        int resp = 6;
        do {
            metodos.menu();
            resp = sc.nextInt();
            if (resp == 6) {
                break;
            }

            switch (resp) {
                case 1:
                    metodos.nome(nome);
                    metodos.email(email);
                    metodos.senha(senha);
                    System.err.println("Seu cadastro foi Realizado!! ");
                    break;

                case 2:
                    if(nome.isEmpty() || email.isEmpty() || senha.isEmpty()){
                            System.err.println("Nenhum usuario cadastrado!!");
                            
                        }else{
                    System.out.println("Digite o que você deseja alterar : \n"
                            + " 1-Email\n"
                            + " 2-nome");
                    int escolha = sc.nextInt();
                    if (escolha == 1) {
                        metodos.alterarEmail(email);
                    } else if (escolha == 2) {
                        metodos.alterarNome(nome);
                    } else {
                        System.err.println("Voce digitou errado ");
                    }
                    }
                    break;
                    

                case 3:
                   metodos.exibirCadastro(nome,email,senha);
                    break;
                case 4:
                    metodos.ExcluirUsuario(nome, email, senha);
                    break;
                
                case 5:
                    metodos.login(email, senha);
                    break;
                    
                default:
                    System.err.println("Opcao nao encontrada!! ");
            }

        } while (resp != 6);
    }

}
