//Name=Hamad Nasir
//Roll Number=120312
//Section=BSCS-6C
//Lab-3 Task-3

package data;

/**
 *
 * @author Hamad nasir
 */
public class Date {
private int year;
private int month;
private int day;
public Date(int y , int m , int d){
if(y>=0)
year = y;
else year = 2000;
if(m>0 && m<=12)
month = m;
else month = 1;
if(d>0 && d<=30)
day = d;
else day = 1;
}
public int getYear(){
return year;
}
public void setYear(int y){
if(y>=0)
year = y;
else year = 2000;
}
public int getMonth(){
return month;
}
public void setMonth(int m){
if(m>0 && m<=12)
month = m;
else month = 1;
}
public int getDay(){
return day;
}
public void setDay(int d){
if(d>0 && d<=30)
day = d;
else day = 1;
}
public void display(){
System.out.println(day+"/"+month+"/"+year);
  }
}