package ex;

import javax.swing.*;

/**
 * Created by vika on 13.10.16.
 */
public class Main {
    public static void main(String[] args) {
        //System.out.println(Calendar.SECOND);
        AboutLabelMonitor ab = new AboutLabelMonitor();
        ab.setLocationRelativeTo(null);
        ab.setVisible(true);
        ab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MonitorConsumer mc = new MonitorConsumer(ab);
        mc.start();
        /*for (int i = 0; i < 10; i++) {
            MonitorConsumer mc = new MonitorConsumer(ab);
            mc.start();
        }*/
        //clock.setTime();
    }
}
