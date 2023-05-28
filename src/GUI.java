import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {

    private JPanel mainPanel;
    private String catName;
    private JTextField typeTheNameYouTextField;
    private JButton startGameButton;

    public GUI() {
        catName = typeTheNameYouTextField.getText();
        createUIComponents();

    }

    public void createUIComponents() {
        setVisible(true);
        setSize(500, 500);
    }

    public String getCatName() {
        return catName;
    }

    public void ActionListener() {

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
