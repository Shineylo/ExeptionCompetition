import java.time.LocalDate;

public class Patineur extends Sportif {

    public Patineur(LocalDate dateDebutCarriere) {
        super(dateDebutCarriere);
    }

    @Override
    public double performer(){
        double nbrAlea = 40;
        if(this.getNbrMedaille()>0){
            return nbrAlea += 1.5 * getAnneeCarriere();
        }else{
            return nbrAlea += 1 * getAnneeCarriere();
        }
    }

    public int getAnneeCarriere(){
        return LocalDate.now().getYear() - this.getDateDebutCarriere().getYear();
    }
}
