package mvc.view.viewlet.demos;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import mvc.Config;
import mvc.utilities.Traceable;

public class CardDemo extends JPanel implements Traceable, Config.DEMO {

  private static final long serialVersionUID = 1L;

  public CardDemo() {
    trace(this);
    stylize();
    addExplanation();
  }

  private void addExplanation() {
    trace(this);
    JTextArea textArea = new JTextArea(TEXT_CARD);
    textArea.setSize(300, 100);
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);
    textArea.setEditable(false);
    add(textArea);
  }

  private void stylize() {
    trace(this);
    setOpaque(true);
    setBackground(Color.CYAN);
    setPreferredSize(new Dimension(500, 500));
  }

}
