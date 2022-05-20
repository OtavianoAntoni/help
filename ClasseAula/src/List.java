public class List {
    Node start;   //pointer for list start
    int size;    //list size

    public void insert(Contact info) {   //insert metho
        Node node = new Node();     //create a node
        node.info = info;   //insert information in node
        node.next = start;   //next node pointer insertion
        start = node;   //new node turns into start
        size++;
    }

    public Contact search(int code) {
        Node node = start;
        while(node != null) {
            if(node.info.code == code) {
                return node.info;
            }

            node = node.next;
        }

        return null;
    }
}