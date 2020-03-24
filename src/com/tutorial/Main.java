package com.tutorial;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var box1 = new Textbox();
        var box2 = box1;
        var box3 = new Textbox();
        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());
        // will have a diff. hashcode cuz it's in a diff. address
        System.out.println(box3.hashCode());

        System.out.println(box1.toString());
        System.out.println(box1.equals(box2));
        System.out.println(box1.equals(box3));
    }
}
