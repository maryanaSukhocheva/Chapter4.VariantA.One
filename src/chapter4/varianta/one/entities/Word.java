package chapter4.varianta.one.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Word  {
     //Объявляем лист символов
    private List<Symbol> symbols;
    
    public Word() {
        symbols = new ArrayList<Symbol>();
    }
    //Объявляем конструктор
    public Word(String text)  {

        symbols = new ArrayList<Symbol>();
        
    }

   
    public List<Symbol> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Symbol> symbols) {
        this.symbols = symbols;
    }

    

    public void addSymbol(Symbol symbol) {
         if (symbol!=null) {
            getSymbols().add(symbol);
         }
     }
    
    @Override
       public String toString() {
     
        String res =  new String();
        // Извлекаем содержимое предложений из нашего класса.
        for (Symbol sym : symbols) {
            res += sym.toString();
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
        final Word other = (Word) obj;
        if (this.symbols != other.symbols && (this.symbols == null || !this.symbols.equals(other.symbols))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.symbols != null ? this.symbols.hashCode() : 0);
        return hash;
    }

    
   
}
