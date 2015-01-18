package simple_engine;

import java.io.File;
import java.util.Map;

public class Crawler {

	/* 
	 * source: http://stackoverflow.com/questions/2056221/recursively-list-files-in-java
	 * 
	 */
	public void walk(String path) {

		File root = new File(path);
		File[] list = root.listFiles();

		if (list == null)
			return;

		for (File f : list) {
			if (f.isDirectory()) {
				walk(f.getAbsolutePath());
				System.out.println("Dir:" + f.getAbsoluteFile());
			} else {
				System.out.println("File:" + f.getAbsoluteFile());
				// extract f
				Map<String,String> metadata = Extraction.extract(f);
				
				// store metadata
				Storage.save(f, metadata);
			}
		}
	}

	public static void main(String[] args) {
		String startDir = args[0];
		new Crawler().walk(startDir);
	}

}
