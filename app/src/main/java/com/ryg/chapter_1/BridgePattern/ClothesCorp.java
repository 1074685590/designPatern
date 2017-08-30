package com.ryg.chapter_1.BridgePattern;

/**
 * @author cbf4Life cbf4life@126.com
 *         I'm glad to share my knowledge with you all.
 *         服装公司，这个行当现在不怎么样
 */
public class ClothesCorp extends Corp {
    public ClothesCorp(Product product) {
        super(product);
    }

    public ClothesCorp() {
    }

    //服装公司生产的就是衣服了
    protected void produce() {
        System.out.println("服装公司生产衣服...");
    }

    //服装公司买服装，可只卖服装，不买穿衣服的模特
    protected void sell() {
        System.out.println("服装公司出售衣服...");
    }

    //服装公司不景气，但怎么说也是赚钱行业也
    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司赚小钱...");
    }
}