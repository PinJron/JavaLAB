package lr5_sdacha;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSimpleSort_5 {

  @Test
  public void TestInsert() throws Exception {
    MyVector<Integer> test_vec_vozrastanie = new MyVector<Integer>(4);
    test_vec_vozrastanie.addLast(2);
    test_vec_vozrastanie.addLast(3);
    test_vec_vozrastanie.addLast(5);
    test_vec_vozrastanie.addLast(10);

    MyVector<Integer> test_vec_ubivanie = new MyVector<Integer>(4);
    test_vec_ubivanie.addLast(10);
    test_vec_ubivanie.addLast(5);
    test_vec_ubivanie.addLast(3);
    test_vec_ubivanie.addLast(2);

    MyVector<Integer> vec = new MyVector<Integer>(4);
    vec.addLast(3);
    vec.addLast(5);
    vec.addLast(2);
    vec.insertByIndex(10, 3);

    vec.sortInsert("vozrastanie", 0, 3);
    assertArrayEquals(vec.arr,  test_vec_vozrastanie.arr);

    vec.sortInsert("ubivanie", 0, 3);
    assertArrayEquals(vec.arr,  test_vec_ubivanie.arr);

  }
  
}
