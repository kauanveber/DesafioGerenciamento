
import java.util.ArrayList;
import java.util.Scanner;

public class metodos {

    public static void menu() {
        System.out.println("Escolha a opcao: \n"
                + "1-Cadastrar usuario\n"
                + "2-Editar cadastro\n"
                + "3-Exibir cadastrados\n"
                + "4-Excluir cadastro\n"
                + "5-Login\n"
                + "6-Sair");
    }

    public static void nome(ArrayList<String> nome) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome.add(sc.nextLine());
    }

    public static void email(ArrayList<String> email) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu email: ");
        email.add(sc.nextLine());
    }

    public static void senha(ArrayList<String> senha) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        senha.add(sc.nextLine());
    }

    public static void alterarEmail(ArrayList<String> email) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o email que deseja alterar: ");
        String emailAntigo = sc.nextLine();
        if (email.contains(emailAntigo)) {
            System.out.println("Informe o novo email: ");
            String novoEmail = sc.nextLine();
            int indice = email.indexOf(emailAntigo);
            email.set(indice, novoEmail);
        } else {
            System.out.println("O email nao foi encontrado");
        }
    }

    public static void alterarNome(ArrayList<String> nome) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome que deseja alterar: ");
        String nomeAntigo = sc.nextLine();
        if (nome.contains(nomeAntigo)) {
            System.out.println("Informe o novo nome: ");
            String novoNome = sc.nextLine();
            int indice = nome.indexOf(nomeAntigo);
            nome.set(indice, novoNome);
        } else {
            System.out.println("O nome nao foi encontrado");
        }
        
    }
    public static void ExcluirUsuario(ArrayList<String>nome,ArrayList<String>email,ArrayList<String>senha){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do usuario que deseja excluir: ");
        String usuario = sc.nextLine();
        if (nome.contains(usuario)) {
            System.out.println("Deseja mesmo excluir o usuario: "+usuario+"?\n"
                    + "1-S"
                    + "2-N ");
           String opcao = sc.nextLine();
           if(opcao.equalsIgnoreCase("S")){
            int indice = nome.indexOf(usuario);
            nome.remove(indice);
            email.remove(indice);
            senha.remove(indice);
               System.err.println("Usuario excluido com sucesso!!");
           }else{
               System.err.println("Nenhum Usuario foi excluido");
           }
        } else {
            System.err.println("Nenhum usuario foi encontrado");
        }
        
    }
    public static void login(ArrayList<String>email,ArrayList<String>senha){
        Scanner sc = new Scanner (System.in);
        boolean emailComfirmado = false;
        boolean senhaComfirmado = false;
        System.out.println("Digite seu email: ");
        String emailL = sc.nextLine();
        
        System.out.println("Digite sua senha: ");
        String senhaL = sc.nextLine();
        
        if(email.contains(emailL)){
            emailComfirmado = true;
        }
        if(senha.contains(senhaL)){
            senhaComfirmado = true;
        }
        if(emailComfirmado && senhaComfirmado){
            System.out.println("Login efetuado com sucesso");
        }else{
            System.err.println("Login negado ");
        }
    }
    }


