package legato;

import java.util.Scanner;
import java.util.regex.Pattern;

public class AnimalCon {
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	Animal a[]=null;
	while(true) {
	System.out.println("Enter the no of objects \n"+"2 for displaying\n"+"3 for exit");
	int option=scan.nextInt();
	switch(option) {
	case 1:addAnimals(a);
			break;
	case 2:displayAnimals(a);
	break;
	case 3:
		System.exit(0);
	break;
	default : System.out.println("please enter correct option");
	}
}
}
	public static Animal[] addAnimals(Animal[] a)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of objects \n");
	int count=scan.nextInt();
		a=new Animal[count];
		int noOfAttempts=0;
    for(int i=0;i<count;i++) {
	System.out.println("Enter the animal name");
	String name=scan.next();
	
	while(!validateName(name))
	{
		System.out.println("name can only chars");
		System.out.println("Enter the animal name again");
		name=scan.next();
		noOfAttempts++;
		if(noOfAttempts>=3) {
			System.out.println("you exeeded max no of attempt");
			noOfAttempts=0;
			System.exit(0);
		}
	}
	
	System.out.println("Enter the animal breed");
	String breed=scan.next();
	while(!validateBreed(breed))
	{
		System.out.println("name can only chars");
		System.out.println("Enter the animal breed again");
		breed=scan.next();
		if(noOfAttempts>=3) {
			System.out.println("you exeeded max no of attempt");
			noOfAttempts=0;
			System.exit(0);
		}
	}
	System.out.println("Enter the animal age");
	int age=scan.nextInt();
	
	Animal a1=new Animal();
    //System.out.println("total no objects="+Animal.getcount());	
	a1.setName(name);
	a1.setBreed(breed);
	a1.setAge(age);
	a1.Reverse();
	a[i]=a1;
   a1.getAnimalLifeStyle();
	}
    return a;
	}
	public static void displayAnimals(Animal[] a)
	{
		System.out.println("the array is"+a);
		if(a!=null) {
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
	}
		else
		{
			System.out.println("no object displayed");
		}
	}

	public static boolean validateName(String name) {
		if(Pattern.matches("^[A-Za-z]+$",name))
			return true;
		else
			return false;
	}
	public static boolean validateBreed(String breed) {
		if(Pattern.matches("^[A-Za-z]+$",breed))
			return true;
		else
			return false;
	}
	
}