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
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;

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
    private TabPane tabPane;
    @FXML
    private void abrirF1(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("help.fxml")); // seu FXML de help
            AnchorPane abaContent = loader.load();

            Tab novaAba = new Tab("Ajuda");
            novaAba.setContent(abaContent);
            tabPane.getTabs().add(novaAba);
            tabPane.getSelectionModel().select(novaAba);

            // Pega o controller se precisar passar dados
            HelpController controller = loader.getController();
            // controller.setAlgumaCoisa("texto"); // se precisar
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("abrirF1 foi chamado!");
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
