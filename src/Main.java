import javax.swing.*;

/**
 * Created by Jennifer Balling on 2/22/14.
 */
public class Main {

   public Main(){

    }
    public static void main(String [] args){

            JFrame frame= new JFrame("20 Incredible Questions");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setContentPane(new WorkingClass());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

    }
}
