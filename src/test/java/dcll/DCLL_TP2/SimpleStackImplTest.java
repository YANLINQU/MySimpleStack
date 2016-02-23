package dcll.DCLL_TP2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by QYL on 2016/2/23.
 */
public class SimpleStackImplTest {
    SimpleStack simplestack;
    @Before
    public void setUp() throws Exception {
        simplestack = new SimpleStackImpl();
        System.out.println("SimpleStackTest setUp");
    }

    @Test
    public void testIsEmpty() throws Exception {
        Assert.assertEquals(true,simplestack.isEmpty());
        String element1="toto";
        simplestack.push(new Item(new String(element1)));
        Assert.assertEquals(false,simplestack.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        Assert.assertEquals(0,simplestack.getSize());
        String element1="toto";
        simplestack.push(new Item(new String(element1)));
        simplestack.push(new Item(new String(element1+"2")));
        Assert.assertEquals(2,simplestack.getSize());
    }

    @Test
    public void testPush() throws Exception {
        Item ita=new Item(new Integer(8));
        Assert.assertEquals(0,simplestack.getSize());
        simplestack.push(ita);
        Assert.assertEquals(1,simplestack.getSize());
        Item o = simplestack.peek();
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer=(Integer)o.getValue();
        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals(ita.getValue(),integer);
    }

    @Test
    public void testPeek() throws Exception {
        Item ita=new Item(new Integer(8));
        Assert.assertEquals(0,simplestack.getSize());
        simplestack.push(ita);
        Assert.assertEquals(1,simplestack.getSize());
        Item o = simplestack.peek();
        Assert.assertEquals(1,simplestack.getSize());
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer=(Integer)o.getValue();
        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals(ita.getValue(),integer);
    }

    @Test
    public void testPop() throws Exception {
        Item ita=new Item(new Integer(8));
        Assert.assertEquals(0,simplestack.getSize());
        simplestack.push(ita);
        Assert.assertEquals(1,simplestack.getSize());
        Item o = simplestack.pop();
        Assert.assertEquals(0,simplestack.getSize());
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer=(Integer)o.getValue();
        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals(ita.getValue(),integer);
    }
}