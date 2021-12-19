package filetree;

import java.nio.file.Path;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class RegularFile extends File {

	public RegularFile(Path path) {
		super(path);
	}

	@Override
	public Iterator<File> iterator() {
		return new Iterator<File>() {
			private int el = 0;
			@Override
			public boolean hasNext() {
              return el == 0;
			}

			@Override
			public File next() throws  NoSuchElementException {
				el++;
				if(el - 1 == 0) return new RegularFile(getPath());
				else throw new NoSuchElementException("hait she oxero");
			}
		};
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
