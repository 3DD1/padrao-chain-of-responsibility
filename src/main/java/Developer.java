import java.util.ArrayList;
public abstract class Developer {

    protected ArrayList listaSoftware = new ArrayList();
    private Developer developerSuperior;

    public Developer getDeveloperSuperior() {
        return developerSuperior;
    }
    public void setDeveloperSuperior(Developer developerSuperior) {
        this.developerSuperior = developerSuperior;
    }
    public abstract String getDescricao();

    public String prosseguirSoftware(Software software) {
        if (listaSoftware.contains(software.getTipoSoftware())) {
            return getDescricao();
        } else {
            if (developerSuperior != null) {
                return developerSuperior.prosseguirSoftware(software);
            } else {
                return "Sem prosseguimento";
            }
        }
    }
}



