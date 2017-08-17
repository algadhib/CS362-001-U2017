/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package finalprojectB;

import junit.framework.TestCase;
import java.util.Random;




/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase {

   private boolean printStatus = false;
   private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

   public UrlValidatorTest(String testName) {
      super(testName);
   }



   public void testManualTest()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

      System.out.printf( "http://www.amazon.com" + " ");
	   System.out.println(urlVal.isValid("http://www.amazon.com"));

      System.out.printf( "http://www.amazon.com:65535" + " ");
      System.out.println(urlVal.isValid("http://www.amazon.com:65535")); //second bug

      System.out.printf( "http://www.amazon.com:65" + " ");
      System.out.println(urlVal.isValid("http://www.amazon.com:65"));

      System.out.printf( "http://www.amazon.com:655" + " ");
      System.out.println(urlVal.isValid("http://www.amazon.com:655"));

      System.out.printf( "http://www.amazon.com:6598493405" + " ");
      System.out.println(urlVal.isValid("http://www.amazon.com:6598493405"));

      System.out.printf( "http://www.amazon.com/test1?action=viewtrue" + " ");
      System.out.println(urlVal.isValid("http://www.amazon.com/test1?action=viewtrue"));
      //assertTrue(urlVal.isValid("http://www.amazon.com/test1?action=viewtrue"));

      System.out.printf( "http://www.amazon.com/test1?action=;\\nviewtrue" + " "); //bug
      System.out.println(urlVal.isValid("http://www.amazon.com/test1?action=;\nviewtrue"));

      System.out.printf( "http://www.amazon.com/test1?action=view\0true" + " ");
      System.out.println(urlVal.isValid("http://www.amazon.com/test1?action=view\0true"));

      System.out.printf( "http://www.amazon.com/test1?ac$.!#*&6?$tion=هلا" + " ");
      System.out.println(urlVal.isValid("http://www.amazon.com/test1?ac$.!#*&6?$tion=هلا"));

      System.out.printf( "http://www.amazon.com/test1" + " ");
	   System.out.println(urlVal.isValid("http://www.amazon.com/test1"));

      System.out.printf( "http://www.amazon.com/../" + " ");
	   System.out.println(urlVal.isValid("http://www.amazon.com/../"));

      System.out.printf( "http://www.amazon.com/$23/file" + " ");
	   System.out.println(urlVal.isValid("http://www.amazon.com/$23/file"));

      System.out.printf( "www.google.com.http://:50" + " ");
	   System.out.println(urlVal.isValid("www.google.com.http://:50"));

      System.out.printf( "null" + " ");
	   System.out.println(urlVal.isValid(null));

      System.out.printf( ":50//www.amazon.com" + " ");
	   System.out.println(urlVal.isValid(":50//www.amazon.com"));

      System.out.printf( "http://www.amazon.com/test#fragment" + " ");
	   System.out.println(urlVal.isValid("http://www.amazon.com/test#fragment"));

      System.out.printf( "http://ww!w.amazo#$n.com/test#fragmAent" + " ");
      System.out.println(urlVal.isValid("http://ww!w.amazo#$n.com/test#fragmAent"));
      //assertFalse(urlVal.isValid("http://www.amazon.com/test1?action=view true"));

      System.out.printf("www.amazon.com  \t");
      System.out.println(urlVal.isValid("www.amazon.com"));

      //UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
     System.out.println(urlVal.isValid("http://www.amazon.com"));

  assertTrue(urlVal.isValid("http://www.amazon.com"));

     UrlValidator urlVal2 = new UrlValidator();
     String null_string = null;
     urlVal2.isValid(null);
     assertFalse(urlVal2.isValid(null_string));



     String[] schemes = {"http", "https", "http://"};
     UrlValidator urlVal3 = new UrlValidator(schemes);
      assertFalse(urlVal3.isValid("http://"));
      //assertTrue(urlVal3.isValid("http"));
      assertFalse(urlVal3.isValid("hjhj"));



      //long option = UrlValidator.ALLOW_2_SLASHES + UrlValidator.ALLOW_ALL_SCHEMES + UrlValidator.NO_FRAGMENTS;


      //UrlValidator urlVal4 = UrlValidator(UrlValidator.ALLOW_ALL_SCHEMES);
      UrlValidator urlVal4 = new UrlValidator(schemes , null, UrlValidator.ALLOW_ALL_SCHEMES);

      //assertFalse(urlVal4.isValid("h3t://255.255.255.255:80/test1/$23"));
      assertFalse(urlVal4.isValid("3ht://"));
      assertFalse(urlVal4.isValid("http:/"));
      //assertFalse(urlVal4.isValid("http://256.256.256.256")); //This should be false
      assertFalse(urlVal4.isValid("http://www.google.com:65a"));
      assertFalse(urlVal4.isValid("http://www.google.comهلا"));
      assertFalse(urlVal4.isValid("http://www.google.com:65636"));
      assertFalse(urlVal4.isValid("http://test1/www.google.com"));
      assertFalse(urlVal4.isValid("http://example.com/over/there?name=ferret"));  // Idk why
      assertFalse(urlVal4.isValid("google.com"));
      assertFalse(urlVal4.isValid("file://:80"));
      //assertFalse(urlVal4.isValid("file://www.google.com:80"));
      assertFalse(urlVal4.isValid("http://:80"));

      assertFalse(urlVal4.isValid("http://server.com/server/server1/status "));




      UrlValidator urlVal5 = new UrlValidator(schemes, UrlValidator.NO_FRAGMENTS);
        assertTrue(urlVal5.isValid("http://www.google.com/"));
        assertFalse(urlVal5.isValid("http://www.google.com/#"));




   }


   public void testYourFirstPartition()
{
  UrlValidator urlVal = new UrlValidator(null , null, UrlValidator.ALLOW_ALL_SCHEMES);
  assertTrue(urlVal.isValid("http://www.google.com"));
  assertTrue(urlVal.isValid("http://www.google.com:0"));
  assertTrue(urlVal.isValid("http://www.google.com:80"));
  //assertTrue(urlVal.isValid("http://www.google.com:65535")); //bug in this line
  assertTrue(urlVal.isValid("http://www.google.com:0"));
  assertFalse(urlVal.isValid("http://www.google.com:-1"));
  assertFalse(urlVal.isValid("http://www.google.com:65a"));




}

