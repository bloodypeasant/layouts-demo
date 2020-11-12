package mvc.view.viewlet.demos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import mvc.Config;
import mvc.utilities.Traceable;

public class GridDemo extends JPanel implements Traceable, Config.DEMO {

  private static final long serialVersionUID = 1L;

  public GridDemo() {
    trace(this);
    setLayout(new GridLayout(3, 4, 10, 10));
    stylize();
    addButtons();
    addExplanation();
  }

  private void addButtons() {
    trace(this);
    for (int row = 0; row < 3; ++row) {
      for (int col = 0; col < 4; ++col) {
        if (row == 2 && col == 3) {
          continue;
        }
        add(new JButton("Button " + row + ":" + col));
      }
    }
  }

  private void addExplanation() {
    trace(this);
    JTextArea textArea = new JTextArea(TEXT_GRID);
    textArea.setSize(300, 100);
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);
    textArea.setEditable(false);
    add(textArea);
  }

  private void stylize() {
    trace(this);
    setOpaque(true);
    setBackground(Color.ORANGE);
    setPreferredSize(new Dimension(500, 500));
  }

}
