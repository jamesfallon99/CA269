public class StudentExam {
    private String name;
    private String id;

    public StudentExam(String n, String _id){
        name = n;
        id = _id;
    }
    public String toString(){
        return name + " (" + id + ")";
    }
    public String getName(){
        return name;
    }
    public void setName(String value){
        name = value;
    }
    public String getID(){
        return id;
    }
    public void setID(String value){
        id = value;
    }
}