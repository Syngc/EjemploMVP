/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvp;

import javax.swing.SwingUtilities;

/**
 *
 * @author syn
 */

public class MVP {

    public static void main(String[] args) { 
            
            View view = new View();
            view.setPresenter(new Presenter(view, new Model()));
            view.createUI();
    }
}
