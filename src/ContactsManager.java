public class ContactsManager {
    Contact[] contacts;
    int contactCount;

    public ContactsManager() {
        contacts = new Contact[100];
        contactCount = 0;
    }

    public void addContact(Contact contact) {
        contacts[contactCount] = contact;
        contactCount++;
    }

    public Contact searchContact(String name) {
        for (int i = 0; i < contactCount; i++) {
            if (contacts[i].name.equalsIgnoreCase(name)) {
                return contacts[i];
            }
        }
        return null;
    }
}
