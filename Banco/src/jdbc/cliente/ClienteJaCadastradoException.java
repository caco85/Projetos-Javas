package jdbc.cliente;

public class ClienteJaCadastradoException extends Exception {
    
    private String cpf;
    
    public ClienteJaCadastradoException(String cpf){
        super ("Cliente j� cadastrado!");
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return cpf;
    }
} 