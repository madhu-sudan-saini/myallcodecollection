#include<iostream>
#include<vector>
#include<queue>
using namespace std;

class Node {
public:
    int data;
    Node* left;
    Node* right; 

    Node(int value) {
        data = value;
        left = NULL;
        right = NULL;
    }
};

static int idx = -1;
Node* buildTree(vector<int> preorder) {
    idx++;
    if (idx >= preorder.size() || preorder[idx] == -1) {
        return NULL;
    }
    Node* root =  new Node(preorder[idx]);
    root->left = buildTree(preorder);
    root->right = buildTree(preorder); 
    return root;
}

//preorder traversal
void preOrderTraversal(Node*root)
{
    if(root==NULL)
    {
        return;
    }
    cout<<root->data<<" ";
    preOrderTraversal(root->left);
    preOrderTraversal(root->right);
}

//InorderTraversal
void InOrderTraversal(Node*root)
{
    if(root==NULL)
    {
        return;
    }
    InOrderTraversal(root->left);
    cout<<root->data<<" ";
    InOrderTraversal(root->right);
}
 //postOrderTraversal
 void postOrderTraversal(Node*root)
 {
    if(root==NULL)
    {
        return;
    }
    postOrderTraversal(root->left);
    postOrderTraversal(root->right);
    cout<<root->data<<" ";
 }   

 //levelOrderTraversal
void levelOrderTraversal(Node* root) {
    if (root == NULL) 
    return;

    queue<Node*> q;
    q.push(root);

    while (!q.empty()) {
        int levelSize = q.size();  

        
        for (int i = 0; i < levelSize; i++) {
            Node* curr = q.front();
            q.pop();

            cout << curr->data << " ";

            if (curr->left != NULL) {
                q.push(curr->left);
            }
            if (curr->right != NULL) {
                q.push(curr->right);
            }
        }
        cout << endl;
    }
}



int main() {
    vector<int>preorder = {1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1};

    Node* root = buildTree(preorder);

    // cout << "Preorder Traversal: ";
    // preOrderTraversal(root);
    // cout << endl;

    // cout << "Inorder Traversal: ";
    // InOrderTraversal(root);
    // cout << endl;

    // cout << "Postorder Traversal: ";
    // postOrderTraversal(root);
    // cout << endl;

    cout << "Level Order Traversal: "<<endl;
    levelOrderTraversal(root);
    cout << endl;

    return 0;
}

