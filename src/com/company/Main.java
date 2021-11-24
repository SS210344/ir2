package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
	// write your code here
        /*
        ArrayList<String>names = new ArrayList<>();
        names.add("Ben");
        names.add("Thor");
        names.add("Zoe");
        names.add("Kate");
        int Max = 4;
        int Current  = 1;
        boolean found = false;
        System.out.println("what player are you looking for?");
        Scanner input = new Scanner(System.in);
        String PlayerName = input.next();

        while((found == false)&&(Current <= Max)){
            if (names.get(Current).equals(PlayerName)){
                found = true;
            }
            else{
                Current = Current +1;
            }
        }
        if (found ==  true){
            System.out.println("Yes, they have a top score");
        }
        else{
            System.out.println("no, they do not have a top score");
        }

         */
        /*
        System.out.println("decimal number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String output= "";
        while (number != 0){
            int remander = number%2;
            number = number/2;
            String bit = Integer.toString(remander);
            output = bit+output;


        }
        System.out.println(output);

         */
        Scanner input = new Scanner(System.in);
        System.out.println("input plaintext:");
        String plaintext = input.next();
        String[][] converter= new String[12][2];
        converter [0][0]= "A";
        converter [0][1]= "4";
        converter [1][0]= "B";
        converter [1][1]= "6";
        converter [2][0]= "E";
        converter [2][1]= "3";
        converter [3][0]= "I";
        converter [3][1]= "1";
        converter [4][0]= "L";
        converter [4][1]= "1";
        converter [5][0]= "M";
        converter [5][1]= "(V)";
        converter [6][0]= "N";
        converter [6][1]= "(\\)";
        converter [7][0]= "O";
        converter [7][1]= "0";
        converter [8][0]= "S";
        converter [8][1]= "5";
        converter [9][0]= "T";
        converter [9][1]= "7";
        converter [10][0]="V";
        converter [10][1]="\\/";
        converter [11][0]="W";
        converter [11][1]="'//";
        String output = "";
        boolean found = false;
        for (int i = 0; i < plaintext.length(); i++) {
            found = false;
            String letter = plaintext.substring(i,i+1);

            for (int j = 0; j < converter.length; j++) {
                if(converter[j][0].equals(letter)){
                    found = true;
                    output = output+converter[j][1];
                }
            }
            if(found != true){
                output=output+letter;
            }

        }
        System.out.println(output);
    }
}
