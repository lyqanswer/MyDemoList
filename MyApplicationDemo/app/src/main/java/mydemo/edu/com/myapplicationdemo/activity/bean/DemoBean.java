package mydemo.edu.com.myapplicationdemo.activity.bean;

/**
 * Created by Administrator on 2017/9/30.
 */

public class DemoBean {
    public String name;
    public Class<?> clazz;

    public DemoBean(String name, Class<?> clazz) {
        this.name = name;
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return name;
    }
}
