import java.io.*;
import java.util.*;

class Solution {
  public boolean gus(Strng str){
    String s = str + str;
    retunr s.subtring(1, s.lenght()-1).contains(str);
  }
}


//resultado: no me dio ningun resultado por que no me dio tiempo de crear ninguna prueba unitaria y además el ejercicio pasado no compilaba.
