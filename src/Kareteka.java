import java.time.LocalDate;

public class Kareteka extends Sportif{
    private int poids;

    public Kareteka(LocalDate dateDebutCarriere,int poids) {
        super(dateDebutCarriere);
        if(poids<33.5){
            throw new ExceptionPoids();
        }
        this.poids = poids;
    }

    @Override
    public double performer(){
        double nbrAlea = 50;
        if(this.getNbrMedaille()>0){
            return nbrAlea = (double)(Math.random() * 2 * poids) ;
        }else{
            return nbrAlea = (double)(Math.random() * 1.5 * poids);
        }
    }

}
