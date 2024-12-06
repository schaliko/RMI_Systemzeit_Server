import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDateTime;

public class DaytimeImpl extends UnicastRemoteObject implements Daytime {
	public DaytimeImpl() throws RemoteException {}

	@Override
	public String getTime() throws RemoteException {
		return LocalDateTime.now().toString();
	}
}