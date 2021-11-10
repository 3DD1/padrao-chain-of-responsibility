public abstract class Developer {

    protected Arraylist listaSoftware = new Arraylist();
    private Developer developerSuperior;

    public Developer getDeveloperSuperior() {
        return developerSuperior;
    }
    public void setDeveloperSuperior(Developer developerSuperior) {
        this.developerSuperior = developerSuperior;
    }
    public abstract String getDescription();

    public String toSingSoftwatre(Software software) {
        if (listaSoftware.contains(software.getTipoSoftware())) {
            return getDescription();
        } else {
            if (developerSuperior != null) {
                return developerSuperior.prosseguirSoftware(software);
            } else {
                return "Sem prosseguimento";
            }
        }
    }
}



