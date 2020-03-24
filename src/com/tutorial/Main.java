package com.tutorial;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var control = new UIControl(true);
        var box1 = new Textbox();
        box1.setText("Hello");
        show(control);

        //Upcasting (every Textbox IS A UIControl)
        show(box1);
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
