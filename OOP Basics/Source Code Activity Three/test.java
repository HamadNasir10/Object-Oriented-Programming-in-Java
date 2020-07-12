//Name=Hamad Nasir
//Roll Number=120312
//Section=BSCS-6C
//lAB-3 Activity 3
/*Output:
   count is 101
   times is 0
*/




public class test
{
public static void main(String[] args)
{
Count myCount = new Count();
int times = 0;
for (int i = 0; i < 100; i++)
increment(myCount, times);
System.out.println("count is " + myCount.count);
System.out.println("times is " + times);
}
public static void increment(Count c, int times)
{
c.count++;
times++;
}
}