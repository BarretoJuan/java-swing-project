package proyecto;
import java.awt.*;
import javax.swing.*;

public class Proyecto extends JFrame{
    public Proyecto() {
      this.setSize(640,512); //Tamanio de la ventana
      this.setTitle("Proyecto"); // Titulo de la ventana
      this.setLocationRelativeTo(null); // Ubicar la ventana en el centro de la pantalla
      this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Terminar la ejecucion del programa cuando se cierre la ventana 
      this.getContentPane().setBackground(Color.BLACK); // Se establece un color de fondo para la ventana
      iniciarComponentes();
    }
    
    
        private void iniciarComponentes() {
            JPanel panel = new JPanel();
            panel.setLayout(null);     
            this.getContentPane().add(panel);
            Color azul = new Color(52,232,232,255);


            
  
            JLabel etiqueta = new JLabel();
            etiqueta.setText("Hola Mundo");
            etiqueta.setBounds(25, 30, 120, 20);
            etiqueta.setForeground(Color.white);
            etiqueta.setBackground(azul);
            etiqueta.setOpaque(true);
            panel.add(etiqueta);
            
            
                  }
}
