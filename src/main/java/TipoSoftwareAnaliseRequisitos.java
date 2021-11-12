public class TipoSoftwareAnaliseRequisitos implements TipoSoftware {
    private static TipoSoftwareAnaliseRequisitos analiseRequisitos = new TipoSoftwareAnaliseRequisitos();

    private TipoSoftwareAnaliseRequisitos (){};

    public static TipoSoftwareAnaliseRequisitos getTipoSoftwareAnaliseRequisitos (){
        return analiseRequisitos;
    }
}
