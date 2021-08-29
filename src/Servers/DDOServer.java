package Servers;
/**
 * Server file to initiate DDOServer
 */
import ServerImplementation.DDOClass;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class DDOServer {

    public void run() throws Exception {
        final String serverName = "DDO";
        final int serverNum = 30000;
        final int serverPort = 4569;
        DDOClass ddo = new DDOClass(serverName, serverNum);
        Registry registry = LocateRegistry.createRegistry(serverPort);
        registry.bind("DDO", ddo);
        System.out.println("Dollard des server is running on port:" + serverPort);
        String managerID = "DDO0000";
        ddo.createSRecord("Jay", "Patel", "Math, English", "active", "12/32/1990", managerID);
        ddo.createSRecord("Stallone", "Shinghania", "Math, French", "inactive", "01/12/2000", managerID);
        ddo.createSRecord("Shubham", "Agrawal", "Art, Chemistry", "active", "07/12/1967", managerID);
        ddo.createSRecord("Virag", "Shinghania", "Geography, Music", "active", "01/32/22", managerID);
        ddo.createSRecord("Vandit", "Agrawal", "Geography, French", "active", "11/11/12", managerID);
        ddo.createSRecord("Meet", "Patel", "French, Music", "inactive", "09/02/45", managerID);
        ddo.createSRecord("Akshita", "Patel", "Music, Art", "active", "01/22/22", managerID);
        ddo.createSRecord("Bhoomi", "Sehra", "Music, History", "active", "01/03/20", managerID);
        ddo.createTRecord("Azim", "Patel", "1234 street", "5145231123", "Math", "DDO", managerID);
        ddo.createTRecord("Ashraf", "Shinghania", "1234 street", "51452312343", "Spanish", "DDO", managerID);
        ddo.createTRecord("Satinder", "Singh", "1234 street", "5145231123", "History", "DDO", managerID);
        ddo.createTRecord("Nilesh", "Patel", "1234 street", "5145231123", "French", "DDO", managerID);
        ddo.createTRecord("Teja", "Sehra", "1234 street", "5145231123", "English", "DDO", managerID);
        ddo.createTRecord("Zeal", "Agrawal", "1234 street", "5145631123", "Geography", "DDO", managerID);
        ddo.createTRecord("Pavit", "Singh", "1234 street", "5146541123", "Geography", "DDO",managerID);
    }

}
