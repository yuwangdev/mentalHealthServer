package data;

public class ConversationEntity {
    private String sender;
    private String msg;

    public ConversationEntity() {
    }

    public ConversationEntity(String sender, String msg) {
        this.sender = sender;
        this.msg = msg;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
