import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

class DigitalClock extends JFrame {
    private JLabel timeLabel; //  display time

    public DigitalClock() {
        setTitle("Digital Clock"); // Set title of the window
        setSize(200, 100); // Set size of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set default close operation
        setLayout(new BorderLayout()); // S


        timeLabel = new JLabel("00:00:00", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 40)); // Set font of the label
        add(timeLabel, BorderLayout.CENTER); // Add label to the center of layout

        // Update time every second
        Timer timer = new Timer(1000, e -> updateTime());
        timer.start(); // Start the timer

        setVisible(true); // Make the frame visible
    }

    private void updateTime() {
        // Simple date format for hours, minutes, and seconds
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        // Set the text of the time label to the current time
        timeLabel.setText(formatter.format(new Date()));
    }

    public static void main(String[] args) {
        // Run the clock in the Event Dispatch Thread
        SwingUtilities.invokeLater(DigitalClock::new);
    }
}