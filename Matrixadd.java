class Matrixadd{
 public static void main(String[] args){
  int[][] a = {{1,2},{3,4}};
  int[][] b = {{4,3},{2,1}};
  int[][] c = new int[2][2];
  for (int i=0;i<2;i++){
   for (int j=0;j<2;j++){
    c[i][j] = b[i][j]+c[i][j];
    System.out.print(c[i][j]+" ");
   }
   System.out.println();
  }
 }
}