package com.teamde.ventaspasteleria_td.Vista;

import com.teamde.ventaspasteleria_td.Modelo.Trabajador;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class PantallaTrabajador extends BorderPane {
    private Label lTitulo;
    private Button bAgregarUsuario;
    private HBox barra;
   private TableView tablaUsuarios;
    TabPane tabPane;
    Tab tab;
    //private ObservableList<Pastel> pasteles;

    public PantallaTrabajador(TabPane tabPane, Tab tab) {
        getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        this.tabPane = tabPane;
        this.tab = tab;
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        //Crea label del titulo
        this.lTitulo = new Label("Usuarios");
        //Le da estilo
        this.lTitulo.getStyleClass().add("label-titulo");
        //Tamanio del label de titulo
        this.lTitulo.setPrefHeight(70.0);
        //Cambiar despues por el helper del controlador
        //Pasteles listaHelper = new Pasteles();
        //metodo para crear la lista con el controlador
        //listaHelper.crearLista();
        //Se usa de momento pero luego de va a camniar por la lista real del controlador
        List<Trabajador> listaTrabajadorHelper = new ArrayList<>();
        //Se crea la tabla del usuario y se envia la lista del controlador(cambiar por lista helper)
        TablaTrabajador tablaTrabajadorHelper = new TablaTrabajador(listaTrabajadorHelper);
        //Se le asigna a la tabla this. el contenido de la tabla usuarios
        this.tablaUsuarios = tablaTrabajadorHelper.getTablaUsuario();

        //TableView tablaPasteles1 = this.tablaPasteles.getTablaPasteles();
        //TableView tablaPasteles1 = new TableView();
        //tablaPasteles1.setPrefWidth(1000.0);
        /*tablaPasteles1.setOnMouseClicked((evtm) -> {
            Pastel pastelSeleccionado = (Pastel)tablaPasteles1.getSelectionModel().getSelectedItem();
            if (evtm.getClickCount() == 2) {
                int seleccion = tablaPasteles1.getSelectionModel().getSelectedIndex();
                this.editarPastel(pastelSeleccionado, seleccion);
            }

        });*/

        this.bAgregarUsuario = new Button("Agregar Trabajador");
        this.bAgregarUsuario.getStyleClass().add("cssBoton");
        this.bAgregarUsuario.setOnAction((evtm) -> {
           this.crearUsuario();
        });
        this.barra = new HBox();
        this.barra.setSpacing(200.0);
        this.barra.setAlignment(Pos.CENTER);
        this.barra.getChildren().addAll(lTitulo, bAgregarUsuario);
        this.setTop(barra);
        this.setLeft(tablaUsuarios);
    }
    //private void editarPastel(Trabajador usuario, int seleccion) {
    /*private void editarUsuario() {
        Stage stage = new Stage();
        EditarUsuario = new EditarUsuario(stage, pastel, this.tablaUsuarios);
        Scene scene = new Scene(menu, 700.0, 600.0);
        scene.getStylesheets().add(this.getClass().getResource("styles.css").toExternalForm());
        stage.setTitle("Editar pastel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    private void crearPastel() {
        Stage stage = new Stage();
        AgregarPastel menu = new AgregarPastel(stage, this.tablaPasteles);
        Scene scene = new Scene(menu, 700.0, 600.0);
        scene.getStylesheets().add(this.getClass().getResource("styles.css").toExternalForm());
        stage.setTitle("Nuevo pastel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }*/

    private void crearUsuario(){
        Stage ventanaUsuario = new Stage();
        Pane root = new PantallaAgregarUsuarios();
        Scene escena = new Scene(root, 400, 300);
        //escena.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        ventanaUsuario.setScene(escena);
        ventanaUsuario.setResizable(false);
        ventanaUsuario.setAlwaysOnTop(true);
        ventanaUsuario.setTitle("Agregar Trabajador");
        ventanaUsuario.setAlwaysOnTop(true);
        ventanaUsuario.show();
    }
}