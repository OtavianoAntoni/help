public class Hash {
    int operator;
    List[] vector;

    Hash(int operator) {
        this.operator = operator;
        vector = new List[operator];
        for (int i = 0; i < operator; i++) {
            vector[i] = new List();
        }
    }
    void Insert(Contact contact) {
        int key = contact.code % operator;
        vector[key].insert(contact);
    }
    Contact search(int code) {
        return vector[code & operator].search(code);
    }
    public String toString() {
        String out = "";
        for (int i = 0; i < operator; i++) {
            out += "" + i + ": ";
            out += vector[i % operator] + "\n";
        }
        return out;
    }
}