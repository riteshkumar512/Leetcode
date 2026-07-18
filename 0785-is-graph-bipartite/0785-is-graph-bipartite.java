class Solution {
    public boolean isBipartite(int[][] graph) {
    Queue<BipartitePair>q=new LinkedList<>();
            HashMap<Integer,Integer>visited=new HashMap<>();
            for (int i = 0; i < graph.length; i++) {
                if (visited.containsKey(i)){
                    continue;
                }
                q.add(new BipartitePair(i,0));
                while (!q.isEmpty()){
                    //1. Remove
                    BipartitePair rp=q.poll();
                    //2. Ignore if Already visited
                    if (visited.containsKey(rp.vtx)){
                        if (visited.get(rp.vtx)!= rp.dist){
                            return false;
                        }else {
                            continue;
                        }
                    }
                    //3. Marked Visted
                    visited.put(rp.vtx,rp.dist);
                    //4. self Work

                    //5. Add unvisited neighbours
                    for(int nbrs:graph[rp.vtx]){
                        if (!visited.containsKey(nbrs)){
                            q.add(new BipartitePair(nbrs,rp.dist+1));
                        }
                    }

                }
            }
            return true;
        }
    }
    class BipartitePair{
        int vtx;
        int dist;
         public BipartitePair(int vtx,int dist){
             this.vtx=vtx;
             this.dist=dist;
         }

    }
