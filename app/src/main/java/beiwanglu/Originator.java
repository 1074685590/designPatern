package beiwanglu;

class Originator { //内容原创者
    private String state = "";   //需要被备份的内容
      
    public String getState() {  
        return state;  
    }  
    public void setState(String state) {  
        this.state = state;  
    }  
    public Memento createMemento(){  //创建一个备忘录,将需要保存的内容传递给另外一个备份对象
        return new Memento(this.state);  
    }  
    public void restoreMemento(Memento memento){  //恢复备忘录
        this.setState(memento.getState());  
    }  
}
class Memento { //备忘录模式
    private String state = "";
    public Memento(String state){
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
}
class Caretaker {  //管理员
    private Memento memento;
    public Memento getMemento(){
        return memento;
    }
    public void setMemento(Memento memento){
        this.memento = memento;
    }
}