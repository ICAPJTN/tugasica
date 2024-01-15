<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tree Visualization</title>
    <style>
        /* Style untuk tree */
        .node {
            display: inline-block;
            width: 50px;
            height: 50px;
            line-height: 50px;
            text-align: center;
            border: 1px solid #000;
            margin: 0 10px;
        }
    </style>
</head>
<body>
    <h2>Balanced Tree Visualization</h2>
    
    <div id="balancedTree"></div>

    <script>
        class TreeNode {
            constructor(key) {
                this.key = key;
                this.left = null;
                this.right = null;
            }
        }

        function height(node) {
            if (node === null) {
                return 0;
            }
            return 1 + Math.max(height(node.left), height(node.right));
        }

        function isBalanced(root) {
            if (root === null) {
                return true;
            }
            const leftHeight = height(root.left);
            const rightHeight = height(root.right);
            if (Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
                return true;
            }
            return false;
        }

        // Contoh penggunaan
        const root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        const balancedTreeDiv = document.getElementById('balancedTree');

        if (isBalanced(root)) {
            balancedTreeDiv.innerHTML = '<div class="node">1</div><div class="node">2</div><div class="node">3</div><div class="node">4</div><div class="node">5</div>';
        } else {
            balancedTreeDiv.innerHTML = '<p>Tree is not balanced</p>';
        }
    </script>
</body>
</html>
