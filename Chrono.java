public class Chrono {
    private long starting_time = System.currentTimeMillis();
    private int minutes = 0;
    private int secondes = 0;

    /*
     * Getters for private elements
     */
    public long getStartingTime(){
        return starting_time;
    }
    public long getMinutes(){
        return minutes;
    }
    public long getSecondes(){
        return secondes;
    }

    /*
     * Setters for private elements
     */
    public void setStartingTime(int st){
        starting_time = st;
    }
    public void setMinutes(int m){
        minutes = m;
    }
    public void setSecondes(int s){
        secondes = s;
    }

    public long[] unit(long st, long s, long m) {
        while (minutes < 100)
        {
            long actual_time =  System.currentTimeMillis() - st;
            if (actual_time > 1000*(s+1)) {
                s++;
                if (s != 60) {
                    //    System.out.println(m + " : "+ s);
                }
                else {
                    m++;
                    s = 0;
                    //System.out.println(m + " : " + s);
                    st = System.currentTimeMillis();
                }  
                st = System.currentTimeMillis();
                long[] tab = new long[3];
                tab[0] = st;
                tab[1] = m;
                tab[2] = s;
                return tab;
            }
        }
        return null;
    }
    public void stop() {

    }
    public void restart() {

    }
}
