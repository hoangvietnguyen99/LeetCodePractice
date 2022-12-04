/**
 * 
 */
package easy;

/**
 * @author hoang
 *
 */
public class FloodFill {

  /**
   * @param args
   */
  public static void main(String[] args) {
    FloodFill floodFill = new FloodFill();
    int[][] result = floodFill
        .floodFill2(new int[][] { new int[] { 1, 1, 1 }, new int[] { 1, 1, 0 }, new int[] { 1, 0, 1 } }, 1, 1, 2);
    for (int[] item : result) {
      for (int child : item) {
        System.out.print(child);
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    int m = image.length;
    int n = image[0].length;
    int oldValue = image[sr][sc];
    if (oldValue == color) {
      return image;
    }
    image[sr][sc] = color;
    if (sr + 1 < m && image[sr + 1][sc] == oldValue) {
      floodFill(image, sr + 1, sc, color);
    }
    if (sr - 1 >= 0 && image[sr - 1][sc] == oldValue) {
      floodFill(image, sr - 1, sc, color);
    }
    if (sc + 1 < n && image[sr][sc + 1] == oldValue) {
      floodFill(image, sr, sc + 1, color);
    }
    if (sc - 1 >= 0 && image[sr][sc - 1] == oldValue) {
      floodFill(image, sr, sc - 1, color);
    }
    return image;
  }
  
  public int[][] floodFill2(int[][] image, int sr, int sc, int color) {
    if (image[sr][sc] != color) {
      floodFill2(image, sr, sc, color, image[sr][sc]);
    }
    return image;
  }
  
  public void floodFill2(int[][] image, int sr, int sc, int color, int startColor) {
    if (image[sr][sc] == startColor) {
      image[sr][sc] = color;
      if (sr - 1 >= 0) {
        floodFill2(image, sr - 1, sc, color, startColor);
      }
      if (sr + 1 < image.length) {
        floodFill2(image, sr + 1, sc, color, startColor);
      }
      if (sc - 1 >= 0) {
        floodFill2(image, sr, sc - 1, color, startColor);
      }
      if (sc + 1 < image[0].length) {
        floodFill2(image, sr, sc + 1, color, startColor);
      }
    }
  }

}
