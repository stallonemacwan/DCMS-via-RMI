package ServerInterface;
/**
 * Main interface that defines all the operations allowed by the clients/managers
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CenterServer extends Remote{

    public String createTRecord(String firstName, String lastName, String address, String phone, String specialization, String location, String manID) throws RemoteException;
    public String createSRecord(String firstName, String lastName, String courseRegistered, String status, String statusDate, String manID) throws RemoteException;
    public String getRecordCounts(String manID) throws RemoteException;
    public String editRecord(String recID, String fieldName, String newValue, String manID) throws RemoteException;
    public String displayAllRecords(String manID) throws RemoteException;
    public String displayRecord(String recID, String manID) throws RemoteException;
}
