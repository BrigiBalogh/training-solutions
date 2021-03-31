package week12d04;

import java.util.*;

public class Clients {

    Map<String,Client> clients = new HashMap<>();

    public void addClient(String name, String regNumber) {
        clients.put(regNumber, new Client(name, regNumber));
    }

    public Client findByRegNumber(String regNumber) {
        if (!clients.containsKey(regNumber)) {
            throw new IllegalArgumentException("Not found regnumber :" + regNumber);
        }
        return clients.get(regNumber);
    }

    public List<Client> findByName(String parts) {
        List<Client> clientList = new ArrayList<>();
        Collection<Client> clientsName = clients.values();
        for (Client client : clientsName) {
            if(client.getName().contains(parts)) {
                clientList.add(client);
            }
        }
        return clientList;
    }
}
