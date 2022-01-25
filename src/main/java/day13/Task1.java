package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Petr");
        User user2 = new User("Ivan");
        User user3 = new User("Roman");

        user1.sendMessage(user2, "hi");
        user1.sendMessage(user2, "how are you?");
        user2.sendMessage(user1,"hi, I'm fine");
        user2.sendMessage(user1,"I had an amazing vacation");
        user2.sendMessage(user1,"And I have a lot of stories for you");

        user3.sendMessage(user1,"Hello!");
        user3.sendMessage(user1,"I heard you got a job!");
        user3.sendMessage(user1,"I would invite you to visit");
        user1.sendMessage(user3,"Hello! "+user3.getUserName()+"!");
        user1.sendMessage(user3,"Yes, I got my first job");
        user1.sendMessage(user3,"And I'm going to visit you tomorrow");
        user3.sendMessage(user1,"Can't wait for our meeting");
        MessageDatabase.showDialog(user1,user2);
        System.out.println("------------------");
        MessageDatabase.showDialog(user1,user3);

//        user1.subscribe(user2);
//        System.out.println( user1.isFriend(user2));
//        user2.subscribe(user1);
//        System.out.println( user1.isFriend(user2));
//        System.out.println(user3.isSubscribed(user2));
//        System.out.println(user1.isSubscribed(user2));


    }

    }




