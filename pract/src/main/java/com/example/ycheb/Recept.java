package com.example.ycheb;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;



public class Recept {
    int p1 = 0;
    int p2 = 0;

    @FXML
    private Button enterButton;

    @FXML
    private Button backButton;

    @FXML
    private Button back;

    @FXML
    private ListView<String> listOfFirst;

    @FXML
    private ListView<String> listOfSecond;
    @FXML
    private Label l1;

    @FXML
    private Label l2;

    @FXML
    private Label l3;

    @FXML
    private Label l4;

    @FXML
    private Label l5;

    @FXML
    private Label l6;

    @FXML
    private Label l7;

    @FXML
    private Label l8;

    @FXML
    private Label firstPrice;

    @FXML
    private Label secondPrice;

    @FXML
    private Label name;

    @FXML
    private Label price;

    JOptionPane JOptionPane;

    @FXML
    public void Back(ActionEvent event) {
        Stage stageCLose = (Stage) back.getScene().getWindow();
        stageCLose.close();
    }

    @FXML
    void click_Back(ActionEvent event) {
        Stage stageCLose = (Stage) backButton.getScene().getWindow();
        stageCLose.close();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("cur.fxml"));
        try {
            loader.load();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Scene scene = new Scene(root,500,300);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void button_enter_click(ActionEvent event) {
        String choice = "";
        ObservableList<String> object;
        object = listOfFirst.getSelectionModel().getSelectedItems();

        for (String w: object){
            choice += w;
        }
        String choice1 = "";

        ObservableList<String> object2;
        object2 = listOfSecond.getSelectionModel().getSelectedItems();

        for (String w2: object2){
            choice1 += w2;
        }
        if (choice.equals("") || choice1.equals("")){
            JOptionPane.showMessageDialog(null, "Ошибка!");
        }
        else {
            enterButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("cur3.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Scene scene = new Scene(root, 500, 300);
            Label price = (Label) scene.lookup("#price");
            Label name = (Label) scene.lookup("#name");

            if ((1 + listOfFirst.getSelectionModel().getSelectedIndex()) == 1) { //если выбранный элемент по индеску совпадает с 1 и записывает в переменную р1 и парсит
                p1 = Integer.parseInt(l1.getText().trim());
            }
            if ((1 + listOfFirst.getSelectionModel().getSelectedIndex()) == 2) {
                p1 = Integer.parseInt(l2.getText().trim());
            }
            if ((1 + listOfFirst.getSelectionModel().getSelectedIndex()) == 3) {
                p1 = Integer.parseInt(l2.getText().trim());
            }
            if ((1 + listOfFirst.getSelectionModel().getSelectedIndex()) == 4) {
                p1 = Integer.parseInt(l2.getText().trim());
            }

            if ((5 + listOfSecond.getSelectionModel().getSelectedIndex() == 5)) {
                p2 = Integer.parseInt(l5.getText().trim());
            }
            if ((5 + listOfSecond.getSelectionModel().getSelectedIndex() == 6)) {
                p2 = Integer.parseInt(l6.getText().trim());
            }
            if ((5 + listOfSecond.getSelectionModel().getSelectedIndex() == 7)) {
                p2 = Integer.parseInt(l7.getText().trim());
            }
            if ((5 + listOfSecond.getSelectionModel().getSelectedIndex() == 8)) {
                p2 = Integer.parseInt(l8.getText().trim());
            }

            if (p1 > p2) {
                price.setText(String.valueOf(p2)); //сравнение двух выбранных блюд
                name.setText(firstPrice.getText());
            } else {
                price.setText(String.valueOf(p1)); //запись цены в label сравненного блюда 
                name.setText(secondPrice.getText()); //запись адреса
            }

            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }

    }
}
