public class ChronoAppX {
    public static void main(String[] args) {
        Chrono ch = new Chrono();
        long starting_time_ = ch.getStartingTime();
        long secondes_ = ch.getSecondes();
        long minutes_ = ch.getMinutes();
        boolean running = true;
        long[] tab_ = new long[3];
        tab_[0] = starting_time_;
        tab_[1] = secondes_;
        tab_[2] = minutes_;
        while (minutes_ < 90) {
            if(running) {
                tab_ = ch.unit(tab_[0], tab_[1], tab_[2]);
                System.out.println(tab_[2]+" : "+tab_[1]);
            }
        }
        /*long starting_time = System.currentTimeMillis();
        //System.out.println("Temps actuel : " + time_ms);
        int minutes = 0;
        int secondes = 0;
        System.out.println("\n"+minutes + " : "+ secondes);
        while (minutes < 90) {
            long actual_time =  System.currentTimeMillis() - starting_time;
            if (actual_time > 1000*(secondes+1)) {
                secondes++;
                if (secondes != 60)
                    System.out.println(minutes + " : "+ secondes);
                else {
                    minutes++;
                    secondes = 0;
                    System.out.println(minutes + " : " + secondes);
                    starting_time = System.currentTimeMillis();
                }  
            }
        }*/
    }
}
