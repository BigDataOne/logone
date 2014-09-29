
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import ac.ict.http.MsgClient;

public class IndexLogFile {

	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("exe file_path flume_host_port( like 10.10.72.127:5140 )");
			System.exit(0);
		}
		
		MsgClient msgClient = new MsgClient("http://" + args[1]);
		String filePath = args[0];
		try {
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { 
				InputStreamReader read = new InputStreamReader( new FileInputStream(file));
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					System.out.println(lineTxt);
					msgClient.log(lineTxt);
				}
				read.close();
			} else {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
