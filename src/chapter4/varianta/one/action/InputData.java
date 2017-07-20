package chapter4.varianta.one.action;

import chapter4.varianta.one.entities.Sentence;
import chapter4.varianta.one.entities.Text;
import chapter4.varianta.one.exception.TextException;
import java.util.List;


/**
 *
 * @author Sukhocheva Maryana
 */
public class InputData {
   
    public static  Text generationText() throws TextException{
        StringBuilder string = new StringBuilder("Создать приложение, удовлетворяющее требованиям,"
                + " приведенным в задании. Наследование применять только в тех заданиях, "
                + "в которых это логически обосновано.");
       Text text = new Text(); 
       List<Sentence> sentences = TextAction.breakText(string.toString());
       text.setSentences(sentences);
       return text;
      }
    
   
}
