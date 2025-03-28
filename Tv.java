import java.util.Scanner;
interface TvRemote{
	void increasingVolume();
	void changeChannel();
	void decreasingVolume();
}
interface SmartTvRemote extends TvRemote{
	void amazonPrime();
	void netflix();
	void zeeTv();
	void back();
}
class Tv1 implements SmartTvRemote{
	public void increasingVolume(){
		System.out.println("Increasing Volume.....");
	}
	public void decreasingVolume(){
		System.out.println("Decreasing Volume.....");
	}
	public void changeChannel(){
		System.out.println("Channel changed");
	}
	public void amazonPrime(){
		System.out.println("Opening Prime....");
	}
	public void netflix(){
		System.out.println("Opening Netflix.....");
	}
	public void zeeTv(){
		System.out.println("Opening ZeeTv.....");
	}
	public void back(){
		System.out.println("Going Back.....");
	}
}
class Tv{
   public static void main(String[] args){//main function
    Tv1 obj = new Tv1();
	obj.increasingVolume();
	obj.netflix();
   }
}