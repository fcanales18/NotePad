package texteditor;

import javax.swing.JFrame;

public class TextEditor {

    public static void main(String[] args) {
       
        textEditorGUI obj = new textEditorGUI();
        obj.setBounds(0, 0, 750, 840);
        obj.setTitle("Notepad");
        obj.setResizable(true);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
