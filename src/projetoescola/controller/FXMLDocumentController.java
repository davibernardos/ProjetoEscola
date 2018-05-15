/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoescola.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.TextField;

/**
 *
 * @author Aluno
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField txtCodigo;
    
    @FXML
    private TextField txtNome;
    
    @FXML
    private TextField txtNascimento;
    
    @FXML
    private TextField txtCPF;
    
    @FXML
    private TextField txtRG;
    
    @FXML
    private TextField txtSexo;
    
    @FXML
    private TextField txtNomePai;
    
    @FXML
    private TextField txtNomeMae;
    
    @FXML
    private TextField txtEstadoCivil;
    
    @FXML
    private Button btnEnviar;
    
    @FXML
    private Button btnReset;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
