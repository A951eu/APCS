

public class Grads extends Student
{//新添加学号
    private int id;
    public Grads(String n,int[] s,String f,int i){
    super(n,s,f);//从爸爸传参
    id=i;
    }
    
    //部分重写：
    //super.【】是爸爸的某个函数
    public void computeGrade(){//partial overwritting
        super.computeGrade();
        if(getAve()>90){
            setGrade("A+");
        }
    }
}
