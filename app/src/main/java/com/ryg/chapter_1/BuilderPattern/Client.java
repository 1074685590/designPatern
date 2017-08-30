package com.ryg.chapter_1.BuilderPattern;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 *         I'm glad to share my knowledge with you all.
 *         最终客户开始使用这个模型
 */
public class Client {
    public static void main(String[] args) {
//        method1();
//        benzMethod();
//        bmwMethod();
        finalMehtod();
    }

    private static void finalMehtod() {
        Director director = new Director();
        //1W辆A类型的奔驰车
        for(int i=0;i<10000;i++){
            director.getABenzModel().run();
        }
        //100W辆B类型的奔驰车
        for(int i=0;i<1000000;i++){
            director.getBBenzModel().run();
        }
        //1000W量C类型的宝马车
        for(int i=0;i<10000000;i++){
            director.getCBMWModel().run();
        }
    }

    private static void bmwMethod() {
        ArrayList<String> sequence = new ArrayList<String>(); //存放run的顺序
        sequence.add("engine boom"); //客户要求，run的时候时候先发动引擎
        sequence.add("start"); //启动起来
        sequence.add("stop"); //开了一段就停下来
        //按照同样的顺序，我再要一个宝马
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmw = (BMWModel)bmwBuilder.getCarModel();
        bmw.run();
    }

    private static void benzMethod() {
    /*
* 客户告诉牛叉公司，我要这样一个模型，然后牛叉公司就告诉我老大
* 说要这样一个模型，这样一个顺序，然后我就来制造
*/
        ArrayList<String> sequence = new ArrayList<String>(); //存放run的顺序
        sequence.add("engine boom"); //客户要求，run的时候时候先发动引擎
        sequence.add("start"); //启动起来
        sequence.add("stop"); //开了一段就停下来
        //要一个奔驰车：
        BenzBuilder benzBuilder = new BenzBuilder();
        //把顺序给这个builder类，制造出这样一个车出来
        benzBuilder.setSequence(sequence);
        //制造出一个奔驰车
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        //奔驰车跑一下看看
        benz.run();
    }

    private static void method1() {
    /*
    * 客户告诉牛叉公司，我要这样一个模型，然后牛叉公司就告诉我老大
    * 说要这样一个模型，这样一个顺序，然后我就来制造
    */
        BenzModel benz = new BenzModel();
        ArrayList<String> sequence = new ArrayList<String>(); //存放run的顺序
        sequence.add("engine boom"); //客户要求，run的时候时候先发动引擎
        sequence.add("start"); //启动起来
        sequence.add("stop"); //开了一段就停下来
        //然后我们把这个顺序给奔驰车：
        benz.setSequence(sequence);
        benz.run();
    }
}