class Main{
	/*public void printTriangle(int n) {
   for (int i = 0; i < n; i++){
	   
  for (int j = 0; j <= i; j++){
	   System.out.print("*");
  }
  System.out.println("");
   }
} 
	
 public static void main(String[] args){
    Main m = new Main();
	m.printTriangle(4);
  
 }
}


  void printPattern(int n) {
 for (int i = 1; i <= n; i *= 2){
 for (int j = 0; j < n; j++){
 System.out.println(i + "," + j);
  }
 }
  }
public static void main(String[] args){
    Main m = new Main();
	m.printPattern(8);
}
void recHalf(int n) {
if (n <= 0) return;
System.out.print(n + " ");
recHalf(n / 2);
}
public static void main(String[] args){
    Main m = new Main();
	m.recHalf(20);
 }
}
void fun(int n) {
if (n == 0) return;
fun(n - 1);
fun(n - 1);
}
public static void main(String[] args){
    Main m = new Main();
	m.fun(3);
}
}*/
void tripleNested(int n) {
for (int i = 0; i < n; i++)
  for (int j = 0; j < n; j++)
   for (int k = 0; k < n; k++)
System.out.println(i + j + k);
}
public static void main(String[] args){
    Main m = new Main();
	m.tripleNested(3);
 }
}