public class DeveloperRequisitos extends Developer{


    public DeveloperRequisitos(Developer superior){
        listaSoftware.add(TipoSoftwareAnaliseRequisitos.getTipoSoftwareAnaliseRequisitos());
        setDeveloperSuperior(superior);
    }

    public String getDescricao() {
        return "Requisitos";
    }
}
