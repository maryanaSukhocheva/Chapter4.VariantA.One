package chapter4.varianta.one.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Sentence {
     private int amountWord;

   //Объявляем лист слов
     private List<Word> words;

    public Sentence() {
        words = new ArrayList<Word>();

    }

    public Sentence(String sentenceString) {
        words = new ArrayList<Word>();
    }

     /**
     * @return the words
     */
    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        if (words!=null) {
            this.words = words;
        }
    }

    public void addWord(Word word) {
          getWords().add(word);
     }

     /**
      * @param sentence
      * @return the amountWord
     */
    public int getAmountWord() {
       if (words != null) {
        return words.size();
       } else {
       return 0;
       }
       
    }

      /**
     * @param amountWord the amountWord to set
     */
    public void setAmountWord(int amountWord) {
        this.amountWord = amountWord;
    }

   @Override
     public String toString() {

        String res =  new String();
        // Извлекаем содержимое предложений из нашего класса.
       for (Word word : words) {
            res += word.toString();
        }
        return res;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sentence other = (Sentence) obj;
        if (this.amountWord != other.amountWord) {
            return false;
        }
        if (this.words != other.words && (this.words == null || !this.words.equals(other.words))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.amountWord;
        hash = 89 * hash + (this.words != null ? this.words.hashCode() : 0);
        return hash;
    }


  
}

