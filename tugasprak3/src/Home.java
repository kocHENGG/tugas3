/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;

/**
 *
 * @author ACER
 */
public class Home extends JFrame {
    JLabel nama = new JLabel("Username : ");
    JTextField user = new JTextField();
    JLabel sandi = new JLabel("Password : ");
    JPasswordField pass = new JPasswordField();
    
    JButton login = new JButton ("Login");
    JButton cancel = new JButton ("Cancel");
    
    public Home()
    {
        setLocationRelativeTo(null);
        setTitle("Login");
        setSize(300,200);
        setDefaultCloseOperation(3);
        setVisible(true);
        setLayout(null);
        add(nama);
        add(user);
        add(sandi);
        add(pass);
        add(login);
        add(cancel);
        nama.setBounds(25,10,100,20);
        user.setBounds(110,10,150,20);
        sandi.setBounds(25,50,100,20);
        pass.setBounds(110,50,150,20);
        login.setBounds(25,100,100,20);
        cancel.setBounds(160,100,100,20);
    }
    
}
