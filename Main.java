import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int operador = 10;
        Map<Integer, HashFunction> hashTables = new HashMap<>();

        // Criando clientes com identificador único
        Cliente cliente1 = new Cliente(4, "Luan");
        Cliente cliente2 = new Cliente(1, "Alice");
        Cliente cliente3 = new Cliente(2, "Guilherme");

        // Criando tabelas separadas para cada cliente
        hashTables.put(cliente1.id, new HashFunction(operador));
        hashTables.put(cliente2.id, new HashFunction(operador));
        hashTables.put(cliente3.id, new HashFunction(operador));

        // Cada pedido vai ter um id único, id do Cliente + id do Pedido
        String idPedido1 = cliente1.id + "-1234";
        String idPedido2 = cliente2.id + "-5438";
        String idPedido3 = cliente3.id + "-6693";

        // Listando o Id do Cliente com o idPedido e info do Cliente
        hashTables.get(cliente1.id).inserir(idPedido1, cliente1);
        hashTables.get(cliente2.id).inserir(idPedido2, cliente2);
        hashTables.get(cliente3.id).inserir(idPedido3, cliente3);

        // Tabelas separadas para cada cliente
        System.out.println("Tabela hash do Cliente 1 (Luan): ");
        System.out.println(hashTables.get(cliente1.id));

        System.out.println("Tabela hash do Cliente 2 (Alice): ");
        System.out.println(hashTables.get(cliente2.id));

        System.out.println("Tabela hash do Cliente 3 (Guilherme): ");
        System.out.println(hashTables.get(cliente3.id));
    }
}
