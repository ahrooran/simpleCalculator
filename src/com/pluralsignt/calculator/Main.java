package com.pluralsignt.calculator;
import javax.swing.*;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //supports multithreading making it more robust
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator();
            }
        });


    }

}


