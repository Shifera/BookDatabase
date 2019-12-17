package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
	// write your code here
        BookObject book1 = new BookObject("Java1001","Head First Java","Kathy Sierra and BertBates","Easy to read Java", 47.50);
        BookObject book2 = new BookObject("sku=Java1002","title=Thinking in Java","author=Bruce Eckel","description=Details about Java under the hood", 20.00);
        BookObject book3 = new BookObject("sku=Java1003","title=OCP:OracleCertifiedProfessionalJavaSE","author=Jeanne Boyarsky","description=Everything you need to know in one place", 45.00);
        BookObject book4 = new BookObject("sku=Java1004","title=Automate the Boring Stuff with Python","author=Al Sweigart","description=Fun with Python", 10.50);
        BookObject book5 = new BookObject("sku=Java1005","title=The Maker's Guide to the Zombie Apocalypse\t","author=Simon Monk","description=Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50);
        BookObject book6 = new BookObject("sku=Java1001","title=Raspberry Pi Projects for the Evil Genius","author=Donald Norris","description=A dozen fiendishly fun projects for the Raspberry Pi!", 14.75);

        System.out.println("please enter the sku");
        String rep = keyboard.nextLine();
    }
}
