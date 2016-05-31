import java.io.File;
import java.util.LinkedList;

/**
 * Created by jfmmeyers on 5/31/16.
 */
public class ImageData {
    private File ImageFile;
    private LinkedList<String> Tags;
    private String Title;
    private String Description;
    private String Author;
    public ImageData(File thefile, LinkedList<String> _tags,String ImageTitle,String ImgDescription,String _author)
    {
        ImageFile = thefile;
        Tags = _tags;
        Title = ImageTitle;
        Description = ImgDescription;
        Author = _author;
    }

}
