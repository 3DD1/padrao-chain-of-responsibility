public class TipoSoftwareBackEnd implements TipoSoftware {
    private static TipoSoftwareBackEnd backend = new TipoSoftwareBackEnd();

    private TipoSoftwareBackEnd(){};

    public static TipoSoftwareBackEnd getTipoSoftwareBackEnd(){
        return backend;
    }

}
