import util.Input;

public class ContactsApplication {
    public static void main(String[] args) {

        Welcome msg = new Welcome();
        msg.welcomeDisplay();
        Input userSelect = new Input();
        msg.userOptions(userSelect.getInt(1,5));
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