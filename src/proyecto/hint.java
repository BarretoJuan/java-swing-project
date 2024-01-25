package proyecto;
import java.awt.Color;
import javax.swing.JTextField;

public class hint {

// Esta clase tiene como único objetivo establecer hints a textos en una línea
    public static void setHint(String hint, JTextField field) {
        TextPrompt textHint = new TextPrompt(hint, field);
        textHint.setForeground(Color.BLACK);
        textHint.changeAlpha(0.5f);

    }

}
