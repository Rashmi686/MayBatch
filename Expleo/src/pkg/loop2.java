package pkg;

import java.util.ArrayList;
import java.util.List;

public class loop2 
{
public static void main(String[] args) 
{

	List<String> cars = new ArrayList<>();
	cars.add("car1");
	cars.add("car2");
	cars.add("car3");
	for(int i=0;i<cars.size();i++)
	{
		System.out.println(cars.get(i));
	}
}
}

