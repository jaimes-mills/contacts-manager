import util.Input;


public class ContactsApplication {

    public static void main(String[] args) {

        boolean willContinue;
        int user;

        do {
            Welcome msg = new Welcome();
            msg.welcomeDisplay();
            Input input = new Input();
            user = (input.getInt(1, 5));
            willContinue = msg.userOptions(user);

        } while (willContinue);

    }
}
