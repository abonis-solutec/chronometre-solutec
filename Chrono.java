/**
 * \brief Classe gérant la logique métier du Chrono
 * 
 * Cette classe permet de gérer tout ce qu'il y a en rapport avec l'évolution des minutes et secondes en fonction du temps.
 */
public class Chrono {
    private long starting_time = System.currentTimeMillis();
    private int minutes = 0;
    private int secondes = 0;

    /*
     * \brief Getter pour l'élément privé "starting_time" de la classe
     * 
     * @return Valeur de l'élément privé "starting_time" de la classe
     */
    public long getStartingTime(){
        return starting_time;
    }

    /*
     * \brief Getter pour l'élément privé "minutes" de la classe
     * 
     * @return Valeur de l'élément privé "minutes" de la classe
     */
    public long getMinutes(){
        return minutes;
    }

    /*
     * \brief Getter pour l'élément privé "secondes" de la classe
     * 
     * @return Valeur de l'élément privé "secondes" de la classe
     */
    public long getSecondes(){
        return secondes;
    }

    /*
     * \brief Setter pour l'élément privé "starting_time" de la classe
     * 
     * @param s
     * Valeur devant être affectée à l'élément privé "starting_time" de la classe
     */
    public void setStartingTime(int st){
        starting_time = st;
    }

    /*
     * \brief Setter pour l'élément privé "minutes" de la classe
     * 
     * @param s
     * Valeur devant être affectée à l'élément privé "minutes" de la classe
     */
    public void setMinutes(int m){
        minutes = m;
    }

    /*
     * \brief Setter pour l'élément privé "secondes" de la classe
     * 
     * @param s
     * Valeur devant être affectée à l'élément privé "secondes" de la classe
     */
    public void setSecondes(int s){
        secondes = s;
    }

    /**
     * \brief Fonction permettant le calcul des valeurs de scondes et minutes
     * 
     * Cette fonction permet de mettre à jour les secondes et les minutes en fonction du temps réel.
     * 
     * @param st
     * Paramètre correspondant au temps de départ.
     * @param s
     * Paramètre correspondant aux secondes.
     * @param m
     * Paramètre correspondant aux minutes.
     * @return
     * Retourne un tableau contenant les nouvelles valeurs de "st", "s" et "m".
     */
    public long[] unit(long st, long s, long m) {
        while (m < 100)
        {
            long actual_time =  System.currentTimeMillis() - st;
            if (actual_time > 1000*(s+1)) {
                s++;
                if (s == 60) {
                    m++;
                    s = 0;
                    st = System.currentTimeMillis();
                }
                long[] tab = new long[3];
                tab[0] = st;
                tab[1] = s;
                tab[2] = m;
                return tab;
            }
        }
        return null;
    }
}
