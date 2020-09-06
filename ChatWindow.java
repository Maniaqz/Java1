package HW24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ChatWindow extends JFrame {

        static final int WINDOW_X = 400;
        static final int WINDOW_Y = 100;
        static final int WINDOW_WIDTH = 300;
        static final int WINDOW_HEIGHT = 600;
        JTextField textField = new JTextField();
        JTextField textArea = new JTextField();

        JButton sentMessage = new JButton("SEND MESSAGE");

        public ChatWindow() {

            setTitle("Chatroom");

            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setBounds(WINDOW_X, WINDOW_Y, WINDOW_WIDTH, WINDOW_HEIGHT);

            GridBagConstraints t = new GridBagConstraints();
            t.fill = GridBagConstraints.CENTER;
            t.weightx = 0.9;
            t.gridx = 0;
            t.gridy = 0;

            textArea.setEditable(false);
            add(textArea);

            JPanel panel = new JPanel(new GridLayout(2,1));

            textField.addActionListener(this::messageSending);
            textField.setBackground(Color.gray);
            panel.add(textField);

            sentMessage.addActionListener(this::messageSending);
            sentMessage.setBackground(Color.orange);
            panel.add(sentMessage);

            add(panel, BorderLayout.SOUTH);

            setVisible(true);
        }

        private void messageSending(ActionEvent event) {
            textArea.setText(textField.getText());
            textField.setText("");
        }
}
