/**
 * @Author: Chenxy
 * @Date: 2022/12/21  19:20
 * @Version 1.0
 */

/**
 * 矩形
 */
public class Rectangle {

    /**
     * 长度
     */
    private int length;

    /**
     * 宽度
     */
    private int width;

    /**
     * 设置举行的长度和宽度
     * @param length
     * @param width
     */
    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }

    /**
     * 计算矩形的面积
     * @return
     */
    public int area(){
        return this.length*this.width;
    }
}
