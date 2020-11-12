package mvc.view.viewlet.demos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import mvc.Config;
import mvc.utilities.Traceable;

public class GridBagDemo extends JPanel implements Traceable, Config.DEMO {

  private static final long serialVersionUID = 1L;

  public GridBagDemo() {
    trace(this);
    setLayout(new GridBagLayout());
    stylize();
    addButtons();
    addExplanation();
  }

  private void addButtons() {
    trace(this);
    JButton button;
    GridBagConstraints constraints = new GridBagConstraints();

    constraints.fill = GridBagConstraints.HORIZONTAL;

    button = new JButton("r0-c0");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.weightx = 0.083333333;
    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.gridwidth = 1;
    add(button, constraints);

    button = new JButton("r0-c1");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.weightx = 0.083333333;
    constraints.gridx = 1;
    constraints.gridy = 0;
    constraints.gridwidth = 1;
    add(button, constraints);

    button = new JButton("r0-c2");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.weightx = 0.083333333;
    constraints.gridx = 2;
    constraints.gridy = 0;
    constraints.gridwidth = 1;
    add(button, constraints);

    button = new JButton("r0-c3");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.weightx = 0.083333333;
    constraints.gridx = 3;
    constraints.gridy = 0;
    constraints.gridwidth = 1;
    add(button, constraints);

    button = new JButton("r0-c4");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.weightx = 0.083333333;
    constraints.gridx = 4;
    constraints.gridy = 0;
    constraints.gridwidth = 1;
    add(button, constraints);

    button = new JButton("r0-c5");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.weightx = 0.083333333;
    constraints.gridx = 5;
    constraints.gridy = 0;
    constraints.gridwidth = 1;
    add(button, constraints);

    button = new JButton("r0-c6");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.weightx = 0.083333333;
    constraints.gridx = 6;
    constraints.gridy = 0;
    constraints.gridwidth = 1;
    add(button, constraints);

    button = new JButton("r0-c7");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.weightx = 0.083333333;
    constraints.gridx = 7;
    constraints.gridy = 0;
    constraints.gridwidth = 1;
    add(button, constraints);

    button = new JButton("r0-c8");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.weightx = 0.083333333;
    constraints.gridx = 8;
    constraints.gridy = 0;
    constraints.gridwidth = 1;
    add(button, constraints);

    button = new JButton("r0-c9");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.weightx = 0.083333333;
    constraints.gridx = 9;
    constraints.gridy = 0;
    constraints.gridwidth = 1;
    add(button, constraints);

    button = new JButton("r0-c10");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.weightx = 0.083333333;
    constraints.gridx = 10;
    constraints.gridy = 0;
    constraints.gridwidth = 1;
    add(button, constraints);

    button = new JButton("r0-c11");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.weightx = 0.083333333;
    constraints.gridx = 11;
    constraints.gridy = 0;
    constraints.gridwidth = 1;
    add(button, constraints);

    button = new JButton("r1-c0");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridx = 0;
    constraints.gridy = 1;
    constraints.gridwidth = 2;
    add(button, constraints);

    button = new JButton("r1-c2");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridx = 2;
    constraints.gridy = 1;
    constraints.gridwidth = 2;
    add(button, constraints);

    button = new JButton("r1-c4");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridx = 4;
    constraints.gridy = 1;
    constraints.gridwidth = 4;
    add(button, constraints);

    button = new JButton("r1-c8");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridx = 8;
    constraints.gridy = 1;
    constraints.gridwidth = 2;
    add(button, constraints);

    button = new JButton("r1-c10");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridx = 10;
    constraints.gridy = 1;
    constraints.gridwidth = 2;
    add(button, constraints);

    button = new JButton("r2-c0");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridx = 0;
    constraints.gridy = 2;
    constraints.gridwidth = 3;
    add(button, constraints);

    button = new JButton("r2-c3");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridx = 3;
    constraints.gridy = 2;
    constraints.gridwidth = 1;
    add(button, constraints);

    button = new JButton("r2-c8");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridx = 8;
    constraints.gridy = 2;
    constraints.gridwidth = 1;
    add(button, constraints);

    button = new JButton("r2-c9");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridx = 9;
    constraints.gridy = 2;
    constraints.gridwidth = 3;
    add(button, constraints);

    button = new JButton("r3-c0");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridx = 0;
    constraints.gridy = 3;
    constraints.gridwidth = 4;
    add(button, constraints);

    button = new JButton("r3-c8");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridx = 8;
    constraints.gridy = 3;
    constraints.gridwidth = 4;
    add(button, constraints);

    button = new JButton("r4-c0");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridx = 0;
    constraints.gridy = 4;
    constraints.gridwidth = 6;
    add(button, constraints);

    button = new JButton("r4-c6");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridx = 6;
    constraints.gridy = 4;
    constraints.gridwidth = 6;
    add(button, constraints);

    button = new JButton("r5-c0");
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridx = 0;
    constraints.gridy = 5;
    constraints.gridwidth = 12;
    add(button, constraints);
  }

  private void addExplanation() {
    trace(this);
    GridBagConstraints constraints = new GridBagConstraints();
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridx = 4;
    constraints.gridy = 3;
    constraints.gridwidth = 4;

    JTextArea textArea = new JTextArea(TEXT_GRID_BAG);
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);
    textArea.setEditable(false);
    add(textArea, constraints);
  }

  private void stylize() {
    trace(this);
    setOpaque(true);
    setBackground(Color.MAGENTA);
    setPreferredSize(new Dimension(500, 500));
  }

}
