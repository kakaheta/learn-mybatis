package con.learn.mybatis.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.File;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.NotDirectoryException;

/**
 * Created by yimeng on 2016/10/20.
 */
public class FileUtils {

    public static final Log logger = LogFactory.getLog(FileUtils.class);

    public static boolean createFile(String destFileName) throws Exception {
        File file = new File(destFileName);

        if (file.exists()) {
            throw new FileAlreadyExistsException(destFileName);
        }

        if (destFileName.endsWith(File.separator)) {
            throw  new NotDirectoryException(destFileName);
        }

        // 判断目标文件目录是否存在
        if(!file.getParentFile().exists()) {
            logger.info("目标文件所在目录不存在，正在创建。。。");
            if(!file.getParentFile().mkdirs()) {
                return false;
            }
        }

       if (file.createNewFile()) {
           return true;
       } else {
           return false;
       }
    }

}
