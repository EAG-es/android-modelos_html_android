package android.inweb.modelos_html_android;

import innui.modelos.errores.oks;
import static java.lang.System.exit;

import android.innui.modelos_android.configuraciones.iniciales;
import android.innui.modelos_android.modelos_android;

import java.util.ResourceBundle;

/**
 *
 * @author emilio
 */
public class modelos_html_android extends iniciales {
    public static String k_in_ruta = "assets/in/android/inweb/modelos_html_android/in";
    /**
     * Inicio de la aplicación
     * @param args 
     */
    public static void main(String[] args) {
        oks ok = new oks();
        try {
            ResourceBundle in = null;
            modelos_html_android modelo_html = null;
            try {
                modelo_html = new modelos_html_android();
                modelo_html.run(ok);
            } catch (Exception e) {
                ok.setTxt(e);
            }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        if (ok.es == false) {
            System.err.println(ok.txt);
            exit(1);
        } else {
            exit(0);
        }
    }    
    /**
     * Inicio de la aplicación desde un objeto instanciado
     * @param ok Comunicar resultados
     * @param extras_array Opción de añadir parámetros en el futuro.
     * @return true si todo va bien
     * @throws Exception Opción de notificar errores de excepción
     */
    public boolean run(oks ok, Object ... extras_array) throws Exception {
        try {
            if (ok.es == false) { return ok.es; }
            iniciar(ok);
            if (ok.es) {
                terminar(ok);
            }
            return ok.es;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public boolean iniciar(oks ok, Object... extra_array) throws Exception {
        // Iniciar clase principal de la librería
        if (ok.es == false) { return ok.es; }
        _poner_aplicacion(this.getClass(), ok);
        if (ok.es == false) { return ok.es; }
        _iniciar_desde_clase(null, modelos_android.class, ok);
        if (ok.es == false) { return false; }
        _iniciar_desde_clase(null, this.getClass(), ok);
        return ok.es;
    }

    @Override
    public boolean terminar(oks ok, Object... extra_array) throws Exception {
        // Terminar clase principal de la librería
        _terminar_desde_clase(modelos_android.class, ok);
        if (ok.es == false) { return false; }
        _terminar_desde_clase(this.getClass(), ok);
        return ok.es;
    }
    
}
