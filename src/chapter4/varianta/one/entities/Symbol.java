package chapter4.varianta.one.entities;
/**
 *
 * @author Sukhocheva Maryana
 */
public class Symbol  {

    private char symbol;

    public Symbol() {
    }

    public Symbol(char symbol) {
        setSymbol(symbol);
     }

  
    public char getSymbol() {
        return symbol;
    }

    public final void setSymbol(char symbol) {
       this.symbol = symbol;
    }

     
     
    @Override
    public String toString() {
        return String.valueOf(symbol);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Symbol other = (Symbol) obj;
        if (this.symbol != other.symbol) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.symbol;
        return hash;
    }

    
}
