package filetree;

import java.nio.file.Path;
import java.util.Iterator;

public class RegularFile extends File {

	public RegularFile(Path path) {
		super(path);
	}

	@Override
	public Iterator<File> iterator() {
		// TODO
		return null;
	}

	@Override
	public int getHeight() {
		return 0;
	}

	@Override
	public boolean isRegularFile() {
		return true;
	}

}
