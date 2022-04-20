
public class RepositorioCliente {

    private static Cliente[] listaClientes;
    private static RepositorioCliente instancia;

    public static RepositorioCliente getInstance() {
        if (instancia == null) {
            instancia = new RepositorioCliente();
        }
        return instancia;
    }

    public RepositorioCliente() {
        if (listaClientes == null) {
            listaClientes = new Cliente[100];
        }

    }

    public boolean inserirCliente(Cliente c) {
        String cpf = null;
        int codigo = 0;
        for (int i = 0; i < listaClientes.length; i++) {
            if (listaClientes[i] == null) {
                listaClientes[i] = c;
                System.out.println("ATEN��O \n Cadastrado com sucesso \n    "
                        + " \n   ");
                return true;
            } else if (listaClientes[i].getCpf().equals(cpf) && listaClientes[i].getCodigo() == (codigo)) {
                System.out.println("ATEN��O \n  N�o pode ser cadastrado pois o CPF ou Codigo ja existente \n  "
                        + "Reinicei o processo \n  ");
                return false;
            }

        }
        return false;

    }

    public boolean removerCliente(Cliente c) {
        for (int i = 0; i < listaClientes.length; i++) {
            listaClientes[i] = null;
            return true;
        }

        return false;

    }

    public boolean removerClientePeloCodigo(int codigo) {
        for (int i = 0; i < listaClientes.length; i++) {
            if (listaClientes[i] != null && listaClientes[i].getCodigo() == codigo) {
                listaClientes[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean removerClientePeloNome(String nome) {
        for (int i = 0; i < listaClientes.length; i++) {
            if (listaClientes[i] != null && listaClientes[i].getNome().equals(nome)) {
                listaClientes[i] = null;
                return true;
            }
        }
        return false;
    }

    public Cliente buscarClientePeloCPF(String cpf) {

        for (int i = 0; i < listaClientes.length; i++) {
            if (listaClientes[i] != null && listaClientes[i].getCpf().equals(cpf)) {
                return listaClientes[i];
            }
        }

        return null;
    }

    public Cliente buscarClientePeloCodigo(int codigo) {

        for (int i = 0; i < listaClientes.length; i++) {
            if (listaClientes[i] != null && listaClientes[i].getCodigo() == codigo) {
                return listaClientes[i];
            }
        }

        return null;
    }

    public Cliente buscarClientePeloNome(String nome) {

        for (int i = 0; i < listaClientes.length; i++) {
            if (listaClientes[i] != null && listaClientes[i].getNome().equals(nome)) {
                return listaClientes[i];
            }
        }

        return null;
    }

    public Cliente[] buscarClientePeloBairro(String bairro) {
        Cliente[] clientes = null;
        int cont = 0;

        for (int i = 0; i < listaClientes.length; i++) {
            if (listaClientes[i] != null && listaClientes[i].getEnd().getBairro().equals(bairro)) {
                cont++;
            }
        }
        if (cont > 0) {
            clientes = new Cliente[cont];
            int p = 0;
            for (int i = 0; i < listaClientes.length; i++) {
                if (listaClientes[i] != null && listaClientes[i].getEnd().getBairro().equals(bairro)) {
                    clientes[p] = listaClientes[i];
                    p++;
                }

            }
            return clientes;
        }
        return null;
    }
}

//import java.util.ArrayList;
//
//public class SomaArrayList {
//	public static void main(String arg[]){
//		SomaArrayList soma = new SomaArrayList();
//		soma.init();
//	}
//	ArrayList<Integer> array = new ArrayList<Integer>();
//	public void init(){
//		Integer[] numerosParaAdicionar = { 10, 50, 20, 12, 11, 15, 29, 25, 500};
//		Integer[] numerosParaAdicionar2 = { 8, 7, 2, 1, 1, 5, 9, 2, 700 };
//		int somaDaArray = 0;
//		for(int i = 0; i < numerosParaAdicionar.length; i++){
//			array.add(numerosParaAdicionar[i]);
//		}
//		for(int i = 0; i < numerosParaAdicionar2.length; i++){
//			array.add(numerosParaAdicionar2[i]);
//		}
//		for(int i = 0; i < array.size(); i++){
//			somaDaArray += array.get(i);
//		}
//		System.out.println("Array Size: " + array.size());
//		System.out.println("Array: " + array);
//		System.out.println("Soma: " + somaDaArray);
//	}
//}

