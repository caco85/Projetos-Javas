package jdbc.cliente;

public class ClienteNaoEncontradoException extends Exception {

    private String cpf;

    public ClienteNaoEncontradoException(String cpf){
        super ("Cliente n�o encontrado!");
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

}
