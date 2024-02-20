package org.zerock.mreview.dto;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UploadResultDTO implements Serializable {
    private String fileName;
    private String uuid;
    private String folderPath;

    public String getImageURL() {
        return URLEncoder.encode(folderPath + "/" + uuid + "_" + fileName, StandardCharsets.UTF_8);
    }

    public String getThumbnailURL() {
        return URLEncoder.encode(folderPath + "/s_" + uuid + fileName, StandardCharsets.UTF_8);
    }
}
