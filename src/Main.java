import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Competition technoRun = new Competition();
        try{
            Kareteka bryan = new Kareteka(LocalDate.now().minusYears(2),90);
            Kareteka mathis = new Kareteka(LocalDate.now().plusYears(2),10);
        }
        catch (RuntimeException ex){
            System.out.println( ex.getMessage() );
        }
    }
}