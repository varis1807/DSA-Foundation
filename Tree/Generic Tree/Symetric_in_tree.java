public class Symetric_in_tree {
    public static boolean areMirror(Node n1, Node n2) {
        if(n1.childs.size()!=n2.childs.size()) 
        return false;
       
           
           boolean res=true;
           
           int i=0;
           int j=n2.childs.size()-1;
           
           while(i<n1.childs.size() && j>=0)
           {
               Node c1=n1.childs.get(i);
               Node c2=n2.childs.get(j);
               
               res=res && areMirror(c1,c2);
               
               i++;
               j--;
           }
               
           
           return res;
         
         }
         public static boolean IsSymmetric(Node node) {
           return areMirror(node, node);
         }
       
}
