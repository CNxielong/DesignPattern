package com.icbc.creational.simplefactory;

/**
 * @Auther: XDragon
 * @Date: 2021/2/3/003 17:17
 * @Email:cnxielong@gmail.com
 */
public class TestSimple {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("JAVA");
        video.getVideo();
    }
}
