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
public class Presenter {

    private View view;
    private Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void login(String pass) {
        String result = "Contraseña Incorrecta";
        if (model.getPassword().equals(pass)) {
            result = "Contraseña Correcta";
            
        }
        view.updateStatusLabel(result);
    }
}