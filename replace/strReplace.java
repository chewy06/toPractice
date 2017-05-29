import java.util.*;
import java.lang.String;

class strEdit {
 String str, s;
 char[] n;
 int index = 0;

 public strEdit(String str) {
  this.str = str;
   n = new char[this.str.length()];
   createArray();
 }
 private void createArray() {
  for(char s : str.toCharArray()) {
   n[index] = s;
   index++;
  }
  index= 0;
 }

 public String replace(int i, char c) {
  n[i] = c;
  s = new String(n);
  return s;
 }

 public String replaceAll(char r, char c) {
  while(index < str.length()) {
   if (n[index]==r)
    n[index] = c;
    index++;
  }
  s = new String(n);
  index=0;
  return s;
 }

 public String recursiveReplaceAll(int i, char r, char c) {
  if(i < str.length()) 
   if (n[i] == r) 
    return c+recursiveReplaceAll(i+1, r, c);
   else
    return n[i]+recursiveReplaceAll(i+1, r, c);
  else
    return "";
 }
}

class strReplace {
 public static void main(String[] args) {
  strEdit str = new strEdit("recursiveReplaceAll");

  System.out.println("Index replacement: "+str.replace(2,'C')); 
  System.out.println("Character replacement: "+str.replaceAll('l', 'L'));
  System.out.println("Recursive char repalcement: "+str.recursiveReplaceAll(0,'e', 'E'));
 }
}
