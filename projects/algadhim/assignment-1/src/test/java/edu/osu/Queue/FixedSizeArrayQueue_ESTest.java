/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 01 19:40:24 GMT 2017
 */

package edu.osu.Queue;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.osu.Queue.FixedSizeArrayQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FixedSizeArrayQueue_ESTest extends FixedSizeArrayQueue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FixedSizeArrayQueue fixedSizeArrayQueue0 = new FixedSizeArrayQueue(4);
      fixedSizeArrayQueue0.enQueue((-1146));
      fixedSizeArrayQueue0.deQueue();
      fixedSizeArrayQueue0.isEmpty();
      // Undeclared exception!
      try { 
        fixedSizeArrayQueue0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FixedSizeArrayQueue fixedSizeArrayQueue0 = new FixedSizeArrayQueue(0);
      boolean boolean0 = fixedSizeArrayQueue0.isEmpty();
      assertTrue(boolean0);
      
      fixedSizeArrayQueue0.size();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FixedSizeArrayQueue fixedSizeArrayQueue0 = null;
      try {
        fixedSizeArrayQueue0 = new FixedSizeArrayQueue((-5052));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.osu.Queue.FixedSizeArrayQueue", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FixedSizeArrayQueue fixedSizeArrayQueue0 = new FixedSizeArrayQueue(0);
      // Undeclared exception!
      try { 
        fixedSizeArrayQueue0.enQueue(2822);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("edu.osu.Queue.FixedSizeArrayQueue", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FixedSizeArrayQueue fixedSizeArrayQueue0 = new FixedSizeArrayQueue(0);
      // Undeclared exception!
      try { 
        fixedSizeArrayQueue0.deQueue();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("edu.osu.Queue.FixedSizeArrayQueue", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FixedSizeArrayQueue fixedSizeArrayQueue0 = new FixedSizeArrayQueue(3042);
      fixedSizeArrayQueue0.enQueue(3042);
      fixedSizeArrayQueue0.deQueue();
      fixedSizeArrayQueue0.enQueue((-2832));
      fixedSizeArrayQueue0.toString();
      fixedSizeArrayQueue0.deQueue();
      fixedSizeArrayQueue0.isEmpty();
      fixedSizeArrayQueue0.deQueue();
      fixedSizeArrayQueue0.isEmpty();
      fixedSizeArrayQueue0.deQueue();
      fixedSizeArrayQueue0.enQueue(0);
      fixedSizeArrayQueue0.deQueue();
      fixedSizeArrayQueue0.size();
      fixedSizeArrayQueue0.toString();
      fixedSizeArrayQueue0.toString();
      fixedSizeArrayQueue0.size();
      fixedSizeArrayQueue0.isEmpty();
      fixedSizeArrayQueue0.size();
      // Undeclared exception!
      fixedSizeArrayQueue0.toString();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FixedSizeArrayQueue fixedSizeArrayQueue0 = new FixedSizeArrayQueue(3041);
      assertEquals(3041, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isFull());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertNotNull(fixedSizeArrayQueue0);
      
      fixedSizeArrayQueue0.enQueue(3041);
      assertFalse(fixedSizeArrayQueue0.isFull());
      assertEquals(3042, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      
      fixedSizeArrayQueue0.enQueue(3041);
      assertFalse(fixedSizeArrayQueue0.isFull());
      assertEquals(3043, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      
      int int0 = fixedSizeArrayQueue0.deQueue();
      assertFalse(fixedSizeArrayQueue0.isFull());
      assertEquals(3042, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertEquals(0, int0);
      
      String string0 = fixedSizeArrayQueue0.toString();
      assertFalse(fixedSizeArrayQueue0.isFull());
      assertEquals(3042, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertNotNull(string0);
      
      int int1 = fixedSizeArrayQueue0.deQueue();
      assertEquals(3041, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isFull());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertFalse(int1 == int0);
      assertEquals(3040, int1);
      
      fixedSizeArrayQueue0.enQueue(3211);
      assertFalse(fixedSizeArrayQueue0.isFull());
      assertEquals(3042, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      
      String string1 = fixedSizeArrayQueue0.toString();
      assertFalse(fixedSizeArrayQueue0.isFull());
      assertEquals(3042, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      
      fixedSizeArrayQueue0.enQueue(412);
      assertFalse(fixedSizeArrayQueue0.isFull());
      assertEquals(3043, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      
      int int2 = fixedSizeArrayQueue0.size();
      assertFalse(fixedSizeArrayQueue0.isFull());
      assertEquals(3043, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertEquals(3043, int2);
      
      String string2 = fixedSizeArrayQueue0.toString();
      assertFalse(fixedSizeArrayQueue0.isFull());
      assertEquals(3043, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertNotNull(string2);
      
      // Undeclared exception!
      fixedSizeArrayQueue0.toString();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FixedSizeArrayQueue fixedSizeArrayQueue0 = new FixedSizeArrayQueue();
      assertEquals(16, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertTrue(fixedSizeArrayQueue0.isFull());
      assertNotNull(fixedSizeArrayQueue0);
      
      int int0 = fixedSizeArrayQueue0.deQueue();
      assertFalse(fixedSizeArrayQueue0.isFull());
      assertEquals(15, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertEquals(0, int0);
      
      int int1 = fixedSizeArrayQueue0.deQueue();
      assertFalse(fixedSizeArrayQueue0.isFull());
      assertEquals(14, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertTrue(int1 == int0);
      assertEquals(0, int1);
      
      fixedSizeArrayQueue0.enQueue(776);
      assertFalse(fixedSizeArrayQueue0.isFull());
      assertEquals(15, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      
      fixedSizeArrayQueue0.enQueue(Integer.MIN_VALUE);
      assertEquals(16, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertTrue(fixedSizeArrayQueue0.isFull());
      
      String string0 = fixedSizeArrayQueue0.toString();
      assertEquals(16, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertTrue(fixedSizeArrayQueue0.isFull());
      assertEquals("[2147483647, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2147483648, 775]", string0);
      assertNotNull(string0);
      
      fixedSizeArrayQueue0.enQueue(1731);
      assertFalse(fixedSizeArrayQueue0.isFull());
      assertEquals(17, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      
      int int2 = fixedSizeArrayQueue0.size();
      assertFalse(fixedSizeArrayQueue0.isFull());
      assertEquals(17, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertEquals(17, int2);
      
      boolean boolean0 = fixedSizeArrayQueue0.isFull();
      assertFalse(fixedSizeArrayQueue0.isFull());
      assertEquals(17, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertFalse(boolean0);
      
      String string1 = fixedSizeArrayQueue0.toString();
      assertFalse(fixedSizeArrayQueue0.isFull());
      assertEquals(17, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertFalse(string1.equals((Object)string0));
      assertEquals("[2147483647, 1730, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2147483648, 775, 2147483647]", string1);
      assertNotNull(string1);
      
      boolean boolean1 = fixedSizeArrayQueue0.isEmpty();
      assertFalse(fixedSizeArrayQueue0.isFull());
      assertEquals(17, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
      
      String string2 = fixedSizeArrayQueue0.toString();
      assertFalse(fixedSizeArrayQueue0.isFull());
      assertEquals(17, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertFalse(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertEquals("[2147483647, 1730, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2147483648, 775, 2147483647]", string2);
      assertNotNull(string2);
      
      int int3 = fixedSizeArrayQueue0.deQueue();
      assertEquals(16, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertTrue(fixedSizeArrayQueue0.isFull());
      assertFalse(int3 == int0);
      assertFalse(int3 == int1);
      assertFalse(int3 == int2);
      assertEquals(Integer.MAX_VALUE, int3);
      
      boolean boolean2 = fixedSizeArrayQueue0.isEmpty();
      assertEquals(16, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertTrue(fixedSizeArrayQueue0.isFull());
      assertTrue(boolean2 == boolean1);
      assertTrue(boolean2 == boolean0);
      assertFalse(boolean2);
      
      boolean boolean3 = fixedSizeArrayQueue0.isEmpty();
      assertEquals(16, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertTrue(fixedSizeArrayQueue0.isFull());
      assertTrue(boolean3 == boolean1);
      assertTrue(boolean3 == boolean0);
      assertTrue(boolean3 == boolean2);
      assertFalse(boolean3);
      
      boolean boolean4 = fixedSizeArrayQueue0.isFull();
      assertEquals(16, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertTrue(fixedSizeArrayQueue0.isFull());
      assertFalse(boolean4 == boolean3);
      assertFalse(boolean4 == boolean1);
      assertFalse(boolean4 == boolean0);
      assertFalse(boolean4 == boolean2);
      assertTrue(boolean4);
      
      int int4 = fixedSizeArrayQueue0.deQueue();
      assertFalse(fixedSizeArrayQueue0.isFull());
      assertEquals(15, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertFalse(int4 == int1);
      assertFalse(int4 == int3);
      assertFalse(int4 == int2);
      assertFalse(int4 == int0);
      assertEquals(1730, int4);
      
      boolean boolean5 = fixedSizeArrayQueue0.isEmpty();
      assertFalse(fixedSizeArrayQueue0.isFull());
      assertEquals(15, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertTrue(boolean5 == boolean1);
      assertTrue(boolean5 == boolean0);
      assertFalse(boolean5 == boolean4);
      assertTrue(boolean5 == boolean2);
      assertTrue(boolean5 == boolean3);
      assertFalse(boolean5);
      
      fixedSizeArrayQueue0.enQueue(0);
      assertEquals(16, fixedSizeArrayQueue0.size());
      assertFalse(fixedSizeArrayQueue0.isEmpty());
      assertTrue(fixedSizeArrayQueue0.isFull());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FixedSizeArrayQueue fixedSizeArrayQueue0 = new FixedSizeArrayQueue();
      fixedSizeArrayQueue0.deQueue();
      fixedSizeArrayQueue0.deQueue();
      fixedSizeArrayQueue0.enQueue((-2179));
      fixedSizeArrayQueue0.toString();
      fixedSizeArrayQueue0.toString();
      fixedSizeArrayQueue0.toString();
      fixedSizeArrayQueue0.enQueue(2432);
      fixedSizeArrayQueue0.toString();
      fixedSizeArrayQueue0.enQueue((-2179));
      fixedSizeArrayQueue0.deQueue();
      fixedSizeArrayQueue0.deQueue();
      fixedSizeArrayQueue0.toString();
      fixedSizeArrayQueue0.deQueue();
      fixedSizeArrayQueue0.isFull();
      fixedSizeArrayQueue0.isFull();
      fixedSizeArrayQueue0.deQueue();
      fixedSizeArrayQueue0.deQueue();
      fixedSizeArrayQueue0.deQueue();
      fixedSizeArrayQueue0.enQueue(0);
      fixedSizeArrayQueue0.deQueue();
      fixedSizeArrayQueue0.enQueue(0);
      fixedSizeArrayQueue0.toString();
      fixedSizeArrayQueue0.toString();
      fixedSizeArrayQueue0.toString();
      fixedSizeArrayQueue0.enQueue(0);
      fixedSizeArrayQueue0.isFull();
      fixedSizeArrayQueue0.enQueue((-265));
      fixedSizeArrayQueue0.deQueue();
      fixedSizeArrayQueue0.toString();
      fixedSizeArrayQueue0.toString();
      assertEquals(13, fixedSizeArrayQueue0.size());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      FixedSizeArrayQueue fixedSizeArrayQueue0 = new FixedSizeArrayQueue();
      fixedSizeArrayQueue0.enQueue((-5901));
      fixedSizeArrayQueue0.deQueue();
      fixedSizeArrayQueue0.size();
      fixedSizeArrayQueue0.deQueue();
      fixedSizeArrayQueue0.isEmpty();
      fixedSizeArrayQueue0.toString();
      fixedSizeArrayQueue0.deQueue();
      fixedSizeArrayQueue0.enQueue(956);
      fixedSizeArrayQueue0.isFull();
      fixedSizeArrayQueue0.deQueue();
      fixedSizeArrayQueue0.isFull();
      fixedSizeArrayQueue0.isFull();
      boolean boolean0 = fixedSizeArrayQueue0.isEmpty();
      assertEquals(14, fixedSizeArrayQueue0.size());
      assertFalse(boolean0);
  }
}
