import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Start {

    public static TextField totalPrice;
    public static TextField users;

    public static Scene startScene(){

        GridPane root = new GridPane();
        GridPane startGrid = new GridPane();

        Button splitButton = new Button("Split");

        totalPrice = new TextField();
        totalPrice.setPromptText("Total");
        users = new TextField();
        users.setPromptText("People");

        Label label1 = new Label("Split the bill: ");
        Label label2 = new Label("How many people?");

        startGrid.setVgap(25);
        startGrid.setHgap(25);
        startGrid.add(splitButton,2,5);
        startGrid.add(label1,1,1);
        startGrid.add(totalPrice,2,1);
        startGrid.add(label2,1,2);
        startGrid.add(users,2,2);

        root.add(startGrid,0,0);

        Scene startScene = new Scene(root,330,300);

        return startScene;
   }
}