public void testYourSecondPartition(){
  UrlValidator urlVal = new UrlValidator(null , null, UrlValidator.ALLOW_ALL_SCHEMES);
  assertTrue(urlVal.isValid("http://www.google.com"));
  assertTrue(urlVal.isValid("http://go.com"));
  assertTrue(urlVal.isValid("http://255.255.255.255"));

  assertTrue(urlVal.isValid("http://go.au"));
  //assertFalse(urlVal.isValid("http://256.256.256.256"));
  assertFalse(urlVal.isValid("http://1.2.3.4.5"));
}




   public void testIsValid()
   {
      UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

         //this loops will do partition testing and it will print the buggy inputs
         // test all schemes
         System.out.println("\n*** Test all schemes ***");
         for(int i=0; i<testUrlScheme.length; i++) {
            //System.out.printf(testUrlScheme[i].item + "www.amazon.com  \t");
            //System.out.println(urlVal.isValid(testUrlScheme[i].item + "www.amazon.com"));
            if(testUrlScheme[i].valid != urlVal.isValid(testUrlScheme[i].item + "www.amazon.com"))  {
               System.out.println("There is a bug: " + testUrlScheme[i].item + "www.amazon.com");
            }
         }

         System.out.println("\n*** Test all Authority ***");
         for(int i=0; i<testUrlAuthority.length; i++) {
            //System.out.printf("http://" + testUrlAuthority[i].item + "\t");
            //System.out.println(urlVal.isValid("http://" + testUrlAuthority[i].item));
            if(testUrlAuthority[i].valid != urlVal.isValid("http://" + testUrlAuthority[i].item))  {
               System.out.println("There is a bug: " + "http://" + testUrlAuthority[i].item);
            }
         }

         System.out.println("\n*** Test all Ports ***");
         for(int i=0; i<testUrlPort.length; i++) {
            //System.out.printf("http://www.amazon.com" + testUrlPort[i].item + "\t");
            //System.out.println(urlVal.isValid("http://www.amazon.com" + testUrlPort[i].item));
            if(testUrlPort[i].valid != urlVal.isValid("http://www.amazon.com" + testUrlPort[i].item)) {
               System.out.println("There is a bug: " +"http://www.amazon.com" + testUrlPort[i].item);
            }
         }

         System.out.println("\n*** Test all Paths ***");
         for(int i=0; i<testPath.length; i++) {
            //System.out.printf("http://www.amazon.com" + testPath[i].item + "\t");
            //System.out.println(urlVal.isValid("http://www.amazon.com" + testPath[i].item));
            if(testPath[i].valid != urlVal.isValid("http://www.amazon.com" + testPath[i].item)) {
               System.out.println("There is a bug: " + "http://www.amazon.com" + testPath[i].item);
            }
         }

         System.out.println("\n*** Test all Query ***");
         for(int i=0; i<testUrlQuery.length; i++) {
            //System.out.printf("http://www.amazon.com" + testUrlQuery[i].item + "\t");
            //System.out.println(urlVal.isValid("http://www.amazon.com" + testUrlQuery[i].item));
            if(testUrlQuery[i].valid != urlVal.isValid("http://www.amazon.com" + testUrlQuery[i].item)) {
               System.out.println("There is a bug: " + "http://www.amazon.com" + testUrlQuery[i].item);
            }
         }


         //this test will do all the compinations and it will print the buggy ones

         // System.out.println("\n*** Test all ***");
         // for(int i=0; i<testUrlScheme.length; i++) {
         //    for(int j=0; j<testUrlAuthority.length; j++) {
         //       for(int k=0; k<testUrlPort.length; k++) {
         //          for(int l=0; l<testPath.length; l++) {
         //             for(int m=0; m<testUrlQuery.length; m++)  {
         //                //System.out.printf(testUrlScheme[i].item + testUrlAuthority[j].item + testUrlPort[k].item + testPath[l].item + testUrlQuery[m].item + "\t");
         //                //System.out.println(urlVal.isValid(testUrlScheme[i].item + testUrlAuthority[j].item + testUrlPort[k].item + testPath[l].item + testUrlQuery[m].item));
         //                if(testUrlScheme[i].valid && testUrlAuthority[j].valid && testUrlPort[k].valid && testPath[l].valid && testUrlQuery[m].valid
         //                   && !urlVal.isValid(testUrlScheme[i].item + testUrlAuthority[j].item + testUrlPort[k].item + testPath[l].item + testUrlQuery[m].item))
         //                      System.out.println("there is a bug here !!!: " + testUrlScheme[i].item + testUrlAuthority[j].item + testUrlPort[k].item + testPath[l].item + testUrlQuery[m].item);
         //             }
         //          }
         //       }
         //    }
         // }
   }

   public void testAnyOtherUnitTest()
   {

   }
   /**
    * Create set of tests by taking the testUrlXXX arrays and
    * running through all possible permutations of their combinations.
    *
    * @param testObjects Used to create a url.
    */

    //-------------------- Test data for creating a composite URL
       /**
        * The data given below approximates the 4 parts of a URL
        * <scheme>://<authority><path>?<query> except that the port number
        * is broken out of authority to increase the number of permutations.
        * A complete URL is composed of a scheme+authority+port+path+query,
        * all of which must be individually valid for the entire URL to be considered
        * valid.
        */
       ResultPair[] testUrlScheme = {new ResultPair("http://", true),
                                   new ResultPair("ftp://", true),
                                   new ResultPair("h3t://", true),
                                   new ResultPair("3ht://", false),
                                   new ResultPair("http:/", false),
                                   new ResultPair("http:", false),
                                   new ResultPair("http/", false),
                                   new ResultPair("://", false),
                                   new ResultPair("file", true),
                                   new ResultPair("", true)};

       ResultPair[] testUrlAuthority = {new ResultPair("www.google.com", true),
                                      new ResultPair("go.com", true),
                                      new ResultPair("go.au", true),
                                      new ResultPair("0.0.0.0", true),
                                      new ResultPair("255.255.255.255", true),
                                      new ResultPair("256.256.256.256", false),
                                      new ResultPair("255.com", true),
                                      new ResultPair("1.2.3.4.5", false),
                                      new ResultPair("1.2.3.4.", false),
                                      new ResultPair("1.2.3", false),
                                      new ResultPair(".1.2.3.4", false),
                                      new ResultPair("go.a", false),
                                      new ResultPair("go.a1a", false),
                                      new ResultPair("go.cc", true),
                                      new ResultPair("go.1aa", false),
                                      new ResultPair("aaa.", false),
                                      new ResultPair(".aaa", false),
                                      new ResultPair("aaa", false),
                                      new ResultPair("", false)
       };
       ResultPair[] testUrlPort = {new ResultPair(":80", true),
                                 new ResultPair(":65535", true),
                                 new ResultPair(":655", true),
                                 new ResultPair(":0", true),
                                 new ResultPair("", true),
                                 new ResultPair(":-1", false),
                                 new ResultPair(":65636", true),
                                 new ResultPair(":6563", true),
                                 new ResultPair(":656", true),
                                 new ResultPair(":65a", false)
       };
       ResultPair[] testPath = {new ResultPair("/test1", true),
                              new ResultPair("/t123", true),
                              new ResultPair("/$23", true),
                              new ResultPair("/..", false),
                              new ResultPair("/../", false),
                              new ResultPair("/test1/", true),
                              new ResultPair("", true),
                              new ResultPair("/test1/file", true),
                              new ResultPair("/..//file", false),
                              new ResultPair("/test1//file", false)
       };
       //Test allow2slash, noFragment
       ResultPair[] testUrlPathOptions = {new ResultPair("/test1", true),
                                        new ResultPair("/t123", true),
                                        new ResultPair("/$23", true),
                                        new ResultPair("/..", false),
                                        new ResultPair("/../", false),
                                        new ResultPair("/test1/", true),
                                        new ResultPair("/#", false),
                                        new ResultPair("", true),
                                        new ResultPair("/test1/file", true),
                                        new ResultPair("/t123/file", true),
                                        new ResultPair("/$23/file", true),
                                        new ResultPair("/../file", false),
                                        new ResultPair("/..//file", false),
                                        new ResultPair("/test1//file", true),
                                        new ResultPair("/#/file", false)
       };

       ResultPair[] testUrlQuery = {new ResultPair("?action=view", true),
                                  new ResultPair("?action=edit&mode=up", true),
                                  new ResultPair("?action=edit&mo\nde=up", false),
                                  new ResultPair("", true)
       };

       Object[] testUrlParts = {testUrlScheme, testUrlAuthority, testUrlPort, testPath, testUrlQuery};
       Object[] testUrlPartsOptions = {testUrlScheme, testUrlAuthority, testUrlPort, testUrlPathOptions, testUrlQuery};
       int[] testPartsIndex = {0, 0, 0, 0, 0};

       //---------------- Test data for individual url parts ----------------
       ResultPair[] testScheme = {new ResultPair("http", true),
                                new ResultPair("ftp", false),
                                new ResultPair("httpd", false),
                                new ResultPair("telnet", false)};
}
