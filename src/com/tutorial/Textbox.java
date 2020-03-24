package com.tutorial;

public class Textbox extends UIControl{
    private String text = "";

    public Textbox() {
        //must call parents constructor first
        super(true);
        System.out.println("Textbox");
    }

    @Override
    public String toString(){
        return text;
    }

    public Textbox setText(String text) {
        this.text = text;
        return this;
    }
    public void clear(){
        text="";
    }
}
