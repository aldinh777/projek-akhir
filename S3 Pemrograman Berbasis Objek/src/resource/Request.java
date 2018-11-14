package resource;

import actor.User;

public class Request {
    private final int id;
    private final User user;
    private final String desc;
    private final String btc;
    
    private static int counter;
    
    public Request(User user, String desc, String btc){
        id = ++counter;
        this.user = user;
        this.desc = desc;
        this.btc = btc;
    }
    public User getUser() {
        return user;
    }
    public String getDesc() {
        return desc;
    }
    @Override
    public String toString(){
        return user.getNick()+" : "+user.getStatus();
    }
}
