package remoteTutorial;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	public MyRemoteImpl() throws RemoteException {
		super();
	}

	@Override
	public String sayHello() throws RemoteException {
		return "Server say: Hey!";
	}

	public static void main(String[] args) {
		try {
			MyRemoteImpl service = new MyRemoteImpl();
			Naming.bind("RemoteHello", service);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
