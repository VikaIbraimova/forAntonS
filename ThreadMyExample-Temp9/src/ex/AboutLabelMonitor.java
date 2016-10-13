package ex;

import javax.swing.*;
import java.awt.*;

/**
 * Created by vika on 13.10.16.
 */
public class AboutLabelMonitor extends JFrame {
           /*JLabel m_time;*/

    String name; // имя потоко исполнения
    Thread t;
    JLabel m_time;
    JLabel m_time2;
    JLabel m_time3;
    JLabel m_time4;

    JLabel m_time5;
    JLabel m_time6;
    JLabel m_time7;
    JLabel m_time8;
    JLabel m_time9;
    JLabel m_time10;
    JLabel m_time11;
    JLabel m_time12;
    JLabel m_time13;
    JLabel m_time14;
    JLabel m_time15;
    JLabel m_time16;

    public AboutLabelMonitor() throws HeadlessException {
        /*m_time = new JLabel("Vika");
        add(m_time);
        setBounds(0,0,300,100);*/
        setTitle("ClockThread");
        //JPanel panel = new JPanel(null);

        //установка панели во фрейм в центральную часть (панель будет растягиваться на весь фрейм)
        //add(panel, BorderLayout.CENTER);

        GridLayout gl = new GridLayout(4, 2);
        //gl.preferredLayoutSize(
        setLayout(gl);
        //for(int i=0; i<1; i++) {
        m_time = new JLabel("*");
        add(m_time);
        m_time2 = new JLabel("*");
        add(m_time2);
        m_time3 = new JLabel("*");
        add(m_time3);
        m_time4 = new JLabel("*");
        add(m_time4);
        //}

        // for(int i=0; i<1; i++) {
        m_time5 = new JLabel("*");
        add(m_time5);
        m_time6 = new JLabel("*");
        add(m_time6);
        m_time7 = new JLabel("*");
        add(m_time7);
        m_time8 = new JLabel("*");
        add(m_time8);
        // }

        // for(int i=0; i<1; i++) {
        m_time9 = new JLabel("*");
        add(m_time9);
        m_time10 = new JLabel("*");
        add(m_time10);
        m_time11 = new JLabel("*");
        add(m_time11);
        m_time12 = new JLabel("*");
        add(m_time12);
        // }

        // for(int i=0; i<1; i++) {
        m_time13 = new JLabel("*");
        add(m_time13);
        m_time14 = new JLabel("*");
        add(m_time14);
        m_time15 = new JLabel("*");
        add(m_time15);
        m_time16 = new JLabel("*");
        add(m_time16);
        // }
        //getContentPane().add(panel);
        setBounds(0,0,400,400);
    }

    public synchronized void change(){
        try {
            /*Thread.sleep(5000);
            m_time.setText("change");*/

            Thread.sleep(5000);
            m_time3.setText("5");

            Thread.sleep(5000);
            m_time4.setText("10");

            Thread.sleep(5000);
            m_time8.setText("15");

            Thread.sleep(5000);
            m_time12.setText("20");

            Thread.sleep(5000);
            m_time16.setText("25");

            Thread.sleep(5000);
            m_time15.setText("30");

            Thread.sleep(5000);
            m_time14.setText("35");

            Thread.sleep(5000);
            m_time13.setText("40");

            Thread.sleep(5000);
            m_time9.setText("45");

            Thread.sleep(5000);
            m_time5.setText("50");

            Thread.sleep(5000);
            m_time.setText("55");

            Thread.sleep(5000);
            m_time2.setText("60");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public synchronized void rechange(){
        try {
           /* Thread.sleep(5000);
            m_time.setText("rechage");*/

            Thread.sleep(5000);
            m_time3.setText("*");

            //Thread.sleep(5000);
            m_time4.setText("*");

            //Thread.sleep(5000);
            m_time8.setText("*");

            //Thread.sleep(5000);
            m_time12.setText("*");

            //Thread.sleep(5000);
            m_time16.setText("*");

            //Thread.sleep(5000);
            m_time15.setText("*");

            //Thread.sleep(5000);
            m_time14.setText("*");

            //Thread.sleep(5000);
            m_time13.setText("*");

            //Thread.sleep(5000);
            m_time9.setText("*");

            //Thread.sleep(5000);
            m_time5.setText("*");

            //Thread.sleep(5000);
            m_time.setText("*");

            //Thread.sleep(5000);
            m_time2.setText("*");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
