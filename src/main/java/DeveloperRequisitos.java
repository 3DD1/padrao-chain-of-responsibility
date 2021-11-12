public class DeveloperRequisitos extends Developer{


    public DeveloperRequisitos(Developer superior){
        listaSoftware.add(TipoSoftwareRequisitos.getTipoSoftwareRequisitos());
        setDeveloperSuperior(superior);
    }

    public String getDescricao() {
        return "Requisitos";
    }
}
