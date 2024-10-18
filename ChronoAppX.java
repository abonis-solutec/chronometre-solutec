public class ChronoAppX {
    private static long[] tab_ = new long[3];
    public static void main(String[] args) {
        Chrono ch = new Chrono();
        long starting_time_ = ch.getStartingTime();
        long secondes_ = ch.getSecondes();
        long minutes_ = ch.getMinutes();
        tab_[0] = starting_time_;
        tab_[1] = secondes_;
        tab_[2] = minutes_;
        graphics fe = new graphics();
        fe.fenetre(tab_, ch);
    }
}
