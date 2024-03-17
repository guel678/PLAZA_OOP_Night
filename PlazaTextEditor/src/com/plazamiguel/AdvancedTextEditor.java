package com.plazamiguel;

import java.util.Stack;

public class AdvancedTextEditor extends TextEditor {
    private Stack<String> history;
    public AdvancedTextEditor(String initialText){
        super(initialText);
        history = new Stack<>();
        history.push(initialText);

    }

    @Override
    public void append(String newText) {
        super.append(newText);
        history.push(getText());
    }

    @Override
    public void delete(int n) {
        super.delete(n);
        history.push(getText());
    }
    public void print(){
        System.out.println(getText());
    }
    public  void undo(){
        if (!history.isEmpty()){
            history.pop();
            if (!history.isEmpty()){
                setText(history.peek());
            }
        }
    }
}
