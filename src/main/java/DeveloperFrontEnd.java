public class DeveloperFrontEnd extends Developer {

    public DeveloperFrontEnd(Developer superior){
        listaSoftware.add(TipoSoftwareFrontEnd.getTipoSoftwareFrontEnd());
        setDeveloperSuperior(superior);
    }

    public String getDescricao() {
        return "Front-End";
    }
}
