package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.*;
import java.awt.event.*;
import javax.swing.border.Border;
public class EmployeeInfo extends JFrame implements ActionListener {
    JTable table;
    JButton back;
    EmployeeInfo()
    {
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
         JLabel lblroom = new JLabel("Name");
         lblroom.setBounds(0,10,125,20);
         add(lblroom);
         Border border = BorderFactory.createLineBorder(Color.BLACK, 2); 
         lblroom.setBorder(border);
         
         JLabel lblavail = new JLabel("Age");
         lblavail.setBounds(125,10,125,20);
         add(lblavail);
         border = BorderFactory.createLineBorder(Color.BLACK, 2); 
         lblavail.setBorder(border);
         
         
         JLabel lblstatus = new JLabel("Gender");
         lblstatus.setBounds(250,10,125,20);
         add(lblstatus);
         border = BorderFactory.createLineBorder(Color.BLACK, 2); 
         lblstatus.setBorder(border);
         
         
         JLabel lblprice = new JLabel("Job");
         lblprice.setBounds(375,10,125,20);
         add(lblprice);
         border = BorderFactory.createLineBorder(Color.BLACK, 2); 
         lblprice.setBorder(border);
         
         
         JLabel lbltype = new JLabel("Salary");
         lbltype.setBounds(500,10,125,20);
         add(lbltype);
         border = BorderFactory.createLineBorder(Color.BLACK, 2); 
         lbltype.setBorder(border);
         
         JLabel lblphone = new JLabel("Phone");
         lblphone.setBounds(625,10,125,20);
         add(lblphone);
         border = BorderFactory.createLineBorder(Color.BLACK, 2); 
         lblphone.setBorder(border);
         
         JLabel lblemail = new JLabel("Email");
         lblemail.setBounds(750,10,125,20);
         add(lblemail);
         border = BorderFactory.createLineBorder(Color.BLACK, 2); 
         lblemail.setBorder(border);
         
         JLabel lblaadhar = new JLabel("Aadhar Number");
         lblaadhar.setBounds(875,10,125,20);
         add(lblaadhar);
         border = BorderFactory.createLineBorder(Color.BLACK, 2); 
         lblaadhar.setBorder(border);
         
         
         
         
         
         table = new JTable();
         table.setBounds(0,40,1000,400);
         add(table);
         try
         {
           Conn c = new Conn();
           ResultSet rs = c.s.executeQuery("select * from employee");
           table.setModel(DbUtils.resultSetToTableModel(rs));
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
        
        back = new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        back.setBounds(420,500,120,30);
        add(back);
        
        setBounds(300,200,1000,600);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == back)
        {
            setVisible(false);
            new Reception();
        }
    }
    public static void main(String args[])
    {
        new EmployeeInfo();
    }
}

