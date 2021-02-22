import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SwingLab extends JFrame {

    SwingLab() {
        super("Счетчик");
        setBounds(400, 400, 350, 300);
        JTextField j = new JTextField("0");
        JLabel jlabel = new JLabel("Число");
        JButton add = new JButton("+1");
        JButton dec = new JButton("-1");

        j.setBounds(100, 20, 60, 30);
        jlabel.setBounds(50, 20, 20, 80);
        add.setBounds(200, 20, 60, 30);
        dec.setBounds(200, 60, 60, 30);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i=Integer.parseInt(j.getText());
                if (i< 3) i++;
                    j.setText(Integer.toString(i));
            }
        });
        dec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i=Integer.parseInt(j.getText());
                if (i>-5) i--;
                j.setText(Integer.toString(i));
            }
        });

        add(add);
        add(dec);
        add(j);
        add(jlabel);
    setVisible(true);

    }

    public static void main(String[] args) {
        new SwingLab();
    }
}