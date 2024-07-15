package org.icestormikk.geneticalgorithmjava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.icestormikk.geneticalgorithmjava.core.domain.Chromosome;
import org.icestormikk.geneticalgorithmjava.core.domain.GeneticAlgorithm;
import org.icestormikk.geneticalgorithmjava.core.domain.Population;
import org.icestormikk.geneticalgorithmjava.core.domain.operators.parents.RouletteWheelParentsSelector;

import java.io.IOException;
import java.util.Random;
import java.util.stream.Stream;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Population<Integer, Chromosome<Integer>> population = new Population<>(
            Stream.generate(() -> new Chromosome<>(
                Stream.generate(() -> new Random().nextInt(0, 10)).limit(10).toList()
            ))
            .limit(10)
            .peek((c) -> c.setFitness(new Random().nextDouble(0, 100)))
            .toList()
        );

        GeneticAlgorithm<Integer, Chromosome<Integer>, Population<Integer, Chromosome<Integer>>> ga = new GeneticAlgorithm<>();
        ga.setParentsSelector(new RouletteWheelParentsSelector<>(2));
        System.out.println(ga.applyParentsSelection(population));

        launch();
    }
}