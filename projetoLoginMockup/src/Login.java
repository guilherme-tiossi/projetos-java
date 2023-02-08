public class Login {
    public Boolean logUser(String input_user, String input_senha){
        
        String credenciais [][] = {{"user1", "user2", "user3"}, 
                                  {"1@Senha123", "2@Senha123", "3@Senha123"}
        };
        Boolean acesso = false;

        for(int i = 0; i < 3; i++){
            if(input_user.equals(credenciais[0][i]) && input_senha.equals(credenciais[1][i])){
                acesso = true;
            }
        }

        return acesso;
    
    }
}
