package chapter4.varianta.one.action;

import chapter4.varianta.one.entities.Sentence;
import chapter4.varianta.one.entities.Symbol;
import chapter4.varianta.one.entities.Text;
import chapter4.varianta.one.entities.Word;
import chapter4.varianta.one.exception.TextException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Sukhocheva Maryana
 */
public class TextAction {
    private static final String END_SENTENCE = "([\\.?!:]+\\s+)|([\\.?!:]*\\r\\n)|(\\\\r\\\\n)|($)";
    private static final String END_WORD = "(\\s)+|(\\r\\n)|($)";
    public TextAction() {
       }
 
    public static List<Sentence> breakText(String text) throws TextException {
        List<Sentence>  sentenses = new ArrayList<Sentence>();
        Pattern p1 = Pattern.compile(END_SENTENCE);
        String sentenceString = new String();
        Matcher m = p1.matcher(text);
        int start = 0;
	char[] symbolText = text.toCharArray();
        Sentence sentence = null;
	while (m.find()) {
	    sentenceString = "";
            int end = m.end();
            for (int i = start; i < end ; i++) {
                sentenceString += String.valueOf(symbolText[i]);
            }
            start = m.end();
	    try {
                sentence = new Sentence();
                sentence.setWords(TextAction.breakSentence(sentenceString));
                sentenses.add(sentence);
             } catch(Exception e) {
                  throw new TextException("Ошибка при создании предложения");
             }     
        }
      
        return sentenses;
    }

     public static List<Word> breakSentence(String sentenceText) throws  TextException {
        List<Word>  words = new ArrayList<Word>();
        Pattern p1 = Pattern.compile(END_WORD);
        String wordString = new String();
         Matcher m = p1.matcher(sentenceText);
         int start=0;
         char[] symbolSentence =sentenceText.toCharArray();
         Word word = null;
         while (m.find()) {
            wordString="";
            int end=m.end();
            for (int i=start; i<end;i++) {
                wordString+=String.valueOf(symbolSentence[i]);
            }
            start=m.end();
            try {
                word = new Word();
                word.setSymbols(TextAction.breakWord(wordString));       ;
                words.add(word);
             } catch(Exception e) {
                  throw new TextException("Ошибка при создании слова");
             }
         }
         return words;

    }

  public static List<Symbol> breakWord(String wordText) throws TextException  {
        List<Symbol> symbols = new ArrayList<Symbol>();
         try {
                char[] arraySymbols =wordText.toCharArray();
                int masSize=arraySymbols.length;
                for (int i=0; i<masSize; i++) {
                   Symbol symbol=new Symbol(arraySymbols[i]);
                   symbols.add(symbol);
                }

           } catch(Exception e) {
               throw new TextException("Ошибка при добавлении символа");
          
           }
        return symbols;
       }
    
    public static void addText(Text text, String string) throws TextException{
        List<Sentence> sentences = breakText(string);
        for (Sentence sentence: sentences){
            text.addSentence(sentence);
            
        }
     }
 
}
