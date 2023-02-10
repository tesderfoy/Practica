package com.example.ycheb;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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
    private Button enter, backButton;

    @FXML
    private ListView<String> firstList;


    @FXML
    private ListView<String> secondList;

    @FXML
    void enter_click(ActionEvent event) {

        String choice = "";
        ObservableList<String> object;
        object = firstList.getSelectionModel().getSelectedItems();

        for (String o: object){
            choice += o;
        }
        String choice1 = "";

        ObservableList<String> object2;
        object2 = secondList.getSelectionModel().getSelectedItems();

        for (String o2: object2){
            choice1 += o2;
        }

        if(choice1.equals("") || choice.equals("")){
            JOptionPane.showMessageDialog(null, "Ошибка!");
        }

        if (choice1.equals(choice)){
            JOptionPane.showMessageDialog(null, "Ошибка!");
        }
        else {
            enter.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("cur2.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Scene scene = new Scene(root, 600, 300);

            ListView list1 = (ListView) scene.lookup("#listOfFirst");
            ListView list2 = (ListView) scene.lookup("#listOfSecond");


            Label nameOne = (Label) scene.lookup("#nameOne");
            Label nameTwo = (Label) scene.lookup("#nameTwo");

            if (choice.equals("Юнистрим")) {
                list1.getItems().addAll("Доллар    Евро       Юань",
                                            "70.5           76          10.25",
                                            "77              82           11.5");
                list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


                nameOne.setText("Юнистрим");
            }
            if (choice.equals("Авангард")) {
                list1.getItems().addAll("Доллар    Евро       ",
                        "71             76          ",
                        "78              83           ");
                list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

                nameOne.setText("Авангард");
            }
            if (choice.equals("НБД-Банк")) {
                list1.getItems().addAll("Доллар      Евро       ",
                        "73.80          78.70       ",
                        "77.70           81.10        ");
                list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


                nameOne.setText("НБД-Банк");
            }
            if (choice.equals("Сбербанк")) {
                list1.getItems().addAll("Доллар    Евро       Юань",
                        "69.42           76.09       10.60",
                        "78.82           83.52        13.48");
                list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

                nameOne.setText("Сбербанк");
            }
            if (choice.equals("ВТБ")) {
                list1.getItems().addAll("Доллар       Евро         Юань",
                        "72.01           75.91          10.2",
                        "77.01           80.91          11.24");
                list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


                nameOne.setText("ВТБ");
            }
            if (choice.equals("Альфа-Банк")) {
                list1.getItems().addAll("Доллар    Евро       Юань",
                        "72              76           10.6",
                        "79               83           11.5");
                list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


                nameOne.setText("Альфа-Банк");
            }

            if (choice1.equals("Юнистрим")) {
                list2.getItems().addAll("Доллар    Евро       Юань",
                        "70.5           76          10.25",
                        "77              82           11.5");;
                list2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


                nameTwo.setText("Юнистрим");
            }
            if (choice1.equals("Авангард")) {
                list2.getItems().addAll("Доллар    Евро       ",
                        "71             76          ",
                        "78              83           ");
                list2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

                nameTwo.setText("Авангард");
            }
            if (choice1.equals("НБД-Банк")) {
                list2.getItems().addAll("Доллар      Евро       ",
                        "73.80          78.70       ",
                        "77.70           81.10        ");
                list2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


                nameTwo.setText("НБД-Банк");
            }
            if (choice1.equals("Сбербанк")) {
                list2.getItems().addAll("Доллар    Евро       Юань",
                        "69.42           76.09       10.60",
                        "78.82           83.52        13.48");
                list2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

                nameTwo.setText("Сбербанк");
            }

            if (choice1.equals("ВТБ")) {
                list2.getItems().addAll("Доллар       Евро         Юань",
                        "72.01           75.91          10.2",
                        "77.01           80.91          11.24");
                list2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

                nameTwo.setText("ВТБ");
            }
            if (choice1.equals("Альфа-Банк")) {
                list2.getItems().addAll("Доллар    Евро       Юань",
                        "72              76           10.6",
                        "79               83           11.5");
                list2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


                nameTwo.setText("Альфа-Банк");
            }
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        firstList.getItems().addAll("Юнистрим", "Авангард", "НБД-Банк", "Сбербанк","ВТБ", "Альфа-Банк"); //получение в лист записанных значений
        firstList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        secondList.getItems().addAll("Юнистрим", "Авангард", "НБД-Банк", "Сбербанк", "ВТБ", "Альфа-Банк");
        secondList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
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
    }

