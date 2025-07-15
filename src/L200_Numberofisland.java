package src;
import java.util.*;
public class L200_Numberofisland {
    public int numIslands(char[][] grid) {
        int row=grid.length; int col=grid[0].length; int ct=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    ct++;
                    bfs(i,j,row,col,grid);
                }
            }
        }
        return ct;
    }
    public void bfs(int i,int j,int row,int col,char[][]grid){
        Queue<int[]> qu= new LinkedList<>();
        qu.add(new int[]{i,j});
        grid[i][j]=2;

        int [] dir = {1,0,-1,0,1};
        while(!qu.isEmpty()){
            int[] arr = qu.poll();

            for(int z=1; z<=4; z++){
                int x=arr[0]+dir[z-1];
                int y=arr[1]+dir[z];

                if(x<0 || y<0 || x==row || y == col || grid[x][y] == '0' || grid[x][y] == '2') continue;

                grid[x][y]='2';
                qu.add(new int[]{x, y});
            }
        }
    }
}
