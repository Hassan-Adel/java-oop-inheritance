package com.tutorial;

public class Textbox extends UIControl{
    private String text = "";

    public Textbox setText(String text) {
        this.text = text;
        return this;
    }
    public void clear(){
        text="";
    }
}
