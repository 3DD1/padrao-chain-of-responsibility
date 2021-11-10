public class TipoSoftwareAnaliseRequisitos implements TypeSoftware {
    private static TipoSoftwareAnaliseRequisitos analiseRequisitos = new TipoSoftwareAnaliseRequisitos();

    private TipoSoftwareAnaliseRequisitos (){};

    public static TipoSoftwareAnaliseRequisitos getAnaliseRequisitos (){
        return analiseRequisitos;
    }
}
