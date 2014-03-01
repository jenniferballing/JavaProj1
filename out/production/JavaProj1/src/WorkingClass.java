/**
 * Created by Jennifer Balling on 2/22/14.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class WorkingClass extends JPanel implements ActionListener {

    private JButton YesB, NoB;
    private JLabel QuestionL, TitleL, counterTF, counterNum, picLabel, image, CompScoreL, PlayScoreL, CompScoreTF, PlayScoreTF;
    private JTextField QuestionTF;
    private JPanel ContainerPanel, ImagePanel, panel;
    public ImageIcon FirstImg;

    public WorkingClass(){

        //CREATE PANELS
        ContainerPanel= new JPanel();//http:stackoverflow.com/questions/10637788/jpanel-within-jframe
        ContainerPanel.setBackground(Color.BLACK);

        ImagePanel = new JPanel();
        ImagePanel.setBackground(Color.BLACK);
        ImagePanel.setPreferredSize(new Dimension(400,290));

        JPanel QuestionPanel = new JPanel();
        QuestionPanel.setBackground(Color.BLACK);
        QuestionPanel.setPreferredSize(new Dimension(400, 250));

        JPanel TitlePanel= new JPanel();
        TitlePanel.setBackground(Color.BLACK);
        TitlePanel.setPreferredSize(new Dimension(400,70));

        //ADD STUFF TO PANELS
        //FamilyPic
        ImageIcon image = new ImageIcon(this.getClass().getResource("IncredibleImage.png"));
        picLabel = new JLabel ("", image, JLabel.CENTER);
        panel = new JPanel(new BorderLayout());
        panel.add( picLabel, BorderLayout.NORTH );
        ImagePanel.add(panel);

        //TITLE
        TitleL= new JLabel("Who Is Your \'Incredible\' Alter-Ego?");
        TitleL.setForeground(Color.yellow);
        TitleL.setFont(TitleL.getFont().deriveFont(20f));
        TitlePanel.add(TitleL);

        //RUNNING TOTAL
        CompScoreL= new JLabel("ComputerScore: ");
        CompScoreL.setForeground(Color.white);
        CompScoreL.setFont(CompScoreL.getFont().deriveFont(12f));
        CompScoreTF= new JLabel("0");
        CompScoreTF.setForeground(Color.WHITE);
        CompScoreTF.setFont(CompScoreTF.getFont().deriveFont(12f));
        PlayScoreL= new JLabel("Player Score: ");
        PlayScoreL.setForeground(Color.white);
        PlayScoreL.setFont(PlayScoreL.getFont().deriveFont(12f));
        PlayScoreTF= new JLabel("0");
        PlayScoreTF.setForeground(Color.WHITE);
        PlayScoreTF.setFont(PlayScoreTF.getFont().deriveFont(12f));

        //QUESTION COUNTER
        counterTF= new JLabel();
        counterTF.setText("Questions Left: ");
        counterTF.setBackground(Color.BLACK);
        counterTF.setFont(counterTF.getFont().deriveFont(12f));
        counterTF.setForeground(Color.WHITE);

        //ADD TO PANEL
        TitlePanel.add(CompScoreL);
        TitlePanel.add(CompScoreTF);
        TitlePanel.add(PlayScoreL);
        TitlePanel.add(PlayScoreTF);
        counterTF.setHorizontalAlignment(JTextField.RIGHT);
        counterNum= new JLabel();
        counterNum.setText("4");
        counterNum.setBackground(Color.BLACK);
        counterNum.setFont(counterNum.getFont().deriveFont(13f));
        counterNum.setForeground(Color.WHITE);
        counterNum.setHorizontalAlignment(JTextField.RIGHT);

        //QUESTION LABEL
        QuestionL = new JLabel("Think of who you would be if you were a character on The Incredibles.", SwingConstants.CENTER);
        QuestionL.setForeground(Color.ORANGE); //http://stackoverflow.com/questions/2966334/how-do-i-set-the-colour-of-a-label-coloured-text-in-java
        QuestionL.setFont(QuestionL.getFont().deriveFont(11f));

        //BUTTONS
        YesB= new JButton("YES");
        YesB.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yesButtonHandler(e);
            }
        });
        NoB= new JButton("NO");
        NoB.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                noButtonHandler(e);
            }
        });

        //TEXT FIELDS
        QuestionTF= new JTextField(35);
        QuestionTF.setBackground(Color.white);
        QuestionTF.setFont(QuestionTF.getFont().deriveFont(13f));//http://stackoverflow.com/questions/6461506/jtextarea-default-font-very-small-in-windows
        QuestionTF.setHorizontalAlignment(JTextField.CENTER);//http://www.daniweb.com/software-development/java/threads/21472/how-do-you-center-the-text-in-a-jtextfield
        QuestionTF.setText("Are you ready?");
        QuestionTF.setEditable(false);

        //ADD TO QUESTION PANEL
        QuestionPanel.add(counterTF);
        QuestionPanel.add(counterNum);
        QuestionPanel.add(QuestionL);
        QuestionPanel.add(QuestionTF);
        QuestionPanel.add(YesB);
        QuestionPanel.add(NoB);

        //SET CONTAINER PANEL LAYOUT
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
    public void yesButtonHandler(ActionEvent e) {

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
        QuestionL.setFont(QuestionTF.getFont().deriveFont(15f));
        QuestionL.setText("Question: ");
        if(a==0){
            ImagePanel.removeAll();
            FirstImg = new ImageIcon("../../IncredibleImage.png");
            image = new JLabel(FirstImg);
            image.setIcon(FirstImg);
            ImagePanel.add(image);
            ImagePanel.revalidate();
            ImagePanel.repaint();

            int j=4;
            counterNum.setText(Integer.toString(j));

            QuestionTF.setText("Are you Super?");
        }
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
            QuestionTF.setText("Are you ElastiGirl?");
            String i=counterNum.getText();
            int j=Integer.parseInt(i);
            j--;
            counterNum.setText(Integer.toString(j));
        }
        else if(a==8){
            QuestionTF.setText("Are you Dash?");
            String i=counterNum.getText();
            int j=Integer.parseInt(i);
            j--;
            counterNum.setText(Integer.toString(j));
        }
        else if(a==9){
            ImagePanel.removeAll();
            FirstImg = new ImageIcon("../../JavaVill.png");//Idea to run program with images 2 files up given by Levi Balling
            image = new JLabel(FirstImg);
            image.setIcon(FirstImg);
            ImagePanel.add(image);
            ImagePanel.revalidate();
            ImagePanel.repaint();

            QuestionL.setText("Answer: ");
            QuestionTF.setText("Awesome! Your Incredible Alter-Ego is a Villain!");
        }
        else if(a==10){
            ImagePanel.removeAll();
            FirstImg = new ImageIcon("../../JavaEdna.png");
            image = new JLabel(FirstImg);
            image.setIcon(FirstImg);
            ImagePanel.add(image);
            ImagePanel.revalidate();
            ImagePanel.repaint();

            QuestionL.setText("Answer: ");
            QuestionTF.setText("Awesome! Your Incredible Alter-Ego is Edna Mode!");
        }
        else if(a==11){
            ImagePanel.removeAll();
            FirstImg = new ImageIcon("../../JavaVillain.png");
            image = new JLabel(FirstImg);
            image.setIcon(FirstImg);
            ImagePanel.add(image);
            ImagePanel.revalidate();
            ImagePanel.repaint();

            QuestionL.setText("Answer: ");
            QuestionTF.setText("Awesome! Your Incredible Alter-Ego is some random Civilian!");
        }
        else if(a==12){
            ImagePanel.removeAll();
            FirstImg = new ImageIcon("../../JavaSyn.png");
            image = new JLabel(FirstImg);
            image.setIcon(FirstImg);
            ImagePanel.add(image);
            ImagePanel.revalidate();
            ImagePanel.repaint();

            QuestionL.setText("Answer: ");
            QuestionTF.setText("Awesome! Your Incredible Alter-Ego is Syndrome!");
        }
        else if(a==13){
            ImagePanel.removeAll();
            FirstImg = new ImageIcon("../../JavaViolet.png");
            image = new JLabel(FirstImg);
            image.setIcon(FirstImg);
            ImagePanel.add(image);
            ImagePanel.revalidate();
            ImagePanel.repaint();

            QuestionL.setText("Answer: ");
            QuestionTF.setText("Awesome! Your Incredible Alter-Ego is Violet!");
        }
        else if(a==14){
            ImagePanel.removeAll();
            FirstImg = new ImageIcon("../../JavaElastiGirl.png");
            image = new JLabel(FirstImg);
            image.setIcon(FirstImg);
            ImagePanel.add(image);
            ImagePanel.revalidate();
            ImagePanel.repaint();

            QuestionL.setText("Answer: ");
            QuestionTF.setText("Awesome! Your Incredible Alter-Ego is ElastiGirl!");
        }
        else if(a==15){
            ImagePanel.removeAll();
            FirstImg = new ImageIcon("../../JavaMrI.png");
            image = new JLabel(FirstImg);
            image.setIcon(FirstImg);
            ImagePanel.add(image);
            ImagePanel.revalidate();
            ImagePanel.repaint();

            QuestionL.setText("Answer: ");
            QuestionTF.setText("Awesome! Your Incredible Alter-Ego is Mr. Incredible!");
        }
        //http://www.coderanch.com/t/340488/GUI/java/Adding-removing-components-JPanel
        else if(a==16){
            ImagePanel.removeAll();
            FirstImg = new ImageIcon("../../JavaJackJack.png");
            image = new JLabel(FirstImg);
            image.setIcon(FirstImg);
            ImagePanel.add(image);
            ImagePanel.revalidate();
            ImagePanel.repaint();

            QuestionL.setText("Answer: ");
            QuestionTF.setText("Awesome! Your Incredible Alter-Ego is Jack Jack!");
        }
        else if(a==17){
            ImagePanel.removeAll();
            FirstImg = new ImageIcon("../../JavaDash.png");
            image = new JLabel(FirstImg);
            image.setIcon(FirstImg);
            ImagePanel.add(image);
            ImagePanel.revalidate();
            ImagePanel.repaint();

            QuestionL.setText("Answer: ");
            QuestionTF.setText("Awesome! Your Incredible Alter-Ego is Dash!");
        }
        else if(a==18){
            QuestionTF.setText("Are you Mr. Incredible?");
            String i=counterNum.getText();
            int j=Integer.parseInt(i);
            j--;
            counterNum.setText(Integer.toString(j));
        }
        if(in<0){
            QuestionTF.setText("Uh oh. I'm out of Questions!");

            String j= PlayScoreTF.getText();
            int i= Integer.parseInt(j);
            i++;
            PlayScoreTF.setText(Integer.toString(i));
        }
        if(a==9||a==10||a==11||a==12||a==13||a==14||a==15||a==16||a==17){
            if(JOptionPane.showConfirmDialog(this, "Do you want to play again?")==JOptionPane.OK_OPTION){
                String i=CompScoreTF.getText();
                int j=Integer.parseInt(i);
                j++;
                CompScoreTF.setText(Integer.toString(j));

                QuestionTF.setText("Are you ready?");
                QuestionL.setText("Question: ");
            }
            else {
                QuestionTF.setText("Thanks for playing!");
                System.exit(0);
            }
        }
    }

    public void noButtonHandler(ActionEvent e) {
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
        else if(a==18){
            QuestionTF.setText("Are you Jack Jack?");
            String i=counterNum.getText();
            int j=Integer.parseInt(i);
            j--;
            counterNum.setText(Integer.toString(j));
        }
        if(a==9||a==10||a==11||a==12||a==13||a==14||a==15||a==16||a==17){
            QuestionTF.setText("Oh... well this is awkward...");
            QuestionL.setText("Answer: ");

            ImagePanel.removeAll();
            FirstImg = new ImageIcon("C:/Users/jensbaby/Documents/JavaVillain.png");
            image = new JLabel(FirstImg);
            image.setIcon(FirstImg);
            ImagePanel.add(image);
            ImagePanel.revalidate();
            ImagePanel.repaint();

            String i=PlayScoreTF.getText();
            int j=Integer.parseInt(i);
            j++;
            PlayScoreTF.setText(Integer.toString(j));

            if(JOptionPane.showConfirmDialog(this, "Do you want to play again?")==JOptionPane.OK_OPTION){
                QuestionTF.setText("Are you ready?");
                QuestionL.setText("Question: ");
            }
            else {
                QuestionTF.setText("Thanks for playing!");
                System.exit(0);
            }
        }
    }
}
