public class ExceptionDejaInscrit extends RuntimeException{

    public ExceptionDejaInscrit(){
        super("Le sportif est déjà inscrit");
    }
}
