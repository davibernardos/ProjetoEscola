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
    private TextField txtNome;
    
    @FXML
    private TextField txtNascimento;
    
    @FXML
    private TextField txtCPF;
    
    @FXML
    private TextField txtRG;
    
    @FXML
    private RadioButton rbtnSexoM;
    
    @FXML
    private RadioButton rbtnSexoF;
    
    @FXML
    private TextField txtNomePai;
    
    @FXML
    private TextField txtNomeMae;
    
    @FXML   
    private TextField txtEstadoCivil;
    
    @FXML
    private RadioButton rbtnFoneCel;
    
    @FXML
    private RadioButton rbtnFoneTel;
    
    @FXML
    private TextField txtNumTelefone;
    
    @FXML
    private TextField txtEstado;
    
    @FXML
    private TextField txtCidade;
    
    @FXML
    private TextField txtRua;
    
    @FXML
    private TextField txtCEP;
    
    @FXML
    private TextField txtNumCasa;
    
    @FXML
    private Button btnEnviar;
    
    @FXML
    private Button btnReset;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    @FXML
    public void salvarDados(){
        System.out.println("CONTROLLER TESTE");
    }
    
    @FXML
    public void resetarDados(){
        txtCEP.setText("");
        txtCPF.setText("");
        txtCidade.setText("");
        txtEstado.setText("");
        txtNascimento.setText("");
        txtNome.setText("");
        txtNomeMae.setText("");
        txtNomePai.setText("");
        txtNumCasa.setText("");
        txtNumTelefone.setText("");
        txtRG.setText("");
        txtRua.setText("");
    }
}
