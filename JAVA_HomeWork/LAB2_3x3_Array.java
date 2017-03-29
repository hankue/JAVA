//183頁LAB2:陣列練習
public class LAB2_3x3_Array {
    public static void main (String args[]) {

      int x[][]=new int[3][3];
	  int y[][]=new int[3][3];
	  int z[][]=new int[3][3];
	  int i,j,k;
	  
	  System.out.println("             X陣列                                   Y陣列                                     Z陣列");
	  System.out.println("---------------------------           ---------------------------           ---------------------------");
	  for(i=0;i<3;i++){
		  k=0;
		  for(j=0;j<3;j++){
			  switch(k){
				  case 1:
					System.out.print(y[i][j]+"\t");
					break;
				  case 2:
					System.out.print(z[i][j]+"\t");
					break;
				  default:
					x[i][j]=(int)(30*Math.random());
					y[i][j]=(int)(30*Math.random());
					z[i][j]=x[i][j]+y[i][j];
				  //System.out.println("i="+i+",j="+j+",k="+k);
					System.out.print(x[i][j]+"\t");
			  // } else System.out.println("io="+i+",jo="+j+"ko="+k);
			  } 
			  if(j==2 && k<2){
				  k++;
				  j=-1;
			  }		  
		  }
		  System.out.println();
	  }

    }
}
