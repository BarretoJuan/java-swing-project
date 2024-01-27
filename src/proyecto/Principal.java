package proyecto;

import java.util.Locale;

public class Principal {
    
    public static void main(String[] args) {
        Proyecto p1 = new Proyecto();
        p1.setVisible(true);
        String[] paises = Locale.getISOCountries();
        int tamanio = paises.length;

        int i;
        for (i=0; i<tamanio; i++) {
            System.out.println(paises[i]);
        }

        
    } //main()
} //Principal class
