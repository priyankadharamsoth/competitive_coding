

public class Occurance {
    public static void main(String[] args) {
        String str= "cabbcdabbscedbcda";
        Character target = 'a';
        int first = -1;
        int last = -1;
        
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == target){
                first = i;
                break;
            }  
        }
        
        for (int j = str.length()-1; j >first; j--) {
            if (str.charAt(j) == target){
                last = j;
                break;
            }  
        }
        System.out.println(first +" "+last);
    }
    

}
    

        

    

