package com.exmaple.concatestrings;


/*
        compare string and concatenate
    Given three strings, 
    Concatenate the three strings in alphabetically increasing order to create one string.

    for exmaple given firstString=one, secondString=two , thridString=three,
    concatenate in ascending alphabetical order the result=onethreetwo.

    Funcation Description
    Analyze the output given in the sample for an input. Write a program to concatenating string.
    
    Contrains:
    1 <= the length of the first,second, third string <105
    Each of the strings consists of lowercase English charecters, ascii(a-z).

    Input Format:
        List itemThe first line contians the first string.
        The second line contains the second string.
        The thrid line contains the thrid stirng.
    Sample case 1
        hack
        hacker
        hackerrank
    Sample out put
        hackhackerhackerrank
*/
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ByIncreasingOrder {
    public static void main(String[] args) {
        Scanner commandLineInputScanner = new Scanner(System.in);
        try (commandLineInputScanner) {
            String firstString = commandLineInputScanner.nextLine();
            String secondString = commandLineInputScanner.nextLine();
            String thirdString = commandLineInputScanner.nextLine();
            String[] items = { firstString, secondString, thirdString };
            System.out.println(items);
            if ((1 <= firstString.length() && firstString.length() <= 105)
                    && (1 <= secondString.length() && firstString.length() <= 105)
                    && (1 <= thirdString.length() && firstString.length() <= 105)) {

                Arrays.sort(items);
                for (String item : items) {
                        System.out.println(item);
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }

    }
}

