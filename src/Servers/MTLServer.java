package Servers;
/**
 * Server file to initiate MTLServer
 */
import ServerImplementation.MTLClass;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MTLServer {

    public void run() throws Exception {
        final String serverName = "MTL";
        final int serverNum = 10000;
        final int serverPort = 4567;
        MTLClass mtl = new MTLClass(serverName, serverNum);
        Registry registry = LocateRegistry.createRegistry(serverPort);
        registry.bind("MTL", mtl);

        System.out.println("Montreal server is running on port:" + serverPort);
        String managerID = "MTL0000";
        mtl.createSRecord("Jay", "", "Math, English", "active", "12/32/1990", managerID);
        mtl.createSRecord("Stallone", "Mecwan", "Math, French", "inactive", "01/12/2000", managerID);
        mtl.createSRecord("Shubham", "Agrawal", "Art, Chemistry", "act", "07/12/1967", managerID);
        mtl.createSRecord("Virag", "Shinghania", "Geography, Music", "active", "01/31/1222", managerID);
        mtl.createSRecord("Vandit", "Thakkar", "Geography, French", "active", "11/11/12", managerID);
        mtl.createSRecord("Meet", "Patel", "French, Music", "inactive", "09/02/45", managerID);
        mtl.createSRecord("Akshita", "Patel", "Music, Art", "active", "01/22/22", managerID);
        mtl.createSRecord("Bhoomi", "Sehra", "Music, History", "active", "01/03/20", managerID);
        mtl.createTRecord("", "Patel", "1234 street", "5145231123", "Math", "MTL", managerID);
        mtl.createTRecord("Ashraf", "", "1234 street", "51452312343", "Spanish", "MTL", managerID);
        mtl.createTRecord("Satinder", "Singh", "1234 street", "5145dfg231123", "History", "MTL", managerID);
        mtl.createTRecord("Nilesh", "Patel", "1234 street", "5145231123", "French", "mtl", managerID);
        mtl.createTRecord("Teja", "Sehra", "1234 street" , "5145231123", "English", "MTL", managerID);
        mtl.createTRecord("Zeal", "Agrawal", "1234 street" , "5145631123", "Geography", "MTL", managerID);
        mtl.createTRecord("Pavit", "Singh", "1234 street" , "5146541123", "Geography", "MTL", managerID);
        mtl.editRecord("SR1001", "status", "active", managerID);
    }
}

