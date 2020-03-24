package com.tutorial;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var point1 = new Point(1,2);
        var point2 = new Point(1,2);
        System.out.println(point1.equals(point2));
        System.out.println(point1 == point2);

        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
    }
    public static void show(UIControl uiControl){
        if(uiControl instanceof Textbox){
            //DownCasting
            var textBox = (Textbox)uiControl;
            textBox.setText("Hello after Downcasting");
        }
        System.out.println(uiControl);
    }
}
