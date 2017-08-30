package CloneableExample;

public class Client {
    public static void main(String[] args) {
//        mehthod1();
        //产生一个对象
        Thing thing = new Thing();
        //设置一个值
        thing.setValue("张三");
        //拷贝一个对象
        Thing cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getValue());
    }

    //clone构造方法只会走一次
    private static void mehthod1() {
        //产生一个对象
        Thing thing = new Thing();
        //拷贝一个对象
        Thing cloneThing = thing.clone();
    }
}