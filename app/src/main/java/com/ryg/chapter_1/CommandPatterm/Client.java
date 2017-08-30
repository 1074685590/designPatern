package com.ryg.chapter_1.CommandPatterm;

/**
 * @author cbf4Life cbf4life@126.com
 *         I'm glad to share my knowledge with you all.
 *         客户就是甲方，给我们钱的一方，是老大
 */
public class Client {
    public static void main(String[] args) {
//        method1();
//        method2();
        method3();

    }

    private static void method3() {
        //定义我们的接头人
        Invoker xiaoSan = new Invoker(); //接头人就是我小三
        //客户要求增加一项需求
        System.out.println("-------------客户要求增加一项需求-----------------");
        //客户给我们下命令来
//        Command command = new AddRequirementCommand();
        Command command = new DeletePageCommand();
        //接头人接收到命令
        xiaoSan.setCommand(command);
        //接头人执行命令
        xiaoSan.action();
    }

    private static void method2() {
        //首先客户找到美工组说，过来谈页面，并修改
        System.out.println("-------------客户要求删除一个页面-----------------");
        Group pg = new PageGroup();
        //找到需求组
        pg.find();
        //增加一个需求
        pg.delete();
        //要求变更计划
        pg.plan();
    }

    private static void method1() {
        //首先客户找到需求组说，过来谈需求，并修改
        System.out.println("-------------客户要求增加一个需求-----------------");
        Group rg = new RequirementGroup();
        //找到需求组
        rg.find();
        //增加一个需求
        rg.add();
        //要求变更计划
        rg.plan();
    }
}