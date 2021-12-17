/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;

import javax.swing.*;
import java.awt.*;

public class FeeStructure extends JFrame{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
    JLabel i1;
    JLabel b1,b2,b3,b4,b5,b6,b7,b8;
    JLabel bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,bb10,bb11,bb12,bb13,bb14,bb15,bb16,bb17,bb18;
    JLabel m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;
    
    public FeeStructure(){
        
        setSize(1300,800);          // 1700 and 800
        setLocation(50,50);         // 100 and 100
        setLayout(null);
        
        i1 = new JLabel("Fee Structure");
        i1.setFont(new Font("serif",Font.ITALIC,56));
        i1.setBounds(600,10,400,70);
        add(i1);
        
        l1 = new JLabel("Course");
        l1.setBounds(80,100,100,40);     // 80,---
        l1.setFont(new Font("serif",Font.BOLD,26));
        add(l1);
        
        l2 = new JLabel("BTech");
        l2.setBounds(230,100,100,40);      // 280,---
        l2.setFont(new Font("serif",Font.BOLD,26));
        add(l2);
        
        l3 = new JLabel("BCA");
        l3.setBounds(380,100,100,40);       // 480
        l3.setFont(new Font("serif",Font.BOLD,26));
        add(l3);
        
        l4 = new JLabel("BBA");
        l4.setBounds(530,100,100,40);     // 680
        l4.setFont(new Font("serif",Font.BOLD,26));
        add(l4);
        
        bb5 = new JLabel("Rs 25k");
        bb5.setBounds(530,170,100,40);       // 680
        bb5.setFont(new Font("serif",Font.PLAIN,26));
        add(bb5);
        
        bb6 = new JLabel("Rs 25k");
        bb6.setBounds(530,240,100,40);      // 680
        bb6.setFont(new Font("serif",Font.PLAIN,26));
        add(bb6);
        
        bb7 = new JLabel("Rs 25k");
        bb7.setBounds(530,310,100,40);    // 680
        bb7.setFont(new Font("serif",Font.PLAIN,26));
        add(bb7);
        
        bb8 = new JLabel("Rs 25k");        // 680
        bb8.setBounds(530,380,100,40);
        bb8.setFont(new Font("serif",Font.PLAIN,26));
        add(bb8);
        
        bb13 = new JLabel("Rs 25k");
        bb13.setBounds(530,450,100,40);       // 680
        bb13.setFont(new Font("serif",Font.PLAIN,26));
        add(bb13);
        
        bb14 = new JLabel("Rs 25k");
        bb14.setBounds(530,520,100,40);   // 680
        bb14.setFont(new Font("serif",Font.PLAIN,26));
        add(bb14);
        
        l5 = new JLabel("Bsc");
        l5.setBounds(680,100,100,40);        //880
        l5.setFont(new Font("serif",Font.BOLD,26));
        add(l5);
        
        bb9 = new JLabel("Rs 18k");
        bb9.setBounds(680,170,100,40);   /// 880
        bb9.setFont(new Font("serif",Font.PLAIN,26));
        add(bb9);
        
        bb10 = new JLabel("Rs 18k");
        bb10.setBounds(680,240,100,40);        // 880
        bb10.setFont(new Font("serif",Font.PLAIN,26));
        add(bb10);
        
        bb11 = new JLabel("Rs 18k");
        bb11.setBounds(680,310,100,40);
        bb11.setFont(new Font("serif",Font.PLAIN,26));
        add(bb11);
        
        bb12 = new JLabel("Rs 18k");
        bb12.setBounds(680,380,100,40);
        bb12.setFont(new Font("serif",Font.PLAIN,26));
        add(bb12);
        
        bb15 = new JLabel("Rs 18k");
        bb15.setBounds(680,450,100,40);
        bb15.setFont(new Font("serif",Font.PLAIN,26));
        add(bb15);
        
        bb16 = new JLabel("Rs 18k");
        bb16.setBounds(680,520,100,40);
        bb16.setFont(new Font("serif",Font.PLAIN,26));
        add(bb16);
        
        l6 = new JLabel("MBA");
        l6.setBounds(830,100,100,40);       // 1080
        l6.setFont(new Font("serif",Font.BOLD,26));
        add(l6);
        
        m1 = new JLabel("Rs 65k");
        m1.setBounds(830,170,100,40);
        m1.setFont(new Font("serif",Font.PLAIN,26));
        add(m1);
        
        m2 = new JLabel("Rs 65k");
        m2.setBounds(830,240,100,40);
        m2.setFont(new Font("serif",Font.PLAIN,26));
        add(m2);
        
        m3 = new JLabel("Rs 65k");
        m3.setBounds(830,310,100,40);
        m3.setFont(new Font("serif",Font.PLAIN,26));
        add(m3);
        
        m4 = new JLabel("Rs 65k");
        m4.setBounds(830,380,100,40);
        m4.setFont(new Font("serif",Font.PLAIN,26));
        add(m4);
        
        l7 = new JLabel("MCA");
        l7.setBounds(980,100,100,40);        // 1280
        l7.setFont(new Font("serif",Font.BOLD,26));
        add(l7);
        
        m5 = new JLabel("Rs 55k");
        m5.setBounds(980,170,100,40);
        m5.setFont(new Font("serif",Font.PLAIN,26));
        add(m5);
        
        m6 = new JLabel("Rs 55k");
        m6.setBounds(980,240,100,40);
        m6.setFont(new Font("serif",Font.PLAIN,26));
        add(m6);
        
        m7 = new JLabel("Rs 55k");
        m7.setBounds(980,310,100,40);
        m7.setFont(new Font("serif",Font.PLAIN,26));
        add(m7);
        
        m8 = new JLabel("Rs 55k");
        m8.setBounds(980,380,100,40);
        m8.setFont(new Font("serif",Font.PLAIN,26));
        add(m8);
        
        l8 = new JLabel("MTech");
        l8.setBounds(1130,100,100,40);     // 1480
        l8.setFont(new Font("serif",Font.BOLD,26));
        add(l8);
        
        m9 = new JLabel("Rs 81k");
        m9.setBounds(1130,170,100,40);
        m9.setFont(new Font("serif",Font.PLAIN,26));
        add(m9);
        
        m10 = new JLabel("Rs 81k");
        m10.setBounds(1130,240,100,40);
        m10.setFont(new Font("serif",Font.PLAIN,26));
        add(m10);
        
        m11 = new JLabel("Rs 81k");
        m11.setBounds(1130,310,100,40);
        m11.setFont(new Font("serif",Font.PLAIN,26));
        add(m11);
        
        m12 = new JLabel("Rs 81k");
        m12.setBounds(1130,380,100,40);
        m12.setFont(new Font("serif",Font.PLAIN,26));
        add(m12);
        
        l10 = new JLabel("Sem 1");
        l10.setBounds(80,170,100,40);
        l10.setFont(new Font("serif",Font.BOLD,26));
        add(l10);
        
        l11 = new JLabel("Sem 2");
        l11.setBounds(80,240,100,40);
        l11.setFont(new Font("serif",Font.BOLD,26));
        add(l11);
        
        l12 = new JLabel("Sem 3");
        l12.setBounds(80,310,100,40);
        l12.setFont(new Font("serif",Font.BOLD,26));
        add(l12);
        
        l13 = new JLabel("Sem 4");
        l13.setBounds(80,380,100,40);
        l13.setFont(new Font("serif",Font.BOLD,26));
        add(l13);
        
        l14 = new JLabel("Sem 5");
        l14.setBounds(80,450,100,40);
        l14.setFont(new Font("serif",Font.BOLD,26));
        add(l14);
        
        l15 = new JLabel("Sem 6");
        l15.setBounds(80,520,100,40);
        l15.setFont(new Font("serif",Font.BOLD,26));
        add(l15);
        
        l16 = new JLabel("Sem 7");
        l16.setBounds(80,590,100,40);
        l16.setFont(new Font("serif",Font.BOLD,26));
        add(l16);
        
        l17 = new JLabel("Sem 8");
        l17.setBounds(80,660,100,40);
        l17.setFont(new Font("serif",Font.BOLD,26));
        add(l17);
        
        
        b1 = new JLabel("Rs 43k");
        b1.setBounds(230,170,100,40);
        b1.setFont(new Font("serif",Font.PLAIN,26));
        add(b1);
        
        b2 = new JLabel("Rs 43k");
        b2.setBounds(230,240,100,40);
        b2.setFont(new Font("serif",Font.PLAIN,26));
        add(b2);
        
        b3 = new JLabel("Rs 43k");
        b3.setBounds(230,310,100,40);
        b3.setFont(new Font("serif",Font.PLAIN,26));
        add(b3);
        
        b4 = new JLabel("Rs 43k");
        b4.setBounds(230,380,100,40);
        b4.setFont(new Font("serif",Font.PLAIN,26));
        add(b4);
        
        b5 = new JLabel("Rs 43k");
        b5.setBounds(230,450,100,40);
        b5.setFont(new Font("serif",Font.PLAIN,26));
        add(b5);
        
        b6 = new JLabel("Rs 43k");
        b6.setBounds(230,520,100,40);
        b6.setFont(new Font("serif",Font.PLAIN,26));
        add(b6);
        
        b7 = new JLabel("Rs 43k");
        b7.setBounds(230,590,100,40);
        b7.setFont(new Font("serif",Font.PLAIN,26));
        add(b7);
        
        b8 = new JLabel("Rs 43k");
        b8.setBounds(230,660,100,40);
        b8.setFont(new Font("serif",Font.PLAIN,26));
        add(b8);
        
        
        bb1 = new JLabel("Rs 32k");
        bb1.setBounds(380,170,100,40);
        bb1.setFont(new Font("serif",Font.PLAIN,26));
        add(bb1);
        
        bb2 = new JLabel("Rs 32k");
        bb2.setBounds(380,240,100,40);
        bb2.setFont(new Font("serif",Font.PLAIN,26));
        add(bb2);
        
        bb3 = new JLabel("Rs 32k");
        bb3.setBounds(380,310,100,40);
        bb3.setFont(new Font("serif",Font.PLAIN,26));
        add(bb3);
        
        bb4 = new JLabel("Rs 32k");
        bb4.setBounds(380,380,100,40);
        bb4.setFont(new Font("serif",Font.PLAIN,26));
        add(bb4);
        
        bb17 = new JLabel("Rs 32k");
        bb17.setBounds(380,450,100,40);
        bb17.setFont(new Font("serif",Font.PLAIN,26));
        add(bb17);
        
        bb18 = new JLabel("Rs 32k");
        bb18.setBounds(380,520,100,40);
        bb18.setFont(new Font("serif",Font.PLAIN,26));
        add(bb18);
        
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
}
