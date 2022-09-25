import java.util.ArrayList;
import java.util.Scanner;

public class SchoolSystem implements ISignUp,IParams{
	static Scanner in=new Scanner(System.in);
	ArrayList<String> x=new ArrayList<String>();
	Integer big; Integer medium;Integer small;
	SchoolSystem(){}
	SchoolSystem(Integer big, Integer medium, Integer small){
		this.big=big;
		this.medium=medium;
		this.small=small;
	}
	public void setBig(Integer big) {
		this.big=big;
	}
	public void setMedium(Integer medium) {
		this.medium=medium;
	}
	public void setSmall(Integer small) {
		this.small=small;
	}
	public int getBig() {
		return big;
	}
	public int getMedium() {
		return medium;
	}
	public int getSmall() {
		return small;
	}
	public ArrayList<Integer> getPlanSignUp() {
		ArrayList<Integer> a=new ArrayList<Integer>();
		System.out.print("输入要入学的学生人数:");
		int b=in.nextInt();
		System.out.print("输入要去的班级:");
		for(int i=0;i<b;i++) {
			a.add(in.nextInt());
		}
		return a;
	}
	public static IParams parse()throws Exception{
		System.out.print("输入大，中，小班幼儿园的剩余名额:");
		return new SchoolSystem(in.nextInt(),in.nextInt(),in.nextInt());
	}
	public void print() {
		for(int i=0;i<x.size();i++) {
			System.out.print(x.get(i)+",");
		}
	}
	public boolean addStudent(Integer stuType) {
		switch(stuType) {
		case 1:if(getBig()>=1) {
			setBig(getBig()-1);
			x.add("true");
			return true;
		}
		else {
			x.add("false");
			return false;
		}
		case 2:if(getMedium()>=1) {
			setMedium(getMedium()-1);
			x.add("true");
			return true;
		}
		else {
			x.add("false");
			return false;
		}
		case 3:if(getSmall()>=1) {
			setSmall(getSmall()-1);
			x.add("true");
			return true;
		}
		else {
			x.add("false");
			return false;
		}
		}
		return false;
	}
	@Override
	public boolean addStudent(int stuType) {
		// TODO Auto-generated method stub
		return false;
	}
	
}