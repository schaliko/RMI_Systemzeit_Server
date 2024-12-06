import java.rmi.Naming;
import java.time.LocalDateTime;

public class DaytimeClient {
	public static void main(String args[]) throws Exception {
		if (args.length != 1) {
            System.out.println("Usage: java DaytimeClient <server-host>");
            return;
        }
        try {
            String host = args[0];

            LocalDateTime startTime = LocalDateTime.now();
            System.out.println("Local starttime is " + startTime);

            Daytime remote = (Daytime) Naming.lookup("rmi://" + host + "/Daytime");
            String received = remote.getTime();

            LocalDateTime endTime = LocalDateTime.now();
            System.out.println("Received time is " + received);
            System.out.println("Local endtime is " + endTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}