import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
        System.out.println("Done");
    }

    public void start(Stage primaryStage) throws Exception {
        Main.primaryStage = primaryStage;

        primaryStage.setScene(Start.startScene());
        primaryStage.setTitle("SplitBill - HackNotts20");
        primaryStage.show();
    }
}