package mvc.view.viewlet.demos;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import mvc.Config;
import mvc.utilities.Traceable;

public class FlowDemo extends JPanel implements ActionListener, Traceable, Config.DEMO {

  private static final long serialVersionUID = 1L;

  public FlowDemo() {
    trace(this);
    setLayout(new FlowLayout(FlowLayout.LEFT));
    stylize();
    addButtons();
    addExplanation();
    addOptions();
  }

  private void addButtons() {
    trace(this);
    for (int i = 0; i < 9; ++i) {
      add(new JButton(TEXT_BUTTONS[i]));
    }
  }

  private void addExplanation() {
    trace(this);
    JTextArea textArea = new JTextArea(TEXT_FLOW);
    textArea.setSize(300, 100);
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);
    textArea.setEditable(false);
    add(textArea);
  }

  private void addOptions() {
    trace(this);
    ButtonGroup group = new ButtonGroup();

    JRadioButton leftButton = new JRadioButton("Left");
    leftButton.setActionCommand("Left");
    leftButton.setSelected(true);
    leftButton.addActionListener(this);
    group.add(leftButton);
    add(leftButton);

    JRadioButton rightButton = new JRadioButton("Right");
    rightButton.setActionCommand("Right");
    rightButton.addActionListener(this);
    group.add(rightButton);
    add(rightButton);
  }

  private void stylize() {
    trace(this);
    setOpaque(true);
    setBackground(Color.GREEN);
    setPreferredSize(new Dimension(500, 500));
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    trace(this);
    JRadioButton button = (JRadioButton) e.getSource();
    Container container = button.getParent();
    container.setComponentOrientation(button.getActionCommand().equals("Right") ? ComponentOrientation.RIGHT_TO_LEFT
        : ComponentOrientation.LEFT_TO_RIGHT);
    container.revalidate();
  }

}