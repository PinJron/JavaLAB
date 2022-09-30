import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBinaryTree {
    @Test
    public void testGetSize() {
        BinaryTree tree = new BinaryTree();
        tree.add(6);
        tree.add(8);
        tree.add(5);
        assertEquals(3, tree.getSize(), 0);
    }
}
