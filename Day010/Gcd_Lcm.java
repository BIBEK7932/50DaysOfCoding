package Day010;

public class Gcd_Lcm {
    static Long[] lcmAndGcd(Long A , Long B) {
        Long gcd = 1l;
        Long a = A,b=B;
       while(A>0 && B>0){
           if(A>B) A%=B;
           else B%=A;
           
           if(A == 0) gcd = B;
           else gcd = A;
       }
       Long lcm = a*b/gcd;
        Long [] arr ={lcm,gcd};
        return arr;
    }
}
