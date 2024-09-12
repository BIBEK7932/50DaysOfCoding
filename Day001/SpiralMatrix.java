package Day001;
import java.util.*;
public class SpiralMatrix {
    

    public List<Integer> spiralOrder(int[][] m) {
      int ROW = m.length;
      int COL = m[0].length;
List<Integer> res = new ArrayList<>();
      int sR = 0,eR=ROW-1,sC=0,eC=COL-1;
      while (sC<=eC && sR<=eR){
          for(int i =sC;i<=eC;i++){
           
              res.add(m[sR][i]);
          }
          sR++;
          for(int i =sR;i<=eR;i++)  res.add(m[i][eC]);
          eC--;
if(sR<=eR){
          for(int i=eC;i>=sC;i--)  res.add(m[eR][i]);
    eR--;

}

if(sC<=eC) {

    for (int i = eR; i >= sR; i--) res.add(m[i][sC]);
    sC++;
}
      }
      return res;
    }
}
