import org.yaml.snakeyaml.Yaml;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

/**
 * Created by jfmmeyers on 5/31/16.
 */
public class YamlFuncts {
    public static void SerializeImageData()
    {
        Yaml mydata = new Yaml();
        UtilityFunctions.PrintLineToConsole(mydata.dump(ImgDatabase.GetImgDatabase().GetImages()));
    }
    public static void SaveData() throws IOException {
        Yaml mydata = new Yaml();
        FileWriter theyamlfile = new FileWriter(Paths.get(UtilityFunctions.GetOperatingRepo().toString(),"Art.yml").toString());
        mydata.dump(ImgDatabase.GetImgDatabase().GetImages(),theyamlfile);
    }
}
