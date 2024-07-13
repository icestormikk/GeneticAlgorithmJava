module org.icestormikk.geneticalgorithmjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires static lombok;

    opens org.icestormikk.geneticalgorithmjava to javafx.fxml;
    exports org.icestormikk.geneticalgorithmjava;
    exports org.icestormikk.geneticalgorithmjava.gui.contollers;
    opens org.icestormikk.geneticalgorithmjava.gui.contollers to javafx.fxml;
}