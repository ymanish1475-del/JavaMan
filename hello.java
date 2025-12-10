import java.util.ArrayList;


import java.util.ListIterator;



/*public class hello{
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(6);
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            if(it.next()==5){
                it.remove();
            }
        }

    }
}*/
/*public class hello{
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(6);
        ListIterator<Integer> it=list.listIterator(list.size());
        
        while(it.hasPrevious()){
            Integer X =it.previous();
            System.out.println(X);
        }

    }
}*/
/*public class hello{
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(6);
        ListIterator<Integer> it=list.listIterator(list.size());
        
        while(it.hasNext()){
            Integer X =it.next();
            if(X==7){
                it.set(10);
            }
            System.out.println(X);
        
        }
    }
}*/
/*public class hello{
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        int s =  list.size();
        int m =s/2;
        ListIterator<Integer> it=list.listIterator();
        
        
        while(it.hasNext() && it.nextIndex()<=m){
            Integer X =it.next();
            
            System.out.println(X);
        
        }
        while(it.hasPrevious()){
            Integer y =it.next();
            
            System.out.println(y);}

    }
}*/
public class hello{
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(-19);
        
        ListIterator<Integer> it=list.listIterator();
        
        
        while(it.hasNext()){
            Integer X =it.next();
            if(X<0){
                int value=X*(-1);
                it.set(value);
            }
            
            System.out.println(X);
        
        }
        //while(it.hasPrevious()){
         //   Integer y =it.next();
            
          //  System.out.println(y);}

    }
}



