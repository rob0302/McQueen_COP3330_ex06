/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
import java.util.Scanner;
import java.util.Calendar;
public class retireCalc {

public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    System.out.print("What is your current age? ");
    int age = sc.nextInt();
    System.out.print("At what age do you want to retire? ");
int retireAge = sc.nextInt();

    int year = Calendar.getInstance().get(Calendar.YEAR);
int retireTime = retireAge - age;
int retireYear = year + retireTime;

    System.out.print("\nYou have "+retireTime+" years until you can retire.\n"+" It is "+year+", so you can retire in "+retireYear+".");

}
}
