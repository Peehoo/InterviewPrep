package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LevelOrderBottom {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        levelOrderBottom(lists, root, 0);
        Collections.reverse(lists);
        return lists;
    }
	
	public static void levelOrderBottom(List<List<Integer>> lists, TreeNode root, int level){
        if(root==null){ return;}
        List<Integer> list = null;
        if(lists.size()==level){
            list = new LinkedList<Integer>();
            lists.add(level, list);
        }
        list = lists.get(level);
        list.add(root.val);
        levelOrderBottom(lists, root.left, level+1);
        levelOrderBottom(lists, root.right, level+1);
    }
}
