import java.io.File;
import java.util.LinkedList;

/**
 * Created by jfmmeyers on 5/31/16.
 */
public class ImageData {
    private String ImageFile;
    private LinkedList<String> Tags;
    private String Title;
    private String Description;
    private String Author;
    public ImageData(String thefile, LinkedList<String> _tags,String ImageTitle,String ImgDescription,String _Author)
    {
        ImageFile = thefile;
        Tags = _tags;
        Title = ImageTitle;
        Description = ImgDescription;
        Author = _Author;
    }

    public String getDescription() {
        return Description;
    }

    public String getImageFile() {
        return ImageFile;
    }

    public LinkedList<String> getTags() {
        return Tags;
    }

    public String getTitle() {
        return Title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setImageFile(String imageFile) {
        ImageFile = imageFile;
    }

    public void setTags(LinkedList<String> tags) {
        Tags = tags;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
