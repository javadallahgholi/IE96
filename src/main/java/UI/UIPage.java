package UI;
import Controller.UIController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class UIPage {

    public static void main(String[] args) throws IOException { show(true); }

    public static JTextField CreateLable(JPanel panel, String name, int Lx, int Ly,
                                         int Lwidth, int Lheight, int Tx, int Ty, int Twidth, int Theight){

        JLabel Label = new JLabel(name);
        Label.setBounds(Lx, Ly,Lwidth,Lheight);
        panel.add(Label);
        JTextField Text = new JTextField(20);
        Text.setBounds(Tx, Ty,Twidth,Theight);
        panel.add(Text);
        return Text;
    }

    public static void show(boolean exitOnClose) {

        final JFrame frame = new JFrame("سامانه هواپیمایی آی ای!");
        frame.setSize(475, 500);
        frame.setLocationRelativeTo(null);

        if (exitOnClose)
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setBackground(Color.LIGHT_GRAY);

        JLabel title = new JLabel("_ پروژه ");
        title.setBounds(330, 15,100,25);
        title.setFont(title.getFont ().deriveFont (20.0f));
        panel.add(title);
        JLabel title1 = new JLabel(" درس ");
        title1.setBounds(270, 15,100,25);
        title1.setFont(title1.getFont ().deriveFont (20.0f));
        panel.add(title1);
        JLabel title2 = new JLabel("  مهندسی اینترنت _");
        title2.setBounds(90, 15,200,25);
        title2.setFont(title2.getFont ().deriveFont (20.0f));
        panel.add(title2);
        JLabel title3 = new JLabel("* سامانه هواپیمایی *");
        title3.setBounds(165, 55,200,25);
        title3.setFont(title3.getFont ().deriveFont (15.0f));
        panel.add(title3);
        panel.setLayout(null);

        final JTextField originCode = CreateLable(panel, "مبدا :",400, 105, 100, 25, 290, 105, 100, 25);
        final JTextField destinationCode = CreateLable(panel, "مقصد :",180, 105, 100, 25, 70, 105, 100, 25);
        final JTextField date = CreateLable(panel, "تاریخ پرواز :",255, 155, 100, 25, 145, 155, 100, 25);
        final JLabel passCount = new JLabel("تعداد مسافران");
        passCount.setBounds(160, 205, 200, 25);
        passCount.setFont(passCount.getFont ().deriveFont (18.0f));
        panel.add(passCount);
        final JTextField adultCount = CreateLable(panel, "بزرگسال :",255, 260, 100, 25, 145, 260, 100, 25);
        adultCount.setText("0");
        final JTextField childCount = CreateLable(panel, "کودک :",255, 310, 100, 25, 145, 310, 100, 25);
        childCount.setText("0");
        final JTextField infantCount = CreateLable(panel, "نوزاد :",255, 360, 100, 25, 145, 360, 100, 25);
        infantCount.setText("0");

        JButton searchButton = new JButton("جستجو");
        searchButton.setBounds(250, 430, 100, 25);
        panel.add(searchButton);
        JButton exitButton = new JButton("خروج");
        exitButton.setBounds(100, 430, 100, 25);
        panel.add(exitButton);

        searchButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                UIController uc = new UIController();
                try {
                    uc.searchFlight(originCode.getText() , destinationCode.getText(), date.getText(), Integer.parseInt(adultCount.getText()), Integer.parseInt(childCount.getText()), Integer.parseInt(infantCount.getText()));
                    WaitPage.show(true);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        frame.setVisible(true);
    }
}