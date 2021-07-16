public class similar {
    public static int size(Node node) {
        int s = 0;
    
        for (Node child : node.childs) {
          s += size(child);
        }
        s += 1;
    
        return s;
      }
    
    
      public static boolean areSimilar(Node n1, Node n2) {
         if(n1.childs.size() != n2.childs.size())
         return false;
         
         for(int i=0; i<n1.childs.size(); i++){
             Node c1=n1.childs.get(i);
             Node c2=n2.childs.get(i);
             if(areSimilar(c1,c2)==false){
                 return false;
             }
         }
         return true;
      }
}
