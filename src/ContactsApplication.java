import util.Input;


public class ContactsApplication {

    public static void main(String[] args) {
//        Input y = new Input();
        boolean willContinue;
        int user;

        do {
            Welcome msg = new Welcome();
            msg.welcomeDisplay();
            Input input = new Input();
             user = (input.getInt(1, 5));
            willContinue = msg.userOptions(user);

        } while (willContinue);


//        TrackContacts x  = new TrackContacts();
//        x.getFiles("contacts.txt");
//        x.addContact("Mike ");
//        x.searchContacts("Ed");
//        x.deleteContact("mIkE");
//        x.getFiles("contacts.txt");
    }
}
//Beeboop 7709161234
//        Be 7709161234
//        Beebo 7709161234
//        Mike 7709161234
//        Chris Brown 7709161234
//        Ed 7709161234