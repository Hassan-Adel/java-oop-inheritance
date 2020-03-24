package com.tutorial;

public class Main {

    public static void main(String[] args) {
	// write your code here
        UIControl[] controls = {new Textbox(),new CheckBox(), new Textbox()};
        for (UIControl ctrl: controls) {
            ctrl.render();
        }
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
