class HashFunction {
    int operador;
    Lista[] vetor;

    // Define tamanho do vetor
    HashFunction(int operador) {
        this.operador = operador;
        vetor = new Lista[operador];

        for(int i = 0; i < operador; i++) {
            vetor[i] = new Lista();
        }
    }

    // Insere na lista com chave definida, usando hashCode
    public void inserir(String idPedido, Cliente cliente) {
        int chave = Math.abs(idPedido.hashCode() % operador);
        vetor[chave].inserir(idPedido, cliente);
    }

    // Busca elementos com chave, usando hashCode
    public Cliente buscar(String idPedido) {
        int chave = Math.abs(idPedido.hashCode() % operador);
        return vetor[chave].buscar(idPedido);
    }

    public String toString() {
        StringBuilder out = new StringBuilder();

        for(int i = 0; i < operador; i++) {
            out.append(i).append(": ").append(vetor[i]).append("\n");
        }
        return out.toString();
    }
}