public class Test {
    public static void main(String[] args) {
        int a[]={2,6,9,0,7,6,5,8};
        int n=a.length;
        int i,j,temp;
        for(i=0;i<n-1;i++){
            for(j=0;j<n-1;j++){
                if(a[j+1]>a[j]){
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;

                }
            }
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }


    }
    
}
