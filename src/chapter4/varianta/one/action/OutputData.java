package chapter4.varianta.one.action;

import chapter4.varianta.one.entities.Sentence;
import chapter4.varianta.one.entities.Text;
import java.util.List;

/**
 *
 * @author Sukhocheva Maryana
 */
public class OutputData {
    //вывод массива дробей
    public static void outputSentence(List<Sentence> sentences) {
    for (Sentence sentence : sentences) {
            System.out.println(sentence.toString());
            System.out.println();
        }
    }
    public static void outputText(Text text) {
        System.out.println(text.toString());
    
    }
    public static void outputCaptionText(Text text) {
        System.out.println(text.getCaption());
    }
    
}
