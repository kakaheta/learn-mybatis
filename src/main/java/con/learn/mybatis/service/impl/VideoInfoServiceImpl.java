package con.learn.mybatis.service.impl;

import con.learn.mybatis.domain.VideoInfo;
import con.learn.mybatis.mapper.VideoInfoMapper;
import con.learn.mybatis.service.VideoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yimeng on 2016/10/19.
 */
@Service
public class VideoInfoServiceImpl implements VideoInfoService {

    @Autowired
    private VideoInfoMapper videoInfoMapper;

    @Override
    public VideoInfo getVideoInfo() {
        return videoInfoMapper.getOne();
    }

    @Override
    public List<VideoInfo> getAllVideoIds() {
        return videoInfoMapper.getAllVideoIds();
    }
}
