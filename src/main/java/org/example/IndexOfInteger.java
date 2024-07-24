package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<String>();
        while (true){
            System.out.println("Type an item to add to the list");
            String item = sc.nextLine();
            if (!item.equals("0")) {
                items.add(item);
            }
            else{
                break;
            }
        }
        System.out.println("Done entering numbers into the list");
        System.out.println("What number are you looking for in the list?");
        int index = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < items.size(); i++) {
            if (index == Integer.parseInt(items.get(i))) {
                System.out.println(index+" is at index "+(i));

            }
        }
    }
}
