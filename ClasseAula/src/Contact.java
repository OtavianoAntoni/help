public class Contact {
    int code;    //contact code
    String name;     //contact name
    String telephone;    //telephone number

    public Contact(int code, String name, String telephone) {
        this.code = code;
        this.name = name;
        this.telephone = telephone;

    }

    public java.lang.String toString() {
        return "Contact{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}