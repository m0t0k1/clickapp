package ClickAppJava;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ClickAppJavaController implements Initializable {
  @FXML Label counter;
  @FXML Button countup;

  private int count;

  @Override
  public void initialize(URL location, ResourceBundle resource){
    this.count = 0;
    countup.setOnAction((ActionEvent) -> {
      this.count++;
      counter.setText(Integer.toString(this.count));
    });
  }
}
