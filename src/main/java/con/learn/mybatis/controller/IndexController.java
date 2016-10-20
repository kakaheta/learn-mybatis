package con.learn.mybatis.controller;

import con.learn.mybatis.domain.VideoInfo;
import con.learn.mybatis.service.VideoInfoService;
import con.learn.mybatis.utils.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by yimeng on 2016/10/18.
 */
@Controller
public class IndexController {

    @Autowired
    private VideoInfoService videoInfoService;

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    @ResponseBody
    public String welcome() {
        return videoInfoService.getVideoInfo().getVideoName();
    }

    public void putAllVideoIdsToFile(){
        String filename = "videoIds.txt";
        try {
            FileUtils.createFile(filename);
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<VideoInfo> videoIdList = videoInfoService.getAllVideoIds();


    }

}
