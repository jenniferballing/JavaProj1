import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;

/**
 * Created by Jennifer Balling on 2/22/14.
 */
public class Main extends JFrame{

    private static final int WIDTH = 400;
    private static final int LENGTH = 300;

    private JButton YesB, NoB;
    private JLabel QuestionL;
    private JTextField QuestionTF;
    private questionArr questionHandler;

    public Main(){

        setTitle ("20 Incredible Questions");//Who is your incredible alter-ego?

        //Labels
        QuestionL = new JLabel("Question: ", SwingConstants.LEFT);

        //Buttons
        YesB= new JButton("YES");
        NoB= new JButton("NO");

        //Text fields
        QuestionTF= new JTextField(15);
        QuestionTF.setText("Are you ready?");
        QuestionTF.setEditable(false);

        questionHandler= new questionArr();
        QuestionTF.addActionListener(questionHandler);

        Container pane=getContentPane();
        pane.setLayout(new GridLayout(2,2));

        pane.add(QuestionL);
        pane.add(QuestionTF);
        //pane.add(yes);
        pane.add(YesB);
        //pane.add(no);
        pane.add(NoB);

        // Must come last
        setSize(WIDTH, LENGTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public String arrMethod ( int num){
        String QA []={};
        QA[0]="Are you ready?";
        QA[1]="Are you male?";
        QA[2]="Are you female?";
        QA[3]="Are you good?";
        QA[4]="Are you evil?";
        QA[5]="Are you a Super?";
        QA[6]="Do you wish you were a Super?";
        QA[7]="Do you love Supers?";
        QA[8]="Do you hate Supers?";
        QA[9]="Are you stretchy?";
        QA[10]="Are you Strong?";
        QA[11]="Are you Very fast?";
        QA[12]="Are you invisible?";
        QA[13]="Are you an angry ball of lead?";
        QA[14]="Do you need water to use your super power?";
        QA[15]="Are you ...";

        String Question=QA[num];
        return Question;
    }

    private class questionArr implements ActionListener{
        public void actionPerformed(ActionEvent e){

            String q= arrMethod(4);
            QuestionTF.setText(q);
        }
    }

    public static void main(String [] args){

        Main demo= new Main();

    }
}
