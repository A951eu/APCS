
/**
 * Write a description of class test1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test1
{//stage，引用student
    public static void main(){
        String s=new String("A");
        Student a1=new Student();//相当于刚刚右键调用了new
        UnderGrad a2=new UnderGrad("Tom",new int[] {52,65,98},"");//左右必须一样
        //改自Student a2=new Student("Tom",new int[]{52,65,98},"");
        Student a3=new Student("Tonny",new int[]{52,65,98},"B");//调用constructor 来copy
        System.out.println(a1.toString());
        System.out.println(a2);//toString好处：可以直接写这个 自动的
        System.out.println(a3);
    }
}
