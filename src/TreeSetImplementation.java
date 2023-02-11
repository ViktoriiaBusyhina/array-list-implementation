public class TreeSetImplementation {
    Node root;

    public void add(int element) {
        if (root == null) {
            Node node = new Node(null, null, element);
            root = node;
        }
        else {
            search(element);
        }
    }

    private void search(int element) {
        Node current = root;
        boolean searching = true;

        while (searching) {
            if (element < current.value) {
                if (current.left != null) {
                    current = current.left;
                }
                else {
                    current.left = new Node(null, null, element);
                    searching = false;
                }
            }
            if (element > current.value) {
                if (current.right != null) {
                    current = current.right;
                }
                else {
                    current.right = new Node(null, null, element);
                    searching = false;
                }
            }
            if (element == current.value) {
                return;
            }
        }

    }
}
