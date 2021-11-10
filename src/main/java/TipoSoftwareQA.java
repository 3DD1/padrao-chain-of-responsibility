public class TipoSoftwareQA implements TypeSoftware{
    private static TipoSoftwareQA qa = new TipoSoftwareQA();

    private TipoSoftwareQA(){};

    public static TipoSoftwareQA getQa(){
        return qa;
    }

}
