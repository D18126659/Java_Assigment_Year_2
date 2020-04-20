package Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CoronaTest extends Gui implements ActionListener {

    //Setting variables for the coronaTest panel
    JPanel corona, backbutton;
    JLabel tester;
    JButton back;
    String arr1[]= new String[5];
    String text;




    public CoronaTest(String text) {
        //Displaying coronaTest panel
        setTitle("COVID-19 Result");
        corona = new JPanel(new BorderLayout());
        add(corona);
        setSize(400,200);
        tester = new JLabel("You have tested " + text + " For Covid-19");
        backbutton=new JPanel(new FlowLayout());
        corona.add(tester);



        //Allowing the user to get back to the first panel/Setting the button to the bottom
        back = new JButton("Back");
        back.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        back.setSize(50,50);
        back.addActionListener(this);
        backbutton.add(back);


        getContentPane().add(corona, BorderLayout.NORTH);
        getContentPane().add(backbutton, BorderLayout.SOUTH);



        tester.setBorder(BorderFactory.createEmptyBorder(50, 100, 10, 0));

        arr1=User_Input.arr1;

        Excel_Sheet records = new Excel_Sheet();

    }

    //Allows the user to go back after the test
    @Override
    public void actionPerformed(ActionEvent e) {
        User_Input test = new User_Input();
        hide();
    }
}
