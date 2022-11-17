import java.util.ArrayList;

public class Competition {
    private boolean enCours = false;
    private ArrayList<Sportif> inscrit;
    private Podium podium = new Podium();

    public void inscrire(Sportif sportif){
        //regarder si lancé
        if (this.enCours){
            throw new ExceptionDejaEnCours();
        }
        //Regarder si inscrit
        if(inscrit.contains(sportif)){
            throw new ExceptionDejaInscrit();
        }
        inscrit.add(sportif);
    }

    public void desinscrire(Sportif sportif){
        //regarder si lancé
        if (this.enCours){
            throw new ExceptionDejaEnCours();
        }
        //Regarder si inscrit
        if(!inscrit.contains(sportif)){
            throw new ExceptionPasInscrit();
        }
        inscrit.remove(sportif);
    }

    public Podium lancer(){
        if (this.enCours){
            throw new ExceptionDejaEnCours();
        }
        if(inscrit.size()<3){
            throw new ExceptionPasAsserInscrit();
        }
        enCours = true;
        // Calcul podium;
        for(int i = 0;i<3;i++){
            int meilleur;
            meilleur = max(inscrit);
            switch (i){
                case 0:
                    podium.setOr(inscrit.get(meilleur));
                    inscrit.remove(meilleur);
                    break;
                case 1:
                    podium.setArgent(inscrit.get(meilleur));
                    inscrit.remove(meilleur);
                    break;
                case 2:
                    podium.setBronze(inscrit.get(meilleur));
                    inscrit.remove(meilleur);
                    break;
            }
        }
        return(podium);
    }

    public int max(ArrayList<Sportif> inscrit){
        Sportif meilleur = inscrit.get(0);
        for (int i = 1;i<inscrit.size();i++){
            if (inscrit.get(i).performer() > meilleur.performer()){
                meilleur = inscrit.get(i);
            }
        }
        return inscrit.indexOf(meilleur);
    }

    public Podium getPodium(){
        return this.podium;
    }
}
