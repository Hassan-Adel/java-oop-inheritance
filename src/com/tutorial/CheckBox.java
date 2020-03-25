package com.tutorial;

//final class cannot be instantiated
public final class CheckBox extends UIControl {
    boolean checked;
    public CheckBox() {
        super(true);
    }

    @Override
    public void render() {
        System.out.println("Render CheckBox");
    }

    //final method cannot be overridden
    public final void check(){
        checked=true;
    }
}
