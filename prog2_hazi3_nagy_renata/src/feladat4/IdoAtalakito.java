/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat4;


import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Reni
 */
public class IdoAtalakito extends JFrame implements ActionListener{
    
    JLabel lb1;
    JLabel lb2;
    JLabel lb3;
    JLabel lb4;
    JLabel lb5;
    JLabel lb6;
    JLabel lb7;
    JLabel lb8;
    JLabel lb9;
    JLabel lb10;
    JLabel lb11;
    JLabel lb12;
    
    JTextField tf1;
    JTextField tf2;
    JTextField tf3;
    JTextField tf4;
    JTextField tf5;
    JTextField tf6;
    JTextField tf7;
    JTextField tf8;
    JTextField tf9;
    JTextField tf10;
    JTextField tf11;
    JTextField tf12;
    
    JButton b;
    
    JPanel p1;
    JPanel p2;
    JPanel p3;
    

    public IdoAtalakito(String title) throws HeadlessException {
        super(title);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.lb1 = new JLabel("nap");
        this.lb2 = new JLabel("óra");
        this.lb3 = new JLabel("perc");
        this.lb4 = new JLabel("másodperc");
        this.lb5 = new JLabel("nap");
        this.lb6 = new JLabel("óra");
        this.lb7 = new JLabel("perc");
        this.lb8 = new JLabel("másodperc");
        this.lb9 = new JLabel("nap");
        this.lb10 = new JLabel("óra");
        this.lb11 = new JLabel("perc");
        this.lb12 = new JLabel("másodperc");
        
        this.tf1 = new JTextField(10);
        this.tf2 = new JTextField(10);
        this.tf3 = new JTextField(10);
        this.tf4 = new JTextField(10);
        this.tf5 = new JTextField(10);
        this.tf6 = new JTextField(10);
        this.tf7 = new JTextField(10);
        this.tf8 = new JTextField(10);
        this.tf9 = new JTextField(10);
        this.tf10 = new JTextField(10);
        this.tf11 = new JTextField(10);
        this.tf12 = new JTextField(10);
        
        this.b = new JButton("Számol");
        this.b.addActionListener(this);
        
        this.p1 = new JPanel();
        this.p2 = new JPanel();
        this.p3 = new JPanel();
        
        GridLayout gr1 = new GridLayout(2,8);
        p1.setLayout(gr1);
        
        GridLayout gr2 = new GridLayout(1,8);
        p2.setLayout(gr2);
        p3.setLayout(gr2);
        
        GridLayout gr3 = new GridLayout(3,1);
        this.setLayout(gr3);
        
        
        p1.add(tf1);
        p1.add(lb1);
        p1.add(tf2);
        p1.add(lb2);
        p1.add(tf3);
        p1.add(lb3);
        p1.add(tf4);
        p1.add(lb4);
        
        p1.add(tf5);
        p1.add(lb5);
        p1.add(tf6);
        p1.add(lb6);
        p1.add(tf7);
        p1.add(lb7);
        p1.add(tf8);
        p1.add(lb8);
        
        p2.add(b);
        
        p3.add(tf9);
        p3.add(lb9);
        p3.add(tf10);
        p3.add(lb10);
        p3.add(tf11);
        p3.add(lb11);
        p3.add(tf12);
        p3.add(lb12);
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        
        pack();
        
        
    }
    
    public static void main(String[] args) {
        IdoAtalakito ido = new IdoAtalakito("IdoAtalakito");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if( e.getSource() == b){
            
            int nap=0;
            int ora=0;
            int perc=0;
            int masodperc=0;
            
            masodperc=Integer.parseInt(tf4.getText())+Integer.parseInt(tf8.getText());
            perc=Integer.parseInt(tf3.getText())+Integer.parseInt(tf7.getText());
            ora=Integer.parseInt(tf2.getText())+Integer.parseInt(tf6.getText());
            nap=Integer.parseInt(tf1.getText())+Integer.parseInt(tf5.getText());
            
            if(masodperc>59){
                masodperc -= 60;
                perc++;
            }
            if(perc>59){
                perc-= 60;
                ora++;
            }
            if(ora>23){
                ora-=24;
                nap++;
            }
            
            tf9.setText(Integer.toString(nap));
            tf10.setText(Integer.toString(ora));
            tf11.setText(Integer.toString(perc));
            tf12.setText(Integer.toString(masodperc));
        }
            
    }
    
    
}
