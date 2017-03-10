package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ShowResultPage {

    public static void main(String[] args) throws IOException { show(true, "sldfjsldkflskdf"); }

    public static void show(boolean exitOnClose, String result) {

        final JFrame frame = new JFrame("سامانه هواپیمایی آی ای!");
        frame.setSize(475, 380);
        frame.setLocationRelativeTo(null);

        if (exitOnClose)
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setBackground(Color.LIGHT_GRAY);

        JLabel title3 = new JLabel("پرواز های موجود به شرح زیر می باشد :");
        title3.setBounds(165, 25,300,25);
        title3.setFont(title3.getFont ().deriveFont (15.0f));
        panel.add(title3);
        panel.setLayout(null);

        JTextArea textArea = new JTextArea ();
        JScrollPane scroll = new JScrollPane (textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(65, 75, 350, 200);
        textArea.append(result);
        panel.add(scroll);

        JButton okButton = new JButton("خروج");
        okButton.setBounds(190, 310, 100, 25);
        panel.add(okButton);

        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
