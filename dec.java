public class dec {
    public static void main(String[] args ){
        //voteAge();
        try {
            voteAge(15);
        } catch (Exception e) {
            System.out.println(e);// TODO: handle exception
        }
        try {
            voteAge(19);
        } catch (Exception e) {
            System.out.println(e);// TODO: handle exception
        }

    }
    static void voteAge(int age){
        System.out.println("check for vote");
        if(age<18){
            throw new IllegalArgumentException("aap vote nahi akr sakte");
        }
        else{
            System.out.println("aap vote kAR sakte ho");
        }

    }
    
}
