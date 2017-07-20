package chapter4.varianta.one.main;

import chapter4.varianta.one.action.InputData;
import chapter4.varianta.one.action.OutputData;
import chapter4.varianta.one.action.TextAction;
import chapter4.varianta.one.entities.Text;
import chapter4.varianta.one.exception.TextException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Text text = new Text ();
        try {
            text = InputData.generationText();
        
            TextAction.addText(text, "Моя строка");
            OutputData.outputText(text);
            OutputData.outputCaptionText(text);
        
        } catch (TextException ex) {
            System.err.println("Ошибка при выводе данных");
        }
    }
}
