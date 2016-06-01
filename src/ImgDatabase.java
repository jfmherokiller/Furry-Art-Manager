
import java.io.File;
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
    public void AddImage(String Imgfilepath,String TagsFileLoc,String ImgTitle, String DescriptionFileLoc,String theAuthor) {
        UtilityFunctions.MakeAuthDir(theAuthor);

        Images.add( new ImageData(Imgfilepath,null,ImgTitle,DescriptionFileLoc,theAuthor));
    }

    public LinkedList<ImageData> GetImages()
    {
        return Images;
    }
    public void SetImages(LinkedList<ImageData> dtb)
    {
        Images = dtb;
    }
    public void TestAdd()
    {
        for (int i = 0; i < 10; i++) {
            AddImage( i+"",i+"",i+"",i+"","Penis");
        }

    }
}
