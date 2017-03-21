/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvp;

/**
 *
 * @author Syn
 */
public class Model {
    private String password;
    
    public Model() {
        password = "pass"; //Contraseña por deffecto
    }
    
    public void setPassword(String pass) {
        password = pass;
    }
    
    public String getPassword() {
        return password;
    }
}

