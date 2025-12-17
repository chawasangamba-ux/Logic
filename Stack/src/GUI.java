import javax.swing.*;
import java.awt.*;
import  java.awt.event.ActionEvent;
import  java.awt.event.ActionListener;

public class GUI extends JFrame implements  ActionListener {

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JTextField field;
    JLabel label1;
     Stack stack1 = new Stack(5);
    public GUI(){

        setLayout(null);
          field = new JTextField(10);
         field.setFont(new Font("Dialog", Font.BOLD , 20));
        field.setBounds(125,40,220,30);

          button1 = new JButton("push");
          button1.setBounds(130,80,100,50);
         button1.setFont(new Font("Dialog",Font.BOLD,18));
         button1.setBackground(Constants.TEXT_COLOR);
         button1.addActionListener(this);
          button2 = new JButton("pop");
        button2.setFont(new Font("Dialog",Font.BOLD,18));
        button2.setBounds(250,80,100,50);
        button2.addActionListener(this);
        button2.setBackground(Constants.TEXT_COLOR);
         button3 = new JButton("delete");
        button3.setFont(new Font("Dialog",Font.BOLD,18));
        button3.setBounds(130,150,100,50);
        button3.addActionListener(this);
        button3.setBackground(Constants.TEXT_COLOR);
        button4 = new JButton("peek");
        button4.setFont(new Font("Dialog",Font.BOLD,18));
        button4.setBounds(250,150,100,50);
        button4.setBackground(Constants.TEXT_COLOR);
        button4.addActionListener(this);
         add(field);
        add(button1);
        add(button2);
        add(button3);
        add(button4);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            label1 = new JLabel();
            label1.setForeground(Constants.TEXT_COLOR);
            label1.setFont(new Font("Dialog",Font.BOLD,18));
            label1.setBounds(150,200,200,50);
            if (e.getSource() == button1) {
                int number = Integer.parseInt(field.getText());
                stack1.push(number);
                label1.setText("Pushed: " + number);

        } else if (e.getSource() == button2) {
            int popped = stack1.pop();
            if (popped != -1)
                label1.setText("Popped: " + popped);
            else
                label1.setText("Stack is empty!");
        } else if (e.getSource() == button3) {
            stack1.deleteStack();
            label1.setText("Stack deleted.");
        } else if (e.getSource() == button4) {
            int peeked = stack1.peek();
            if (peeked != -1)
                label1.setText("Top: " + peeked);
            else
                label1.setText("Stack is empty!");
         }
        }catch (NumberFormatException ex) {
            label1.setText("Enter a valid number!");
        }
add(label1);
    }
}
