
//strings are immutable in java
//We use string builder class when we have to manupilate string and perform the insertion,deletion and other different operations.

import java.util.*;

public class strings
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        // when we use only next() while taking input of string
        //input:captain america
        //output:captain
        // If we want to take input of whole line then we have to write nextLine()i inplace of next()
        //String str=sc.next(); 
        String str=sc.nextLine();
        
        //concatenation
        // '+' this will add those strings in which this operator is placed.
        String fullstring=str+" "+"always rocks";
        System.out.println(fullstring);

        //displaying characters of a string
        //for this we use charAt() functions
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }

        //substring of a string is exctracted with the help of substring() function
        //in this function's parameters we have to pass the strating index as well as ending index of substring
        //if we pass substring(4,9) then substring from adress 4 to 8 will extracted 9th index character will not be included
        //if we pass substring(4) then substring from adress 4 and upto the last index will be extracted
        System.out.println(str.substring(3,7));
        System.out.println(str.substring(3));


        //comparison of two srings
        //we use compareTo() functions to compare two strings

        System.out.println("Enter second string");
        String str2=sc.nextLine();
        System.out.println(str.compareTo(str2));

        /*
        Other functions of string class
        ->toUpperCase()
        convert lowercase string into uppercase
        ->toLowerCase()
        convert a uppercase string into lowercase string
        ->trim()
        removes white space from both the ends of string
        ->compareToIgnoreCase()
        compare two string ignoring their case 
        ->equals()
        return boolean value by comparing two strings
        ->egualsIgnoreCase()
        return boolean value by comparing two strings while comparing it ignores their case
        ->indexOf(String s)
        returns adress of first occurence of given string or character in the parameters
        ->lastindexOf(Strings)
        retirn adress of last occurence of given string or character in the parameters        
        ->concat()
        this functions add the given string at the end of original string
        ->replace(char old character,char new character)
        this functions replace the old character with new character through out the whole string
        
        */


    }
}