class NodeInsert {
    int data;
    NodeInsert left;
    NodeInsert right;

    NodeInsert(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class SolutionInsert {
    public static NodeInsert insert(NodeInsert root, int data) {
        if (root == null) {
            return new NodeInsert(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }
}