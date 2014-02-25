/**
 * Created by Jennifer Balling on 2/22/14.
 */
//opening page
//Counter for questions left.
//4 clicks per answer

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.*;
import java.io.*;
import javax.imageio.ImageIO;

public class WorkingClass extends JPanel implements ActionListener {

    private static final int WIDTH = 400;
    private static final int LENGTH = 300;

    private JButton YesB, NoB;
    private JLabel QuestionL, TitleL;
    private JTextField QuestionTF, counterTF, counterNum;
    //private questionArr questionHandler;
    private yesButtonHandler yesHandler;
    private noButtonHandler noHandler;

    //private BufferedImage image;

    public WorkingClass(){

        //CREATE PANELS
        JPanel ContainerPanel= new JPanel();//http:stackoverflow.com/questions/10637788/jpanel-within-jframe
        ContainerPanel.setBackground(Color.BLACK);

        JPanel ImagePanel = new JPanel();
        ImagePanel.setBackground(Color.BLACK);
        ImagePanel.setPreferredSize(new Dimension(400,300));

        JPanel QuestionPanel = new JPanel();
        QuestionPanel.setBackground(Color.BLACK);
        QuestionPanel.setPreferredSize(new Dimension(400, 250));

        JPanel TitlePanel= new JPanel();
        TitlePanel.setBackground(Color.BLACK);
        TitlePanel.setPreferredSize(new Dimension(400,75));

        //ADD STUFF TO PANELS
        ImageIcon image = new ImageIcon("C:/Users/jensbaby/Documents/IncredibleImage.png");
        JLabel picLabel = new JLabel("", image, JLabel.CENTER);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add( picLabel, BorderLayout.NORTH );
        ImagePanel.add(panel);

        TitleL= new JLabel("Who is your Incredible alter-ego?");
        TitleL.setForeground(Color.yellow);
        TitleL.setFont(TitleL.getFont().deriveFont(20f));
        TitlePanel.add(TitleL);
        counterTF= new JTextField();
        counterTF.setText("Questions left: ");
        counterTF.setBackground(Color.BLACK);
        counterTF.setFont(counterTF.getFont().deriveFont(16f));
        counterTF.setForeground(Color.WHITE);
        TitlePanel.add(counterTF);
        counterTF.setEditable(false);
        counterTF.setHorizontalAlignment(JTextField.RIGHT);

        counterNum= new JTextField();
        counterNum.setText("15");
        counterNum.setBackground(Color.BLACK);
        counterNum.setFont(counterNum.getFont().deriveFont(16f));
        counterNum.setForeground(Color.WHITE);
        TitlePanel.add(counterNum);
        counterNum.setEditable(false);
        counterNum.setHorizontalAlignment(JTextField.RIGHT);

        QuestionL = new JLabel("Question: ", SwingConstants.LEFT);
        QuestionL.setForeground(Color.white); //http://stackoverflow.com/questions/2966334/how-do-i-set-the-colour-of-a-label-coloured-text-in-java
        QuestionL.setFont(QuestionL.getFont().deriveFont(16f));

        //Buttons
        YesB= new JButton("YES");
        yesHandler= new yesButtonHandler();
        YesB.addActionListener(yesHandler);
        NoB= new JButton("NO");
        noHandler= new noButtonHandler();
        NoB.addActionListener(noHandler);
        //Text fields
        QuestionTF= new JTextField(35);
        QuestionTF.setBackground(Color.white);
        QuestionTF.setFont(QuestionTF.getFont().deriveFont(14f));//http://stackoverflow.com/questions/6461506/jtextarea-default-font-very-small-in-windows
        QuestionTF.setHorizontalAlignment(JTextField.CENTER);//http://www.daniweb.com/software-development/java/threads/21472/how-do-you-center-the-text-in-a-jtextfield
        QuestionTF.setText("Are you ready?");
        QuestionTF.setEditable(false);
        QuestionPanel.add(QuestionL);
        QuestionPanel.add(QuestionTF);
        QuestionPanel.add(YesB);
        QuestionPanel.add(NoB);

        //ImagePanel.add(image);

        //SET PANEL LAYOUT
        ContainerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));//ContainerPanel, FlowLayout(new FlowLayout()));
        ContainerPanel.setPreferredSize(new Dimension(600, 500));
        ContainerPanel.add(TitlePanel);
        ContainerPanel.add(ImagePanel);
        ContainerPanel.add(QuestionPanel);
        add(ContainerPanel, BorderLayout.NORTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    private class yesButtonHandler implements ActionListener{
        public void actionPerformed (ActionEvent e){

            ArrayList<String> QA=new ArrayList<String>();
            QA.add("Are you ready?");//0
            QA.add("Please get ready! Are you ready now?");//1
            QA.add("Are you Super?");//2
            QA.add("Are you Evil?");//3
            QA.add("Are you Male?");//4
            QA.add("Do you love Supers?");//5
            QA.add("Do you wish you were a Super?");//6
            QA.add("Are you insanely Stretchy?");//7
            QA.add("Are you very, very Fast?");//8
            QA.add("Are you a Villain?");//9
            QA.add("Are you Edna Mode?");//10
            QA.add("Are you some civilian?");//11
            QA.add("Are you Syndrome?");//12
            QA.add("Are you Violet?");//13
            QA.add("Are you ElastiGirl?");//14
            QA.add("Are you Mr. Incredible?");//15
            QA.add("Are you Jack Jack?");//16
            QA.add("Are you Dash?");//17
            QA.add("Are you uncontrollably strong?");


            int a=QA.indexOf(QuestionTF.getText());

            String str= counterNum.getText();
            int in= Integer.parseInt(str);

            if(a==0){QuestionTF.setText("Are you Super?");}
            else if(a==1){QuestionTF.setText("Are you Super?");}
            else if(a==2){
                QuestionTF.setText("Are you Male?");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
            else if(a==3){
                QuestionTF.setText("Do you wish you were a Super?");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
            else if(a==4){
                QuestionTF.setText("Are you very, very Fast?");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
            else if(a==5){
                QuestionTF.setText("Are you Edna Mode?");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
            else if(a==6){
                QuestionTF.setText("Are you Syndrome?");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
            else if(a==7){
                QuestionTF.setText("Are you ElastiGirl?");}
            else if(a==8){
                QuestionTF.setText("Are you Dash?");}
            else if(a==9){
                QuestionTF.setText("Awesome! Your Incredible Alter-Ego is a Villain!");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
            else if(a==10){
                QuestionTF.setText("Awesome! Your Incredible Alter-Ego is Edna Mode!");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
            else if(a==11){
                QuestionTF.setText("Awesome! Your Incredible Alter-Ego is some random Civilian!");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
            else if(a==12){
                QuestionTF.setText("Awesome! Your Incredible Alter-Ego is Syndrome!");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
            else if(a==13){
                QuestionTF.setText("Awesome! Your Incredible Alter-Ego is Violet!");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
            else if(a==14){
                QuestionTF.setText("Awesome! Your Incredible Alter-Ego is ElastiGirl!");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
            else if(a==15){
                QuestionTF.setText("Awesome! Your Incredible Alter-Ego is Mr. Incredible!");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
            else if(a==16){
                QuestionTF.setText("Awesome! Your Incredible Alter-Ego is Jack Jack!");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
            else if(a==17){
                QuestionTF.setText("Awesome! Your Incredible Alter-Ego is Dash!");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
            else if(a==18){
                QuestionTF.setText("Are you Mr. Incredible?");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
            else if(in==0 || in<0){
                QuestionTF.setText("Uh oh. I'm out of Questions!");
                return;
            }
        }
    }
    private class noButtonHandler implements ActionListener{
        public void actionPerformed (ActionEvent e){

            ArrayList<String> QA=new ArrayList<String>();
            QA.add("Are you ready?");//0
            QA.add("Please get ready! Are you ready now?");//1
            QA.add("Are you Super?");//2
            QA.add("Are you Evil?");//3
            QA.add("Are you Male?");//4
            QA.add("Do you love Supers?");//5
            QA.add("Do you wish you were a Super?");//6
            QA.add("Are you insanely Stretchy?");//7
            QA.add("Are you very, very Fast?");//8
            QA.add("Are you a Villain?");//9
            QA.add("Are you Edna Mode?");//10
            QA.add("Are you some civilian?");//11
            QA.add("Are you Syndrome?");//12
            QA.add("Are you Violet?");//13
            QA.add("Are you ElastiGirl?");//14
            QA.add("Are you Mr. Incredible?");//15
            QA.add("Are you Jack Jack?");//16
            QA.add("Are you Dash?");//17
            QA.add("Are you uncontrollably strong?");

            int a=QA.indexOf(QuestionTF.getText());
            //System.out.println("a: " + a);
            if(a==0){QuestionTF.setText("Please get ready! Are you ready now?");}
            else if (a==1){QuestionTF.setText("Are you ready?");}
            else if(a==2){
                QuestionTF.setText("Are you Evil?");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
            else if(a==3){
                QuestionTF.setText("Do you love Supers?");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
            else if(a==4){
                QuestionTF.setText("Are you insanely Stretchy?");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
            else if(a==5){
                QuestionTF.setText("Are you a Villain?");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
            else if(a==6){
                QuestionTF.setText("Are you a Villain?");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
            else if(a==7){
                QuestionTF.setText("Are you Violet?");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
            else if(a==8){
                QuestionTF.setText("Are you uncontrollably strong?");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
            else if(a==9){QuestionTF.setText("Oh... well this is awkward...");}
            else if(a==10){QuestionTF.setText("Oh... well this is awkward...");}
            else if(a==11){QuestionTF.setText("Oh... well this is awkward...");}
            else if(a==12){QuestionTF.setText("Oh... well this is awkward...");}
            else if(a==13){QuestionTF.setText("Oh... well this is awkward...");}
            else if(a==14){QuestionTF.setText("Oh... well this is awkward...");}
            else if(a==15){QuestionTF.setText("Oh... well this is awkward...");}
            else if(a==16){QuestionTF.setText("Oh... well this is awkward...");}
            else if(a==17){QuestionTF.setText("Oh... well this is awkward...");}
            else if(a==18){
                QuestionTF.setText("Are you Jack Jack?");
                String i=counterNum.getText();
                int j=Integer.parseInt(i);
                j--;
                counterNum.setText(Integer.toString(j));
            }
        }
    }
}
