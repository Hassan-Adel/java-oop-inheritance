package com.tutorial;

public abstract class UIControl {
    //private cannot be accessed by child class
    private boolean isEnabled;

    //no access modifiers means public in all classes in the SAME package (com.tutorial) but cannot be accessed by other packages
    boolean fitsWindow = true;

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        //System.out.println("UIControl");
    }

    public boolean isEnabled() {
        return isEnabled;
    }
    public void enable(){
        isEnabled = true;
    }
    public void disable(){
        isEnabled = false;
    }
    public abstract void render();
}
