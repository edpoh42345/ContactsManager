public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();

        Contact c1 = new Contact();
        c1.name = "Johanne";
        c1.phoneNumber = "0789093456";
        myContactsManager.addContact(c1);

        Contact c2 = new Contact();
        c2.name = "Emma";
        c2.phoneNumber = "0768309890";
        myContactsManager.addContact(c2);

        Contact c3 = new Contact();
        c3.name = "Bakayoko";
        c3.phoneNumber = "0128789345";
        myContactsManager.addContact(c3);

        Contact c4 = new Contact();
        c4.name = "Akissi";
        c4.phoneNumber = "0500042989";
        myContactsManager.addContact(c4);

        Contact c5 = new Contact();
        c5.name = "Ethan";
        c5.phoneNumber = "0521987890";
        myContactsManager.addContact(c5);


        String nameToSearch = "Bakayoko";
        Contact found = myContactsManager.searchContact(nameToSearch);

        if (found != null) {
            System.out.println("Numéro de " + nameToSearch + " : " + found.phoneNumber);
        } else {
            System.out.println(nameToSearch + " n'est pas dans vos contacts.");
        }
    }
}
