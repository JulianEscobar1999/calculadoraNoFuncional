
package javaapplication20;


import java.awt.*;
import javax.swing.*;


public class SimpleFrame {
 
    
    public static void main (String []args){
        
        JFrame frame = new JFrame();
        Image icon = Toolkit.getDefaultToolkit().getImage("icon.gift");
        frame.setIconImage(icon);
        JPanel panel = (JPanel) frame.getContentPane();
        panel.setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300,400));
        frame.setTitle("Calculadora");
        
        Button back = new Button("/");
        Button mult = new Button("*");
        Button sus = new Button("-");
        Button ad = new Button("+");
        Button equ = new Button("=");
        
        JPanel northAWest = new JPanel(new FlowLayout());
        northAWest.add(new Button("Editar"));
        northAWest.add(new Button("Ver"));
        northAWest.add(new Button("Ayuda"));                
        
        JPanel northA = new JPanel(new BorderLayout());
        northA.add(northAWest , BorderLayout.WEST);
        northA.add(new JTextField(), BorderLayout.SOUTH);
        
        
        JPanel northD = new JPanel(new GridLayout());          
        northD.setForeground(Color.RED);
        northD.add(new Button(" "));
        northD.add(new Button("Retroceso"));
        northD.add(new Button("CE"));
        northD.add(new Button("C"));

        JPanel north = new JPanel(new BorderLayout());
        north.add(northA, BorderLayout.NORTH);
        north.add(northD, BorderLayout.SOUTH);
                        

       
        JPanel centerL = new JPanel(new GridLayout(4,1));       
        centerL.setForeground(Color.RED);
        centerL.add(new Button("MC"));
        centerL.add(new Button("MR"));
        centerL.add(new Button("MS"));
        centerL.add(new Button("M+"));
        
        JPanel centerC = new JPanel(new GridLayout(4,5));        
        centerC.setForeground(Color.BLUE);
        centerC.add(new Button("7"));
        centerC.add(new Button("8"));
        centerC.add(new Button("9"));       
        back.setForeground(Color.RED);
        centerC.add(back);
        centerC.add(new Button("sqrt"));
        centerC.add(new Button("4"));
        centerC.add(new Button("5"));
        centerC.add(new Button("6"));
        mult.setForeground(Color.RED);
        centerC.add(mult);
        centerC.add(new Button("%"));
        centerC.add(new Button("1"));
        centerC.add(new Button("2"));
        centerC.add(new Button("3"));
        sus.setForeground(Color.RED);
        centerC.add(sus);
        centerC.add(new Button("1/x"));
        centerC.add(new Button("0"));
        centerC.add(new Button("+/-"));
        centerC.add(new Button("."));
        ad.setForeground(Color.RED);
        centerC.add(ad);
        equ.setForeground(Color.RED);
        centerC.add(equ);
        
        
        JPanel center = new JPanel(new BorderLayout());
        center.add(centerL, BorderLayout.WEST);
        center.add(centerC, BorderLayout.CENTER);
        
        
        frame.add(north, BorderLayout.NORTH);
        frame.add(center, BorderLayout.CENTER);
        
        
        
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2,
        dim.height/2-frame.getSize().height/2);
        frame.setTitle("Calculadora");
        frame.setVisible(true);
        
    }
    
}
