/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndStrings;

/**
 *
 * @author Joseph
 */
public class TreeWithMinimalHeight {
  TreeNode BST(int[] array)
{
	Return createBST(array, 0, array.length - 1);
}

TreeNode createBST(int[] array, int start, int end)
{
	If (end < start)
	{
		Return null;
	}

	Int mid = (start+end) / 2;
	TreeNode root = new TreeNode(arr[mid]);
	Root.left = createBST(array, start, mid-1);
	Root.right = createBST(array, mid + 1, end);
	Return root;
}
  
}
