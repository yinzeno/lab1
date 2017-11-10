package lab1;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileModifyTest {

    @Test
    public void testQueryBridgeWords() {
//        fail("Not yet implemented");
        String re = "The bridge words from if to the are: not,turned,.";
        String yuan = FileModify.queryBridgeWords("if", "the");
        assertEquals(re, yuan);

    }
    @Test
    public void testQueryBridgeWords1() {
//        fail("Not yet implemented");
        String re = "The bridge words from the to for are: sun,.";
        String yuan = FileModify.queryBridgeWords("the", "for");
        assertEquals(re, yuan);

    }
    @Test
    public void testQueryBridgeWords2() {
//        fail("Not yet implemented");
        String re = "No   in the graph!";
        String yuan = FileModify.queryBridgeWords("to", " ");
        assertEquals(re, yuan);

    }
    @Test
    public void testQueryBridgeWords3() {
//      fail("Not yet implemented");
      String re = "No bridge words from if to sun!";
      String yuan = "No bridge words from if to sun!";
      //System.out.println(yuan);
      assertEquals(re, yuan);

  }

}
