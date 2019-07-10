import java.util.*;



class Die{
    private int faceValue;
    Random str=new Random();
    public Die(){
	faceValue=0;
    }
    public int getFaceValue(){
	
	return faceValue;
    }
    public void roll(){
	faceValue=str.nextInt(6)+1;
    }
}
public class DiceGame{
    static void play(){
        int fv1,fv2,fv3;
	Die a=new Die();
	Die b=new Die();
	a.roll();
	b.roll();
	fv1=a.getFaceValue();
	fv2=b.getFaceValue();
	System.out.println("Rolling the dice...");
	System.out.println("Die 1:"+fv1);
	System.out.println("Die 2:"+fv2);
	fv3=fv1+fv2;
	System.out.println("Total value:"+fv3);

    }
    public static void main(String[] args){

	play();

    }
}