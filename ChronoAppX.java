import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChronoAppX {
    private static boolean running = false;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Super Chrono Solutec3000");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        JPanel panel = new JPanel();
        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                running = true;
            }
        });
        panel.add(startButton);
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                running = false;
            }
        });
        panel.add(stopButton);
        frame.add(panel);
        frame.setVisible(true);

        Chrono ch = new Chrono();
        long starting_time_ = ch.getStartingTime();
        long secondes_ = ch.getSecondes();
        long minutes_ = ch.getMinutes();
        long[] tab_ = new long[3];
        boolean dispZero = true;
        tab_[0] = starting_time_;
        tab_[1] = secondes_;
        tab_[2] = minutes_;

        while (tab_[2] < 90) {
            if(running) {
                tab_ = ch.unit(tab_[0], tab_[1], tab_[2]);
                System.out.println(tab_[2]+" : "+tab_[1]);
                dispZero = true;
            }
            else {
                tab_[0] = System.currentTimeMillis();
                tab_[1] = secondes_;
                tab_[2] = minutes_;
                if(dispZero) {
                    System.out.println("0 : 0");
                    //dispZero = false;
                }
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
