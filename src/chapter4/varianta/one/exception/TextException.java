package chapter4.varianta.one.exception;
/**
 *
 * @author Sukhocheva Maryana
 */
public class TextException extends Exception{
    public TextException()    {
    }

    public TextException(String msg) {
        System.err.println(msg);

    }

  
 }
