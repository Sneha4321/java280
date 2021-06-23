
class MyMatrix {
 double[][] doubleArray;
MyMatrix(double[][] X, int size) {
  doubleArray = X;
}

   public double getDeterminant() {
  if (doubleArray.length < 3){
    double determinant;
    determinant = (doubleArray[0][0]*doubleArray[1][1])-(doubleArray)[0][1]*doubleArray[1][0];
  return determinant; 
  }

  else {
    double determinant;
    double a = (doubleArray[1][1]*doubleArray[2][2])-(doubleArray [2][1]*doubleArray[1][2]);
    double b = (doubleArray[1][0]*doubleArray[2][2])-(doubleArray [2][0]*doubleArray[1][2]);
    double c = (doubleArray[1][0]*doubleArray[2][1])-(doubleArray[2][0]*doubleArray[1][1]);
    determinant = (doubleArray[0][0]*a)-(doubleArray[0][1]*b) + (doubleArray [0][2]*c); 
    return determinant;
  }
  
   }
   
   public void printMe() {
    
    for(int i = 0; i< doubleArray.length; i++){
    for (int j =0 ; j < doubleArray[i].length; j++){
    System.out.print(" "+ doubleArray[i][j]);

    }
    System.out.println();
   }
 }
}