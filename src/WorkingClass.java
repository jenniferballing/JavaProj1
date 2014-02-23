/**
 * Created by Jennifer Balling on 2/22/14.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class WorkingClass extends JFrame implements ActionListener {

    private static final int WIDTH = 400;
    private static final int LENGTH = 300;

    private JButton YesB, NoB;
    private JLabel QuestionL;
    private JTextField QuestionTF;
    //private questionArr questionHandler;
    private yesButtonHandler yesHandler;
    private noButtonHandler noHandler;


    public WorkingClass(){

        setTitle ("20 Incredible Questions");//Who is your incredible alter-ego?

        //Labels
        QuestionL = new JLabel("Question: ", SwingConstants.LEFT);

        //Buttons
        YesB= new JButton("YES");
        yesHandler= new yesButtonHandler();
        YesB.addActionListener(yesHandler);

        NoB= new JButton("NO");
        noHandler= new noButtonHandler();
        NoB.addActionListener(noHandler);

        //Text fields
        QuestionTF= new JTextField(15);
        QuestionTF.setText("Are you ready?");
        QuestionTF.setEditable(false);

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

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    private class yesButtonHandler implements ActionListener{
        public void actionPerformed (ActionEvent e){

            ArrayList<String> QA=new ArrayList<String>();
            QA.add("Are you ready?");//0
            QA.add("Are you male?");//1
            QA.add("Are you female?");//2
            QA.add("Are you good?");//3
            QA.add("Are you evil?");//4
            QA.add("Are you a Super?");//5
            QA.add("Do you wish you were a Super?");//6
            QA.add("Do you love Supers?");//7
            QA.add("Do you now hate Supers?");//8
            QA.add("Are you stretchy?");//9
            QA.add("Are you Strong?");//10
            QA.add("Are you Very fast?");//11
            QA.add("Are you invisible?");//12
            QA.add("Are you an angry ball of lead?");//13
            QA.add("Do you need water to use your super power?");//14

            int a=QA.indexOf(QuestionTF.getText());
            System.out.println("a: " + a);
            if(a==0){
                QuestionTF.setText("Are you male?");
            }
            else if(a==1){
                QuestionTF.setText("Are you evil?");
            }
            else if(a==2){
                QuestionTF.setText("Are you evil?");
            }
            else if(a==3){
                QuestionTF.setText("Are you a Super?");
            }
            else if(a==4){
                QuestionTF.setText("Do you wish you were a Super?");
            }
            else if(a==5){
                QuestionTF.setText("Are you stretchy?");
            }
            else if(a==6){
                QuestionTF.setText("Do you now hate Supers?");
            }
            else if(a==7){
                QuestionTF.setText("Are you Edna Mode?");
            }
            else if(a==8){
                QuestionTF.setText("Are you one of the many silly, yet cleverly named, villains?");
            }
            else if(a==9){
                QuestionTF.setText("Are you ElastiGirl?");
            }
            else if(a==10){
                QuestionTF.setText("Are you Mr. Incredible?");
            }
            else if(a==11){
                QuestionTF.setText("Are you Dash?");
            }
            else if(a==12){
                QuestionTF.setText("Are you Violet?");
            }
            else if(a==13){
                QuestionTF.setText("Are you Jack Jack?");
            }
            else if(a==14){
                QuestionTF.setText("Are you Frozone?");
            }
        }
    }
    private class noButtonHandler implements ActionListener{
        public void actionPerformed (ActionEvent e){

            ArrayList<String> QA=new ArrayList<String>();
            QA.add("Are you ready?");//0
            QA.add("Are you male?");//1
            QA.add("Are you female?");//2
            QA.add("Are you good?");//3
            QA.add("Are you evil?");//4
            QA.add("Are you a Super?");//5
            QA.add("Do you wish you were a Super?");//6
            QA.add("Do you love Supers?");//7
            QA.add("Do you now hate Supers?");//8
            QA.add("Are you stretchy?");//9
            QA.add("Are you Strong?");//10
            QA.add("Are you Very fast?");//11
            QA.add("Are you invisible?");//12
            QA.add("Are you an angry ball of lead?");//13
            QA.add("Do you need water to use your super power?");//14

            int a=QA.indexOf(QuestionTF.getText());
            //System.out.println("a: " + a);
            if(a==0){
                QuestionTF.setText("Are you ready?");
            }
            else if(a==1){
                QuestionTF.setText("Are you evil?");
            }
            else if(a==2){
                QuestionTF.setText("Are you evil?");
            }
            else if(a==3){
                QuestionTF.setText("Do you wish you were a Super?");
            }
            else if(a==4){
                QuestionTF.setText("Are you a Super?");
            }
            else if(a==5){
                QuestionTF.setText("Do you wish you were a Super?");
            }
            else if(a==6){
                QuestionTF.setText("Have you actually seen this movie?");
            }
            else if(a==7){
                QuestionTF.setText("Are you Edna Mode?");
            }
            else if(a==8){
                QuestionTF.setText("Are you one of the many villains?");
            }
            else if(a==9){
                QuestionTF.setText("Are you Strong?");
            }
            else if(a==10){
                QuestionTF.setText("Are you Very fast?");
            }
            else if(a==11){
                QuestionTF.setText("Are you invisible?");
            }
            else if(a==12){
                QuestionTF.setText("Are you an angry ball of lead?");
            }
            else if(a==13){
                QuestionTF.setText("Do you need water to use your super power?");
            }
            else if(a==14){
                QuestionTF.setText("Are you some random extra?");
            }
        }
    }
}
