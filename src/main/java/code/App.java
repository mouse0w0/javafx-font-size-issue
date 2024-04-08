package code;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        MyControl test = new MyControl();

        VBox vBox = new VBox(test);

        Scene scene = new Scene(vBox);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
