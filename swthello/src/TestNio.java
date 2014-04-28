import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;


public class TestNio {

	public static void main(String[] args) {
		try {
			InetSocketAddress address = new InetSocketAddress(InetAddress.getByName(""), 22222);
			System.out.println(address);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
