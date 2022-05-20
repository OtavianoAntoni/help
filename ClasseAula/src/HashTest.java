public class HashTest {
    public static void main(String[] args) {
        Hash hash = new Hash(4);
        hash.Insert(new Contact(2,"Saulo","0000-0000"));
        hash.Insert(new Contact(1,"Paulo","1000-0000"));
        hash.Insert(new Contact(7,"Mauro","0010-0000"));
        hash.Insert(new Contact(9,"Taulo","0000-0001"));

        System.out.println(hash);
    }
}
