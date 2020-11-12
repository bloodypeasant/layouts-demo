package mvc.view.viewlet;

import java.awt.CardLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import mvc.utilities.Traceable;
import mvc.view.View;
import mvc.view.viewlet.demos.*;

public class ContentPane extends JPanel implements Traceable {

  private static final long serialVersionUID = 1L;

  private CardLayout cardLayout = new CardLayout();
  public View view;

  public ContentPane(View view) {
    trace(this);
    this.view = view;
    setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    setLayout(cardLayout);
    add(new FlowDemo(), "Flow Layout");
    add(new BorderDemo(), "Border Layout");
    add(new CardDemo(), "Card Layout");
    add(new BoxDemo(), "Box Layout");
    add(new GridDemo(), "Grid Layout");
    add(new GridBagDemo(), "GridBag Layout");
    add(new GroupDemo(), "Group Layout");
    add(new SpringDemo(), "Spring Layout");
  }

  public void updateLayout(String layout) {
    trace(this);
    cardLayout.show(this, layout);
  }

}
