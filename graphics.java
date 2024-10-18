import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Graphics {
    private static boolean[] running = new boolean[1];
    private static long[] tab_ = new long[3];

    public void fenetre(Chrono ch) {
        running[0] = false;
        long starting_time_ = ch.getStartingTime();
        long secondes_ = ch.getSecondes();
        long minutes_ = ch.getMinutes();
        tab_[0] = starting_time_;
        tab_[1] = secondes_;
        tab_[2] = minutes_;

        JFrame frame = new JFrame("Super Chrono Solutec3000");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        JPanel panel = new JPanel();
        JButton startButton = new JButton("Start");
        JButton restartButton = new JButton("Restart");
        JLabel labelMinutes = new JLabel("Minutes : "+tab_[2]);
        JLabel labelSecondes = new JLabel("Secondes : "+tab_[1]);
        JLabel labelFinal = new JLabel("Final time : "+ tab_[2]+" : "+ tab_[1]);

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                running[0] = true;
            }
        });
        panel.add(startButton);
        restartButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                running[0] = false;
                labelFinal.setText("Final time : "+ tab_[2]+" : "+ tab_[1]);
                panel.add(labelFinal);
            }
        });

        panel.add(restartButton);
        panel.add(labelMinutes);
        panel.add(labelSecondes);
        frame.add(panel);
        frame.setVisible(true);

        while (tab_[2] < 90) {
            labelMinutes.setText("Minutes : "+tab_[2]);
            labelSecondes.setText("Secondes : "+tab_[1]);
            if(running[0]) {
                tab_ = ch.unit(tab_[0], tab_[1], tab_[2]);
            }
            else {
                tab_[0] = System.currentTimeMillis();
                tab_[1] = 0;
                tab_[2] = 0;
            }
        }
    }
}
