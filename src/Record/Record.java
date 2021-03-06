package Record;
/**
 * Record class used to create TeacherRecord and StudentRecord
 */
public class Record {

    private String recordID;
    private String firstName;
    private String lastName;

    public String getRecordID() {
        return recordID;
    }

    protected void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    protected String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    protected String getLastName() {
        return lastName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString(){
        String result = null;
        result = "Record ID: "+getRecordID() +"\n" +"Name: " + getFirstName() + " " + getLastName();
        return result;

    }
}

