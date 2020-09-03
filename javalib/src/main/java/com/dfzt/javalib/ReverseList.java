package com.dfzt.javalib;

import com.dfzt.javalib.struck.ListNode;

import java.util.HashMap;
import java.util.Map;

public class ReverseList {


    public static void main(String[] args) {

        int[] testNums = new int[]{2, 7, 11, 15};

        int testTarget = 18;


    }

    private static ListNode reverseList(ListNode head) {//迭代
        ListNode pre = null;
        ListNode next;

        while (head.next != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;//移动一位，准备进入下一轮循环
        }
        return pre;

    }

    public ListNode reverseList2(ListNode head) { //递归
        if (head == null || head.next == null) return head;  //当第一个节点不为空时，返回的就是最后一个节点
        ListNode p = reverseList(head.next);    //p始终指向最后一个节点
        head.next.next = head;  //反转
        head.next = null;  //移除原方向
        return p;  //返回的始终是最后一个节点
    }

}
