import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.event.ActionEvent;

public class Calculator implements ActionListener {
    JLabel displayLabel;
    JButton seveButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton divisionButton;
    JButton mulButton;
    JButton minusButton;
    JButton addButton;
    JButton clearButton;
    boolean isOperatorClicked=false;
    String oldValue;
    String operator;

    public Calculator(){
        //Window Frame
        JFrame jf=new JFrame();
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(300,150);
        jf.setVisible(true);

        //Calculator display
        displayLabel=new JLabel("");
        displayLabel.setBounds(30,50,540,40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setForeground(Color.white);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(displayLabel);

        //Calculator Button

        //row 1 (7 8 9 /)
        seveButton=new JButton("7");
        seveButton.setBounds(30,130,80,80);
        seveButton.addActionListener(this);
        jf.add(seveButton);


        eightButton=new JButton("8");
        eightButton.setBounds(130,130,80,80);
        eightButton.addActionListener(this);
        jf.add(eightButton);
        
        nineButton=new JButton("9");
        nineButton.setBounds(230,130,80,80);
        nineButton.addActionListener(this);
        jf.add(nineButton);

        divisionButton=new JButton("/");
        divisionButton.setBounds(330,130,80,80);
        divisionButton.addActionListener(this);
        jf.add(divisionButton);

         //row 2 (4 5 6 x)

        fourButton=new JButton("4");
        fourButton.setBounds(30,230,80,80);
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton=new JButton("5");
        fiveButton.setBounds(130,230,80,80);
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton=new JButton("6");
        sixButton.setBounds(230,230,80,80);
        sixButton.addActionListener(this);
        jf.add(sixButton);

        mulButton=new JButton("x");
        mulButton.setBounds(330,230,80,80);
        mulButton.addActionListener(this);
        jf.add(mulButton);

        //row 3 (1 2 3 -)
        oneButton=new JButton("1");
        oneButton.setBounds(30,330,80,80);
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton=new JButton("2");
        twoButton.setBounds(130,330,80,80);
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton=new JButton("3");
        threeButton.setBounds(230,330,80,80);
        threeButton.addActionListener(this);
        jf.add(threeButton);

        minusButton=new JButton("-");
        minusButton.setBounds(330,330,80,80);
        minusButton.addActionListener(this);
        jf.add(minusButton);

         //row 4 (. 0 = +)
         dotButton=new JButton(".");
         dotButton.setBounds(30,430,80,80);
         dotButton.addActionListener(this);
         jf.add(dotButton);
 
         zeroButton=new JButton("0");
         zeroButton.setBounds(130,430,80,80);
         zeroButton.addActionListener(this);
         jf.add(zeroButton);
 
         equalButton=new JButton("=");
         equalButton.setBounds(230,430,80,80);
         equalButton.addActionListener(this);
         jf.add(equalButton);

         addButton=new JButton("+");
         addButton.setBounds(330,430,80,80);
         addButton.addActionListener(this);
         jf.add(addButton);

         clearButton=new JButton("clear");
         clearButton.setBounds(430,430,80,80);
         clearButton.addActionListener(this);
         jf.add(clearButton);
        
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==seveButton) {
            if(isOperatorClicked){
                displayLabel.setText("7");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"7");
            }

        }
        else if (e.getSource() == eightButton) {
            if(isOperatorClicked){
                displayLabel.setText("8");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"8");
            }
        }

        else if (e.getSource() == nineButton) {
            if(isOperatorClicked){
                displayLabel.setText("9");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"9");
            }
        }

        else if (e.getSource() == divisionButton) {
            operator="/";
           isOperatorClicked=true;
           oldValue=displayLabel.getText();
        }

        else if (e.getSource() == fourButton) {
            if(isOperatorClicked){
                displayLabel.setText("4");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"4");
            }
        }

        else if (e.getSource() == fiveButton) {
            if(isOperatorClicked){
                displayLabel.setText("5");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"5");
            }
        }

        else if (e.getSource() == sixButton) {
            if(isOperatorClicked){
                displayLabel.setText("6");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"6");
            }
        }

        else if (e.getSource() == mulButton) {
            operator="x";
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
        }

        else if (e.getSource() == oneButton) {
            if(isOperatorClicked){
                displayLabel.setText("1");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"1");
            }
        }

        else if (e.getSource() == twoButton) {
            if(isOperatorClicked){
                displayLabel.setText("2");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"2");
            }
        }

        else if (e.getSource() == threeButton) {
            if(isOperatorClicked){
                displayLabel.setText("3");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"3");
            }
        }

        else if (e.getSource() == minusButton) {
            operator="-";
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
        }

        else if (e.getSource() == dotButton) {
            if(isOperatorClicked){
                displayLabel.setText(".");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+".");
            }
        }

        else if (e.getSource() == zeroButton) {
            if(isOperatorClicked){
                displayLabel.setText("0");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"0");
            }
        }

        else if (e.getSource() == equalButton) {
            String newValue=displayLabel.getText();
            float oldValuef=Float.parseFloat(oldValue);
            float newValueF=Float.parseFloat(newValue);

            if (operator=="+") {
                float result=oldValuef+newValueF;
                displayLabel.setText(result+"");
            }
            if (operator=="-") {
                float result=oldValuef-newValueF;
                displayLabel.setText(result+"");
                
            }
            if (operator=="x") {
                float result=oldValuef*newValueF;
                displayLabel.setText(result+"");
    
            }
            if (operator=="/") {
                float result=oldValuef/newValueF;
                displayLabel.setText(result+"");
               
            }
            isOperatorClicked=true;
        }

        else if (e.getSource() == addButton) {
             operator="+";
             isOperatorClicked=true;
             oldValue=displayLabel.getText();
        }

        else if (e.getSource() == clearButton) {
            displayLabel.setText("");
        }
    }

}