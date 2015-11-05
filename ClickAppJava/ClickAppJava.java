package ClickAppJava;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class ClickAppJava extends Application {
  @Override
  public void start(Stage stage){
    try {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("ClickAppJava.fxml"));
      Parent bp = (Parent)loader.load();
      Scene sc = new Scene(bp, 240, 240);
      stage.setScene(sc);
      stage.setTitle("クリックするとカウントアップ");
      stage.show();
      ClickAppJavaController controller = (ClickAppJavaController)loader.getController();
    } catch(IOException e){
      e.printStackTrace();
    }
  }
}
