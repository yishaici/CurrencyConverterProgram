import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


             // define list
                Boolean Y = true;
                Boolean loopFlag = Y;
                while (loopFlag == Y) {

                    ArrayList<Double> list = new ArrayList<>();
                    Scanner scanner1 = new Scanner(System.in);
                    Scanner scanner2 = new Scanner(System.in);
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Welcome to currency converter");
                    System.out.println("Please choose an option 1/2: ");
                    System.out.println("1: Dollars to Shekels");
                    System.out.println("2: Shekels to Dollars");
                    int input1 = scanner1.nextInt();
                    System.out.println("pleas enter amount to convert");
                    double input = scanner2.nextDouble();
                    Coin coin;
                    if (input1 == 1) {
                        coin = CoinFactory.getCoinInstance(Coins.USD);
                    } else {
                        coin = CoinFactory.getCoinInstance(Coins.ILS);
                    }
                    double value = coin.calculate(input);
                    System.out.println("Result = " + value);
                    // add to list
                    list.add(value);
                    System.out.println("Y/N");
//                    Boolean loopFlag = scanner3.nextBoolean();
                    loopFlag = scanner3.nextBoolean();
                    if (loopFlag != true){
                    System.out.println("Thanks for using from ");
                    System.out.println(value);

                    //            להפוך N/Y ל TRUE/FALSE

    }


    }}}





