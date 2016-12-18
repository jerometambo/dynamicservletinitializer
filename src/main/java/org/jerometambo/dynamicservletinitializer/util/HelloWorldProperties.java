package org.jerometambo.dynamicservletinitializer.util;

import java.io.IOException;
import java.util.Properties;

/**
 * HeloWorld project properties file.
 */
public class HelloWorldProperties extends Properties {

    public HelloWorldProperties() {
        try {
            load(this.getClass().getResourceAsStream("/helloworld.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return the upload size limit described in the properties file.
     */
    public int getUploadSizeLimit() {
        return Integer.valueOf((String) get("UPLOAD_SIZE_LIMIT"));
    }

    /**
     * @return the upload size limit described in the properties file.
     */
    public String getUploadTempDir() {
        return (String) get("UPLOAD_TEMP_DIR");
    }

}
