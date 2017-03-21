/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author syn
 */

public class View {
    private Presenter presenter; 
    private JLabel statusLabel;
    private JTextField inputField;
    
    public View() {}
    
    public void createUI() {
        //Creamos los elementos
        statusLabel = new JLabel("Ingrese contraseña: ");
        inputField = new JTextField(20);
        JButton loginButton = new JButton("Login");
        //Se le agrega el evento para actualiza al boton
        loginButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            presenter.login(inputField.getText()); } }
        
        ); 
        //Creamos y agregamos los elementos a la ventana
        Box topBox = Box.createHorizontalBox();
        topBox.add(statusLabel);
        topBox.add(Box.createHorizontalStrut(5));
        topBox.add(inputField);
        topBox.add(Box.createHorizontalStrut(5));
        topBox.add(loginButton);
        
        JFrame frame = new JFrame("Ejemplo MVP");
        ((JPanel)frame.getContentPane()).setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(topBox, BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    
    //Le asignamos un presentador a la vista
    public void setPresenter(Presenter pres) {       
        presenter = pres;     
    }
    
    //Llama al presentador y actualiza el estado del label.
    public void updateStatusLabel(String text) {
        statusLabel.setText(text);
    }
}