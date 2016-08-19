
public class ConsolePrinter implements IPrinter{
    IMessageService message;
    @Override
    public void print() {
        System.out.println(message.getMessage());

    }

    public IMessageService getMessage() {
        return message;
    }

    public void setMessage(IMessageService message) {
        this.message = message;
    }
}
