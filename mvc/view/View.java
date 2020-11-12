package mvc.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;

import mvc.App;
import mvc.Config;
import mvc.utilities.Traceable;
import mvc.view.viewlet.ChoiceBox;
import mvc.view.viewlet.ContentPane;

public class View extends JFrame implements Traceable, Config.VIEW {

  private static final long serialVersionUID = 1L;
  public App app;
  public ChoiceBox choiceBox;
  private ContentPane contentPane;

  public View(App app) {
    trace(this);
    this.app = app;
    choiceBox = new ChoiceBox(this);
    contentPane = new ContentPane(this);
    add(choiceBox, BorderLayout.PAGE_START);
    add(contentPane, BorderLayout.CENTER);
    setTitle(TITLE);
    if (IS_PACKED) {
      pack();
    } else {
      setSize(UNPACKED_WIDTH, UNPACKED_HEIGHT);
    }
    setDefaultCloseOperation(CLOSE_OP);
    setResizable(IS_RESIZABLE);
    if (IS_CENTERED) {
      setLocationRelativeTo(null);
    }
    updateLayout("Card Layout");
    setVisible(IS_VISIBLE);
  }

  public void updateLayout(String layout) {
    trace(this);
    contentPane.updateLayout(layout);
    setTitle("Demonstrating " + layout);
  }

}
