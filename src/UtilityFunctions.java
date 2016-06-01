import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by jfmmeyers on 5/31/16.
 */
public class UtilityFunctions {
    public static String GetFileNameWithoutExtension(String ImgLoc)
    {
        String FileName = Paths.get(ImgLoc).getFileName().toString();
        return FileName.substring(0,FileName.length()-3);
    }
    public static Path GetAuthDir( String author)
    {
        String location = ClassLoader.getSystemClassLoader().getResource(".").getPath();
        return Paths.get(location,"FurArtRepo",author);
    }
    public static Path GetNewImageLocation(String ImageLoc,String Author)
    {
        Path imagename = Paths.get(ImageLoc).getFileName();
        return Paths.get(GetAuthDir(Author).toString(),imagename.toString());
    }
    public static void MoveImage(String ImgLoc,String Author) throws IOException {

        Files.copy(Paths.get(ImgLoc),GetNewImageLocation(ImgLoc,Author), StandardCopyOption.ATOMIC_MOVE);
    }
    public static void MakeAuthDir( String AuthorLoc)
    {
        GetAuthDir(AuthorLoc).toFile().mkdir();
    }
    public static void PrintLineToConsole(String line)
    {
        System.out.println(line);
    }
}
