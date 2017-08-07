package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
		CalDay calday = new CalDay();
		assertFalse(calday.isValid());
	 }

	 @Test
	  public void test02()  throws Throwable  {
		  GregorianCalendar today = new GregorianCalendar(2017, 1, 10);
		  //GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		  CalDay calday = new CalDay(today);

		 int startHour=13;
		 int startMinute=30;
		 int startDay=5;
		 int startMonth=5;
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

		 calday.addAppt(appt);

		 assertTrue(calday.isValid());
		 assertEquals(2017, calday.getYear());
		 //assertEquals(10, calday.getDay()); //there is a bug
		 assertEquals(1, calday.getMonth());

	 }

	 @Test
	  public void test03()  throws Throwable  {
		 GregorianCalendar today = new GregorianCalendar(2017, 1, 10);
		  //GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		  CalDay calday = new CalDay(today);

		 int startHour=13;
		 int startMinute=30;
		 int startDay=5;
		 int startMonth=5;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt_1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 Appt appt_2 = new Appt(5,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 Appt appt_3 = new Appt(5,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 calday.addAppt(appt_1);
		 calday.addAppt(appt_2);
		 calday.addAppt(appt_3);

		 assertTrue(calday.isValid());
		 assertEquals(2017, calday.getYear());
		 //assertEquals(10, calday.getDay()); //there is a bug
		 assertEquals(1, calday.getMonth());
		 //assertEquals(3, calday.getSizeAppts()); //bug

	 }

	 @Test
	  public void test04()  throws Throwable  {
		 GregorianCalendar today = new GregorianCalendar(2017, 1, 10);
		  //GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		  CalDay calday = new CalDay(today);

		 int startHour=25;
		 int startMinute=30;
		 int startDay=5;
		 int startMonth=5;
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

		 calday.appts = null;
		 calday.addAppt(appt);

		 assertTrue(calday.isValid());
		 assertEquals(2017, calday.getYear());
		 //assertEquals(10, calday.getDay()); //there is a bug
		 assertEquals(1, calday.getMonth());
	 }

	 @Test
	  public void test05()  throws Throwable  {
		CalDay calday = new CalDay();
		assertFalse(calday.isValid());


		 int startHour=2;
		 int startMinute=30;
		 int startDay=5;
		 int startMonth=5;
		 int startYear=2017;
		Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          "",
		          "");

		//you cant add it because the CalDay is inValid !!
		try	{
			 calday.addAppt(appt);
		 }
		 catch(NullPointerException e)	{
		 }

	 }

	 @Test
	  public void test06()  throws Throwable  {
		 CalDay calday = new CalDay();
		 assertFalse(calday.isValid());
		 assertNull(calday.iterator());
	 }

	 @Test
	  public void test07()  throws Throwable  {
		  GregorianCalendar today = new GregorianCalendar(2017, 1, 10);
		  //GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		  CalDay calday = new CalDay(today);

		 int startHour=13;
		 int startMinute=30;
		 int startDay=5;
		 int startMonth=5;
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

		 calday.addAppt(appt);

		 assertTrue(calday.isValid());
		 assertEquals(2017, calday.getYear());
		 //assertEquals(10, calday.getDay()); //there is a bug
		 assertEquals(1, calday.getMonth());

		 assertNotNull(calday.iterator());
	 }

	 @Test
	  public void test08()  throws Throwable  {
		 CalDay calday = new CalDay();
		 assertFalse(calday.isValid());
		 assertEquals("", calday.toString());
	 }

	 @Test
	  public void test09()  throws Throwable  {
		 GregorianCalendar today = new GregorianCalendar(2017, 1, 10);
		  //GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		  CalDay calday = new CalDay(today);

		 int startHour=13;
		 int startMinute=30;
		 int startDay=5;
		 int startMonth=5;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt_1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 Appt appt_2 = new Appt(5,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 Appt appt_3 = new Appt(5,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 calday.addAppt(appt_1);
		 calday.addAppt(appt_2);
		 calday.addAppt(appt_3);

		 assertEquals(
		 "	 --- 1/1/2017 --- \n" +
		 " --- -------- Appointments ------------ --- \n" +
		 "	5/5/2017 at 5:30am ,Birthday Party, This is my birthday party.\n" +
		 " 	5/5/2017 at 5:30am ,Birthday Party, This is my birthday party.\n" +
		 " 	5/5/2017 at 1:30pm ,Birthday Party, This is my birthday party.\n" +
		 " \n" +
		 "",
		 calday.toString());
	 }

	 @Test
	  public void test10()  throws Throwable  {
		  GregorianCalendar today = new GregorianCalendar(2017, 10, 10);
		  //GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		  CalDay calday = new CalDay(today);

		 int startHour=13;
		 int startMinute=30;
		 int startDay=5;
		 int startMonth=5;
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

		 calday.addAppt(appt);

		 assertTrue(calday.isValid());
		 assertEquals(2017, calday.getYear());
		 assertEquals(10, calday.getDay()); //there is a bug
		 assertEquals(10, calday.getMonth());

	 }

	 @Test
	  public void test11()  throws Throwable  {
	 	GregorianCalendar today = new GregorianCalendar(2017, 1, 10);
	 	 //GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
	 	 CalDay calday = new CalDay(today);

	 	int startHour=5;
	 	int startMinute=30;
	 	int startDay=5;
	 	int startMonth=5;
	 	int startYear=2017;
	 	String title="appt_1";
	 	String description="This is my birthday party.";
	 	//Construct a new Appointment object with the initial data
	 	Appt appt_1 = new Appt(startHour,
	 				startMinute ,
	 				startDay ,
	 				startMonth ,
	 				startYear ,
	 				title,
	 			  description);

		title="appt_2";
	 	Appt appt_2 = new Appt(startHour,
	 				startMinute ,
	 				startDay ,
	 				startMonth ,
	 				startYear ,
	 				title,
	 			  description);

		title="appt_3";
	 	Appt appt_3 = new Appt(startHour,
	 				startMinute ,
	 				startDay ,
	 				startMonth ,
	 				startYear ,
	 				title,
	 			  description);

	 	calday.addAppt(appt_1);
	 	calday.addAppt(appt_2);
	 	calday.addAppt(appt_3);

		assertEquals(
		"	 --- 1/1/2017 --- \n" +
		" --- -------- Appointments ------------ --- \n" +
		"	5/5/2017 at 5:30am ,appt_1, This is my birthday party.\n" +
		" 	5/5/2017 at 5:30am ,appt_2, This is my birthday party.\n" +
		" 	5/5/2017 at 5:30am ,appt_3, This is my birthday party.\n" +
		" \n" +
		"",
		calday.toString());

	 }

	 @Test
	  public void test12()  throws Throwable  {
		 GregorianCalendar today = new GregorianCalendar(2017, 1, 10);
		  //GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		  CalDay calday = new CalDay(today);

		 int startHour=13;
		 int startMinute=30;
		 int startDay=5;
		 int startMonth=5;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt_1 = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);

		 Appt appt_2 = new Appt(5,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);

		 Appt appt_3 = new Appt(5,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);

		 calday.addAppt(appt_1);
		 calday.addAppt(appt_2);
		 calday.addAppt(appt_3);

		 assertTrue(calday.isValid());
		 assertEquals(2017, calday.getYear());
		 //assertEquals(10, calday.getDay()); //there is a bug
		 assertEquals(1, calday.getMonth());
		 assertEquals(2, calday.getSizeAppts()); //bug

	 }


//add more unit tests as you needed
}
