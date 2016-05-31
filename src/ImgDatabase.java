
import java.util.LinkedList;

/**
 * Created by jfmmeyers on 5/31/16.
 */
public class ImgDatabase {
    private static ImgDatabase Dtbinstance;
    private LinkedList<ImageData> Images;
    private ImgDatabase() {
        Images = new LinkedList<ImageData>();

    }
    public static ImgDatabase GetImgDatabase() {
        if (Dtbinstance == null)
        {
            Dtbinstance = new ImgDatabase();
        }
        return Dtbinstance;
    }
    public void AddImage(String Imgfilepath,String TagsFileLoc,String ImgTitle, String DescriptionFilePath,String theAuthor) {

    }
}
