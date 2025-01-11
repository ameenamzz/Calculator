import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {

    public Calculator(){
        //Window Frame
        JFrame jf=new JFrame();
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(300,150);
        jf.setVisible(true);

        //Calculator display
        JLabel displayLabel=new JLabel("hello");
        displayLabel.setBounds(30,50,540,40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setForeground(Color.white);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(displayLabel);

        //Calculator Button

        //row 1 (7 8 9 /)
        JButton seveButton=new JButton("7");
        seveButton.setBounds(30,130,80,80);
        jf.add(seveButton);

        JButton eightButton=new JButton("8");
        eightButton.setBounds(130,130,80,80);
        jf.add(eightButton);
        
        JButton nineButton=new JButton("9");
        nineButton.setBounds(230,130,80,80);
        jf.add(nineButton);

        JButton divisionButton=new JButton("/");
        divisionButton.setBounds(330,130,80,80);
        jf.add(divisionButton);

         //row 2 (4 5 6 x)

        JButton fourButton=new JButton("4");
        fourButton.setBounds(30,230,80,80);
        jf.add(fourButton);

        JButton fiveButton=new JButton("5");
        fiveButton.setBounds(130,230,80,80);
        jf.add(fiveButton);

        JButton sixButton=new JButton("6");
        sixButton.setBounds(230,230,80,80);
        jf.add(sixButton);

        JButton mulButton=new JButton("x");
        mulButton.setBounds(330,230,80,80);
        jf.add(mulButton);

        //row 3 (1 2 3 -)
        JButton oneButton=new JButton("1");
        oneButton.setBounds(30,330,80,80);
        jf.add(oneButton);

        JButton twoButton=new JButton("2");
        twoButton.setBounds(130,330,80,80);
        jf.add(twoButton);

        JButton threeButton=new JButton("3");
        threeButton.setBounds(230,330,80,80);
        jf.add(threeButton);

        JButton minusButton=new JButton("-");
        minusButton.setBounds(330,330,80,80);
        jf.add(minusButton);

         //row 4 (. 0 = +)
         JButton dotButton=new JButton(".");
         dotButton.setBounds(30,430,80,80);
         jf.add(dotButton);
 
         JButton zeroButton=new JButton("0");
         zeroButton.setBounds(130,430,80,80);
         jf.add(zeroButton);
 
         JButton equalButton=new JButton("=");
         equalButton.setBounds(230,430,80,80);
         jf.add(equalButton);

         JButton addButton=new JButton("+");
         addButton.setBounds(330,430,80,80);
         jf.add(addButton);
         

        
    }

    public static void main(String[] args) {
        new Calculator();
    }
}