public class MessageService implements IMessageService{

    private String message;
    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
