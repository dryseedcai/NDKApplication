package dryseed.ndkapplication;

/**
 * Created by caiminming on 2017/10/11.
 */

public class NdkJniUtils {
    static {
        System.loadLibrary("DryseedJniLibName");   //defaultConfig.ndk.moduleName
    }

    public native String getCLanguageString();
}
