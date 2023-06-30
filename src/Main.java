// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
     JFrame frame;
     JPanel panel;
     JLabel clock;
     JButton button;

    public Main() {
        frame = new JFrame();

        panel = new JPanel();

        clock = new JLabel();

        button = new JButton();

        panel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
        panel.setLayout(new GridLayout(0,1));

        panel.add(clock);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);


        while (true) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            LocalDateTime now = LocalDateTime.now();
            clock.setText(now.toString());
            panel.revalidate();
            panel.repaint();
        }
    }
    public static void main(String[] args) {
        new Main();

    }
}