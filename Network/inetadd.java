import java.net.*;

public class inetadd {

	public static void main(String[] args) throws UnknownHostException
	{
		InetAddress add=InetAddress.getLocalHost();
		System.out.println(add);
		
		add=InetAddress.getByName("www.Goggle.com");
		System.out.println(add);;
		
		InetAddress SW[]=InetAddress.getAllByName("www.nba.com");
		for(int i=0;i<SW.length;i++)
			System.out.println(SW[i]);
	}

}
