// Name:	    Clint Serafino
// Class:	    CS 3305 W04
// Term:	    Fall 2023
// Instructor:  Carla McManus
// Assignment:  3 – Part 1 Iterator


import java.util.LinkedList;
import java.util.Scanner;

public class Part_1_Linked_List_Iterator {
    //Create Linked List
    static LinkedList<Integer> list = new LinkedList<>();


    //Create removeRepetitions Method
    static void removeRepetitions(){

        //Cycle through the list using p as variable
        for (int p = 0; p < list.size(); p++){
            //Each number in the list
            int number = list.get(p);
            //For each number compare q to p, if not last number in list
            for(int q = p+1; q <= list.size()-2; q++){
                //If q == p
                if(number == list.get(q)){
                    //remove number
                    list.remove(q);
                }
            }
        }
    }
    //Create printRange Method
    static void printRange(int x, int y){
        //If x > y
        if (x > y){
            for (int number : list) {
                //Do not include y in if statement
                if (number == x || number > x) {
                    System.out.print(number + " ");
                }
            }
        }
        else {
            //Print out list of numbers in range
            for (int number : list) {
                //(If number = x or is > x) and number < y, print element
                if ((number == x || number > x) && number < y) {
                    System.out.print(number + " ");
                }
            }
        }
    }



    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        //Add the integers in the linked list
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        //Ask for x and y value
        System.out.println("Please enter a x value");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter a y value");
        int y = sc.nextInt();
        sc.nextLine();

        //Call removeRepetition
        removeRepetitions();

        //Display printRange of input
        printRange(x,y);
    }
}