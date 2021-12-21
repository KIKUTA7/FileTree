package filetree;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            Path p = Path.of("C:\\Users\\beqak\\OneDrive\\Desktop\\folder");
            Directory d = (Directory) FileUtil.toFileRepresentation(p);
            Iterator<File> it = d.iterator();
            System.out.println(it.next());
            System.out.println(it.next());
            System.out.println(it.next());
            System.out.println(it.next());
            System.out.println(it.next());
            System.out.println(it.next());
            System.out.println(it.next());
            System.out.println(it.next());
            System.out.println(d.getHeight());
            RegularFile reg = new RegularFile(Path.of("C:\\Users\\beqak\\OneDrive\\Desktop\\folder\\8.txt"));
            Iterator<File> it2 = reg.iterator();
            System.out.println(it2.hasNext());
            System.out.println(it2.next());
            System.out.println(it2.hasNext());
            if(d != null)      System.out.println(d.getFiles().size());
        }
        catch (IOException e )
        {
            e.printStackTrace();
        }
    }
}
