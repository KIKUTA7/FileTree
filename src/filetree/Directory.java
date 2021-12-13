package filetree;

import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;

public class Directory extends File {

	private final List<File> files;

	public Directory(Path path, List<File> files) {
		super(path);
		this.files = files;
	}

	@Override
	public Iterator<File> iterator() {
		// TODO
		return null;
	}

	@Override
	public int getHeight() {
		// TODO
		return -1;
	}

	@Override
	public boolean isRegularFile() {
		return false;
	}

	public List<File> getFiles() {
		return files;
	}

}
