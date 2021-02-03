package com.icbc.creational.simplefactory;

import com.sun.deploy.util.StringUtils;

/**
 *
 * @Author X-Dragon <cnxielong@163.com>
 * @Date: ${DATE} ${HOUR}:${MINUTE}
 */
public class VideoFactory {
    public Video getVideo(String videoType){
        if(null == videoType){
            return null;
        }else if("java".equalsIgnoreCase(videoType)){//忽略
            return new JavaVideo();
        }else if("Python".equalsIgnoreCase(videoType)){//忽略
            return new PythonVideo();
        }
        return null;
    }
}
