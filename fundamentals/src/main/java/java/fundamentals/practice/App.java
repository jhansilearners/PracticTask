package java.fundamentals.practice;

/**
 * Hello world!
 *
 */
public class App 
{
	byte b;
    short s;
    int i;
    long l;
    float f;
    double d; 
    char cha;
    boolean bo;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        byte b1=127;
       // byte lossOfData=130; CE
        
        // if we declare local variable then we have to initialize them otherwise will get CE.
        //byte data;
        //System.out.println("byte b:=>"+b);
        
        // default value for byte, short , int , long , float , double , char, boolean
        App app=new App();       
        
        
        System.out.println("byte b:=>"+app.b);
        System.out.println("short s:=>"+app.s);
        System.out.println("int i:=>"+app.i);
        System.out.println("long l:=>"+app.l);
        System.out.println("float float:=>"+app.f);
        System.out.println("double d:=>"+app.d);
        System.out.println("char c:=>"+app.cha);
        System.out.println("boolean bo:=>"+app.bo);
    }
}
