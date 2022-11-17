public class Podium {
    private Sportif or;
    private Sportif argent;
    private Sportif bronze;

    public void setOr(Sportif or) {
        this.or = or;
    }

    public void setArgent(Sportif argent) {
        this.argent = argent;
    }

    public void setBronze(Sportif bronze) {
        this.bronze = bronze;
    }

    public void or(Sportif sportif){
        sportif.setNbrMedaille();
    }

    public void argent(Sportif sportif){
        sportif.setNbrMedaille();
    }

    public void bronze(Sportif sportif){
        sportif.setNbrMedaille();
    }
}
