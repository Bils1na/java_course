package lecture6;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastNname;

    @Override
    public String toString() {
        return String.format("id:%d fn:%s ln:%d sal:%d", id, firstName, lastNname, salary);
    }
    
}
