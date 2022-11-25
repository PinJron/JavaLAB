import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestBinaryTree {
    BinaryTree<Integer> tree = new BinaryTree<>();

    @Test
    public void testGetSize() {
        tree.add(6);
        tree.add(8);
        tree.add(5);
        assertEquals(3, tree.getSize(), 0);
    }

    @Test
    public void testFindNodeByValue() {
        tree.add(6);
        tree.add(8);
        tree.add(5);
        assertEquals(5, tree.findNodeByValue(5).getValue(), 0);
    }
}
