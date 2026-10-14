public class Student{
    public String myClub;
    public String myName;
    
    public Student(String myClub, String myName){
        this.myClub = myClub;
        this.myName = myName;
    }
        public String getClub(){
            return this.myClub;
        }
        public String getName(){
            return this.myName;
        }

        public Boolean isSameClub(Student other){
            return this.myClub.equals(other.myClub);
        }

    }
