package mvc;

import javax.swing.JFrame;

public interface Config {

  public interface VIEW {

    public String TITLE = "Layouts Demonstration";
    public int CLOSE_OP = JFrame.EXIT_ON_CLOSE;
    public boolean IS_CENTERED = true;
    public boolean IS_PACKED = true;
    public boolean IS_RESIZABLE = true;
    public boolean IS_VISIBLE = true;
    public int UNPACKED_HEIGHT = 768;
    public int UNPACKED_WIDTH = 1024;

  }

  public interface CHOICE_BOX {
    public String[] OPTIONS = { "Flow Layout", "Border Layout", "Card Layout", "Box Layout", "Grid Layout",
        "GridBag Layout", "Group Layout", "Spring Layout" };
  }

  public interface DEMO {

    public String[] TEXT_BUTTONS = {
        "<html><body style='text-align:center;'><p style='color:green; font-weight:900;'>Din Djarin</p><p><i>aka The Mandalorian</i></p></body></html>",
        "<html><body style='text-align:center;'><p style='color:green; font-weight:900;'>Greef Karga</p></body></html>",
        "<html><body style='text-align:center;'><p style='color:green; font-weight:900;'>Cara Dune</p></body></html>",
        "<html><body style='text-align:center;'><p style='color:green; font-weight:900;'>Kuiil</p></body></html>",
        "<html><body style='text-align:center;'><p style='color:green; font-weight:900;'>IG-11</p></body></html>",
        "<html><body style='text-align:center;'><p style='color:green; font-weight:900;'>Moff Gideon</p></body></html>",
        "<html><body style='text-align:center;'><p style='color:green; font-weight:900;'>Peli Motto</p></body></html>",
        "<html><body style='text-align:center;'><p style='color:green; font-weight:900;'>Baby Yoda</p><p><i>aka The Child</i></p></body></html>",
        "<html><body style='text-align:center;'><p style='color:green; font-weight:900;'>Fennec Shand</p></body></html>" };

    public String TEXT_BORDER = "The components in this panel are organized in a BorderLayout.\n\n"
        + "Notice that the components are organized by the directions NORTH, SOUTH, EAST, WEST, and CENTER.\n\n"
        + "Drag the corner of the window to resize, and see how the components respond.";

    public String TEXT_FLOW = "The components in this panel are organized in a FlowLayout.\n\n"
        + "Notice that components can lie in different sizes.\n\n"
        + "Drag the corner of the window to resize, and see how the components respond.";

    public String TEXT_GRID_BAG = "The components in this panel are organized in a GridBagLayout.\n\n"
        + "Notice that components lie in a grid, but the cells can span multiple rows or columns.\n\n"
        + "Drag the corner of the window to resize, and see how the components respond.";

    public String TEXT_GRID = "The components in this panel are organized in a GridLayout.";

    public String TEXT_CARD = "Each of the various layouts being demonstrated are, themselves, organized in a CardLayout.\n\n"
        + "Each time you make a selection in the drop-down menue above, the corresponding \"card\" is displayed.";

    public String TEXT_BOX = "The buttons in the side panel are organized in a BoxLayout.\n\n"
        + "They can be stacked vertically (as here at left) or horizontally.\n\n"
        + "Drag the corner of the window to resize, and see how the components respond.";

    public String TEXT_GROUP = "It is possible to manually code a GroupLayout, but it is relatively challenging.\n\n"
        + "Instead, the GroupLayout is typically generated automatically by a GUI-building application -- such as Matisse in NetBeans.";

    public String TEXT_SPRING = "You will rarely, if ever, want to manually code a SpringLayout.\n\n"
        + "The GroupLayout is used by GUI-building applications.";

  }
}
