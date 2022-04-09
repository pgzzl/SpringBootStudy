package com.mark.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
public class SciNews implements Serializable {
    private String id;
    private String title;
    private String type;
    private String userId;
    private String link;
    private String cover;
    private Integer downloads;
    private Timestamp gmtCreate;
    private String createBy;
    private  Timestamp gmtUpdate;
    private String updateBy;

    public SciNews(String id, String title, String type, String userId, String link, String cover, Integer downloads, String createBy, String updateBy) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.userId = userId;
        this.link = link;
        this.cover = cover;
        this.downloads = downloads;
        this.createBy = createBy;
        this.updateBy = updateBy;
    }
}
