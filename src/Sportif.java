import java.time.LocalDate;

public class Sportif {
    private LocalDate dateDebutCarriere;
    private int nbrMedaille;

    public Sportif(LocalDate dateDebutCarriere) {
        if(dateDebutCarriere.isAfter(LocalDate.now())){
            throw new ExceptionAnneeDebutCarriere();
        }
        this.dateDebutCarriere = dateDebutCarriere;
        this.nbrMedaille = 0;
    }

    public int getNbrMedaille() {
        return nbrMedaille;
    }

    public LocalDate getDateDebutCarriere() {
        return dateDebutCarriere;
    }

    public void setNbrMedaille() {
        this.nbrMedaille += 1;
    }

    public double performer(){
        return 0;
    }
}
