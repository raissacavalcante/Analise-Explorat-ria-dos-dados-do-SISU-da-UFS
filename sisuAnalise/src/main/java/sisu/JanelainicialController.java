/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sisu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 * FXML Controller class
 *
 * @author sophi
 */
public class JanelainicialController implements Initializable {

    @FXML
    private ComboBox<?> filtroAno;
    @FXML
    private ComboBox<?> filtroCurso;
    @FXML
    private ComboBox<?> filtroCampus;
    @FXML
    private ComboBox<?> filtroDemanda;
    @FXML
    private Button botao1;
    @FXML
    private Button botao2;
    @FXML
    private Button botao3;
    @FXML
    private Button botao4;
    @FXML
    private Button botao5;
    @FXML
    private Button botao6;
    @FXML
    private Button botao7;
    @FXML
    private Button botao8;
    @FXML
    private Button botao9;
    @FXML
    private Button botao10;
    @FXML
    private Button botao11;
    @FXML
    private Button botao12;
    @FXML
    private TextArea txtInfo;
    @FXML
    private Button botaoAjuda;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void abrirF1(ActionEvent event) {
    }

    @FXML
    private void abrirF2(ActionEvent event) {
    }

    @FXML
    private void abrirF3(ActionEvent event) {
    }

    @FXML
    private void abrirF4(ActionEvent event) {
    }

    @FXML
    private void abrirF5(ActionEvent event) {
    }

    @FXML
    private void abrirF6(ActionEvent event) {
    }

    @FXML
    private void abrirF7(ActionEvent event) {
    }

    @FXML
    private void abrirF8(ActionEvent event) {
    }

    @FXML
    private void abrirF9(ActionEvent event) {
    }

    @FXML
    private void abrirF10(ActionEvent event) {
    }

    @FXML
    private void abrirF11(ActionEvent event) {
    }

    @FXML
    private void abrirF12(ActionEvent event) {
    }
    
    @FXML
    void switchAjuda(ActionEvent event) throws IOException {
        App.setRoot("help");
    }

}
