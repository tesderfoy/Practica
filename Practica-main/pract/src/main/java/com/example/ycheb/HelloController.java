package com.example.ycheb;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Button nextButton;

    @FXML
    private ListView<String> listViewOne;
    @FXML
    private ListView<String> listViewTwo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listViewOne.getItems().addAll("Юнистрим", "Авангард", "НБД-Банк", "Сбербанк","ВТБ", "Альфа-Банк");
        listViewTwo.getItems().addAll("Юнистрим", "Авангард", "НБД-Банк", "Сбербанк", "ВТБ", "Альфа-Банк");
        listViewOne.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        listViewTwo.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }

    @FXML
    void next() {

        String obmen1 = "";
        String obmen2 = "";

        ObservableList<String> object;
        ObservableList<String> object2;

        object = listViewOne.getSelectionModel().getSelectedItems();
        object2 = listViewTwo.getSelectionModel().getSelectedItems();

        for (String obm1: object){
            obmen1 += obm1;
        }
        for (String obm2: object2){
            obmen2 += obm2;
        }
        // проверка на пустоту и одинаковость
        if(obmen2.equals("") | obmen1.equals("") |(obmen2.equals(obmen1))){
            JOptionPane.showMessageDialog(null, "Ошибка!");
        }
        else {
            nextButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("wind2.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Scene scene = new Scene(root, 600, 300);

            ListView listOne = (ListView) scene.lookup("#ObmenOne");
            ListView listTwo = (ListView) scene.lookup("#ObmenTwo");

            Label nameObmOne = (Label) scene.lookup("#nameObmOne");
            Label nameObmTwo = (Label) scene.lookup("#nameObmTwo");
           // заполнение первой таблицы
            if (obmen1.equals("Юнистрим")) {
                listOne.getItems().addAll("Доллар    Евро       Юань",
                                            "70.5           76          10.25",
                                            "77              82           11.5");
                listOne.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


                nameObmOne.setText("Юнистрим");
            }
            if (obmen1.equals("Авангард")) {
                listOne.getItems().addAll("Доллар    Евро       ",
                        "71             76          ",
                        "78              83           ");
                listOne.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

                nameObmOne.setText("Авангард");
            }
            if (obmen1.equals("НБД-Банк")) {
                listOne.getItems().addAll("Доллар      Евро       ",
                        "73.80          78.70       ",
                        "77.70           81.10        ");
                listOne.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


                nameObmOne.setText("НБД-Банк");
            }
            if (obmen1.equals("Сбербанк")) {
                listOne.getItems().addAll("Доллар    Евро       Юань",
                        "69.42           76.09       10.60",
                        "78.82           83.52        13.48");
                listOne.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

                nameObmOne.setText("Сбербанк");
            }
            if (obmen1.equals("ВТБ")) {
                listOne.getItems().addAll("Доллар       Евро         Юань",
                        "72.01           75.91          10.2",
                        "77.01           80.91          11.24");
                listOne.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


                nameObmOne.setText("ВТБ");
            }
            if (obmen1.equals("Альфа-Банк")) {
                listOne.getItems().addAll("Доллар    Евро       Юань",
                        "72              76           10.6",
                        "79               83           11.5");
                listOne.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


                nameObmOne.setText("Альфа-Банк");
            }

            //  заполнение второй таблицы
            if (obmen2.equals("Юнистрим")) {
                listTwo.getItems().addAll("Доллар    Евро       Юань",
                        "70.5           76          10.25",
                        "77              82           11.5");;
                listTwo.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


                nameObmTwo.setText("Юнистрим");
            }
            if (obmen2.equals("Авангард")) {
                listTwo.getItems().addAll("Доллар    Евро       ",
                        "71             76          ",
                        "78              83           ");
                listTwo.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

                nameObmTwo.setText("Авангард");
            }
            if (obmen2.equals("НБД-Банк")) {
                listTwo.getItems().addAll("Доллар      Евро       ",
                        "73.80          78.70       ",
                        "77.70           81.10        ");
                listTwo.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


                nameObmTwo.setText("НБД-Банк");
            }
            if (obmen2.equals("Сбербанк")) {
                listTwo.getItems().addAll("Доллар    Евро       Юань",
                        "69.42           76.09       10.60",
                        "78.82           83.52        13.48");
                listTwo.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

                nameObmTwo.setText("Сбербанк");
            }
            if (obmen2.equals("ВТБ")) {
                listTwo.getItems().addAll("Доллар       Евро         Юань",
                        "72.01           75.91          10.2",
                        "77.01           80.91          11.24");
                listTwo.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

                nameObmTwo.setText("ВТБ");
            }
            if (obmen2.equals("Альфа-Банк")) {
                listTwo.getItems().addAll("Доллар    Евро       Юань",
                        "72              76           10.6",
                        "79               83           11.5");
                listTwo.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


                nameObmTwo.setText("Альфа-Банк");
            }
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
    }



}

