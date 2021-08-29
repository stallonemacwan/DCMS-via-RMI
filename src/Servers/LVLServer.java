package Servers;
/**
 * Server file to initiate LVLServer
 */
import ServerImplementation.LVLClass;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class LVLServer {

    public void run() throws Exception {
        final String serverName = "LVL";
        final int serverNum = 20000;
        final int serverPort = 4568;
        LVLClass lvl = new LVLClass(serverName, serverNum);
        Registry registry = LocateRegistry.createRegistry(serverPort);
        registry.bind("LVL", lvl);
        System.out.println("Laval server is running on port:" + serverPort);
        String managerID = "LVL0000";
        lvl.createSRecord("Jay", "Patel", "Math, English", "active", "12/32/1990", managerID);
        lvl.createSRecord("Stallone", "Shinghania", "Math, French", "inactive", "01/12/2000", managerID);
        lvl.createSRecord("Shubham", "Agrawal", "Art, Chemistry", "active", "07/12/1967",managerID);
        lvl.createSRecord("Virag", "Shinghania", "Geography, Music", "active", "01/32/22", managerID);
        lvl.createSRecord("Vandit", "Agrawal", "Geography, French", "active", "11/11/12", managerID);
        lvl.createSRecord("Meet", "Patel", "French, Music", "inactive", "09/02/45", managerID);
        lvl.createSRecord("Akshita", "Patel", "Music, Art", "active", "01/22/22", managerID);
        lvl.createSRecord("Bhoomi", "Sehra", "Music, History", "active", "01/03/20", managerID);
        lvl.createTRecord("Azim", "Patel", "1234 street", "5145231123", "Math", "LVL", managerID);
        lvl.createTRecord("Ashraf", "Shinghania", "1234 street", "51452312343", "Spanish", "LVL", managerID);
        lvl.createTRecord("Satinder", "Singh", "1234 street", "5145231123", "History", "LVL", managerID);
        lvl.createTRecord("Nilesh", "Patel", "1234 street", "5145231123", "French", "LVL", managerID);
        lvl.createTRecord("Teja", "Sehra", "1234 street", "5145231123", "English", "LVL", managerID);
        lvl.createTRecord("Zeal", "Agrawal", "1234 street", "5145631123", "Geography", "LVL", managerID);
        lvl.createTRecord("Pavit", "Singh", "1234 street", "5146541123", "Geography", "LVL", managerID);
    }

}

