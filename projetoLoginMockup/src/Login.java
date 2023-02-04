public class Login {
    public void logUser(String input_user, String input_senha){
        String user = "user"; String senha = "@Senha123";
        if(input_user.equals(user) && input_senha.equals(senha)){
            System.out.println("Logado! Seja bem vindo, " + input_user);
        }
        else{
            System.out.println("Não logado.");
        }
    }
}
