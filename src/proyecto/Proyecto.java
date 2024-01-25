package proyecto;
import java.awt.*;
import java.net.URL;
import java.util.Calendar;
import javax.swing.*;
import org.jdesktop.swingx.JXDatePicker;
import org.jdesktop.swingx.plaf.basic.CalendarHeaderHandler;
import org.jdesktop.swingx.plaf.basic.SpinningCalendarHeaderHandler;


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
    } //Proyecto()
    
        private void iniciarComponentes() {
            JPanel panel = new JPanel(); //Panel
            panel.setLayout(null);     //Centrar panel
            panel.setPreferredSize(new Dimension(800,800)); // Modificar preferred size para las posiciones de los elementos
            JScrollPane scrollPane = new JScrollPane(panel); //Crear scrollpane
            this.getContentPane().add(scrollPane); //Agregar el ScrollPanel al content pane
            
            JLabel etiquetaInicio = new JLabel();
            etiquetaInicio.setText(" Formulario para ingresar datos personales");
            etiquetaInicio.setBounds(0, 0, 640, 50);
            etiquetaInicio.setForeground(Colores.white);
            etiquetaInicio.setBackground(Colores.darkBlue);
            etiquetaInicio.setOpaque(true);
            panel.add(etiquetaInicio);
            
            JLabel etiquetaCodigo = new JLabel();
            etiquetaCodigo.setText(" Código:");
            etiquetaCodigo.setBounds(0, 60, 640, 20);
            etiquetaCodigo.setForeground(Colores.white);
            etiquetaCodigo.setBackground(Colores.darkBlue);
            etiquetaCodigo.setOpaque(true);
            panel.add(etiquetaCodigo);
            
            JTextField entryCodigo = new JTextField();
            hint.setHint("Ingrese su código",entryCodigo);
            entryCodigo.setBounds(0,80,640,20);
            entryCodigo.setBackground(Colores.lightBlue);
            panel.add(entryCodigo);
            
            JLabel etiquetaCedula = new JLabel();
            etiquetaCedula.setText(" Cédula:");
            etiquetaCedula.setBounds(0, 110, 640, 20);
            etiquetaCedula.setForeground(Colores.white);
            etiquetaCedula.setBackground(Colores.darkBlue);
            etiquetaCedula.setOpaque(true);
            panel.add(etiquetaCedula);
            
            JTextField entryCedula = new JTextField();
            hint.setHint("Ingrese su cédula", entryCedula);
            entryCedula.setBounds(0,130,640,20);
            entryCedula.setBackground(Colores.lightBlue);
            panel.add(entryCedula);
           
            JLabel etiquetaNombre = new JLabel();
            etiquetaNombre.setText(" Nombre y Apellido:");
            etiquetaNombre.setBounds(0, 160, 640, 20);
            etiquetaNombre.setForeground(Colores.white);
            etiquetaNombre.setBackground(Colores.darkBlue);
            etiquetaNombre.setOpaque(true);
            panel.add(etiquetaNombre);  
            
            JTextField entryNombre = new JTextField();
            hint.setHint("Ingrese sus nombres y apellidos", entryNombre);
            entryNombre.setBounds(0,180,640,20);
            entryNombre.setBackground(Colores.lightBlue);
            panel.add(entryNombre);

            JLabel etiquetaFechaNacimiento = new JLabel();
            etiquetaFechaNacimiento.setText(" Fecha de Nacimiento:");
            etiquetaFechaNacimiento.setBounds(0, 210, 640, 20);
            etiquetaFechaNacimiento.setForeground(Colores.white);
            etiquetaFechaNacimiento.setBackground(Colores.darkBlue);
            etiquetaFechaNacimiento.setOpaque(true);
            panel.add(etiquetaFechaNacimiento);
        
            JTextField entryFecha = new JTextField();
            hint.setHint("Ingrese su fecha de nacimiento", entryFecha);
            entryFecha.setBounds(0,230,640,20);
            entryFecha.setBackground(Colores.lightBlue);
            panel.add(entryFecha);

            JLabel etiquetaLugarNacimiento = new JLabel();
            etiquetaLugarNacimiento.setText(" Lugar de Nacimiento:");
            etiquetaLugarNacimiento.setBounds(0, 260, 640, 20);
            etiquetaLugarNacimiento.setForeground(Colores.white);
            etiquetaLugarNacimiento.setBackground(Colores.darkBlue);
            etiquetaLugarNacimiento.setOpaque(true);
            panel.add(etiquetaLugarNacimiento);
        
            JTextField entryLugarNacimiento = new JTextField();
            hint.setHint("Ingrese su lugar de nacimiento", entryLugarNacimiento);
            entryLugarNacimiento.setBounds(0,280,640,20);
            entryLugarNacimiento.setBackground(Colores.lightBlue);
            panel.add(entryLugarNacimiento);

            JLabel etiquetaDireccion = new JLabel();
            etiquetaDireccion.setText(" Dirección de Habitación:");
            etiquetaDireccion.setBounds(0, 310, 640, 20);
            etiquetaDireccion.setForeground(Colores.white);
            etiquetaDireccion.setBackground(Colores.darkBlue);
            etiquetaDireccion.setOpaque(true);
            panel.add(etiquetaDireccion);
        
            JTextField entryDireccion = new JTextField();
            hint.setHint("Ingrese su dirección", entryDireccion);
            entryDireccion.setBounds(0,330,640,20);
            entryDireccion.setBackground(Colores.lightBlue);
            panel.add(entryDireccion);

            JLabel etiquetaNumTelf = new JLabel();
            etiquetaNumTelf.setText(" Número de Celular:");
            etiquetaNumTelf.setBounds(0, 360, 640, 20);
            etiquetaNumTelf.setForeground(Colores.white);
            etiquetaNumTelf.setBackground(Colores.darkBlue);
            etiquetaNumTelf.setOpaque(true);
            panel.add(etiquetaNumTelf);
        
            JTextField entryNumTelf = new JTextField();
            hint.setHint("Ingrese su número de teléfono", entryNumTelf);
            entryNumTelf.setBounds(0,380,640,20);
            entryNumTelf.setBackground(Colores.lightBlue);
            panel.add(entryNumTelf);

            JLabel etiquetaEmail = new JLabel();
            etiquetaEmail.setText(" Email:");
            etiquetaEmail.setBounds(0, 410, 640, 20);
            etiquetaEmail.setForeground(Colores.white);
            etiquetaEmail.setBackground(Colores.darkBlue);
            etiquetaEmail.setOpaque(true);
            panel.add(etiquetaEmail);
        
            JTextField entryEmail = new JTextField();
            hint.setHint("Ingrese su email", entryEmail);
            entryEmail.setBounds(0,430,640,20);
            entryEmail.setBackground(Colores.lightBlue);
            panel.add(entryEmail);      
            panel.setBackground(Colores.lightBlue);
            

            UIManager.put(CalendarHeaderHandler.uiControllerID, SpinningCalendarHeaderHandler.class.getName());
            JXDatePicker picker = new JXDatePicker();
            picker.getMonthView().setZoomable(true);
            picker.setBounds(0,460,600,50);
            panel.add(picker);
  

                  } // IniciarComponentes()\
        
} // Proyecto Class
