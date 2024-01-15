package ChainOfResponsiblity;

public class InfoConcreteReciever  extends LoggerReciever{

    InfoConcreteReciever(LoggerReciever nexLoggerReciever){
        super(nexLoggerReciever);
    }
    public void log(int level, String message){
        if(level == INFO){
            System.out.println("INFO"+ message);
        }
        else{
            // otherwise our parent goes to the next chain reciver that we made chain of 
            super.log(level, message);
        }
    }
}
