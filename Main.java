import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Main{
  public static void main(String[] args)
  {
    
    ArrayList<Integer> al = new ArrayList();
  
    
  

    ArrayList<String> bo = new ArrayList();
    bo.add("Hey");
    bo.add("Wut");
    bo.add("Up");
    bo.add("Lebron");
    bo.add("James");

    System.out.println(bo);
    removeShorterStrings(bo);
    System.out.println(bo);
  }
  
  public static double findLargest(ArrayList<Double> a)
  {
    double largest = a.get(0);
    
    for(double d: a)
    {
      if(d> largest)
      {
        largest = d;
      }
    }
    return largest;
  }
  
  public static int indexOfLargest(ArrayList<Double> a)
  {
    double largest = findLargest(a);
    
    return a.indexOf(largest);
  }
  
  public static int indexOfInt(ArrayList<Integer> a, int target)
  {
    return a.indexOf(target);
  }
  
 public static boolean hasSameElements(ArrayList<Integer> a, ArrayList<Integer> b)
 {
  Collections.sort(a);
  Collections.sort(b);
    
  for(int i= 0; i < a.size(); i++)
  {
    if(a.get(i) != b.get(i))
    {
      return false;
    }
  }

  return true;
    
 }
  
  public static void removeEvenLength(ArrayList<String> a)
  {
    Iterator<String> iter = a.iterator();

    while(iter.hasNext()) {
      String str = iter.next();
      //remove even ones
      if(str.length() % 2 == 0)
      {
        iter.remove();
      }
    }
  }

  public static void removeDuplicates(ArrayList<Integer>  a)
  {
    for(int i = a.size() - 1; i > 0; i--)
    {
      if(a.get(i) == a.get(i-1))
      {
        a.remove(i);
      }
    }

  }

  public static void swapPairs(ArrayList<String>  a)
  {
    for(int i = 0; i < a.size() - 1; i+=2)
    {
      Collections.swap(a, i, i+1);
    }
  }
  
  public static void doubleList(ArrayList<String> a)
  {
    for(int i = 0; i < a.size(); i+=2)
    {
      String s = a.get(i);
      a.add(i+1, s);
    }
  }
  
  public static void removeShorterStrings(ArrayList<String> a)
  {
    if(a.size() % 2 == 0)
    {
      for(int i = a.size() - 1; i>0; i-=2)
      {
        if(a.get(i-1).length() > a.get(i).length())
        {
          a.remove(i);
        }
        else
        {
          a.remove(i-1);
        }
      }
    }
    else
    {
      for(int i = a.size() -2; i>0; i-=2)
      {
        if(a.get(i-1).length() > a.get(i).length())
        {
          a.remove(i);
        }
        else
        {
          a.remove(i-1);
        }
      }
    }
  }
  
  
  public static String censor(String s, char c)
  {
    //Option 1:
    //return censor.replace(c, '*');
    
    //Option 2:
    String str = "";
    for(int i = 0; i < s.length(); i++)
    {
      if(s.charAt(i) == c)
      {
        str= str + "*";
      }
      else
      {
        str = str + s.charAt(i);
      }
    }
    return str;
  }
  
}