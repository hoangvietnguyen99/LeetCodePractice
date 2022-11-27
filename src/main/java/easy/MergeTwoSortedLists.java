/**
 * 
 */
package easy;

import easy.model.ListNode;

/**
 * @author hoang
 *
 */
public class MergeTwoSortedLists {

  /**
   * @param args
   */
  public static void main(String[] args) {
    ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
    ListNode list3 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
    ListNode result = mergeTwoLists(list1, list3);
  }

  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode temp;
    ListNode firstValue;
    if (list1 != null && list2 != null) {      
      if (list1.val <= list2.val) {
        temp = list1;
        list1 = list1.next;
      } else {
        temp = list2;
        list2 = list2.next;
      }
    } else {
      if (list1 != null) {
        return list1;
      } else if (list2 != null) {
        return list2;
      } else {
        return null;
      }
    }
    firstValue = temp;
    while (temp != null) {
      if (list1 != null && list2 != null) {
        if (list1.val <= list2.val) {
          temp.next = list1;
          list1 = list1.next;
        } else {
          temp.next = list2;
          list2 = list2.next;
        }
      } else {
        if (list1 != null) {
          temp.next = list1;
          break;
        } else if (list2 != null) {
          temp.next = list2;
          break;
        }
      }
      temp = temp.next;
    }
    return firstValue;
  }

}

