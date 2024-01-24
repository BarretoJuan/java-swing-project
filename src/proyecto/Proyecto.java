package proyecto;
import java.awt.*;
import java.net.URL;
import javax.swing.*;
import proyecto.Colores;

public class Proyecto extends JFrame{
    public Proyecto() {

      URL iconURL = getClass().getResource("/resources/notepad.png"); //Buscar recurso del icono
      Image icon = new javax.swing.ImageIcon(iconURL).getImage(); //Identificar una imagen con un recurso
      this.setIconImage(icon); //establecer un icono 
      this.setSize(640,512); //Tamanio de la ventana
      this.setTitle("Datos Personales"); // Titulo de la ventana
      this.setLocationRelativeTo(null); // Ubicar la ventana en el centro de la pantalla
      this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Terminar la ejecucion del programa cuando se cierre la ventana 
      this.setResizable(false); //Establecer la ventana no modificable en tamanio
      iniciarComponentes(); // llamar componentes


    }
    
    
        private void iniciarComponentes() {
            JPanel panel = new JPanel(); //Panel
            panel.setLayout(null);     //Centrar panel
            panel.setPreferredSize(new Dimension(600,1000)); // Modificar preferred size para las posiciones de los elementos
            
            
            JScrollPane scrollPane = new JScrollPane(panel); //Crear scrollpane
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); //Establecer un scroll vertical
            this.getContentPane().add(scrollPane); //Agregar el ScrollPanel al content pane
            
            JLabel etiqueta = new JLabel();
            etiqueta.setText("Formulario para ingresar datos personales");
            etiqueta.setBounds(0, 0, 640, 50);
            etiqueta.setForeground(Color.white);
            etiqueta.setBackground(Colores.darkBlue);
            etiqueta.setOpaque(true);
            panel.add(etiqueta);
            

            JLabel etiqueta2 = new JLabel();
            etiqueta2.setText("Hola Mundo");
            etiqueta2.setBounds(0, 400, 640, 20);
            etiqueta2.setForeground(Color.white);
            etiqueta2.setBackground(Colores.darkBlue);
            etiqueta2.setOpaque(true);
            panel.add(etiqueta2);
            

            JLabel etiqueta3 = new JLabel();
            etiqueta3.setText("Hola Mundo");
            etiqueta3.setBounds(0, 800, 640, 20);
            etiqueta3.setForeground(Color.white);
            etiqueta3.setBackground(Colores.darkBlue);
            etiqueta3.setOpaque(true);
            panel.add(etiqueta3);
            
            
                  }
}
