package mvc.view.viewlet.demos;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import mvc.Config;
import mvc.utilities.Traceable;

public class BoxDemo extends JPanel implements Traceable, Config.DEMO {

  private static final long serialVersionUID = 1L;

  public BoxDemo() {
    trace(this);
    // setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    stylize();
    addButtons();
    addExplanation();
  }

  private void addButtons() {
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
    for (int i = 0; i < 9; ++i) {
      panel.add(new JButton(TEXT_BUTTONS[i]));
    }
    add(panel);
  }

  private void addExplanation() {
    trace(this);
    JTextArea textArea = new JTextArea(TEXT_BOX);
    textArea.setSize(300, 50);
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);
    textArea.setEditable(false);
    add(textArea);
  }

  private void stylize() {
    trace(this);
    setOpaque(true);
    setBackground(Color.BLUE);
    setPreferredSize(new Dimension(500, 500));
  }

}

// package mvc.view;

// import java.awt.Color;
// import java.awt.Dimension;
// import java.awt.BorderLayout;

// import javax.swing.JButton;
// import javax.swing.JPanel;

// public class BorderDemo extends JPanel {

// private static final long serialVersionUID = 1L;
// ContentPane contentPane;

// public BorderDemo(ContentPane contentPane) {
// this.contentPane = contentPane;
// setLayout(new BorderLayout());
// add(new JButton("North"), BorderLayout.NORTH);
// add(new JButton("South"), BorderLayout.SOUTH);
// add(new JButton("East"), BorderLayout.EAST);
// add(new JButton("West"), BorderLayout.WEST);
// add(new JButton("Center"), BorderLayout.CENTER);
// setOpaque(true);
// setBackground(Color.RED);
// setPreferredSize(new Dimension(500, 500));
// }

// }
