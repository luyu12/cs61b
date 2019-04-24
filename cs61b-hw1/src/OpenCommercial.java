
/*
author: YU LU
data:01/19/2017
function:write a program that reads a string form the keyboard.you need to 
construct a URL for http://www.X.com/,replacing X with the String read in, and 
print the first five lines of the web page at that URL in REVERSE ORDER.
i.e,the fifth, fourth,third,second, and the first lines.
*/

import java.net.*;
import java.io.*;

public class OpenCommercial {
  public static void main(String[] args) throws Exception{
    String printLine;
    String inputLine;
    
    System.out.print("Please enter the name of a company (without spaces): ");
    BufferedReader keyboard=new BufferedReader(new InputStreamReader(System.in));
    inputLine=keyboard.readLine();
    printLine="http://www."+inputLine+".com/";
    URL pp=new URL(printLine);
    BufferedReader in =new BufferedReader(new InputStreamReader(pp.openStream()));
    
    String Line;
    String[] mylist=new String[5];//定义数组变量长度为5的数组
    for(int i=0;i<5;i++)
    {
        Line=in.readLine();
        mylist[i]=Line;
    }
    for(int j=4;j>=0;j--)
    {
        System.out.println(mylist[j]);
    }
    in.close();
  }
}
