public class TipoSoftwareFronEnd implements TipoSoftware {
    private static TipoSoftwareFronEnd frontEnd = new TipoSoftwareFronEnd();

    private TipoSoftwareFronEnd(){};

    public static TipoSoftwareFronEnd getFrontEnd(){
        return frontEnd;
    }


}
