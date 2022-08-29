import cs3331.lab0.helper.HelloWorldFrame;
import javafx.stage.*;
import javafx.application.*;

public class App1 extends Application {

    public void start(Stage stage){
        new HelloWorldFrame(stage);
    }
    public static void main(String[] args){
        System.out.println("Hello");
        launch(args);
    }
}
