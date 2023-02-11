package com.example.ycheb;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import javax.swing.*;
import java.io.IOException;

public class Calculation {

    @FXML
    TextField colv, price;

    @FXML
    TextField response;

    @FXML
    private Button calculation, backButton;
    @FXML
    void back() throws IOException {
        backButton.getScene().getWindow().hide();
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("wind1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 575, 320);
        stage.setTitle("Обменник");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void calculation() {
        try {
            double clv = Double.parseDouble(colv.getText());
            double prc = Double.parseDouble(price.getText());
            double resp = clv*prc;
            JOptionPane.showMessageDialog(null, "Вам понадобится едениц валюты " + resp);

        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Ошибка!");
        }







    }















}
