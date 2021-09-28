import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener{
    Label lbl1,lbl2,lbl3;
    TextField txt1,txt2,txt3;
    Button b1,b2,b3,b4,b5;
    public Calculator(){
        lbl1 = new Label("Number 1:");
        lbl2 = new Label("Number 2:");
        lbl3 = new Label("Result:");

        txt1 = new TextField(10);
        txt2 = new TextField(10);
        txt3 = new TextField(10);
        txt3.setEditable(false);

        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("*");
        b4 = new Button("/");
        b5 = new Button("C");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        
        setSize(600,400);
        
        setVisible(true);
        setLayout(null);

        lbl1.setBounds(10,30,80,30);
        lbl2.setBounds(10,60,80,30);
        lbl3.setBounds(10,90,80,30);

        txt1.setBounds(100,30,80,30);
        txt2.setBounds(100,60,80,30);
        txt3.setBounds(100,90,80,30);

        b1.setBounds(10,130, 40, 20);
        b2.setBounds(100,130, 40, 20);
        b3.setBounds(10,150, 40, 20);
        b4.setBounds(100,150, 40, 20);
        b5.setBounds(50,180, 40, 20);

        
        add(lbl1);
        add(lbl2);
        add(lbl3);

        add(txt1);
        add(txt2);
        add(txt3);
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
    }

    public void actionPerformed(ActionEvent ae) {
        double a,b,c=0.0;
        a = Double.parseDouble(txt1.getText());
        b = Double.parseDouble(txt2.getText());
        if(ae.getSource()==b1){
            c=a+b;
            txt3.setText(c+"");
        }
        if(ae.getSource()==b2){
            c=a-b;
            txt3.setText(c+"");
        }
        if(ae.getSource()==b3){
            c=a*b;
            txt3.setText(c+"");
        }
        if(ae.getSource()==b4){
            try{
                if(b==0){
                    throw new ArithmeticException("Divison By Zero Not Possible");
                }else{
                    c=a/b;
                }
            }catch(ArithmeticException e){
                System.out.println(e.toString());
            }
            txt3.setText(c+"");
        }
        if (ae.getSource() == b5) {
            txt3.setText("");
            txt2.setText("");
            txt1.setText("");
        }
    }

    public static void main(String args[]){
        Calculator c = new Calculator();
    }
}