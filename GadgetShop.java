import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GadgetShop extends JFrame implements ActionListener {
    private ArrayList<Gadget> gadgets;
    private JTextField modelField, priceField, weightField, sizeField, creditField, memoryField, phoneNoField, durationField, downloadField, displayNumberField;
    private JButton addMobileButton, addMP3Button, clearButton, displayAllButton, makeCallButton, downloadMusicButton;

    public GadgetShop() {
        gadgets = new ArrayList<>();

        modelField = new JTextField(10);
        priceField = new JTextField(10);
        weightField = new JTextField(10);
        sizeField = new JTextField(10);
        creditField = new JTextField(10);
        memoryField = new JTextField(10);
        phoneNoField = new JTextField(10);
        durationField = new JTextField(10);
        downloadField = new JTextField(10);
        displayNumberField = new JTextField(10);

        addMobileButton = new JButton("Add Mobile");
        addMP3Button = new JButton("Add MP3");
        clearButton = new JButton("Clear");
        displayAllButton = new JButton("Display All");
        makeCallButton = new JButton("Make A Call");
        downloadMusicButton = new JButton("Download Music");

        
        addMobileButton.addActionListener(this);
        addMP3Button.addActionListener(this);
        clearButton.addActionListener(this);
        displayAllButton.addActionListener(this);
        makeCallButton.addActionListener(this);
        downloadMusicButton.addActionListener(this);

        // Layout components
        JPanel inputPanel = new JPanel(new GridLayout(10, 6));
        inputPanel.add(new JLabel("Model:"));
        inputPanel.add(modelField);
        inputPanel.add(new JLabel("Price:"));
        inputPanel.add(priceField);
        inputPanel.add(new JLabel("Weight:"));
        inputPanel.add(weightField);
        inputPanel.add(new JLabel("Size:"));
        inputPanel.add(sizeField);
        inputPanel.add(new JLabel("Credit:"));
        inputPanel.add(creditField);
        inputPanel.add(new JLabel("Memory:"));
        inputPanel.add(memoryField);
        inputPanel.add(new JLabel("Phone No:"));
        inputPanel.add(phoneNoField);
        inputPanel.add(new JLabel("Duration:"));
        inputPanel.add(durationField);
        inputPanel.add(new JLabel("Download:"));
        inputPanel.add(downloadField);
        inputPanel.add(new JLabel("Display Number:"));
        inputPanel.add(displayNumberField);
        
                
        

        JPanel buttonPanel = new JPanel(new GridLayout(10, 10));
        buttonPanel.add(addMobileButton);
        buttonPanel.add(addMP3Button);
        buttonPanel.add(clearButton);
        buttonPanel.add(displayAllButton);
        buttonPanel.add(makeCallButton);
        buttonPanel.add(downloadMusicButton);

        

        JPanel mainPanel = new JPanel(new BorderLayout());
        
        JButton topButton = new JButton("Top");
        JButton bottomButton = new JButton("Bottom");
        
        JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        northPanel.add(modelField);
        northPanel.add(priceField);
        northPanel.add(weightField);
        northPanel.add(sizeField);
        
        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        centerPanel.add(memoryField);
        centerPanel.add(addMobileButton);
        centerPanel.add(clearButton);
        
        
        centerPanel.add(downloadField);
        

        JPanel eastPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        eastPanel.add(addMP3Button);
        eastPanel.add(displayAllButton);
        
        

        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        southPanel.add(phoneNoField);
        southPanel.add(durationField);
        southPanel.add(downloadField);
        southPanel.add(displayNumberField);
        southPanel.add(makeCallButton);
        southPanel.add(downloadMusicButton);
        
        JPanel westPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        westPanel.add(creditField);
        
        // Add panels to main panel
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(eastPanel, BorderLayout.EAST);
        mainPanel.add(southPanel, BorderLayout.SOUTH);
        
        

        add(mainPanel);

        // Set frame properties
        setTitle("Gadget Shop");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Implement action listeners for each button
        if (e.getSource() == addMobileButton) {
            // Add Mobile functionality
            // Retrieve data from text fields and create a Mobile object
        } else if (e.getSource() == addMP3Button) {
            // Add MP3 functionality
            // Retrieve data from text fields and create a MP3 object
        } else if (e.getSource() == clearButton) {
            // Clear functionality
            clearFields();
        } else if (e.getSource() == displayAllButton) {
            // Display All functionality
            // Display all gadgets in the ArrayList
        } else if (e.getSource() == makeCallButton) {
            
        } else if (e.getSource() == downloadMusicButton) {
            
        }
    }

    private void clearFields() {
        // Clear all text fields
        modelField.setText("");
        priceField.setText("");
        weightField.setText("");
        sizeField.setText("");
        creditField.setText("");
        memoryField.setText("");
        phoneNoField.setText("");
        durationField.setText("");
        downloadField.setText("");
        displayNumberField.setText("");
    }

    public static void main(String[] args) {
        new GadgetShop();
    }
}
        
       



