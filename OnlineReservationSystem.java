import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OnlineReservationSystem extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel reservationLabel;
    private JTextField trainNumberField;
    private JTextField classTypeField;
    private JTextField dateField;
    private JTextField fromField;
    private JTextField toField;
    private JButton reserveButton;
    private JLabel cancellationLabel;
    private JTextField pnrField;
    private JButton cancelButton;



    public OnlineReservationSystem() {
        setTitle("Online Reservation System");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Login Form
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(15);
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(15);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);

        loginButton = new JButton("Login");
        loginPanel.add(loginButton);

        // Reservation Form
        JPanel reservationPanel = new JPanel();
        reservationPanel.setLayout(new BoxLayout(reservationPanel, BoxLayout.Y_AXIS));

        reservationLabel = new JLabel("Reservation Form");
        trainNumberField = new JTextField(15);
        classTypeField = new JTextField(15);
        dateField = new JTextField(15);
        fromField = new JTextField(15);
        toField = new JTextField(15);
        reserveButton = new JButton("Reserve");

        reservationPanel.add(reservationLabel);
        reservationPanel.add(new JLabel("Train Number:"));
        reservationPanel.add(trainNumberField);
        reservationPanel.add(new JLabel("Class Type:"));
        reservationPanel.add(classTypeField);
        reservationPanel.add(new JLabel("Date:"));
        reservationPanel.add(dateField);
        reservationPanel.add(new JLabel("From:"));
        reservationPanel.add(fromField);
        reservationPanel.add(new JLabel("To:"));
        reservationPanel.add(toField);
        reservationPanel.add(reserveButton);

        // Cancellation Form
        JPanel cancellationPanel = new JPanel();
        cancellationPanel.setLayout(new BoxLayout(cancellationPanel, BoxLayout.Y_AXIS));

        cancellationLabel = new JLabel("Cancellation Form");
        pnrField = new JTextField(15);
        cancelButton = new JButton("Cancel");
        // jhgjh

        cancellationPanel.add(cancellationLabel);
        cancellationPanel.add(new JLabel("PNR Number:"));
        cancellationPanel.add(pnrField);
        cancellationPanel.add(cancelButton); //cancel btn

        // Add action listeners
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement login functionality
            }
        });

        reserveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement reservation functionality
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement cancellation functionality
            }
        });

        // Set the default panel to login panel
        getContentPane().add(loginPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OnlineReservationSystem();
            }
        });
    }
}
