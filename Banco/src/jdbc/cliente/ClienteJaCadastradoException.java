package jdbc.cliente;

public class ClienteJaCadastradoException extends Exception {
    
    private String cpf;
    
    public ClienteJaCadastradoException(String cpf){
        super ("Cliente já cadastrado!");
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return cpf;
    }
} 