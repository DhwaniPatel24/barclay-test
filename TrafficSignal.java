public class TrafficSignal{
    
    public static void main(String []args){
       
       int northSouth = 0, eastWest = 0;

       for(int i = 0; i<=20;i++){
           
           System.out.printf("%d: N = %d; S = %d; E = %d; W = %d\n",i,northSouth,northSouth,eastWest,eastWest);
           
           if (i%8 == 1 || i%8 == 2 || i ==0){
               eastWest++;
           }
           else if(i%8 == 5 || i%8==6){
               northSouth++ ;
           }
           else{
               eastWest++;
               northSouth++;
           }
       }
     }
}
