/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    double Weight;
    double Height;

    public static void main(String[] args) {
        App myApp = new App();
        myApp.readUserInput();
    }

    public void readUserInput(){
        System.out.print("Please enter your weight in pounds: ");
        while (!in.hasNextDouble()){
            System.out.print("Please enter a valid number.\nPlease enter your weight in pounds: ");
            in.next();
        }
        Weight = in.nextDouble();
        System.out.print("Please enter your height in inches: ");
        while (!in.hasNextDouble()){
            System.out.print("Please enter a valid number.\nPlease enter your height in inches: ");
            in.next();
        }
        Height = in.nextDouble();
        CalcBMI(Weight, Height);
    }

    public void CalcBMI(double Weight, double Height){
        double BMI = (Weight/(Height*Height))*703;
        withinRange(BMI);
    }
    
    public void withinRange(double BMI){
        if (BMI < 25 && BMI > 18.5) {
            System.out.printf("Your BMI is %s.\nYou are within the ideal weight range.", BMI);
        } else if (BMI > 25) {
            System.out.printf("Your BMI is %s.\nYou are overweight. You should see your doctor.", BMI);
        } else if (BMI < 18.5) {
            System.out.printf("Your BMI is %s.\nYou are underweight. You should see your doctor.", BMI);
        }
    }
}