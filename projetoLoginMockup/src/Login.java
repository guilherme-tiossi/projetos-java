public class Login {
    public Boolean logUser(String input_user, String input_senha){
        String[] user = {"user1", "user2", "user3"}; String[] senha = {"1@Senha123", "2@Senha123", "3@Senha123"};
        Boolean acesso = false;

        for(int i = 0; i < 3; i++){
            if(input_user.equals(user[i]) && input_senha.equals(senha[i])){
                acesso = true;
            }
        }

        return acesso;
    }
}
