/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author suneh_vo7g
 */
public class TestProduct {
    public static void main(String[] args){
        System.out.println("We Sell");
       Product[] array = new Product[3];
       Product apple = new Product("apple",10,4);
       Product corn = new Product("corn",12,3);
       Product orange = new Product("orange",6,4.5);
       array[0] = apple;
       array[1] = corn;
       array[2] = orange;
       for(int i=0; i<3; i++)
       {
           System.out.println(array[i]);
       }
       System.out.println("What product you want to buy?");
       Scanner input = new Scanner(System.in);
       
    }
}

