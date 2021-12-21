package filetree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FileUtil {

	public static File toFileRepresentation(Path path) throws IOException {

		try {

			if(path.toFile().isDirectory()) {
				List<File> files = new LinkedList<>();
				Files.list(path).forEach(f -> {
					try {
						files.add(toFileRepresentation(f));
					} catch (IOException e) {
						e.printStackTrace();
					}
				});
				return new Directory(path, files);
			}
			else {
                return new RegularFile(path);
			}


		}

		catch (IOException e )
		{
			e.printStackTrace();
		}


























         return null;
	}

}
