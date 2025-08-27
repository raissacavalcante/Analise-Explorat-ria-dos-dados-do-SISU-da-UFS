/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sisu;

import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.chart.*;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class Utilidade1Controller implements Initializable {

    @FXML
    private LineChart<String, Number> lineChart;
    
    @FXML
    private CategoryAxys eixoX;
    
    @FXML
    private NumberAxis eixoY;
    
    private List<Candidato> dados;
    
    public void initialize(){
        eixoX.setLabel("Ano");
        eixoY.setLabel("Nota de Corte");
        
        Map<String, Map<Integer, Double>> notasPorCampus = calcularNotacorte(dados, "");
        
        for(Map.Entry<String, Map<Integer, Double>> campus : notasPorCampus.entrySet()){
            XYChart.Series<String, Number> serie = new XYChart.Series<>();
            serie.setName(campus.getKey());
            
            for(Map.Entry<Integer, Double> ano : campus.getValue().entrySet()) {
                serie.getData().add(new XYChart.Data<>(ano.getKey().toString(), ano.getValue()));
            }
            
            lineChart.getData().add(serie);
        }
    }
    
    public void setDados(ArrayList<Candidato> dados) {
        this.dados= dados;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
