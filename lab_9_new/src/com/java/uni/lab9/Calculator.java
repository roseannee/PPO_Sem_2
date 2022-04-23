package com.java.uni.lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel panel;
    private JButton sumButton;
    private JButton subtractionButton;
    private JButton multiplicationButton;
    private JButton divisionButton;
    private JButton clearButton;
    private JTextField num1;
    private JTextField num2;
    private JTextField output;
    private JLabel sign;
    private JLabel equals;
    private JLabel message;

    float a;
    float b;

    public void getNumbers() {
        a = Float.parseFloat(num1.getText());
        b = Float.parseFloat(num2.getText());
    }

    public void signs(String x, String y) {
        sign.setText(x);
        equals.setText(y);
    }

    public Calculator() {
        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (num1.getText().isEmpty() || num2.getText().isEmpty())
                    message.setText("Error! Enter data.");
                else {
                    getNumbers();
                    signs("+", "=");
                    output.setText(String.valueOf(a + b));
                }
            }
        });

        subtractionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (num1.getText().isEmpty() || num2.getText().isEmpty())
                    message.setText("Error! Enter data.");
                else {
                    getNumbers();
                    signs("-", "=");
                    output.setText(String.valueOf(a - b));
                }
            }
        });

        multiplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (num1.getText().isEmpty() || num2.getText().isEmpty())
                    message.setText("Error! Enter data.");
                else {
                    getNumbers();
                    signs("*", "=");
                    output.setText(String.valueOf(a * b));
                }
            }
        });

        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (num1.getText().isEmpty() || num2.getText().isEmpty())
                    message.setText("Error! Enter data.");
                else {
                    getNumbers();
                    signs("/", "=");
                    output.setText(String.valueOf(a / b));
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Component control : panel.getComponents())
                {
                    if (control instanceof JTextField) {
                        JTextField ctrl = (JTextField) control;
                        ctrl.setText("");
                    } else if (control instanceof JLabel) {
                        JLabel ctrl = (JLabel) control;
                        ctrl.setText("");
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
}