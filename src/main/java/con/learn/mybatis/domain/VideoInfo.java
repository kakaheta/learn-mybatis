package con.learn.mybatis.domain;

/**
 * Created by yimeng on 2016/10/19.
 */
public class VideoInfo {

    private Long videoId;

    private String videoName;

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }
}
