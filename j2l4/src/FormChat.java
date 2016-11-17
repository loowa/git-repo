import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by User on 15.11.2016.
 */
public class FormChat extends JFrame {
    public FormChat() throws HeadlessException {
        setTitle("My chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,600,400);

        setLayout(new BorderLayout());

        JMenuBar jmb = new JMenuBar();
        JMenu jmSetting = new JMenu("Setting");
        JMenuItem jmiSettings = new JMenuItem("Settings");
        JMenuItem jmiExit = new JMenuItem("Exit");
        jmiExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jmSetting.add(jmiSettings);
        jmSetting.add(jmiExit);
        JMenu jmContacts = new JMenu("Contacts");
        JMenu jmAbout = new JMenu("About");
        jmb.add(jmSetting);
        jmb.add(jmContacts);
        jmb.add(jmAbout);
        add(jmb,BorderLayout.NORTH);

        JTextArea jtaText = new JTextArea();
        jtaText.setEditable(false);
        jtaText.setLineWrap(true);
        jtaText.setAutoscrolls(true);
        add(jtaText,BorderLayout.CENTER);
        JScrollPane jspScroll = new JScrollPane(jtaText);
        add(jspScroll);

        JPanel jpsPanel = new JPanel(new BorderLayout());
        ChatTextField jtfMessage = new ChatTextField("Enter the message");
        jtfMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage(jtfMessage, jtaText);
            }
        });
        jpsPanel.add(jtfMessage, BorderLayout.CENTER);
        JButton jbSend = new JButton("Send");
        jbSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage(jtfMessage, jtaText);
                jtfMessage.grabFocus();
            }
        });
        jpsPanel.add(jbSend, BorderLayout.EAST);
        add(jpsPanel, BorderLayout.SOUTH);
        setVisible(true);
    }
    private void sendMessage(ChatTextField tf, JTextArea ta){
        if (!tf.getText().isEmpty()) {
            ta.append(tf.getText() + "\n");
            try {
                PrintWriter pw = new PrintWriter(new FileWriter("log.txt",true),true);
                pw.println(tf.getText());
                pw.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            tf.setText("");
        }
    }
}

