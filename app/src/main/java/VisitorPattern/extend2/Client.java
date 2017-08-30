package VisitorPattern.extend2;

import VisitorPattern.advance.Employee;

import static VisitorPattern.advance.Client.mockEmployee;

/**
 * @author cbf4Life cbf4life@126.com
 *         I'm glad to share my knowledge with you all.
 */
public class Client {
    public static void main(String[] args) {
        // 展示报表访问者
        IShowVisitor showVisitor = new ShowVisitor();
        // 汇总报表的访问者
        ITotalVisitor totalVisitor = new TotalVisitor();
        for (Employee emp : mockEmployee()) {
            emp.accept(showVisitor); // 接受展示报表访问者
            emp.accept(totalVisitor);// 接受汇总表访问者
        }
        // 展示报表
        showVisitor.report();
        // 汇总报表
        totalVisitor.totalSalary();
    }


}