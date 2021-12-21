package filetree;

import java.nio.file.Path;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Directory extends File {


	private final List<File> files;
    private int el = 0;
	private boolean t = false;
	public Directory(Path path, List<File> files) {
		super(path);
		this.files = files;
	}

	@Override
	public Iterator<File> iterator() {
		return new Iterator<File>() {

			final int size = files.size();

			@Override
			public boolean hasNext() {
				if (el <= size) {
					return true;
				}
				return false;
			}

			@Override
			public File next() throws NoSuchElementException {
              el++;
              if(el > size + 1) throw new NoSuchElementException("hait");
              if(el == 1) return new Directory(getPath(),files);
              else
			  {
			  	if(files.get(el - 2).isRegularFile()) return files.get(el  - 2);
			  	else
				{
					if(!files.get(el - 2).iterator().hasNext()) return files.get(el - 2);
					el -- ;
					File file = files.get(el - 1).iterator().next();
					if(!files.get(el - 1).iterator().hasNext()) el++;
					return file;
				}
			  }

			}


		};
	}
	@Override
	public int getHeight() {
		if(files.size() == 0) return 0;
		int Mx = Integer.MIN_VALUE;
        for (File f:files)
		{
			int comp = f.getHeight();
			if(comp > Mx) Mx = comp;
		}
        return Mx + 1;
	}

	@Override
	public boolean isRegularFile() {
		return false;
	}

	public List<File> getFiles() {
		return files;
	}

}
