import org.yaml.snakeyaml.Yaml;

/**
 * Created by jfmmeyers on 5/31/16.
 */
public class YamlFuncts {
    public static void SerializeImageData()
    {
        Yaml mydata = new Yaml();
        UtilityFunctions.PrintLineToConsole(mydata.dump(ImgDatabase.GetImgDatabase().GetImages()));
    }
}
