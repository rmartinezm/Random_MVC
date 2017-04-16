package randomfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author rmartinezm
 */
public class Controlador {
    
    @FXML
    private Text output;
    @FXML    
    private TextField tf;
    
    private Modelo modelo = new Modelo();
    
    @FXML
    private void dameRandom(ActionEvent event){
        int range;
        try{
            range = Integer.parseInt(tf.getText());
        }catch(NumberFormatException e){
            output.setText("Introduzca un número válido");
            return;
        }
        
        if (range >= 0)
            output.setText(modelo.dameRandom(range)+"");
        else
            output.setText("No se permite el uso de números negativos");
    }    
}
