package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class SumOfList {
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
        System.out.print(formatItems(items));
        System.out.println(" were the items in the list- the sum is: ");
        System.out.println(addSums(items));
    }

    public static String formatItems(ArrayList<String> items) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            if (i > 0) {
                if (i == items.size() - 1) {
                    sb.append(" and ");
                } else {
                    sb.append(", ");
                }
            }
            sb.append(items.get(i));
        }
        return sb.toString();
    }

    public static int addSums(ArrayList<String> list){
        int total = 0;
        for (String s : list) {
            total = total + Integer.parseInt(s);
        }
        return total;
    }
}
