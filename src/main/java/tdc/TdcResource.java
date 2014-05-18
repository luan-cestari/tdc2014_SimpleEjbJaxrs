package tdc;

@javax.ws.rs.Path("tdc")
@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
public class TdcResource {
    @javax.ejb.EJB
    private MeuEJB meuEJB;

    @javax.ws.rs.GET
    @javax.ws.rs.Path("locais")
    public String getLocais() {
        return meuEJB.listarLocais();
    }
}
