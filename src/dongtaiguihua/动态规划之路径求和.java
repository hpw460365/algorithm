package dongtaiguihua;

public class 动态规划之路径求和 {

    public static void main(String[] args) {
        Integer[][] a = {
                {1,4,3},
                {8,7,5},
                {2,1,5}};
        
//        System.out.println(a[0][2]);
        System.out.println(minPath(a));;
    }
    
    public static int minPath(Integer[][] a) {
    	int row = a.length;
    	int col = a[0].length;
    	int [][] minArray = new int[row][col];
    	for(int i = 1; i< row; i++) {
    		for(int j=1; j<col; j++) {
    			minArray[i][j] = Math.max(minArray[i-1][j] + a[i][j], minArray[i][j-1] + a[i][j]);
    		}
    	}
    	return minArray[row-1][col-1];
    }
}
