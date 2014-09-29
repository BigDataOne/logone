package docone.logsys.test;

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
			if (file.isFile() && file.exists()) { // 判断文件是否存在
				InputStreamReader read = new InputStreamReader( new FileInputStream(file));// 考虑到编码格式
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					System.out.println(lineTxt);
					msgClient.log(lineTxt);
				}
				read.close();
			} else {
				System.out.println("找不到指定的文件");
			}
		} catch (Exception e) {
			System.out.println("读取文件内容出错");
			e.printStackTrace();
		}
	}

}
