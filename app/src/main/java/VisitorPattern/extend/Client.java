package VisitorPattern.extend;

import VisitorPattern.advance.Employee;

import static VisitorPattern.advance.Client.mockEmployee;

/**
 * @author cbf4Life cbf4life@126.com
 *         I'm glad to share my knowledge with you all.
 */
public class Client {
    public static void main(String[] args) {
        IVisitor visitor = new Visitor();
        for (Employee emp : mockEmployee()) {
            emp.accept(visitor);
        }
        System.out.println(" 本公司的月工资总额是： " + visitor.getTotalSalary());
    }
}