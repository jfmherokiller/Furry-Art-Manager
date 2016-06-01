import java.io.IOException;

/**
 * Created by jfmmeyers on 5/31/16.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ImgDatabase imgDatabase = ImgDatabase.GetImgDatabase();
        imgDatabase.TestAdd();
        YamlFuncts.SerializeImageData();
        YamlFuncts.SaveData();

    }
}
