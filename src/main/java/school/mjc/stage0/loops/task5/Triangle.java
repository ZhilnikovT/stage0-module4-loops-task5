package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength)  {
        for(int y = 1; y <= cathetusLength; y++){
            for(int x = 1; x <= cathetusLength; x++){
                if(y >= x) {     
                    System.out.print("8");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.print("\n");
        }
    } 
}
