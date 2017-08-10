package calendar;
import org.junit.Test;
import java.util.Calendar;
import static org.junit.Assert.*;
import java.util.Random;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {



	 }

	 @Test
	  public void radnomtestDeleteAppt()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


		 System.out.println("Start testing...");


		 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			 long randomseed =System.currentTimeMillis(); //10
			 try{

	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);

				//generate a random number of appointments
				int apptNum = ValuesGenerator.getRandomIntBetween(random, 0, 100);

				//create timetable object
				TimeTable timetable = new TimeTable();

				//create a LinkedList of appts
				LinkedList<Appt> ApptsList = new LinkedList<Appt>();
				for(int i=0; i < apptNum; i++)	{
					//create random appt
					int startHour=ValuesGenerator.RandInt(random);
	  				int startMinute=ValuesGenerator.RandInt(random);
	  				int startDay=ValuesGenerator.RandInt(random);;
	  				int startMonth=ValuesGenerator.RandInt(random);;
	  				int startYear=ValuesGenerator.RandInt(random);
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

					//add the appt to the list
					ApptsList.add(appt);
				}

				//create a random number of appt to be deleted
				int deleteNum = ValuesGenerator.getRandomIntBetween(random, 0, apptNum+20);

				//loop to delete appts
				for(int i=0; i<deleteNum; i++)	{
					//probability to pass null LinkedList
					LinkedList<Appt> testingList;
					Appt testingAppt;
					if(ValuesGenerator.getBoolean(0.1f,random))	{
						testingList = null;
					}
					else	{
						testingList = ApptsList;
					}
					//probability to pass null appt
					if(ValuesGenerator.getBoolean(0.1f,random))	{
						testingAppt=null;
					}
					else	{
						int index = ValuesGenerator.getRandomIntBetween(random, 0, testingList.size()-1);
						if(index == 0)
							break;
						testingAppt=testingList.get(index);
					}

					//probability to create a non-exesting appt
					if(ValuesGenerator.getBoolean(0.3f,random))	{
						int startHour=ValuesGenerator.RandInt(random);
		  				int startMinute=ValuesGenerator.RandInt(random);
		  				int startDay=ValuesGenerator.RandInt(random);;
		  				int startMonth=ValuesGenerator.RandInt(random);;
		  				int startYear=ValuesGenerator.RandInt(random);
		  				String title="Birthday Party";
		  				String description="This is my birthday party.";
						testingAppt=new Appt(startHour,
		  				          	startMinute ,
		  				          	startDay ,
		  				          	startMonth ,
		  				          	startYear ,
		  				          	title,
		  				         	description);
					}

					testingList = timetable.deleteAppt(testingList, testingAppt);

					//if(testingList == null)
					//	break;

				}

				elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			   if((iteration%10000)==0 && iteration!=0 )
					System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);


		}catch(NullPointerException e){

		}
		}
		 System.out.println("Done testing...");
	 }

	 @Test
	  public void radnomtestGetApptRange()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


		 System.out.println("Start testing...");


		 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			 long randomseed =System.currentTimeMillis(); //10
			 try{

	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				//create timetable object
				TimeTable timetable = new TimeTable();

				//create a list
				LinkedList<Appt> ApptsList;

				//propelity to pass null list
				if(ValuesGenerator.getBoolean(0.01f,random))	{
					ApptsList = null;
				}

				else	{
					//generate a random number of appointments
					int apptNum = ValuesGenerator.getRandomIntBetween(random, 0, 100);

					//create a LinkedList of appts
					ApptsList = new LinkedList<Appt>();
					for(int i=0; i < apptNum; i++)	{
						//create random appt
						int startHour=ValuesGenerator.RandInt(random);
		  				int startMinute=ValuesGenerator.RandInt(random);
		  				int startDay=ValuesGenerator.RandInt(random);;
		  				int startMonth=ValuesGenerator.RandInt(random);;
		  				int startYear=ValuesGenerator.RandInt(random);
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

						//add the appt to the list
						ApptsList.add(appt);
					}
				}

				//create first and last days
				GregorianCalendar first;
				GregorianCalendar last;
				//last before first
				if(ValuesGenerator.getBoolean(0.1f,random))	{
					int firstDay = ValuesGenerator.getRandomIntBetween(random, 0, 100);
					int firstMonth = ValuesGenerator.getRandomIntBetween(random, 0, 100);
					int firstYear = ValuesGenerator.getRandomIntBetween(random, 0, 3000);
					int lastDay = ValuesGenerator.getRandomIntBetween(random, 0, firstDay);
					int lastMonth = ValuesGenerator.getRandomIntBetween(random, 0, firstMonth);
					int lastYear = ValuesGenerator.getRandomIntBetween(random, 0, firstYear);
					first = new GregorianCalendar(firstYear, firstDay, firstMonth);
					last = new GregorianCalendar(lastYear, lastDay, lastMonth);
				}
				else {
					int firstDay = ValuesGenerator.getRandomIntBetween(random, 0, 30);
					int firstMonth = ValuesGenerator.getRandomIntBetween(random, 0, 12);
					int firstYear = ValuesGenerator.getRandomIntBetween(random, 0, 3000);
					int lastDay = ValuesGenerator.getRandomIntBetween(random, firstDay, 30);
					int lastMonth = ValuesGenerator.getRandomIntBetween(random, firstMonth, 12);
					int lastYear = ValuesGenerator.getRandomIntBetween(random, firstYear, 3000);
					first = new GregorianCalendar(firstYear, firstDay, firstMonth);
					last = new GregorianCalendar(lastYear, lastDay, lastMonth);
					//first = new GregorianCalendar(1, 1, 1);
					//last = new GregorianCalendar(3000, 20, 10);
				}

				try	{
					timetable.getApptRange(ApptsList, first, last);
				}catch(DateOutOfRangeException e){}

				elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			   if((iteration%10000)==0 && iteration!=0 )
					System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);


		}catch(NullPointerException e){

		}
		}
		 System.out.println("Done testing...");
	 }



}
