package proyecto;
import java.awt.*;
import java.net.URL;
import javax.swing.*;


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
            panel.setPreferredSize(new Dimension(600,450)); // Modificar preferred size para las posiciones de los elementos
            JScrollPane scrollPane = new JScrollPane(panel); //Crear scrollpane
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); //Establecer un scroll vertical
            this.getContentPane().add(scrollPane); //Agregar el ScrollPanel al content pane
            
            JLabel etiquetaInicio = new JLabel();
            etiquetaInicio.setText("Formulario para ingresar datos personales");
            etiquetaInicio.setBounds(0, 0, 640, 50);
            etiquetaInicio.setForeground(Color.white);
            etiquetaInicio.setBackground(Colores.darkBlue);
            etiquetaInicio.setOpaque(true);
            panel.add(etiquetaInicio);
            
            JLabel etiquetaCodigo = new JLabel();
            etiquetaCodigo.setText("Código:");
            etiquetaCodigo.setBounds(0, 60, 640, 20);
            etiquetaCodigo.setForeground(Color.white);
            etiquetaCodigo.setBackground(Colores.darkBlue);
            etiquetaCodigo.setOpaque(true);
            panel.add(etiquetaCodigo);
            
            JTextField entryCodigo = new JTextField();
            entryCodigo.setText("Ingrese su codigo");
            entryCodigo.setBounds(0,80,640,20);
            entryCodigo.setBackground(Colores.lightBlue);
            panel.add(entryCodigo);
            
            JLabel etiquetaCedula = new JLabel();
            etiquetaCedula.setText("Cédula:");
            etiquetaCedula.setBounds(0, 110, 640, 20);
            etiquetaCedula.setForeground(Color.white);
            etiquetaCedula.setBackground(Colores.darkBlue);
            etiquetaCedula.setOpaque(true);
            panel.add(etiquetaCedula);
            
            JTextField entryCedula = new JTextField();
            entryCedula.setText("Ingrese su cédula");
            entryCedula.setBounds(0,130,640,20);
            entryCedula.setBackground(Colores.lightBlue);
            panel.add(entryCedula);
           
            JLabel etiquetaNombre = new JLabel();
            etiquetaNombre.setText("Nombre y Apellido:");
            etiquetaNombre.setBounds(0, 160, 640, 20);
            etiquetaNombre.setForeground(Color.white);
            etiquetaNombre.setBackground(Colores.darkBlue);
            etiquetaNombre.setOpaque(true);
            panel.add(etiquetaNombre);  
            
            JTextField entryNombre = new JTextField();
            entryNombre.setText("Ingrese su nombre y apellido");
            entryNombre.setBounds(0,180,640,20);
            entryNombre.setBackground(Colores.lightBlue);
            panel.add(entryNombre);

            JLabel etiquetaFechaNacimiento = new JLabel();
            etiquetaFechaNacimiento.setText("Fecha de nacimiento:");
            etiquetaFechaNacimiento.setBounds(0, 210, 640, 20);
            etiquetaFechaNacimiento.setForeground(Color.white);
            etiquetaFechaNacimiento.setBackground(Colores.darkBlue);
            etiquetaFechaNacimiento.setOpaque(true);
            panel.add(etiquetaFechaNacimiento);
        
            JTextField entryFecha = new JTextField();
            entryFecha.setText("Ingrese su fecha de nacimiento");
            entryFecha.setBounds(0,230,640,20);
            entryFecha.setBackground(Colores.lightBlue);
            panel.add(entryFecha);
        

            JLabel etiquetaLugarNacimiento = new JLabel();
            etiquetaLugarNacimiento.setText("Lugar de nacimiento:");
            etiquetaLugarNacimiento.setBounds(0, 260, 640, 20);
            etiquetaLugarNacimiento.setForeground(Color.white);
            etiquetaLugarNacimiento.setBackground(Colores.darkBlue);
            etiquetaLugarNacimiento.setOpaque(true);
            panel.add(etiquetaLugarNacimiento);
        
            JTextField entryLugarNacimiento = new JTextField();
            entryLugarNacimiento.setText("Ingrese su lugar de nacimiento");
            entryLugarNacimiento.setBounds(0,280,640,20);
            entryLugarNacimiento.setBackground(Colores.lightBlue);
            panel.add(entryLugarNacimiento);

            JLabel etiquetaDireccion = new JLabel();
            etiquetaDireccion.setText("Dirección de Habitación:");
            etiquetaDireccion.setBounds(0, 310, 640, 20);
            etiquetaDireccion.setForeground(Color.white);
            etiquetaDireccion.setBackground(Colores.darkBlue);
            etiquetaDireccion.setOpaque(true);
            panel.add(etiquetaDireccion);
        
            JTextField entryDireccion = new JTextField();
            entryDireccion.setText("Ingrese su dirección de habitación");
            entryDireccion.setBounds(0,330,640,20);
            entryDireccion.setBackground(Colores.lightBlue);
            panel.add(entryDireccion);


            JLabel etiquetaNumTelf = new JLabel();
            etiquetaNumTelf.setText("Número de celular:");
            etiquetaNumTelf.setBounds(0, 360, 640, 20);
            etiquetaNumTelf.setForeground(Color.white);
            etiquetaNumTelf.setBackground(Colores.darkBlue);
            etiquetaNumTelf.setOpaque(true);
            panel.add(etiquetaNumTelf);
        
            JTextField entryNumTelf = new JTextField();
            entryNumTelf.setText("Ingrese su numero de celular");
            entryNumTelf.setBounds(0,380,640,20);
            entryNumTelf.setBackground(Colores.lightBlue);
            panel.add(entryNumTelf);


            JLabel etiquetaEmail = new JLabel();
            etiquetaEmail.setText("Email:");
            etiquetaEmail.setBounds(0, 410, 640, 20);
            etiquetaEmail.setForeground(Color.white);
            etiquetaEmail.setBackground(Colores.darkBlue);
            etiquetaEmail.setOpaque(true);
            panel.add(etiquetaEmail);
        
            JTextField entryEmail = new JTextField();
            entryEmail.setText("Ingrese su email");
            entryEmail.setBounds(0,430,640,20);
            entryEmail.setBackground(Colores.lightBlue);
            panel.add(entryEmail);      
            
            panel.setBackground(Colores.lightBlue);

                  }
}
