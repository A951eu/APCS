
public class Student
{//P144
   private final static int num=3;//final:常量，只能赋值一次。static:静态变量，大家公用。类似于取餐号的那个号
   private String name;
   private int[] score;
   private String grade;//instance variables，存放学生数据
   
   public Student(){//constructors (initialize IV): no return type + same name with the class，参的数量要和input参数数量对上
       //如果小括号里没东西就是default constructor（默认），无参数
       name="";//initialize
       score=new int[num];
       grade="";
       // input: new int[]{43,43,55}
}

  public Student(String n,int[] s,String f){//overloading: same method name with diff parameter list.
      //传参（用户input），参数类型必须匹配，参和参逗号隔开
       
       name=n; //此时调用new会有两个下拉菜单，输入信息。
       score=s;
       grade=f;
}
    public String getName(){//get 开头，无参，把iv拿出来。accessor。//这一群都是接口
        return name;
    }
    public void setName(String n){//mutator,set 开头
        name=n;
    }
     public int[] getScore(){//跟什么型写什么型。三个iv写三对set get
        return score;
    }
    public void setScore(int[] s){
        score=s;
    }
    public String getGrade(){
        return grade;
    }
    public void setGrade(String f){
        grade=f;
    }
    public double getAve(){
        double sum=0;
        for (int i=0;i<score.length;i++){
            sum+=score[i];
    }
    return sum/score.length;
        //函数和函数之间：平级调用
   
}//分清哪些是stage哪些是class
public void computeGrade(){//
 if (getAve()>60){
        grade="pass";
    }
    else{
        grade="fail";
    }
}
public String toString(){//显示函数，toString这名字不能乱改
    return "name:"+name+"\naverage score:"+getAve()+"Grade"+"n/-------------------";//好处：在stage可以打印。 右下斜杠escape sequence
}
}