/*
Name:Sultan Alghamdi
Date:15th April 2020
Class code: D18126659
Assignment Name:Machine learning model, using Naïve Baye
Assignment Description: The Assignment asked us to make a program that would learn over
time to calculate the probability of a user having COVID-19 from a set of values
given to us on an Excel sheet without hardcoding any value into the Java projects.

 */

package Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User_Input extends Gui implements ActionListener {

    private JPanel mainPanel; // Making the main JFrame panel
    private JLabel title, temp, ache, travel, cough, sore; //Making the variable names
    private JButton button; // Making the button for the application
    private JRadioButton temperatureNormal, temperatureCool, temperatureHot,temperatureCold, achesYes, achesNo, coughYes, coughNo, soreThroatYes,
            soreThroatNo, RecentlytraveledYes, RecentlytraveledNo; // Setting the Radio buttons of each variable with Yes/No and Temperature of the pacient
    private ButtonGroup travels; //Setting button group to  move stuff faster
    public static String arr1[] = new String[5];
    Excel_Array prob = new Excel_Array();

    public User_Input() {
        //Initializing The variables of the Project
        panels();
        titles();
        temperature();
        ache();
        cough();
        sore();
        travel();
        button();
    }

    public void panels() {
        //Making the Main JPanel of the project
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        add(mainPanel);
    }

    public void titles() {
        //Setting the title of the project and the size of the panel
        setTitle("COVID-19");
        title = new JLabel("Please answer the following questions:");
        title.setFont(new Font(null, Font.BOLD, 14));
        title.setBounds(60, 0, 300, 50);
        mainPanel.add(title);
    }

    public void temperature() {

        //Asking the question for the user
        temp = new JLabel("What is your temperature?");
        mainPanel.add(temp);

        // Radio buttons for temp
        temperatureNormal = new JRadioButton("Normal");
        temperatureCool = new JRadioButton("Cool");
        temperatureHot = new JRadioButton("Hot");
        temperatureCold = new JRadioButton("Cold");
        //Setting the button group for Temp

        ButtonGroup temperature = new ButtonGroup();
        temperature.add(temperatureNormal);
        temperature.add(temperatureCool);
        temperature.add(temperatureHot);
        temperature.add(temperatureCold);

        //Adding them to the main panel
        mainPanel.add(temperatureNormal);
        mainPanel.add(temperatureCool);
        mainPanel.add(temperatureHot);
        mainPanel.add(temperatureCold);

        //Setting their boundries in the JPanel
        temp.setBounds(115, 60, 170, 20);
        temperatureNormal.setBounds(150, 95, 150, 20);
        temperatureCool.setBounds(150, 120, 150, 20);
        temperatureHot.setBounds(150, 145, 150, 20);
        temperatureCold.setBounds(150, 170, 150, 20);


    }

    public void ache() {
        //Asking the question for the user
        ache = new JLabel("Have you been Aching a lot?");
        achesYes = new JRadioButton("Yes");
        achesNo = new JRadioButton("No");
        mainPanel.add(ache);

        //Setting the button group for Ache
        ButtonGroup aches = new ButtonGroup();
        aches.add(achesYes);
        aches.add(achesNo);
        mainPanel.add(achesYes);
        mainPanel.add(achesNo);

        //Setting their boundries in the JPanel
        ache.setBounds(110, 200, 170, 20);
        achesYes.setBounds(150, 230, 170, 20);
        achesNo.setBounds(150, 255, 170, 20);
    }

    public void cough() {
        //Asking the question for the user
        cough = new JLabel("Have you been coughing a lot?");
        coughYes = new JRadioButton("Yes");
        coughNo = new JRadioButton("No");
        mainPanel.add(cough);

        //Setting the button group for cough
        ButtonGroup coughs = new ButtonGroup();
        coughs.add(coughYes);
        coughs.add(coughNo);
        mainPanel.add(coughYes);
        mainPanel.add(coughNo);

        //Setting their boundries in the JPanel
        cough.setBounds(100, 285, 180, 20);
        coughYes.setBounds(150, 315, 170, 20);
        coughNo.setBounds(150, 340, 170, 20);
    }

    public void sore() {
        //Asking the question for the user
        sore = new JLabel("Do you have a sore throat?");
        soreThroatYes = new JRadioButton("Yes");
        soreThroatNo = new JRadioButton("No");
        mainPanel.add(sore);

        //Setting the button group for sore throats
        ButtonGroup sores = new ButtonGroup();
        sores.add(soreThroatYes);
        sores.add(soreThroatNo);
        mainPanel.add(soreThroatYes);
        mainPanel.add(soreThroatNo);

        //Setting their boundries in the JPanel
        sore.setBounds(110, 370, 180, 20);
        soreThroatYes.setBounds(150, 400, 170, 20);
        soreThroatNo.setBounds(150, 425, 170, 20);
    }

    public void travel() {
        //Asking the question for the user
        travel = new JLabel("Have you recently traveled?");
        RecentlytraveledYes = new JRadioButton("Yes");
        RecentlytraveledNo = new JRadioButton("No");
        mainPanel.add(travel);

        //Setting the button group for
        travels = new ButtonGroup();
        travels.add(RecentlytraveledYes);
        travels.add(RecentlytraveledNo);
        mainPanel.add(RecentlytraveledYes);
        mainPanel.add(RecentlytraveledNo);

        //Setting their boundries in the JPanel
        travel.setBounds(110, 455, 180, 20);
        RecentlytraveledYes.setBounds(150, 485, 170, 20);
        RecentlytraveledNo.setBounds(150, 510, 170, 20);
    }

    public void button() {
        //Button panel with Test for corona
        button = new JButton("Test");
        button.addActionListener(this);
        mainPanel.add(button);
        //Setting boundries
        button.setBounds(130, 560, 100, 20);
    }


    @Override
    public void actionPerformed(ActionEvent e) {


        //If statement to only allow the user to continue if all the buttons are clicked
        if (!(temperatureCool.isSelected() || temperatureHot.isSelected() || temperatureNormal.isSelected() || temperatureCold.isSelected() ) ||
                !(achesYes.isSelected() || achesNo.isSelected()) || !(coughYes.isSelected() || coughNo.isSelected()) ||
                !(soreThroatYes.isSelected() || soreThroatNo.isSelected()) || !(RecentlytraveledNo.isSelected() || RecentlytraveledYes.isSelected() ))
            JOptionPane.showMessageDialog(null, "Error - You have to select all valid buttons", "Error", JOptionPane.ERROR_MESSAGE);

                //Setting arrays for each variables with arr[0],arr[1],arr[2],arr[3],arr[4]
        else {
            if (temperatureNormal.isSelected()) {
                arr1[0] = "Normal";
            }
            if (temperatureCool.isSelected()) {
                arr1[0] = "Cool";
            }
            if (temperatureHot.isSelected()) {
                arr1[0] = "Hot";
            }
            if (temperatureCold.isSelected()) {
                arr1[0] = "Cold";
            }
            if (achesYes.isSelected()) {
                arr1[1] = "Yes";
            }
            if (achesNo.isSelected()) {
                arr1[1] = "No";
            }
            if (coughYes.isSelected()) {
                arr1[2] = "Yes";
            }
            if (coughNo.isSelected()) {
                arr1[2] = "No";
            }
            if (soreThroatYes.isSelected()) {
                arr1[3] = "Yes";
            }
            if (soreThroatNo.isSelected()) {
                arr1[3] = "No";
            }
            if (RecentlytraveledYes.isSelected()) {
                arr1[4] = "Yes";
            }
            if (RecentlytraveledNo.isSelected()) {
                arr1[4] = "No";
            }

            prob.results(arr1);
            hide();
        }


    }


}