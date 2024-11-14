class Lista {
    No inicio;

    public void inserir(String idPedido, Cliente cliente) {
        No no = new No();
        
        no.idPedido = idPedido;
        no.info = cliente;
        no.proximo = inicio;
        inicio = no;
    }

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