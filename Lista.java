// Lista irá armazenar, funcionará como vetor
public class Lista {
    No inicio;

    // Metodo para inserir Nó na lista, com id e info do cliente
    public void inserir(String idPedido, Cliente cliente) {
        No no = new No();
        
        no.idPedido = idPedido;
        no.info = cliente;
        no.proximo = inicio;
        inicio = no;
    }

    // Metodo para buscar 1 elemento pelo seu idPedido
    public Cliente buscar(String idPedido) {
        No no = inicio;
        
        while (no != null) {
            if(no.idPedido.equals(idPedido)) {
                return no.info;
            }
            no = no.proximo;
        }
        return null;
    }

    // Converte para String
    public String toString() {
        StringBuilder sb = new StringBuilder();
        No no = inicio;

        while (no != null) {
            sb.append(no.info);
            no = no.proximo;
            if(no != null) sb.append(" -> ");
        }
        return sb.toString();
    }
}