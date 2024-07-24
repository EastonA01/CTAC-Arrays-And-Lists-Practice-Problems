package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<String>();
        while (true){
            System.out.println("Type an item to add to the list");
            String item = sc.nextLine();
            if (!item.isEmpty()) {
                items.add(item);
            }
            else{
                break;
            }
        }
        System.out.println("The total amount of items in the list is: " + items.size());
    }
}
