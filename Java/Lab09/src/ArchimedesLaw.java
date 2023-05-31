import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create input fields
        TextField massField = new TextField();
        TextField volumeField = new TextField();
        TextField densityField = new TextField();

        // Create button
        Button calculateButton = new Button("Calculate");
        calculateButton.setOnAction(e -> {
            // Get input values
            double mass = Double.parseDouble(massField.getText());
            double volume = Double.parseDouble(volumeField.getText());
            double density = Double.parseDouble(densityField.getText());

            // Calculate buoyancy force
            double buoyancyForce = calculateBuoyancyForce(mass, volume, density);

            // Display result
            Label resultLabel = new Label("Buoyancy force: " + buoyancyForce);
            VBox.setMargin(resultLabel, new Insets(10, 0, 0, 0));
            ((VBox) primaryStage.getScene().getRoot()).getChildren().add(resultLabel);
        });

        // Create layout
        VBox root = new VBox(10);
        root.setPadding(new Insets(10));
        root.getChildren().addAll(
                new Label("Mass:"),
                massField,
                new Label("Volume:"),
                volumeField,
                new Label("Density:"),
                densityField,
                calculateButton
        );

        // Create scene
        Scene scene = new Scene(root, 300, 200);

        // Set scene and show stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Buoyancy Calculator");
        primaryStage.show();
    }

    private double calculateBuoyancyForce(double mass, double volume, double density) {
        // Calculate and return buoyancy force using Archimedes' principle
        return mass * 9.8; // Assuming acceleration due to gravity is 9.8 m/s^2
    }

    public static void main(String[] args) {
        launch(args);
    }
}
