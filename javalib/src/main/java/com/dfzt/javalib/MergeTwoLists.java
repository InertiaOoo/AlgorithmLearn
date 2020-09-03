package com.dfzt.javalib;

import com.dfzt.javalib.struck.ListNode;

public class MergeTwoLists {

    public static void main(String[] args) {


    }


    public static ListNode mergeTwoLists1(ListNode l1, ListNode l2) {

        ListNode preHead = new ListNode(-1);
        ListNode pre = preHead;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                pre.next = l1;
                l1 = l1.next;
            } else {
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }

        pre.next = l1 != null ? l1 : l2;

        return preHead.next;
    }

    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2){

        ListNode temp = null;

        while (l1 != null && l2 != null) {




        }

        return temp;
    }

    //递归
    public ListNode mergeTwoLists3(ListNode l1, ListNode l2) {
        if(l1==null){    //递归返回条件，某一链表已空
            return l2;
        }else if(l2==null){
            return l1;
        }

        if(l1.val<=l2.val){
            l1.next = mergeTwoLists3(l1.next,l2);   //接上递归后的有序链表
            return l1;       //返回有序链表
        }else{
            l2.next = mergeTwoLists2(l2.next,l1);
            return l2;    //同上
        }

    }

}
