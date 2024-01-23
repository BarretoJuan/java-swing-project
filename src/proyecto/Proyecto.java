package proyecto;
import java.awt.*;
import java.net.URL;
import javax.swing.*;
import proyecto.Colores;

public class Proyecto extends JFrame{
    public Proyecto() {

      URL iconURL = getClass().getResource("/resources/notepad.png");
      Image icon = new javax.swing.ImageIcon(iconURL).getImage();
      this.setIconImage(icon);
      this.setSize(640,512); //Tamanio de la ventana
      this.setTitle("Datos Personales"); // Titulo de la ventana
      this.setLocationRelativeTo(null); // Ubicar la ventana en el centro de la pantalla
      this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Terminar la ejecucion del programa cuando se cierre la ventana 
      this.setResizable(false);
      iniciarComponentes();


    }
    
    
        private void iniciarComponentes() {
            JPanel panel = new JPanel();
            panel.setLayout(null);     
            this.getContentPane().add(panel);
            JLabel etiqueta = new JLabel();
            etiqueta.setText("Hola Mundo");
            etiqueta.setBounds(0, 30, 640, 20);
            etiqueta.setForeground(Color.white);
            etiqueta.setBackground(Colores.darkBlue);
            etiqueta.setOpaque(true);
            panel.add(etiqueta);
            
            
                  }
}
