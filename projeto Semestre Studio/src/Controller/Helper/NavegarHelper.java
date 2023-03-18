/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Telas.TelaCadastro;
import Telas.TelaLogin;

/**
 *
 * @author vinic
 */
public class NavegarHelper {

    private final TelaLogin view;
    private LoginHelper helper;

    public NavegarHelper(TelaLogin view) {
        this.view = view;
    }

    public void navegarParaCadastro() {

        TelaCadastro t;
        t = new TelaCadastro();
        t.setVisible(true);

        view.dispose();

    }

}
