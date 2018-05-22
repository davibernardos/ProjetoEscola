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
import javax.persistence.EntityManagerFactory;
import projetoescola.dao.EnderecoJpaController;
import projetoescola.model.Endereco;

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
    private RadioButton rbtnSexoM;
    
    @FXML
    private RadioButton rbtnSexoF;
    
    @FXML
    private RadioButton rbtnSexoO;
    
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
        Endereco end = new Endereco();
        end.setRua(txtRua.getText());
        end.setNumero(txtNumCasa.getText());
        end.setCidade(txtCidade.getText());
        end.setEstado(txtEstado.getText());
        end.setCep(txtCEP.getText());
        
        EnderecoJpaController ejc = new EnderecoJpaController(EnderecoJpaController.getEM());
        ejc.create(end);
    }
}
