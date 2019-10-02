public class ContactsApplication {
    public static void main(String[] args) {
        TrackContacts x  = new TrackContacts();
        x.getFiles("contacts.txt");
        x.addContact("Mike ");
        x.searchContacts("Bridget");

    }
}
