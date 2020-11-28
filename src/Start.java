import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class Start {
    public static Scene startScene(){
        GridPane root = new GridPane();
        GridPane startGrid = new GridPane();

        Button splitButton = new Button("Split");


        startGrid.setVgap(20);
        startGrid.setHgap(20);
        startGrid.add(splitButton,10,15);

        root.add(startGrid,0,0);

        Scene startScene = new Scene(root,400,400);

        return startScene;
   }
}
