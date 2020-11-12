package mvc.view.viewlet;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import mvc.Config;
import mvc.utilities.Traceable;
import mvc.view.View;

public class ChoiceBox extends JComboBox<String> implements Traceable, Config.CHOICE_BOX {

  private static final long serialVersionUID = 1L;

  private View view;

  public ChoiceBox(View view) {
    super(OPTIONS);
    trace(this);
    this.view = view;
    addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    trace(this);
    if (e.getSource() instanceof JComboBox<?>) {
      JComboBox<?> comboBox = (JComboBox<?>) e.getSource();
      Object selected = comboBox.getSelectedItem();
      view.updateLayout((String) selected);
    }
  }
}
