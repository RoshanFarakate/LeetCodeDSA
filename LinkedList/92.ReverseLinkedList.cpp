/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseBetween(ListNode* head, int m, int n) 
    {
        if(m == n)
            return head;
        
        if(m > 1)
        {
            head->next = reverseBetween(head->next, m - 1, n - 1);
            return head;
        }
        else
        {
            auto tailNode = reverseBetween(head->next, 1, n - 1);
            auto tailNodeNext = head->next->next;
            
            head->next->next = head;
            head->next = tailNodeNext;

            return tailNode;
        }
        
    }
};
