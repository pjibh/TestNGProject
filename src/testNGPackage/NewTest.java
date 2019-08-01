package testNGPackage;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;

public class NewTest {
	
	public static List<String> list;
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  
	  System.out.println(list.get(0));
	  
	  
  }

  @DataProvider
  public List<String> dp() {
	  
	  list = new ArrayList<String>();
	  list.add("245");
	return list;
  }
}
