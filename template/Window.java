package com.codewithmosh.template;

public abstract class Window {
    private WindowAction windowAction;

    public Window() {
        windowAction = new WindowAction();
    }
    public void close() {
       windowAction.PreClose();
       augumentedClose();
       windowAction.PostClose();
    }

    protected abstract void augumentedClose();
}

public class CustomWindow1 extends Window {

    protected void augumentedClose(){
        System.out.println("Custom Window1 closing...");
    }

}

public class CustomWindow2 extends Window {

    protected void augumentedClose(){
        System.out.println("Custom Window2 closing...");
    }

}


public class WindowAction {
    public void PreClose() {
        System.out.println("Before closing");
    }

    public void PostClose() {
        System.out.println("After Closing");
    }
}


