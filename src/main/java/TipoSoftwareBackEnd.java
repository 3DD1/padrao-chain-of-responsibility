public class TipoSoftwareBackEnd implements TypeSoftware{
    private static TipoSoftwareBackEnd backend = new TipoSoftwareBackEnd();

    private TipoSoftwareBackEnd(){};

    public static TipoSoftwareBackEnd getBackend(){
        return backend;
    }

}
