public class DeveloperQA extends Developer{

    public DeveloperQA(Developer superior){
        listaSoftware.add(TipoSoftwareQA.getTipoSoftwareQA());
        setDeveloperSuperior(superior);
    }

    public String getDescricao() {
        return "QA";
    }
}
