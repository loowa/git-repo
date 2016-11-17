import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 16.11.2016.
 */
public class ChatTextField extends JTextField{
    private String hint;

    public ChatTextField(String hint) {
        this.hint = hint;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (getText().isEmpty()) {
        g.setColor(Color.LIGHT_GRAY);
        g.drawString(hint,5,16);
        }
    }
}


