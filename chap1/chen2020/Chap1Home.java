

public class Chap1Home
{
        //factorial
    
    public static int fac(int n) {
        int facin=1;
        for (int i=1;i<=n;i++) {
            facin=facin*i;
        }
        return facin;
    }
    
    public static void main(String  [] args) {
        System.out.println("hi");
    }
    /*2++++
     **4+++
     ***6++
     ****8+
     *****10
     */
    public static void exl(int n) {
        for(int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if(i==j) {
                    System.out.print((i+1)*2);
                }
                else if(j<i) {
                    System.out.print("*");
                }
                else{
                    System.out.print("+");
                }
                
                
            }
            System.out.println();
        }
    }
    /*
     * 97531
     * 7531-1
     * 531-1-3
     * 31-1-3-5
     * 1-1-3-5-7
     */
        public static void ex24c(int n) {
        for(int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(2*n-1-(i+j)*2);
                
            }
            System.out.println();
        }
    }
/*
 * 97531
 * 7531
 * 531
 * 31
 * 1

 */
            public static void ex24a(int n) {
        for(int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
            if (i<=j){
                System.out.print(2*n-1-j*2);
            }
        }
        System.out.println();
    }
}
/*
 * 
 * 97531
 * 7531
 * 531
 * 31
 * 1

 */
 public static void ex24b(int n) {
        for(int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
            if (i<=j){
                System.out.print(2*n-1-2*j);
            }
            
        }
        System.out.println();
    }
}
/* 
 * 1
 * 13
 * 135
 * 1357
 * 13579
 */
 public static void ex24d(int n) {
        for(int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
            if (i>=j){
                System.out.print(2*j+1);
            }

        }
        System.out.println();
    }
}
/*
 * 13579
 * 1357
 * 135
 * 13
 * 1

 * 
 */
 public static void ex24e(int n) {
        for(int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
            if (i<=j){
                System.out.print(2*(j-i)+1);
            }

        }
        System.out.println();
    }
}
/*
 * 2----
 * -4---
 * --6--
 * ---8-
 * ----10

 */
    public static void exl25(int n) {
        for(int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if(i==j) {
                    System.out.print((i+1)*2);
                }
                else{
                    System.out.print("-");
                }
                
                
            }
            System.out.println();
        }
    }
    public String lastChars(String a, String b) {
  if (a.length()==0){
    return "@";
  }
  else{
    return a.substring(0,1);
  }
  
  if (b.length()==0){
    return "@";
  }
  else{
    return b.substring(b.length()-1);
  }
}
}