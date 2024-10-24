package mediator;

import mediator.user.PremiumUser;
import mediator.user.RegularUser;
import mediator.user.User;

public class MediatorMain {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new RegularUser(chatRoom, "Alice");
        User user2 = new RegularUser(chatRoom, "Bob");
        User user3 = new PremiumUser(chatRoom, "Charlie");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendMessage("Hi everyone!");
        user2.sendMessage("Hello, Alice!");
        user3.sendMessage("Welcome to the chat!");
    }
}

