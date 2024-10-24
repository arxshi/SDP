package mediator.user;

import mediator.ChatMediator;

public class PremiumUser extends User {
    public PremiumUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + " (Premium User): Sending Message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " (Premium User): Received Message: " + message);
    }
}
