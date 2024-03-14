/**
 * @Author: Chenxy
 * @Date: 2023/2/15  19:48
 * @Version 1.0
 */

/**
 * 演员类
 */
public class Performer {
    /**
     * 行业分类
     */
    private String category;

    /**
     * 地区
     */
    private String area;

    /**
     * 构造函数
     * @param category
     * @param area
     */
    public Performer(String category,String area){
        this.category=category;
        this.area=area;
    }
    /**
     * 表演
     */
    public void perform(){
        System.out.print("表演");
    }
}
