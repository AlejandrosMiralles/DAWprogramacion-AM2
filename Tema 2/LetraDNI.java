public class LetraDNI {
    public static String letraDni(int dni){
        String[] array = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"} ;
        return array[dni%23] ;
    }
    public static void main(String[] args) {
        System.out.println(letraDni(20971752));
    }
}
