public class TipoSoftwareFronEnd implements TypeSoftware{
    private static TipoSoftwareFronEnd frontEnd = new TipoSoftwareFronEnd();

    private TipoSoftwareFronEnd(){};

    public static TipoSoftwareFronEnd getFrontEnd(){
        return frontEnd;
    }


}
