import java.util.Scanner;

// Node class representing each node of the AVL tree
class Node {
    int key, height;
    Node left, right;

    Node(int d) {
        key = d;
        height = 1; // new nodes are initially added at leaf
    }
}

// Main AVL Tree class
class AVLTree {
    Node root;

    // Get the height of the node
    int height(Node N) {
        return (N == null) ? 0 : N.height;
    }

    // Get the balance factor of the node
    int getBalance(Node N) {
        return (N == null) ? 0 : height(N.left) - height(N.right);
    }

    // Perform a right rotation
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }

    // Perform a left rotation
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }

    // Insert a key into the AVL tree and balance it
    Node insert(Node node, int key) {
        // 1. Perform normal BST insertion
        if (node == null)
            return new Node(key);

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else // Duplicate keys not allowed
            return node;

        // 2. Update height of the current node
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // 3. Get balance factor and balance the node if unbalanced
        int balance = getBalance(node);

        // Left Left Case
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // Right Right Case
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // Left Right Case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        // Return the unchanged node pointer
        return node;
    }

    // Get node with minimum key value found in that tree
    Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // Delete a key and balance the tree
    Node delete(Node root, int key) {
        // 1. Perform standard BST delete
        if (root == null)
            return root;

        if (key < root.key)
            root.left = delete(root.left, key);
        else if (key > root.key)
            root.right = delete(root.right, key);
        else {
            // Node with only one child or no child
            if ((root.left == null) || (root.right == null)) {
                Node temp = null;
                temp = (root.left != null) ? root.left : root.right;

                // No child case
                if (temp == null) {
                    temp = root;
                    root = null;
                } else // One child case
                    root = temp;
            } else {
                // Node with two children: Get inorder successor (smallest in the right subtree)
                Node temp = minValueNode(root.right);

                // Copy the inorder successor's key to this node
                root.key = temp.key;

                // Delete the inorder successor
                root.right = delete(root.right, temp.key);
            }
        }

        // If the tree had only one node
        if (root == null)
            return root;

        // 2. Update height
        root.height = Math.max(height(root.left), height(root.right)) + 1;

        // 3. Balance the node
        int balance = getBalance(root);

        // Left Left Case
        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        // Left Right Case
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Right Case
        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        // Right Left Case
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    // Search for a key in AVL tree
    Node search(Node node, int key) {
        if (node == null || node.key == key)
            return node;

        if (key < node.key)
            return search(node.left, key);

        return search(node.right, key);
    }

    // Inorder traversal (Left, Root, Right)
    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }
    }

    // Preorder traversal (Root, Left, Right)
    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // Main method with menu-driven interface
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        Scanner scanner = new Scanner(System.in);
        int choice, key;

        do {
            System.out.println("\nAVL Tree Operations:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Tree Sort (Inorder)");
            System.out.println("5. Preorder Traversal");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key to insert: ");
                    key = scanner.nextInt();
                    tree.root = tree.insert(tree.root, key);
                    break;
                case 2:
                    System.out.print("Enter key to delete: ");
                    key = scanner.nextInt();
                    tree.root = tree.delete(tree.root, key);
                    break;
                case 3:
                    System.out.print("Enter key to search: ");
                    key = scanner.nextInt();
                    Node result = tree.search(tree.root, key);
                    if (result != null)
                        System.out.println("Element found: " + result.key);
                    else
                        System.out.println("Element not found.");
                    break;
                case 4:
                    System.out.println("Sorted elements (Inorder Traversal):");
                    tree.inOrder(tree.root);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Preorder Traversal:");
                    tree.preOrder(tree.root);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
