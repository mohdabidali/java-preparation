package ChainOfResponsiblity;

public abstract class LoggerReciever {
   public static int INFO =1;
   public static int DEBUG =2;
   public static int ERROR =3;
   
   LoggerReciever nextLoggerReciever;
   LoggerReciever(LoggerReciever nextLoggerReciever){
    this.nextLoggerReciever = nextLoggerReciever;
   }
public void log(int level, String message){
    if (nextLoggerReciever!= null){
        nextLoggerReciever.log(level, message);
    }
}
}
