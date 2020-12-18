public class EroorEx {
    static String str = null;

    public static void main(String[] args) {


        try{
        System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("NULLが入力されています");
            System.out.println(e.getMessage());
        }
    }
}
