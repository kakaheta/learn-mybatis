package con.learn.mybatis.mapper;

import con.learn.mybatis.domain.VideoInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yimeng on 2016/10/19.
 */
public interface VideoInfoMapper {

    @Select("select video_id, video_name from video_info order by video_id asc limit 1")
    VideoInfo getOne();

    @Select("select video_id from video_info")
    List<VideoInfo> getAllVideoIds();
}
