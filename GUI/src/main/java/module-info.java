module com.teamde.ventaspasteleria_td {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

//    requires org.controlsfx.controls;
//    requires com.dlsc.formsfx;
//    requires validatorfx;
//    requires org.kordamp.ikonli.javafx;
//    requires org.kordamp.bootstrapfx.core;
//    requires eu.hansolo.tilesfx;

    opens com.teamde.ventaspasteleria_td to javafx.fxml;
    exports com.teamde.ventaspasteleria_td;
    exports com.teamde.ventaspasteleria_td.Vista;
    opens com.teamde.ventaspasteleria_td.Vista to javafx.fxml;
}