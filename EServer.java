import java.io.*;
import java.net.*;

public class EServer
{
public EchoServer(int portnum)
	{
		try
		{
		
		server = new ServerSocket(portnum);
		}
		catch (Exception err)
		{
			System.out.println(err);
		}
	}
