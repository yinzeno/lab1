package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileModifyTest {


//    @Test
//    public void testGenerateNewText1() {   //����һ���õ�ʱ��ȡ��ע��
////        fail("Not yet implemented");
//        String re = "not the sun";
//        String yu = FileModify.generateNewText();
//        assertEquals(re, yu);
//    }
//    @Test
//    public void testGenerateNewText2() {//���Զ����õ�ʱ��ȡ��ע��
////        fail("Not yet implemented");
//        String re = "   ";
//        String yu = FileModify.generateNewText();
//        assertEquals(re, yu);
//    }
    @Test
    public void testGenerateNewText3() {//���������õ�ʱ��ȡ��ע��
//        fail("Not yet implemented");
        String re = "if sun";
        String yu = FileModify.generateNewText();
        assertEquals(re, yu);
    }    
}
