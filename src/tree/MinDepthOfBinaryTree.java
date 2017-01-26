package tree;

public class MinDepthOfBinaryTree {
	public static void main(String[] args){
		TreeNode root = new TreeNode(4);
		minDepth(root);
	}
	public static int minDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		else{
			int minTillNow = 0;
			minDepth(root, minTillNow, 0);
			System.out.println(minTillNow);
			return minTillNow;
		}
	}
	
	public static void minDepth(TreeNode root, int minTillNow, int count){
		minTillNow = 5;
	}
}
