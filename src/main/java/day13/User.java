package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private List<User> subscriptions;


    public User(String userName){
        this.userName=userName;
        subscriptions=new ArrayList<>();
    }

    public String getUserName() { return userName;}
    public List<User> getSubscriptions() { return subscriptions;}

    public void subscribe(User user){ subscriptions.add(user);}

    public boolean isSubscribed(User user){
        if(subscriptions.contains(user)){
            return true;
        } else{ return false;}
    }

    public boolean isFriend(User user){
        if(subscriptions.contains(user) && user.getSubscriptions().contains(this)){
            return true;
        } else{ return false;}
    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this,user,text);
    }

    public String toString(){
        return getUserName();
    }
}
