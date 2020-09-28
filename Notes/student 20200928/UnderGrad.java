

public class UnderGrad extends Student   
/*extends Student：继承Students所有的IV和功能
 * 
 ***ATTENTION：constructor不能继承，因为名字不能用。儿子的constructor必须用super开头接爸爸的constructor。*/
{
    public UnderGrad(){
        super();
    }
    public UnderGrad(String n,int[] s,String f) {
    super(n,s,f);
}
//更改：overloading，继承的东西有一个不满意重新写，复制原函数，名字不变。
public void computeGrade(){//
 if (getAve()>60){
        setGrade("pass");//grade 用过了
    }
    else{
        setGrade("fail");
    }
}
}















