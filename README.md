Files are organized in trees (*): Directories can contain regular files and directories. We now want to model this structure in Java. For this purpose we define our own classes File,Directory and RegularFile. File is an abstract class from whichDirectory and RegularFile inherit. The class Directory is used to represent directories, the class RegularFile represents regular files, i.e. files that are not directories. A Directory manages a list offiles of Files contained in the directory.

Read in file tree
 read in directory tree 0 of 1 tests passing
Implement the method public static File toFileRepresentation (Path path) in the class FileUtil. The method is intended to provide a tree representation of the directory structure which takes the file at the path path as its parameter. Use objects of classes RegularFile and Directory for this purpose. If the file at the path path is a regular file, a representation of this file should be returned. If it is a directory, a representation of the entire file tree from this directory should be returned; the directory with path path should be the root of the tree. If an IOException occurs, you can simply throw it.
Traverse the file tree
abstract class File implements theIteratble <File>interface so that files can be iterated easily. The necessary iterator method should be implemented in the classes Directory and RegularFile.

 Iterator for regular files 0 of 1 tests passing
Implement the method iterator () of the interface Iterable <File> inside the class RegularFile. The iterator should only iterate over the regular file itself. If next () is called on the iterator, if all elements have already been iterated, a NoSuchElementException must be thrown.

 Iterator for file tree 0 of 1 tests passing
Implement the method iterator () of the interface Iterable <File> inside the class Directory. The method is intended to provide an iterator that iterates over the directory itself, as well as all files directly and indirectly contained (both regular files and directories). Which means, if necessary, the iterator must also iterate over the elements in the (direct and indirect) subdirectories. The iteration order is up to you. If next () is called on the iterator, if all elements have already been iterated, a NoSuchElementException must be thrown.

Determine the height of a tree
[task] Height of the directory tree Implement the method public int getHeight () in Directory. The method should calculate and return the height of the tree. The object on which it is called is the root. The object is already the root of a tree; you do not need to access the file system here. The height of a file tree with a regular file as the root is 0 (already implemented). The height of a file tree with a directory as its root that has no children (i.e. a directory with no content) is 0. The height of a file tree with a directory with children is equal to 1 plus the maximum height of the tree that one of the children directory have as the root.
(*) You can assume that the directories to be viewed contain no symbolic links.

Hints:
You can see the documentation of Iterable-Interfaces.
You might need to use method Files.list(...) Returns a Stream, the elements of which are the entries in the directory.
The height of the file tree for which your program must work is not greater than 1000.
