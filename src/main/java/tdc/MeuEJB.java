package tdc;

@javax.ejb.Stateless
public class MeuEJB {
    public String listarLocais() {
        return "{\"locais\": [\"a\",\"b\",\"c\"] }";
    }
}