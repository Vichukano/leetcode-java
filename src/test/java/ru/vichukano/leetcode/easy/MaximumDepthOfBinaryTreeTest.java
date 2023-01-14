package ru.vichukano.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vichukano.leetcode.easy.MaximumDepthOfBinaryTree.TreeNode;

class MaximumDepthOfBinaryTreeTest {

    @Test
    void maxDepthTest() {
        var one = new TreeNode(15);
        var two = new TreeNode(7);
        var three = new TreeNode(20, one, two);
        var four = new TreeNode(9);
        var root = new TreeNode(3, four, three);
        var testTarget = new MaximumDepthOfBinaryTree();
        Assertions.assertEquals(3, testTarget.maxDepth(root));
        var leftNode = new TreeNode(
                4,
                new TreeNode(
                        -7,
                        new TreeNode(
                                -7
                        ),
                        null
                ),
                new TreeNode(
                        -6,
                        new TreeNode(
                                -5,
                                new TreeNode(
                                        -4
                                ),
                                null
                        ),
                        null
                )
        );
        var newRoot = new TreeNode(3, leftNode, new TreeNode(5));
        Assertions.assertEquals(5, testTarget.maxDepth(newRoot));
    }

}
