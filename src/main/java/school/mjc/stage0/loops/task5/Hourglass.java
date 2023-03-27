package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height){
        int center = (height - 1)/2 +1;
        for(int y = 0; y < center; y++){
            for(int x = 1; x <= height; x++){
                if(x > y && x <= height - y && y <= center) {     
                    System.out.print("8");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        
        for(int y = center - 2; y >= 0; y--){
            for(int x = height; x >= 1; x--){
                if(x > y && x <= height - y && y <= center) {     
                    System.out.print("8");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        
    } 
}
