package com.example.demopracticeproject.Entity;

public class News {
    private Integer id;//新闻id
    private String title;//新闻标题
    private String type;//新闻类型
    private Integer user_id;//作者id
    private String link;//新闻连接
    private String cover;//新闻封面连接
    private Integer downloads;//下载量
    private String gmt_create;//创建时间
    private String create_by;//创建操作人
    private String gmt_update;//更新时间
    private String update_by;//更新操作人

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    public String getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(String gmt_create) {
        this.gmt_create = gmt_create;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public String getGmt_update() {
        return gmt_update;
    }

    public void setGmt_update(String gmt_update) {
        this.gmt_update = gmt_update;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", user_id=" + user_id +
                ", link='" + link + '\'' +
                ", cover='" + cover + '\'' +
                ", downloads=" + downloads +
                ", gmt_create='" + gmt_create + '\'' +
                ", create_by='" + create_by + '\'' +
                ", gmt_update='" + gmt_update + '\'' +
                ", update_by='" + update_by + '\'' +
                '}';
    }
}
