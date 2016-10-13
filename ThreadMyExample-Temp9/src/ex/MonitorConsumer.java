package ex;

/**
 * Created by vika on 13.10.16.
 */
public class MonitorConsumer extends Thread {
    private AboutLabelMonitor aboutLabelMonitor;

    public MonitorConsumer(AboutLabelMonitor aboutLabelMonitor) {
        this.aboutLabelMonitor = aboutLabelMonitor;
    }

    public void run(){
        /**
         * Каждый порожденый поток может воспользоваться методом change() и
         * rechange() - 10 раз
         */
        /*try {
            Thread.sleep(2000);
            for (int i = 0; i < 10; i++) {
                if (Math.random()>0.5) {
                    aboutLabelMonitor.change();
                } else {
                    aboutLabelMonitor.rechange();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
       /* try {
            while (true) {
                Thread.sleep(1000);
                aboutLabelMonitor.change();
                //Thread.sleep(5000);
                aboutLabelMonitor.rechange();
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }*/
      while (true){
          aboutLabelMonitor.change();
          //Thread.sleep(5000);
          aboutLabelMonitor.rechange();
      }
    }
}
