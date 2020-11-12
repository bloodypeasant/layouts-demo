package mvc;

import java.awt.EventQueue;

import mvc.utilities.Traceable;
import mvc.view.View;

public class App implements Traceable {

  public App() {
    trace(this);
    new View(this);
  }

  public static void make() {
    EventQueue.invokeLater(() -> {
      new App();
    });
  }

}
