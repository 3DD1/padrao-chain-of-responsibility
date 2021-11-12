public class DeveloperBackEnd extends Developer{

    public DeveloperBackEnd(Developer superior){
        listaSoftware.add(TipoSoftwareBackEnd.getTipoSoftwareBackEnd());
        setDeveloperSuperior(superior);
    }

    public String getDescricao() {
        return "Back-End";
    }
}
