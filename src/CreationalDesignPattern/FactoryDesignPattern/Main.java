package CreationalDesignPattern.FactoryDesignPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Profession");
        String s = sc.nextLine();
        Profession p = Factory.getInstance(s);
        System.out.println(p.profession_name());
    }
}
