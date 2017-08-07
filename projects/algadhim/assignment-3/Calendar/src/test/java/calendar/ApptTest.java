package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
	 }

	 @Test
	  public void test02()  throws Throwable  {
		 int startHour=23;
		 int startMinute=59;
		 int startDay=1;
		 int startMonth=14; //bug
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 try {
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 }catch(IndexOutOfBoundsException e)	{

		 }
	// assertions
		 /*
		 assertTrue(appt.getValid());
		 assertEquals(23, appt.getStartHour());
		 assertEquals(59, appt.getStartMinute());
		 assertEquals(1, appt.getStartDay());
		 assertEquals(12, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
		 */
	 }
//add more unit tests as you needed

	 @Test
	 public void test03()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 appt.setStartDay(1);
		 appt.setStartHour(1);
		 appt.setStartMinute(1);
		 appt.setStartMonth(0);
		 appt.setStartYear(2017);

	// assertions
		 assertFalse(appt.getValid());
		 assertFalse(appt.isRecurring());
		 assertEquals(1, appt.getStartHour());
		 assertEquals(1, appt.getStartMinute());
		 assertEquals(1, appt.getStartDay());
		 assertEquals(0, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
	 }

	 @Test
	 public void test04()  throws Throwable  {
		 int startHour=1;
		 int startMinute=1;
		 int startDay=1;
		 int startMonth=1;
		 int startYear=1;
		 String title="title";
		 String description="des";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(1, appt.getStartHour());
		 assertEquals(1, appt.getStartMinute());
		 assertEquals(1, appt.getStartDay());
		 assertEquals(1, appt.getStartMonth());
		 assertEquals(1, appt.getStartYear());
		 assertEquals("title", appt.getTitle());
		 assertEquals("des", appt.getDescription());

		 int [] arr = {1,2,3};
		 appt.setRecurrence(arr, 3, 3, 3);

		 assertTrue(appt.isRecurring());
		 assertEquals(arr, appt.getRecurDays());
		 assertEquals(3, appt.getRecurBy());
		 assertEquals(3, appt.getRecurIncrement());
		 assertEquals(3, appt.getRecurNumber());



	 }

	 @Test
	 public void test05()  throws Throwable  {
		 int startHour=1;
		 int startMinute=1;
		 int startDay=1;
		 int startMonth=1;
		 int startYear=1;
		 String title="title";
		 String description="des";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(1, appt.getStartHour());
		 assertEquals(1, appt.getStartMinute());
		 assertEquals(1, appt.getStartDay());
		 assertEquals(1, appt.getStartMonth());
		 assertEquals(1, appt.getStartYear());
		 assertEquals("title", appt.getTitle());
		 assertEquals("des", appt.getDescription());

		 int [] arr = null;
		 appt.setRecurrence(arr, 0, 0, 0);

		//assertEquals(arr, appt.getRecurDays());
		 assertEquals(0, appt.getRecurBy());
		 assertEquals(0, appt.getRecurIncrement());
		 assertEquals(0, appt.getRecurNumber());



	 }

	 @Test
	  public void test06()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title=null;
		 String description=null;
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("", appt.getTitle());
		 assertEquals("", appt.getDescription());
	 }
	 @Test
	  public void test07()  throws Throwable  {
	 	int startHour=-1;
	 	int startMinute=30;
	 	int startDay=10;
	 	int startMonth=4;
	 	int startYear=2017;
	 	String title="Birthday Party";
	 	String description="This is my birthday party.";
	 	//Construct a new Appointment object with the initial data
	 	Appt appt = new Appt(startHour,
	 				startMinute ,
	 				startDay ,
	 				startMonth ,
	 				startYear ,
	 				title,
	 			  description);
	 // assertions
	 	assertFalse(appt.getValid());
	 	assertEquals(-1, appt.getStartHour());
	 	assertEquals(30, appt.getStartMinute());
	 	assertEquals(10, appt.getStartDay());
	 	assertEquals(04, appt.getStartMonth());
	 	assertEquals(2017, appt.getStartYear());
	 	assertEquals("Birthday Party", appt.getTitle());
	 	assertEquals("This is my birthday party.", appt.getDescription());
	 	assertEquals(null, appt.toString());
	 }

	 @Test
	  public void test08()  throws Throwable  {
	 	int startHour=25;
	 	int startMinute=30;
	 	int startDay=10;
	 	int startMonth=4;
	 	int startYear=2017;
	 	String title="Birthday Party";
	 	String description="This is my birthday party.";
	 	//Construct a new Appointment object with the initial data
	 	Appt appt = new Appt(startHour,
	 				startMinute ,
	 				startDay ,
	 				startMonth ,
	 				startYear ,
	 				title,
	 			  description);
	 // assertions
	 	assertFalse(appt.getValid());
	 	assertEquals(25, appt.getStartHour());
	 	assertEquals(30, appt.getStartMinute());
	 	assertEquals(10, appt.getStartDay());
	 	assertEquals(04, appt.getStartMonth());
	 	assertEquals(2017, appt.getStartYear());
	 	assertEquals("Birthday Party", appt.getTitle());
	 	assertEquals("This is my birthday party.", appt.getDescription());
	 }


	 @Test
	  public void test09()  throws Throwable  {
	 	int startHour=1;
	 	int startMinute=-1;
	 	int startDay=10;
	 	int startMonth=4;
	 	int startYear=2017;
	 	String title="Birthday Party";
	 	String description="This is my birthday party.";
	 	//Construct a new Appointment object with the initial data
	 	Appt appt = new Appt(startHour,
	 				startMinute ,
	 				startDay ,
	 				startMonth ,
	 				startYear ,
	 				title,
	 			  description);
	 // assertions
	 	assertFalse(appt.getValid());
	 	assertEquals(1, appt.getStartHour());
	 	assertEquals(-1, appt.getStartMinute());
	 	assertEquals(10, appt.getStartDay());
	 	assertEquals(04, appt.getStartMonth());
	 	assertEquals(2017, appt.getStartYear());
	 	assertEquals("Birthday Party", appt.getTitle());
	 	assertEquals("This is my birthday party.", appt.getDescription());
	 }

	 @Test
	  public void test10()  throws Throwable  {
	 	int startHour=1;
	 	int startMinute=61;
	 	int startDay=10;
	 	int startMonth=4;
	 	int startYear=2017;
	 	String title="Birthday Party";
	 	String description="This is my birthday party.";
	 	//Construct a new Appointment object with the initial data
	 	Appt appt = new Appt(startHour,
	 				startMinute ,
	 				startDay ,
	 				startMonth ,
	 				startYear ,
	 				title,
	 			  description);
	 // assertions
	 	assertFalse(appt.getValid());
	 	assertEquals(1, appt.getStartHour());
	 	assertEquals(61, appt.getStartMinute());
	 	assertEquals(10, appt.getStartDay());
	 	assertEquals(04, appt.getStartMonth());
	 	assertEquals(2017, appt.getStartYear());
	 	assertEquals("Birthday Party", appt.getTitle());
	 	assertEquals("This is my birthday party.", appt.getDescription());
	 }

	 @Test
	  public void test11()  throws Throwable  {
		 int startHour=23;
		 int startMinute=59;
		 int startDay=1;
		 int startMonth=0; //bug
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 try {
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 }catch(IndexOutOfBoundsException e)	{

		 }
	// assertions
		 /*
		 assertTrue(appt.getValid());
		 assertEquals(23, appt.getStartHour());
		 assertEquals(59, appt.getStartMinute());
		 assertEquals(1, appt.getStartDay());
		 assertEquals(12, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
		 */
	 }

	 @Test
	  public void test12()  throws Throwable  {
	 	int startHour=1;
	 	int startMinute=55;
	 	int startDay=0;
	 	int startMonth=4;
	 	int startYear=2017;
	 	String title="Birthday Party";
	 	String description="This is my birthday party.";
	 	//Construct a new Appointment object with the initial data
	 	Appt appt = new Appt(startHour,
	 				startMinute ,
	 				startDay ,
	 				startMonth ,
	 				startYear ,
	 				title,
	 			  description);
	 // assertions
	 	assertFalse(appt.getValid());
	 	assertEquals(1, appt.getStartHour());
	 	assertEquals(55, appt.getStartMinute());
	 	assertEquals(0, appt.getStartDay());
	 	assertEquals(04, appt.getStartMonth());
	 	assertEquals(2017, appt.getStartYear());
	 	assertEquals("Birthday Party", appt.getTitle());
	 	assertEquals("This is my birthday party.", appt.getDescription());
	 }

	 @Test
	  public void test13()  throws Throwable  {
	 	int startHour=1;
	 	int startMinute=55;
	 	int startDay=45;
	 	int startMonth=4;
	 	int startYear=2017;
	 	String title="Birthday Party";
	 	String description="This is my birthday party.";
	 	//Construct a new Appointment object with the initial data
	 	Appt appt = new Appt(startHour,
	 				startMinute ,
	 				startDay ,
	 				startMonth ,
	 				startYear ,
	 				title,
	 			  description);
	 // assertions
	 	assertFalse(appt.getValid());
	 	assertEquals(1, appt.getStartHour());
	 	assertEquals(55, appt.getStartMinute());
	 	assertEquals(45, appt.getStartDay());
	 	assertEquals(04, appt.getStartMonth());
	 	assertEquals(2017, appt.getStartYear());
	 	assertEquals("Birthday Party", appt.getTitle());
	 	assertEquals("This is my birthday party.", appt.getDescription());
	 }

	 @Test
	  public void test14()  throws Throwable  {
	   int startHour=1;
	   int startMinute=55;
	   int startDay=25;
	   int startMonth=4;
	   int startYear=2017;
	   String title="Birthday Party";
	   String description="This is my birthday party.";
	   //Construct a new Appointment object with the initial data
	   Appt appt = new Appt(startHour,
					startMinute ,
					startDay ,
					startMonth ,
					startYear ,
					title,
				  description);
	 // assertions
	   assertTrue(appt.getValid());
	   assertEquals(1, appt.getStartHour());
	   assertEquals(55, appt.getStartMinute());
	   assertEquals(25, appt.getStartDay());
	   assertEquals(04, appt.getStartMonth());
	   assertEquals(2017, appt.getStartYear());
	   assertEquals("Birthday Party", appt.getTitle());
	   assertEquals("This is my birthday party.", appt.getDescription());
	   assertEquals("\t4/25/2017 at 1:55am ,Birthday Party, This is my birthday party.\n", appt.toString());

	 }

	 @Test
	  public void test15()  throws Throwable  {
	   int startHour=0;
	   int startMinute=55;
	   int startDay=25;
	   int startMonth=4;
	   int startYear=2017;
	   String title="Birthday Party";
	   String description="This is my birthday party.";
	   //Construct a new Appointment object with the initial data
	   Appt appt = new Appt(startHour,
					startMinute ,
					startDay ,
					startMonth ,
					startYear ,
					title,
				  description);
	 // assertions
	   assertTrue(appt.getValid());
	   assertEquals(0, appt.getStartHour());
	   assertEquals(55, appt.getStartMinute());
	   assertEquals(25, appt.getStartDay());
	   assertEquals(04, appt.getStartMonth());
	   assertEquals(2017, appt.getStartYear());
	   assertEquals("Birthday Party", appt.getTitle());
	   assertEquals("This is my birthday party.", appt.getDescription());
	   assertEquals("\t4/25/2017 at 12:55am ,Birthday Party, This is my birthday party.\n", appt.toString());

	 }

	 @Test
	  public void test16()  throws Throwable  {
	   int startHour=16;
	   int startMinute=55;
	   int startDay=25;
	   int startMonth=4;
	   int startYear=2017;
	   String title="Birthday Party";
	   String description="This is my birthday party.";
	   //Construct a new Appointment object with the initial data
	   Appt appt = new Appt(startHour,
					startMinute ,
					startDay ,
					startMonth ,
					startYear ,
					title,
				  description);
	 // assertions
	   assertTrue(appt.getValid());
	   assertEquals(16, appt.getStartHour());
	   assertEquals(55, appt.getStartMinute());
	   assertEquals(25, appt.getStartDay());
	   assertEquals(04, appt.getStartMonth());
	   assertEquals(2017, appt.getStartYear());
	   assertEquals("Birthday Party", appt.getTitle());
	   assertEquals("This is my birthday party.", appt.getDescription());
	   assertEquals("\t4/25/2017 at 4:55pm ,Birthday Party, This is my birthday party.\n", appt.toString());

	 }

	 @Test
	 public void test17()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 assertTrue(appt.getValid());

		 appt.setStartDay(1000);
		 appt.setStartHour(1000);
		 appt.setStartMinute(1000);
		 appt.setStartMonth(0);
		 appt.setStartYear(2017);

	// assertions
		 assertFalse(appt.getValid());
		 assertFalse(appt.isRecurring());
		 /*assertEquals(10, appt.getStartHour());
		 assertEquals(10, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(10, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());*/

		 appt.setStartDay(10);
		 appt.setStartHour(10);
		 appt.setStartMinute(10);
		 appt.setStartMonth(10);
		 appt.setStartYear(2017);

	// assertions
		 assertTrue(appt.getValid());


	 }

	 @Test
	  public void test18()  throws Throwable  {
	   int startHour=11;
	   int startMinute=55;
	   int startDay=25;
	   int startMonth=4;
	   int startYear=2017;
	   String title="Birthday Party";
	   String description="This is my birthday party.";
	   //Construct a new Appointment object with the initial data
	   Appt appt = new Appt(startHour,
					startMinute ,
					startDay ,
					startMonth ,
					startYear ,
					title,
				  description);
	 // assertions
	   assertTrue(appt.getValid());
	   assertEquals(11, appt.getStartHour());
	   assertEquals(55, appt.getStartMinute());
	   assertEquals(25, appt.getStartDay());
	   assertEquals(04, appt.getStartMonth());
	   assertEquals(2017, appt.getStartYear());
	   assertEquals("Birthday Party", appt.getTitle());
	   assertEquals("This is my birthday party.", appt.getDescription());
	   assertEquals("\t4/25/2017 at 11:55am ,Birthday Party, This is my birthday party.\n", appt.toString());

	 }

	 @Test
	  public void test19()  throws Throwable  {
	   int startHour=13;
	   int startMinute=55;
	   int startDay=25;
	   int startMonth=4;
	   int startYear=2017;
	   String title="Birthday Party";
	   String description="This is my birthday party.";
	   //Construct a new Appointment object with the initial data
	   Appt appt = new Appt(startHour,
					startMinute ,
					startDay ,
					startMonth ,
					startYear ,
					title,
				  description);
	 // assertions
	   assertTrue(appt.getValid());
	   assertEquals(13, appt.getStartHour());
	   assertEquals(55, appt.getStartMinute());
	   assertEquals(25, appt.getStartDay());
	   assertEquals(04, appt.getStartMonth());
	   assertEquals(2017, appt.getStartYear());
	   assertEquals("Birthday Party", appt.getTitle());
	   assertEquals("This is my birthday party.", appt.getDescription());
	   assertEquals("\t4/25/2017 at 1:55pm ,Birthday Party, This is my birthday party.\n", appt.toString());

	 }

	 @Test
	  public void test20()  throws Throwable  {
	   int startHour=12;
	   int startMinute=55;
	   int startDay=25;
	   int startMonth=4;
	   int startYear=2017;
	   String title="Birthday Party";
	   String description="This is my birthday party.";
	   //Construct a new Appointment object with the initial data
	   Appt appt = new Appt(startHour,
					startMinute ,
					startDay ,
					startMonth ,
					startYear ,
					title,
				  description);
	 // assertions
	   assertTrue(appt.getValid());
	   assertEquals(12, appt.getStartHour());
	   assertEquals(55, appt.getStartMinute());
	   assertEquals(25, appt.getStartDay());
	   assertEquals(04, appt.getStartMonth());
	   assertEquals(2017, appt.getStartYear());
	   assertEquals("Birthday Party", appt.getTitle());
	   assertEquals("This is my birthday party.", appt.getDescription());
	   assertEquals("\t4/25/2017 at 12:55pm ,Birthday Party, This is my birthday party.\n", appt.toString());

	 }

	 @Test
	  public void test21()  throws Throwable  {
	   int startHour=23;
	   int startMinute=55;
	   int startDay=25;
	   int startMonth=4;
	   int startYear=2017;
	   String title="Birthday Party";
	   String description="This is my birthday party.";
	   //Construct a new Appointment object with the initial data
	   Appt appt = new Appt(startHour,
					startMinute ,
					startDay ,
					startMonth ,
					startYear ,
					title,
				  description);
	 // assertions
	   assertTrue(appt.getValid());
	   assertEquals(23, appt.getStartHour());
	   assertEquals(55, appt.getStartMinute());
	   assertEquals(25, appt.getStartDay());
	   assertEquals(04, appt.getStartMonth());
	   assertEquals(2017, appt.getStartYear());
	   assertEquals("Birthday Party", appt.getTitle());
	   assertEquals("This is my birthday party.", appt.getDescription());
	   assertEquals("\t4/25/2017 at 11:55pm ,Birthday Party, This is my birthday party.\n", appt.toString());

	 }

	 @Test
	  public void test22()  throws Throwable  {
	   int startHour=24;
	   int startMinute=55;
	   int startDay=25;
	   int startMonth=4;
	   int startYear=2017;
	   String title="Birthday Party";
	   String description="This is my birthday party.";
	   //Construct a new Appointment object with the initial data
	   Appt appt = new Appt(startHour,
					startMinute ,
					startDay ,
					startMonth ,
					startYear ,
					title,
				  description);
	 // assertions
	   assertTrue(appt.getValid());
	   assertEquals(24, appt.getStartHour());
	   assertEquals(55, appt.getStartMinute());
	   assertEquals(25, appt.getStartDay());
	   assertEquals(04, appt.getStartMonth());
	   assertEquals(2017, appt.getStartYear());
	   assertEquals("Birthday Party", appt.getTitle());
	   assertEquals("This is my birthday party.", appt.getDescription());
	   assertEquals("\t4/25/2017 at 12:55pm ,Birthday Party, This is my birthday party.\n", appt.toString());

	 }

	 @Test
	  public void test23()  throws Throwable  {
	   int startHour=24;
	   int startMinute=0;
	   int startDay=25;
	   int startMonth=4;
	   int startYear=2017;
	   String title="Birthday Party";
	   String description="This is my birthday party.";
	   //Construct a new Appointment object with the initial data
	   Appt appt = new Appt(startHour,
	 			  startMinute ,
	 			  startDay ,
	 			  startMonth ,
	 			  startYear ,
	 			  title,
	 			 description);
	 // assertions
	   assertTrue(appt.getValid());
	   assertEquals(24, appt.getStartHour());
	   assertEquals(0, appt.getStartMinute());
	   assertEquals(25, appt.getStartDay());
	   assertEquals(04, appt.getStartMonth());
	   assertEquals(2017, appt.getStartYear());
	   assertEquals("Birthday Party", appt.getTitle());
	   assertEquals("This is my birthday party.", appt.getDescription());
	   //assertEquals("\t4/25/2017 at 12:55pm ,Birthday Party, This is my birthday party.\n", appt.toString());

	 }

	 @Test
	  public void test24()  throws Throwable  {
	   int startHour=24;
	   int startMinute=60;
	   int startDay=25;
	   int startMonth=4;
	   int startYear=2017;
	   String title="Birthday Party";
	   String description="This is my birthday party.";
	   //Construct a new Appointment object with the initial data
	   Appt appt = new Appt(startHour,
					startMinute ,
					startDay ,
					startMonth ,
					startYear ,
					title,
				  description);
	 // assertions
	   assertTrue(appt.getValid());
	   assertEquals(24, appt.getStartHour());
	   assertEquals(60, appt.getStartMinute());
	   assertEquals(25, appt.getStartDay());
	   assertEquals(04, appt.getStartMonth());
	   assertEquals(2017, appt.getStartYear());
	   assertEquals("Birthday Party", appt.getTitle());
	   assertEquals("This is my birthday party.", appt.getDescription());
	   //assertEquals("\t4/25/2017 at 12:55pm ,Birthday Party, This is my birthday party.\n", appt.toString());

	 }

	 @Test
	  public void test25()  throws Throwable  {
	   int startHour=24;
	   int startMinute=60;
	   int startDay=31;
	   int startMonth=4;
	   int startYear=2017;
	   String title="Birthday Party";
	   String description="This is my birthday party.";
	   //Construct a new Appointment object with the initial data
	   Appt appt = new Appt(startHour,
					startMinute ,
					startDay ,
					startMonth ,
					startYear ,
					title,
				  description);
	 // assertions
	   assertTrue(appt.getValid());
	   assertEquals(24, appt.getStartHour());
	   assertEquals(60, appt.getStartMinute());
	   assertEquals(31, appt.getStartDay());
	   assertEquals(04, appt.getStartMonth());
	   assertEquals(2017, appt.getStartYear());
	   assertEquals("Birthday Party", appt.getTitle());
	   assertEquals("This is my birthday party.", appt.getDescription());
	   //assertEquals("\t4/25/2017 at 12:55pm ,Birthday Party, This is my birthday party.\n", appt.toString());

	 }
	 @Test
	  public void test26()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions

		 appt.setStartHour(30);

		 assertFalse(appt.getValid());
		 assertEquals(30, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
	 }

	 @Test
	  public void test27()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions

		appt.setStartMinute(100);

		 assertFalse(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(100, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
	 }

	 @Test
	  public void test28()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions

		 appt.setStartDay(50);

		 assertFalse(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(50, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
	 }

	 @Test
	  public void test29()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
				 assertFalse(appt.isRecurring());
		 appt.setStartMonth(0);

		 assertFalse(appt.getValid());

		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(0, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
	 }

	 @Test
	 public void test30()  throws Throwable  {
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
					startMinute ,
					startDay ,
					startMonth ,
					startYear ,
					title,
				  description);
  // assertions
		assertFalse(appt.isRecurring());
		assertEquals(appt.RECUR_BY_MONTHLY, appt.getRecurBy());

		assertTrue(appt.getValid());
		assertEquals(13, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(4, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
   }
}
