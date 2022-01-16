
import java.util.*;
class Student{
    private int sid;
    private String sname;
    private int age;
    private String  address;
    private String email;

    Student(int sid, String sname, int age, String address, String email){
        this.sid=sid;
        this.sname=sname;
        this.age=age;
        this.address=address;
        this.email=email;
    }
    
    public int getSid(){
        return sid;
    }
    public String getSname(){
        return sname;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }

    public String toString(){
        return sid+" "+sname+" "+age+" "+address+" "+email;
    }

}

class Main{
    public static void main(String[] args){

        List<Student> c =new ArrayList<Student>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
       
        int ch;
        do{
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.print("Enter your choice: ");
            ch=s.nextInt();
            
            switch(ch){
                case 1:
                    System.out.print("Enter Sid: ");
                    int sid = s.nextInt();
                    System.out.print("Enter Sname: ");
                    String sname = s1.nextLine();
                    System.out.print("Enter Age: ");
                    int age = s.nextInt();
                    System.out.print("Enter Address: ");
                    String address = s1.nextLine();
                    System.out.print("Enter Email: ");
                    String email = s1.nextLine();
                    
                    c.add(new Student(sid, sname, age, address, email));
                break;
                
                case 2:
                    System.out.println("-------------------------");
                    Iterator<Student> i = c.iterator();
                    while(i.hasNext()){
                        Student st = i.next();
                        System.out.println(st);
                        
                        
                    }
                    System.out.println("-------------------------");
                break;
                
                case 3:
                    boolean found = false;
                    System.out.print("Enter sid to search: ");
                    sid = s.nextInt();
                    System.out.println("-------------------------");
                    i = c.iterator();
                    while(i.hasNext()){
                        Student st = i.next();
                        if(st.getSid() == sid){
                            System.out.println(st);
                            found = true;
                        }
                        
                        
                        
                    }
                   
                    if(!found){
                        System.out.println("Record not found");
                    }
                     System.out.println("-------------------------");
                break;
                
                case 4:
                    found = false;
                    System.out.print( "Enter sid to delete: ");
                    sid = s.nextInt();
                    System.out.println("-------------------------");
                    i = c.iterator();
                    while(i.hasNext()){
                        Student st = i.next();
                        if(st.getSid() == sid){
                            i.remove();
                            found = true;
                        }
                       
                        
                        
                    }
                   
                    if(!found){
                        System.out.println("Record not found");
                    }else{
                        System.out.println("Record is deleted successfully.");
                    }
                     System.out.println("-------------------------");
                break;
                case 5:
                    found = false;
                    System.out.print("Enter sid to update: ");
                    sid = s.nextInt();
                    System.out.println("-------------------------");
                    ListIterator<Student>li = c.listIterator();
                    while(li.hasNext()){
                        Student st = li.next();
                        if(st.getSid() == sid){
                            System.out.print("Enter new Sname: ");
                            sname = s1.nextLine();
                            
                            System.out.print("Enter new Age: ");
                            age = s.nextInt();
                            
                            System.out.print("Enter new Address: ");
                            address = s1.nextLine();
                            
                            System.out.print("Enter new Email: ");
                            email = s1.nextLine();
                            li.set(new Student(sid, sname, age, address,email));
                            found = true;
                            
                        }
                        
                        
                        
                    }
                   
                    if(!found){
                        System.out.println("Record not found");
                    }else{
                        System.out.println("Record is updated successfully.");
                    }
                     System.out.println("-------------------------");
                break;
                    
                    
            }
            
        }while(ch!=0);
    }
}


