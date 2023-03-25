import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Test {

  public static void main(String[] args) {
    char[][] grid =  new char[][] {
        {'1','1','1','1','0'},
        {'1','1','0','1','0'},
        {'1','1','0','0','0'},
        {'0','0','0','0','0'}
    };

    new SolutionAb().numIslands(grid);
  }

}

class SolutionAb {
  private Map<Integer, List<Integer>> graph;
  boolean[] seen;

  public int numIslands(char[][] grid) {
    graph = new HashMap<>();

    for (int i = 0; i < grid.length; i++) {
      if (!graph.containsKey(i)) {
        graph.put(i, new ArrayList<>());
      }
      for (int j = i + 1; j < grid[i].length; j++) {
        if (!graph.containsKey(j)) {
          graph.put(j, new ArrayList<>());
        }
        if (grid[i][j] == '1') {
          graph.get(i).add(j);
          graph.get(j).add(i);
        }
      }
    }

    int ans = 0;
    seen = new boolean[graph.size()];
    for (int i = 0; i < graph.size(); i++) {
      if (seen[i] == false) {
        ans++;
        seen[i] = true;
        dfs(i);
      }
    }

    return ans;
  }

  private void dfs(int node) {
    for (int neighbor : graph.get(node)) {
      if (seen[neighbor] == false) {
        seen[neighbor] = true;
        dfs(neighbor);
      }
    }
  }
}