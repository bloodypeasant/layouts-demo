package mvc.view.viewlet.demos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import mvc.Config;
import mvc.utilities.Traceable;

public class BorderDemo extends JPanel implements Traceable, Config.DEMO {

  private static final long serialVersionUID = 1L;

  public BorderDemo() {
    trace(this);
    setLayout(new BorderLayout());

    add(new JButton("North"), BorderLayout.NORTH);
    add(new JButton("South"), BorderLayout.SOUTH);
    add(new JButton("East"), BorderLayout.EAST);
    add(new JButton("West"), BorderLayout.WEST);
    add(new JButton("Center"), BorderLayout.CENTER);
    addButtons();
    addExplanation();
    stylize();
  }

  private void addButtons() {
    trace(this);
    JPanel eastPanel = new JPanel(new GridLayout(9, 1, 4, 4));
    JPanel northPanel = new JPanel(new GridLayout(1, 4, 4, 4));
    JPanel southPanel = new JPanel(new GridLayout(1, 4, 4, 4));
    JPanel westPanel = new JPanel(new GridLayout(9, 1, 4, 4));

    eastPanel.setBackground(Color.GRAY);
    northPanel.setBackground(Color.GRAY);
    southPanel.setBackground(Color.GRAY);
    westPanel.setBackground(Color.GRAY);

    for (int i = 0; i < 9; ++i) {
      eastPanel.add(new JButton(TEXT_BUTTONS[i]));
      westPanel.add(new JButton(TEXT_BUTTONS[i]));
    }
    for (int i = 0; i < 4; ++i) {
      northPanel.add(new JButton(TEXT_BUTTONS[i]));
      southPanel.add(new JButton(TEXT_BUTTONS[i]));
    }

    add(eastPanel, BorderLayout.LINE_END);
    add(westPanel, BorderLayout.LINE_START);
    add(northPanel, BorderLayout.PAGE_START);
    add(southPanel, BorderLayout.PAGE_END);
  }

  private void addExplanation() {
    trace(this);
    JTextArea textArea = new JTextArea(TEXT_BORDER);
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);
    textArea.setEditable(false);
    add(textArea, BorderLayout.CENTER);
  }

  private void stylize() {
    trace(this);
    setOpaque(true);
    setBackground(Color.GRAY);
    setPreferredSize(new Dimension(500, 500));
  }

}
