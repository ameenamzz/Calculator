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


    public Calculator(){
        //Window Frame
        JFrame jf=new JFrame();
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(300,150);
        jf.setVisible(true);

        //Calculator display
        displayLabel=new JLabel("hello");
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
        
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==seveButton) {
            displayLabel.setText("7");
        }
        else if (e.getSource() == eightButton) {
            displayLabel.setText("8");
        }

        else if (e.getSource() == nineButton) {
            displayLabel.setText("9");
        }

        else if (e.getSource() == divisionButton) {
            displayLabel.setText("/");
        }

        else if (e.getSource() == fourButton) {
            displayLabel.setText("4");
        }

        else if (e.getSource() == fiveButton) {
            displayLabel.setText("5");
        }

        else if (e.getSource() == sixButton) {
            displayLabel.setText("6");
        }

        else if (e.getSource() == mulButton) {
            displayLabel.setText("x");
        }

        else if (e.getSource() == oneButton) {
            displayLabel.setText("1");
        }

        else if (e.getSource() == twoButton) {
            displayLabel.setText("2");
        }

        else if (e.getSource() == threeButton) {
            displayLabel.setText("3");
        }

        else if (e.getSource() == minusButton) {
            displayLabel.setText("-");
        }

        else if (e.getSource() == dotButton) {
            displayLabel.setText(".");
        }

        else if (e.getSource() == zeroButton) {
            displayLabel.setText("0");
        }

        else if (e.getSource() == equalButton) {
            displayLabel.setText("=");
        }

        else if (e.getSource() == addButton) {
            displayLabel.setText("+");
        }
    }

}