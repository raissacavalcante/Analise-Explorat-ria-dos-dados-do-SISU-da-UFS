/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sisu;

import java.io.IOException;
import java.net.URL;
import java.util.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
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
    private ComboBox<String> filtroAno;
    @FXML
    private ComboBox<String> filtroCurso;
    @FXML
    private ComboBox<String> filtroCampus;
    @FXML
    private ComboBox<String> filtroDemanda;
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
    
    @FXML
    private TabPane tabPane;

    @FXML
    private Tab tabPrincipal;
 
    private ArrayList<Candidato> dadosSisu;
    private Set<String> campus, demandas, cursos;

    private void preencherFiltros(){
        List<String> anos = Arrays.asList("2019", "2020", "2021", "2022", "2023", "2024", "2025");
        filtroAno.getItems().addAll(anos);
        
        campus = new TreeSet<>();
        demandas = new TreeSet<>();
        cursos = new TreeSet<>();
        
        if (dadosSisu != null && !dadosSisu.isEmpty()) {
            for (Candidato candidato : dadosSisu) {
                campus.add(candidato.campus);
                demandas.add(candidato.demanda);
                cursos.add(candidato.curso);
            }
            
            filtroDemanda.getItems().addAll(demandas);
            filtroCurso.getItems().addAll(cursos);
            filtroCampus.getItems().addAll(campus);
        }
        
    }
    
    private ArrayList<Candidato> filtrarDados() {
        String cursoSelecionado = filtroCurso.getSelectionModel().getSelectedItem();
        String anoSelecionado = filtroAno.getSelectionModel().getSelectedItem();
        String demandaSelecionada = filtroDemanda.getSelectionModel().getSelectedItem();
        String campusSelecionado = filtroCampus.getSelectionModel().getSelectedItem();

        ArrayList<Candidato> dadosFiltrados = new ArrayList<>();

        for (Candidato candidato : dadosSisu) {
            boolean validaAno = (anoSelecionado == null || String.valueOf(candidato.ano).equals(anoSelecionado) || anoSelecionado == "");
            boolean validaCurso = (cursoSelecionado == null || candidato.curso.equals(cursoSelecionado));
            boolean validaCampus = (campusSelecionado == null || candidato.campus.equals(campusSelecionado));
            boolean validaDemanda = (demandaSelecionada == null || candidato.demanda.equals(demandaSelecionada));

            if (validaAno && validaCurso && validaCampus && validaDemanda) {
                dadosFiltrados.add(candidato);
            }
        }
        return dadosFiltrados;
    }

    private void atualizar(){ 
        
        String cursoSelecionado = filtroCurso.getSelectionModel().getSelectedItem();
        String anoSelecionado = filtroAno.getSelectionModel().getSelectedItem();
        String demandaSelecionada = filtroDemanda.getSelectionModel().getSelectedItem();
        String campusSelecionado = filtroCampus.getSelectionModel().getSelectedItem();
        
        boolean validaAno = (anoSelecionado != null);
        boolean validaCampus = ( campusSelecionado != null);
        boolean validaDemanda = (demandaSelecionada != null);
        boolean validaCurso = (cursoSelecionado != "" && cursoSelecionado != null);

        botao1.setDisable(!validaAno);
        botao2.setDisable(!validaCampus);
        botao3.setDisable(!validaDemanda);
        botao4.setDisable(!validaCurso);
    }
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        this.dadosSisu = Dados.getInstancia().getListaCandidatos();
        botao12.setDisable(false);
        preencherFiltros();
        
        filtroAno.valueProperty().addListener((obs, oldVal, newVal) -> atualizar());
        filtroCampus.valueProperty().addListener((obs, oldVal, newVal) -> atualizar());
        filtroDemanda.valueProperty().addListener((obs, oldVal, newVal) -> atualizar());
        filtroCurso.valueProperty().addListener((obs, oldVal, newVal) -> atualizar());
        
    }    

    @FXML
    private void abrirAjuda(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("help.fxml"));
            AnchorPane abaContent = loader.load();

            Tab novaAba = new Tab("Ajuda");
            novaAba.setContent(abaContent);
            tabPane.getTabs().add(novaAba);
            tabPane.getSelectionModel().select(novaAba);

            HelpController controller = loader.getController();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("abrirF1 foi chamado!");
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
        try {
            ArrayList<Candidato> dadosParaF12 = filtrarDados();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("consultanome.fxml")); 
            AnchorPane abaContent = loader.load();

            Tab novaAba = new Tab("Consultar Nome");
            novaAba.setContent(abaContent);
            tabPane.getTabs().add(novaAba);
            tabPane.getSelectionModel().select(novaAba);

            ConsultanomeController controllerF12 = loader.getController();
            controllerF12.setDados(dadosParaF12);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    


}
