public class ChronoApp {
    public static void main(String[] args) {
        long starting_time = System.currentTimeMillis();
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
        }
    }
}
