import java.util.Scanner;
public class App {
    public static void main(String[] args){

        System.out.print("Login: "); try (Scanner scan_user = new Scanner(System.in)) {
            String input_user = scan_user.next();
        System.out.print("Senha: "); try (Scanner scan_senha = new Scanner(System.in)) {
            String input_senha = scan_senha.next();

        Login l = new Login();
        if(l.logUser(input_user, input_senha)){
            Sistema s = new Sistema();
            s.mostrarSistema();
        }
        else{
            System.out.println("Credenciais inválidas.");
        }

        }}
    }
}