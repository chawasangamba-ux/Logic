import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StackMain {
    public static void main(String[] args) {
      //  GUI gui = new GUI();
       //gui.setDefaultCloseOperation(gui.EXIT_ON_CLOSE);
        //gui.setSize(520,680);
        //gui.setVisible(true);
        //gui.getContentPane().setBackground(Constants.SECONDARY_COLOR);
        Stack he = new Stack(5);
        he.push(10);
        he.push(20);
        he.push(30);
        he.push(29);
        he.push(15);
        he.printStack();



    }
    }
