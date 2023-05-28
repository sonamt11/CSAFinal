import javax.swing.*;
public class Simulator extends JFrame {
    private JPanel panel1;
    private JButton takeToVetButton;
    private JProgressBar progressBar1;
    private JButton batheButton;
    private JProgressBar progressBar2;
    private JButton feedButton1;
    private JProgressBar progressBar3;
    private JButton giveWaterButton;
    private JProgressBar progressBar4;
    private JButton playButton;
    private JProgressBar progressBar5;
    private JButton takeNapButton;
    private JProgressBar progressBar6;
    private JTextField textField1;
    private GUI welcome;

    public Simulator() {
        createUIComponents();
    }

    public void createUIComponents() {

    }

    public void ActionListener() {
        welcome = new GUI();
        textField1.setText(welcome.getCatName());
    }

}
