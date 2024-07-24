package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
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
        System.out.println("The fifth item in the list is: " + items.get(4));
    }
}
