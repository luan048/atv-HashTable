// Cliente terá id e name, e será convertido em String
public class Cliente {
    int id;
    String name;

    public Cliente(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "(" + id + ", " + name + ")";
    }
}
