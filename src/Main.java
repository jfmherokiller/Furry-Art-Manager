/**
 * Created by jfmmeyers on 5/31/16.
 */
public class Main {
    public static void main(String[] args) {
        ImgDatabase imgDatabase = ImgDatabase.GetImgDatabase();
        imgDatabase.TestAdd();
        YamlFuncts.SerializeImageData();

    }
}
