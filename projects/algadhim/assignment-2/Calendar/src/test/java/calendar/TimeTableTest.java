package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		  TimeTable timetable = new TimeTable();
	 }

	 @Test
	  public void test02()  throws Throwable  {
		  TimeTable timetable = new TimeTable();

		  //Create a linked list of appts to be used
	 		Appt appt_1 = new Appt(1,
	 		         10 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_1",
	 		         "");

	 		Appt appt_2 = new Appt(5,
	 		         15 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_2",
	 		         "");

	 		Appt appt_3 = new Appt(5,
	 		         20 ,
	 		         6 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_3",
	 		         "");


		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		ApptsList.add(appt_2);
		ApptsList.add(appt_3);

		//create first and last days
		//GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar first = new GregorianCalendar(2017, 6, 4);
		GregorianCalendar last = new GregorianCalendar(2018, 6, 7);

		try	{
			timetable.getApptRange(ApptsList, last, first);
		} catch(DateOutOfRangeException e)	{

		}


	}

	 @Test
	  public void test03()  throws Throwable  {
		  TimeTable timetable = new TimeTable();

		  //Create a linked list of appts to be used
	 		Appt appt_1 = new Appt(1,
	 		         10 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_1",
	 		         "");

	 		Appt appt_2 = new Appt(5,
	 		         15 ,
	 		         7 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_2",
	 		         "");

	 		Appt appt_3 = new Appt(5,
	 		         20 ,
	 		         6 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_3",
	 		         "");


		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		ApptsList.add(appt_2);
		ApptsList.add(appt_3);

		//create first and last days
		//GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar first = new GregorianCalendar(2017, 6, 4);
		GregorianCalendar last = new GregorianCalendar(2017, 6, 8);

		try	{
			timetable.getApptRange(ApptsList, first, last);
		} catch(NullPointerException e)	{

		}

	 }

	 @Test
	  public void test04()  throws Throwable  {
		  TimeTable timetable = new TimeTable();

		  //Create a linked list of appts to be used
	 		Appt appt_1 = new Appt(1,
	 		         10 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_1",
	 		         "");


		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);


		//create first and last days
		//GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar first = new GregorianCalendar(2017, 6, 5);
		GregorianCalendar last = new GregorianCalendar(2017, 6, 6);

		try	{
			timetable.getApptRange(ApptsList, first, last);
		} catch(NullPointerException e)	{

		}
	 }

	 @Test
	  public void test05()  throws Throwable  {
		  TimeTable timetable = new TimeTable();

		  //Create a linked list of appts to be used
	 		Appt appt_1 = new Appt(1,
	 		         10 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_1",
	 		         "");


		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);


		//create first and last days
		//GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar first = new GregorianCalendar(2017, 7, 5);
		GregorianCalendar last = new GregorianCalendar(2017, 7, 6);

		try	{
			timetable.getApptRange(ApptsList, first, last);
		} catch(NullPointerException e)	{

		}
	 }

	 @Test
	  public void test06()  throws Throwable  {
		  TimeTable timetable = new TimeTable();

		  //Create a linked list of appts to be used
	 		Appt appt_1 = new Appt(1,
	 		         10 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_1",
	 		         "");


		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);


		//create first and last days
		//GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar first = new GregorianCalendar(2017, 6, 5);
		GregorianCalendar last = new GregorianCalendar(2017, 6, 6);

		try	{
			timetable.getApptRange(ApptsList, first, last);
		} catch(NullPointerException e)	{

		}
	 }


	 @Test
	  public void test07()  throws Throwable  {
		  TimeTable timetable = new TimeTable();

		  //Create a linked list of appts to be used
	 	  Appt appt_1 = new Appt(1,
	 		         10 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_1",
	 		         "");

	 	int [] arr = {1,2,3};
	 	appt_1.setRecurrence(arr, 1, 1, -1);


		Appt appt_2 = new Appt(1,
		         10 ,
		         7 ,
		         6 ,
		         2017 ,
		         "Appt_2",
		         "");

	int [] arr_2 = {1,2,3};
	appt_2.setRecurrence(arr_2, 3, 3, -1);



	LinkedList<Appt> ApptsList = new LinkedList<Appt>();
	ApptsList.add(appt_1);
	ApptsList.add(appt_2);
	assertTrue(appt_1.isRecurring());
	assertTrue(appt_2.isRecurring());

		//create first and last days
		//GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar first = new GregorianCalendar(2017, 6, 5);
		GregorianCalendar last = new GregorianCalendar(2017, 7, 6);

		try	{
			 LinkedList<CalDay> updatedList = timetable.getApptRange(ApptsList, first, last);
		} catch(NullPointerException e)	{

		}
	 }

	 @Test
	  public void test08()  throws Throwable  {
		  TimeTable timetable = new TimeTable();

		  //Create a linked list of appts to be used
		  Appt appt_1 = new Appt(1,
						10 ,
						5 ,
						6 ,
						2017 ,
						"Appt_1",
						"");

	   int [] arr = {1,2,3};
	   appt_1.setRecurrence(arr, 1, 1, -1);

	   LinkedList<Appt> ApptsList = new LinkedList<Appt>();
	   ApptsList.add(appt_1);
	   assertTrue(appt_1.isRecurring());

	   //create first and last days
	   //GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
	   GregorianCalendar first = new GregorianCalendar(2017, 6, 5);
	   GregorianCalendar last = new GregorianCalendar(2017, 6, 6);

		try	{
			 LinkedList<CalDay> updatedList = timetable.getApptRange(ApptsList, first, last);
		} catch(NullPointerException e)	{

		}
	 }

	 @Test
	 public void test09()  throws Throwable  {
		 TimeTable timetable = new TimeTable();

		//Create a linked list of appts to be used
	 		Appt appt_1 = new Appt(1,
	 		         10 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_1",
	 		         "");

	 		Appt appt_2 = new Appt(5,
	 		         15 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_2",
	 		         "");

	 		Appt appt_3 = new Appt(5,
	 		         20 ,
	 		         6 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_3",
	 		         "");


		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		ApptsList.add(appt_2);
		ApptsList.add(appt_3);

		assertEquals(3, ApptsList.size());

		ApptsList = timetable.deleteAppt(ApptsList , appt_2);

		assertEquals(2, ApptsList.size());

	 }

	 @Test
	 public void test10()  throws Throwable  {
		 TimeTable timetable = new TimeTable();

		//Create a linked list of appts to be used
	 		Appt appt_1 = new Appt(1,
	 		         10 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_1",
	 		         "");

	 		Appt appt_2 = new Appt(5,
	 		         15 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_2",
	 		         "");

	 		Appt appt_3 = new Appt(5,
	 		         20 ,
	 		         6 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_3",
	 		         "");


		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		ApptsList.add(appt_2);
		ApptsList.add(appt_3);

		assertEquals(3, ApptsList.size());


		LinkedList<Appt> Res = null;
		assertNull(timetable.deleteAppt(ApptsList , appt_3));
	 }

	 @Test
	 public void test11()  throws Throwable  {
		 TimeTable timetable = new TimeTable();

		//Create a linked list of appts to be used
	 		Appt appt_1 = new Appt(1,
	 		         10 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_1",
	 		         "");

	 		Appt appt_2 = new Appt(5,
	 		         15 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_2",
	 		         "");

	 		Appt appt_3 = new Appt(5,
	 		         20 ,
	 		         6 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_3",
	 		         "");


		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		ApptsList.add(appt_2);
		//ApptsList.add(appt_3);

		assertEquals(2, ApptsList.size());

		LinkedList<Appt> Res = null;
		assertNull(timetable.deleteAppt(ApptsList , appt_3));
	 }

	 @Test
	 public void test12()  throws Throwable  {
		 TimeTable timetable = new TimeTable();

		//Create a linked list of appts to be used
	 		Appt appt_1 = new Appt(1,
	 		         10 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_1",
	 		         "");

	 		Appt appt_2 = new Appt(5,
	 		         15 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_2",
	 		         "");

	 		Appt appt_3 = new Appt(5,
	 		         20 ,
	 		         6 ,
	 		         0 ,
	 		         2017 ,
	 		         "Appt_3",
	 		         "");


		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		ApptsList.add(appt_2);
		//ApptsList.add(appt_3);

		assertEquals(2, ApptsList.size());
		assertNull(timetable.deleteAppt(ApptsList , appt_3));

	 }

	 @Test
	 public void test13()  throws Throwable  {
		 TimeTable timetable = new TimeTable();

		//Create a linked list of appts to be used
	 		Appt appt_1 = new Appt(1,
	 		         10 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_1",
	 		         "");

	 		Appt appt_2 = new Appt(5,
	 		         15 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_2",
	 		         "");

	 		Appt appt_3 = new Appt(5,
	 		         20 ,
	 		         6 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_3",
	 		         "");


		LinkedList<Appt> ApptsList = null;
		//ApptsList.add(appt_1);
		//ApptsList.add(appt_2);
		//ApptsList.add(appt_3);

		//assertEquals(3, ApptsList.size());

		ApptsList = timetable.deleteAppt(ApptsList , appt_2);

		//assertEquals(2, ApptsList.size());

	 }

	 @Test
	 public void test14()  throws Throwable  {
		 TimeTable timetable = new TimeTable();

		//Create a linked list of appts to be used
	 		Appt appt_1 = new Appt(1,
	 		         10 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_1",
	 		         "");

	 		Appt appt_2 = new Appt(5,
	 		         15 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_2",
	 		         "");

	 		Appt appt_3 = new Appt(5,
	 		         20 ,
	 		         6 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_3",
	 		         "");

	 		Appt appt_4 = null;


		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		ApptsList.add(appt_2);
		ApptsList.add(appt_3);

		assertEquals(3, ApptsList.size());

		assertNull(timetable.deleteAppt(ApptsList , appt_4));
	 }


	 @Test
	 public void test15()  throws Throwable  {
		 TimeTable timetable = new TimeTable();

		//Create a linked list of appts to be used
	 		Appt appt_1 = new Appt(1,
	 		         10 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_1",
	 		         "");

	 		Appt appt_2 = new Appt(5,
	 		         15 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_2",
	 		         "");

	 		Appt appt_3 = new Appt(5,
	 		         20 ,
	 		         6 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_3",
	 		         "");

	 		Appt appt_4 = null;


		LinkedList<Appt> ApptsList = null;

		assertNull(timetable.deleteAppt(ApptsList , appt_4));
	 }


	 @Test
	 public void test16()  throws Throwable  {
		 TimeTable timetable = new TimeTable();

		//Create a linked list of appts to be used
	 		Appt appt_1 = new Appt(1,
	 		         10 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_1",
	 		         "");

	 		Appt appt_2 = new Appt(5,
	 		         15 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_2",
	 		         "");

	 		Appt appt_3 = new Appt(5,
	 		         20 ,
	 		         6 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_3",
	 		         "");


		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		ApptsList.add(appt_2);
		ApptsList.add(appt_3);

		assertEquals(3, ApptsList.size());

		ApptsList = timetable.deleteAppt(ApptsList , appt_1);

		try	{
				assertEquals(2, ApptsList.size());
		}
		catch(NullPointerException e)	{
			fail();
		}

	 }

	 @Test
	 public void test17()  throws Throwable  {
		 TimeTable timetable = new TimeTable();

		//Create a linked list of appts to be used
	 		Appt appt_1 = new Appt(1,
	 		         10 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_1",
	 		         "");

	 		Appt appt_2 = new Appt(5,
	 		         15 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_2",
	 		         "");

	 		Appt appt_3 = new Appt(5,
	 		         20 ,
	 		         6 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_3",
	 		         "");


		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		ApptsList.add(appt_2);
		ApptsList.add(appt_3);

		LinkedList<Appt> ApptsList_updated = new LinkedList<Appt>();

		int [] pv = {1,0,2}; //first will be second, second is first, third is last
		ApptsList_updated = timetable.permute(ApptsList, pv);

		Appt TempAppt = ApptsList_updated.get(0);
		assertTrue(TempAppt.equals(appt_2));
		TempAppt = ApptsList_updated.get(1);
		assertTrue(TempAppt.equals(appt_1));
		TempAppt = ApptsList_updated.get(2);
		assertTrue(TempAppt.equals(appt_3));

	 }

	 @Test
	  public void test18()  throws Throwable  {
		  TimeTable timetable = new TimeTable();

		  //Create a linked list of appts to be used
	 	  Appt appt_1 = new Appt(1,
	 		         10 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_1",
	 		         "");

	 	int [] arr = {1,2,3};
	 	appt_1.setRecurrence(arr, 1, 1, -1);


		Appt appt_2 = new Appt(1,
		         10 ,
		         7 ,
		         8 ,
		         2021 ,
		         "Appt_2",
		         "");

	int [] arr_2 = {1,2,3};
	appt_2.setRecurrence(arr_2, 3, 3, -1);



	LinkedList<Appt> ApptsList = new LinkedList<Appt>();
	ApptsList.add(appt_1);
	ApptsList.add(appt_2);
	assertTrue(appt_1.isRecurring());
	assertTrue(appt_2.isRecurring());

		//create first and last days
		//GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar first = new GregorianCalendar(2017, 6, 5);
		GregorianCalendar last = new GregorianCalendar(2020, 7, 6);

		try	{
 	  		LinkedList<CalDay> updatedList = timetable.getApptRange(ApptsList, first, last);
 	  } catch(NullPointerException e)	{

 	  }
	 }

	 @Test
	  public void test19()  throws Throwable  {
		  TimeTable timetable = new TimeTable();

		  //Create a linked list of appts to be used
	 	  Appt appt_1 = new Appt(1,
	 		         10 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_1",
	 		         "");

	 	int [] arr = {1,2,3};
	 	appt_1.setRecurrence(arr, 1, 1, 0);

	LinkedList<Appt> ApptsList = new LinkedList<Appt>();
	ApptsList.add(appt_1);


		//create first and last days
		//GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar first = new GregorianCalendar(2017, 6, 5);
		GregorianCalendar last = new GregorianCalendar(2017, 6, 6);

		try	{
 	  		LinkedList<CalDay> updatedList = timetable.getApptRange(ApptsList, first, last);
 	  } catch(NullPointerException e)	{

 	  }
	 }

	 @Test
	  public void test20()  throws Throwable  {
		  TimeTable timetable = new TimeTable();

		  //Create a linked list of appts to be used
	 	  Appt appt_1 = new Appt(1,
	 		         10 ,
	 		         5 ,
	 		         6 ,
	 		         2017 ,
	 		         "Appt_1",
	 		         "");

	 	int [] arr = {1,2,3};
	 	appt_1.setRecurrence(arr, 1, 1, 10);

	LinkedList<Appt> ApptsList = new LinkedList<Appt>();
	ApptsList.add(appt_1);
	assertTrue(appt_1.isRecurring());

		//create first and last days
		//GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar first = new GregorianCalendar(2017, 6, 5);
		GregorianCalendar last = new GregorianCalendar(2017, 6, 6);

		try	{
 	  		LinkedList<CalDay> updatedList = timetable.getApptRange(ApptsList, first, last);
 	  } catch(NullPointerException e)	{

 	  }
	 }

	 @Test
	  public void test21()  throws Throwable  {
		  TimeTable timetable = new TimeTable();

		  //Create a linked list of appts to be used
			Appt appt_1 = new Appt(1,
						10 ,
						5 ,
						0 ,
						2017 ,
						"Appt_1",
						"");

			Appt appt_2 = new Appt(5,
						15 ,
						5 ,
						0 ,
						2017 ,
						"Appt_2",
						"");

			Appt appt_3 = new Appt(5,
						20 ,
						6 ,
						0 ,
						2017 ,
						"Appt_3",
						"");


	   LinkedList<Appt> ApptsList = new LinkedList<Appt>();
	   ApptsList.add(appt_1);
	   ApptsList.add(appt_2);
	   ApptsList.add(appt_3);

		assertFalse(appt_1.getValid());
		assertFalse(appt_2.getValid());
		assertFalse(appt_3.getValid());
	   //create first and last days
	   //GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
	   GregorianCalendar first = new GregorianCalendar(2017, 6, 4);
	   GregorianCalendar last = new GregorianCalendar(2017, 6, 7);

	   try	{
			timetable.getApptRange(ApptsList, first, last);
	   } catch(DateOutOfRangeException e)	{

	   }


   }

	@Test
	 public void test22()  throws Throwable  {
		 TimeTable timetable = new TimeTable();

		 //Create a linked list of appts to be used
		 Appt appt_1 = new Appt(1,
					  10 ,
					  5 ,
					  6 ,
					  2017 ,
					  "Appt_1",
					  "");

	  int [] arr = {};
	  appt_1.setRecurrence(arr, 1, 1, 10);

	LinkedList<Appt> ApptsList = new LinkedList<Appt>();
	ApptsList.add(appt_1);
	assertTrue(appt_1.isRecurring());

	  //create first and last days
	  //GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
	  GregorianCalendar first = new GregorianCalendar(2017, 6, 5);
	  GregorianCalendar last = new GregorianCalendar(2017, 6, 6);

	  try	{
	  		LinkedList<CalDay> updatedList = timetable.getApptRange(ApptsList, first, last);
	  } catch(NullPointerException e)	{

	  }
	}

	@Test
	 public void test23()  throws Throwable  {
		 TimeTable timetable = new TimeTable();

		 //Create a linked list of appts to be used
		 Appt appt_1 = new Appt(1,
					  10 ,
					  5 ,
					  6 ,
					  2017 ,
					  "Appt_1",
					  "");

	  int [] arr = {1,2};
	  appt_1.setRecurrence(arr, 2, 2, 10);

	LinkedList<Appt> ApptsList = new LinkedList<Appt>();
	ApptsList.add(appt_1);
	assertTrue(appt_1.isRecurring());

	  //create first and last days
	  //GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
	  GregorianCalendar first = new GregorianCalendar(2017, 6, 5);
	  GregorianCalendar last = new GregorianCalendar(2017, 6, 6);

	  try	{
	  		LinkedList<CalDay> updatedList = timetable.getApptRange(ApptsList, first, last);
	  } catch(NullPointerException e)	{

	  }
	}

	@Test
	 public void test24()  throws Throwable  {
		 TimeTable timetable = new TimeTable();

		 //Create a linked list of appts to be used
		 Appt appt_1 = new Appt(1,
					  10 ,
					  5 ,
					  6 ,
					  2017 ,
					  "Appt_1",
					  "");

	  int [] arr = {1,2};
	  appt_1.setRecurrence(arr, 3, 3, 10);

	LinkedList<Appt> ApptsList = new LinkedList<Appt>();
	ApptsList.add(appt_1);
	assertTrue(appt_1.isRecurring());

	  //create first and last days
	  //GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
	  GregorianCalendar first = new GregorianCalendar(2017, 6, 5);
	  GregorianCalendar last = new GregorianCalendar(2017, 6, 6);

	  try	{
	  		LinkedList<CalDay> updatedList = timetable.getApptRange(ApptsList, first, last);
	  } catch(NullPointerException e)	{

	  }
	}

	@Test
	 public void test25()  throws Throwable  {
		 TimeTable timetable = new TimeTable();

		 //Create a linked list of appts to be used
		 Appt appt_1 = new Appt(1,
					  10 ,
					  5 ,
					  6 ,
					  2017 ,
					  "Appt_1",
					  "");

	  int [] arr = {1,2,9};
	  appt_1.setRecurrence(arr, 2, 2, 10);

	LinkedList<Appt> ApptsList = new LinkedList<Appt>();
	ApptsList.add(appt_1);
	assertTrue(appt_1.isRecurring());

	  //create first and last days
	  //GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
	  GregorianCalendar first = new GregorianCalendar(2017, 6, 5);
	  GregorianCalendar last = new GregorianCalendar(2017, 6, 6);

	  try	{
	  		LinkedList<CalDay> updatedList = timetable.getApptRange(ApptsList, first, last);
	  } catch(NullPointerException e)	{

	  }
	}

	@Test
	 public void test26()  throws Throwable  {
		 TimeTable timetable = new TimeTable();

		 //Create a linked list of appts to be used
		 Appt appt_1 = new Appt(1,
					  10 ,
					  5 ,
					  6 ,
					  2017 ,
					  "Appt_1",
					  "");

	  int [] arr = {1,2};
	  appt_1.setRecurrence(arr, 7, 7, 10);

	LinkedList<Appt> ApptsList = new LinkedList<Appt>();
	ApptsList.add(appt_1);
	assertTrue(appt_1.isRecurring());

	  //create first and last days
	  //GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
	  GregorianCalendar first = new GregorianCalendar(2017, 6, 5);
	  GregorianCalendar last = new GregorianCalendar(2017, 6, 6);

	  try	{
	  		LinkedList<CalDay> updatedList = timetable.getApptRange(ApptsList, first, last);
	  } catch(NullPointerException e)	{

	  }
	}
	@Test
	 public void test27()  throws Throwable  {
		 TimeTable timetable = new TimeTable();

		 //Create a linked list of appts to be used
		 Appt appt_1 = new Appt(1,
					  10 ,
					  5 ,
					  6 ,
					  2018 ,
					  "Appt_1",
					  "");

	  int [] arr = {1,2};
	  appt_1.setRecurrence(arr, 3, 3, 10);

	LinkedList<Appt> ApptsList = new LinkedList<Appt>();
	ApptsList.add(appt_1);
	assertTrue(appt_1.isRecurring());

	  //create first and last days
	  //GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
	  GregorianCalendar first = new GregorianCalendar(2017, 6, 5);
	  GregorianCalendar last = new GregorianCalendar(2017, 6, 6);

	  try	{
	  		LinkedList<CalDay> updatedList = timetable.getApptRange(ApptsList, first, last);
			assertEquals(1, updatedList.size());
	  } catch(NullPointerException e)	{

	  }
	}
//add more unit tests as you needed
}
