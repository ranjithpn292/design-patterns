package com.example.design_patterns.CreationalPatterns.AbstractFactoryPattern;

interface ButtonInterface{
    void render();
}

interface ScrollBarInterface{
    void scrollbar();
}

interface UIFactory{
    ButtonInterface createButton();
    ScrollBarInterface createScrollbar();
}

class WindowsButton implements ButtonInterface {
    public void render(){
        System.out.println("Windows Button rendered");
    }
}

class WindowsScrollBar implements ScrollBarInterface{
    public void scrollbar(){
        System.out.println("Windows Scrollbar rendered");
    }
}


// Mac UI components

class MacButton implements ButtonInterface{
    public void render(){
        System.out.println("Mac Button rendered");
    }
}

class MacScrollBar implements ScrollBarInterface{
    public void scrollbar(){
        System.out.println("Mac Scrollbar rendered");
    }
}

class WindowsFactory implements UIFactory{

    @Override
    public ButtonInterface createButton() {
        return new WindowsButton();
    }

    @Override
    public ScrollBarInterface createScrollbar() {
        return new WindowsScrollBar();
    }
}

class MacFactory implements UIFactory{

    @Override
    public ButtonInterface createButton() {
        return new MacButton();
    }

    @Override
    public ScrollBarInterface createScrollbar() {
        return new MacScrollBar();
    }
}

public class GoodCode {
    private ButtonInterface button;
    private ScrollBarInterface scrollbar;

    public GoodCode(UIFactory factory){
        this.button = factory.createButton();
        this.scrollbar = factory.createScrollbar();
    }

    public void renderUI(){
        button.render();
        scrollbar.scrollbar();
    }


    public static void main(String[] args){
        // Use windows UI
            UIFactory windowsFactory = new WindowsFactory();
            GoodCode windowsApp = new GoodCode(new MacFactory());
            windowsApp.renderUI();

    }
}
