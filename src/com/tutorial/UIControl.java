package com.tutorial;

public class UIControl {
    private boolean isEnabled = true;

    public boolean isEnabled() {
        return isEnabled;
    }
    public void enable(){
        isEnabled = true;
    }
    public void disable(){
        isEnabled = false;
    }
}
