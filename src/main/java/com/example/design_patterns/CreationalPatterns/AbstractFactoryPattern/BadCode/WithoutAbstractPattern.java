package com.example.design_patterns.CreationalPatterns.AbstractFactoryPattern.BadCode;

// windows UI components
class WindowsButton {
    public void render(){
        System.out.println("Windows Button rendered");
    }
}

class WindowsScrollBar {
    public void scroll(){
        System.out.println("Windows Scrollbar rendered");
    }
}


// Mac UI components

class MacButton{
    public void render(){
        System.out.println("Mac Button rendered");
    }
}

class MacScrollBar{
    public void scroll(){
        System.out.println("Mac Scrollbar rendered");
    }
}

public class WithoutAbstractPattern {

    public static void main(String[] args){
        // windows UI
        WindowsButton button  = new WindowsButton();
        button.render();
    }
}
