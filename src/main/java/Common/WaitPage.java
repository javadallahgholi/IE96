package Common;

/**
 * Created by j-ghazvne on 2/13/17.
 */
import java.awt.*;
import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.util.List;
        import javax.swing.*;
public class WaitPage {
    public static void main(String [] args){
        show(true);
    }

    private static Timer timer;

    public static void show(boolean exitOnClose) {

        final JFrame framewait = new JFrame(" پیغام ");
        framewait.setSize(350, 140);
        framewait.setLocationRelativeTo(null);

        if (exitOnClose)
            framewait.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);

        JLabel msg = new JLabel("سیستم در حال جستجوی بلیت های پرواز می باشد!");
        msg.setBounds(20, 30, 400, 25);
        panel.add(msg);
        JLabel wait = new JLabel("لطفا کمی صبر کنید...");
        wait.setBounds(85, 70, 400, 25);
        wait.setFont(wait.getFont ().deriveFont (15.0f));
        panel.add(wait);

        panel.setLayout(null);
        framewait.add(panel);

        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                framewait.dispose();
                timer.stop();
                ShowResultPage.show(true, "adsjfkmsdkmfl;sdf");
            }
        };

        timer = new Timer(3000, action);
        timer.start();

        framewait.setVisible(true);
    }
}
