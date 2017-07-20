package chapter4.varianta.one.entities;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sukhocheva Maryana
 */

public class Text {
    private List<Sentence> sentences;
    private String caption = "";

     public Text() {
          sentences = new ArrayList<Sentence>();
     }

     public Text(String text) {
          sentences = new ArrayList<Sentence>();
     }
     


    public List<Sentence> getSentences() {
        return sentences;
    }

   public void setSentences (List<Sentence> sentences) {
        if (sentences!=null) {
            this.sentences = sentences;
        }
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
   
    public void addSentence(Sentence sentence) {
         if (sentence!=null) {
            getSentences().add(sentence);
         }
     }
    
    @Override
   public String toString() {
       StringBuilder str = new StringBuilder(this.getCaption());
       for (Sentence sentence : getSentences()) {
           str.append(sentence.toString());
       }
       return  str.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Text other = (Text) obj;
        if (this.sentences != other.sentences && (this.sentences == null || !this.sentences.equals(other.sentences))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + (this.sentences != null ? this.sentences.hashCode() : 0);
        return hash;
    }
   

}

