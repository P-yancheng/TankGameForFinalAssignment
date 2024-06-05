package com.cugb.util;

import java.awt.*;

/**
 * 工具类
 */
public class MyUtil {
    private  MyUtil(){}

    /**
     * 得到指定的区间的随机数
     * @param min 区间最小值，包含
     * @param max 区间最大值，不包含
     * @return 随机数
     */
    public static final int getRandomNumber(int min, int max){
        return (int)(Math.random()*(max-min)+min);
    }

    /**
     * 得到随机的颜色
     * @return
     */
    public static final Color getRandomColor(){
        int red = getRandomNumber(0,256);
        int blue = getRandomNumber(0,256);
        int green = getRandomNumber(0,256);
        return new Color(red,green,blue);
    }

    /**
     * 判断一个点是否在某一个正方形的内部，
     * @param rectX 正方形的中心点的x坐标
     * @param rectY 正方形的中心点的y坐标
     * @param radius 正方形的边长的一半
     * @param pointX 点的x坐标
     * @param pointY 点的y坐标
     * @return 如果点在正方形内部，返回true，否则返回false
     */
    public static final boolean isCollide(int rectX,int rectY,int radius,int pointX,int pointY){
        //正方形中心点 和 点 的 x y 轴 的距离
        int disX = Math.abs(rectX - pointX);
        int disY = Math.abs(rectY - pointY);
        if (disX <= radius && disY <= radius)
            return true;
        return false;
    }

    /**
     * 根据图片的资源路径创建加载图片对象
     * @param path 图片资源的路径
     * @return
     */
    public static final Image createImage(String path){
        return Toolkit.getDefaultToolkit().createImage(path);
    }

    private static final String[] NAMES = {
    		"阿思日","梓棋",
    		"传杰","彦丞","昕畅"
    };

    private static final String[] MODIFIY = {
            "可爱","傻傻","萌萌","羞羞","笨笨","呆呆","美丽","聪明",
            "胖乎乎","粉嫩嫩","白胖胖","漂亮","可爱","聪明","懂事","乖巧","淘气",
            "淘气","调皮","顽皮","天真","可爱","单纯","纯洁",
            "纯真","温润","好奇"
    };

    /**
     * 得到一个随机的名字
     * @return
     */
    public static final String getRandomName(){
        return MODIFIY[getRandomNumber(0,MODIFIY.length)] + "的" +
                NAMES[getRandomNumber(0,NAMES.length)];
    }
}
