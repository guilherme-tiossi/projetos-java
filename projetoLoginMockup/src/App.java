//import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){

        String input_user = JOptionPane.showInputDialog("Login:");
        String input_senha = JOptionPane.showInputDialog("Senha:");

        Login l = new Login();
        if(l.logUser(input_user, input_senha)){
            Sistema s = new Sistema();
            s.mostrarSistema();
        }
        else{
            JOptionPane.showMessageDialog(null, "Credenciais Inválidas! Tente novamente");
        }
    }
}