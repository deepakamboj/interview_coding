package extraAskedLogic;

public class GetValueAccordingK {
    public static void main(String[] args) {
        //find value from array according k,if k=1 then output =10,if k=2,output=5 so on
        int[] arr = {10,5,4,20,15,35};
        int k=2;
        for(int i= 0;i<arr.length;i++){
       if(i==k-1){
           System.out.println(arr[i]);
       }
        }
    }

}
