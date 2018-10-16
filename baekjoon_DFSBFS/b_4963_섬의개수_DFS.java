package baekjoon_DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class b_4963_섬의개수_DFS {

	static int w, h;
	static int[][] map;
	static boolean [][] isVisit;
	static int[] dx = { 1, 0, -1, 0, -1, -1, 1, 1 };
	static int[] dy = { 0, 1, 0, -1, -1, 1, -1, 1 };
	
	public static boolean isOut(int x, int y) {
		if (x < 0 || y < 0 || x >= h || y >= w) {
			return true;
		}
		else return false;
	}

	public static void dfs(int x, int y) {
		
		isVisit[x][y] = true;
		
		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (!isOut(nx, ny)) {
				if (map[nx][ny] == 1 && !isVisit[nx][ny]) {
					dfs(nx, ny);
				}
			}

		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			map = new int[h][w];
			isVisit = new boolean[51][51];
			
			for (int i = 0; i < isVisit.length; i++) {
				for (int j = 0; j < isVisit.length; j++) {
					isVisit[i][j] = false;
				}
			}
			
			if(w == 0 && h == 0) break;
			
			for (int i = 0; i < h; i++) {
				String [] row = br.readLine().split(" ");
				for (int j = 0; j < w; j++) {
					map[i][j] = Integer.parseInt(row[j]);
				}
			} // input
			
			int cnt = 0;
			
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if(map[i][j] == 1 && !isVisit[i][j]) {
						dfs(i, j);
						cnt++;
					}
				}
			}
			sb.append(cnt + "\n");
		}
		System.out.print(sb.toString());
	}
}
