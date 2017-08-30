package CloneableExample;

import java.util.ArrayList;

public class Thing implements Cloneable {
    //定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<String>();

    public Thing() {
        System.out.println("构造函数被执行了...");
    }

    @Override
    public Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
            thing.arrayList = (ArrayList<String>)this.arrayList.clone(); //加了这一句就是深拷贝
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
    //设置HashMap的值
    public void setValue(String value){
        this.arrayList.add(value);
    }
    //取得arrayList的值
    public ArrayList<String> getValue(){
        return this.arrayList;
    }
}