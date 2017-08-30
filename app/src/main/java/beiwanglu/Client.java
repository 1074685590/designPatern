package beiwanglu;

public class Client {
    public static void main(String[] args){
        //1.创建一个对象
        Originator originator = new Originator();  
        originator.setState("状态1");  
        System.out.println("初始状态:"+originator.getState());
        //2.根据这个对象, 对这个对象进行备份
        Caretaker caretaker = new Caretaker();  
        caretaker.setMemento(originator.createMemento());
        //3.修改原始对象的值
        originator.setState("状态2");  
        System.out.println("改变后状态:"+originator.getState());
        //4.恢复到原始状态
        originator.restoreMemento(caretaker.getMemento());  
        System.out.println("恢复后状态:"+originator.getState());  
    }
    /**
     * 总结:借助了两个中间对象,来完成备忘录模式, 一个用于复制当前对象,
     * 一个用于管理
     */
}  