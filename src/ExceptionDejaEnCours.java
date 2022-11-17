public class ExceptionDejaEnCours extends RuntimeException{

    public ExceptionDejaEnCours(){
        super("Le compétition a déjà commancée");
    }
}
