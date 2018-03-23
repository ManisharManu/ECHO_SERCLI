import java.io.*;
import java.net.*;

public class EClient
{
public static void main(String[] args)
	{
		try
    {
	
       Socket s = new Socket("127.0.0.1", 9999);
			BufferedReader r = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter w = new PrintWriter(s.getOutputStream(), true);
			BufferedReader con = new BufferedReader(new InputStreamReader(System.in));
