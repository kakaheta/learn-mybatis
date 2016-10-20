package con.learn.mybatis.service;

import con.learn.mybatis.domain.VideoInfo;

import java.util.List;

/**
 * Created by yimeng on 2016/10/19.
 */
public interface VideoInfoService {
    VideoInfo getVideoInfo();

    List<VideoInfo> getAllVideoIds();
}
