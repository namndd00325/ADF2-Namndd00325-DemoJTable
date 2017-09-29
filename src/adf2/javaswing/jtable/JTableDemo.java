/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf2.javaswing.jtable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Nam Nguyen
 */
public class JTableDemo extends JFrame{
    public JTableDemo(){
    String[] studentMenager = new String[]{"ID", "NAME", "BIRTHDAY", "PHONE", "EMAIL", "CLASSNAMER"};

        Object[][] student = new Object[][]{
            {"1", "Nguyen Duy Nam", "03/08/1995", "01626180455", "nguyenduynamnd@gmail.com", "C1702G"},
            {"2", "Nguyễn Duc Dong", "01/12/1994", "0123456789", "ducdong@gmail.com", "C1702G"},
            {"3", "Nguyễn Văn A", "01/12/1994", "0123456789", "vana@gmail.com", "C1702G"},
            {"4", "Nguyễn Văn A", "12/12/2003", "0123456789", "vana@gmail.com", "C1702G"},
            {"5", "Nguyễn Văn A", "12/12/2003", "0123456789", "vana@gmail.com", "C1702G"}};
          JTable table = new JTable(student, studentMenager);
         this.setSize(1000, 300);
        this.setTitle("Student Menager");
        this.add(new JScrollPane(table));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    
    }
    
    
}
