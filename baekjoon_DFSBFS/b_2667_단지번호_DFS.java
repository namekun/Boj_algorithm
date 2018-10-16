package baekjoon_DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class b_2667_단지번호_DFS {
	private static int[][] map;
	private static int N;
	private static int[] dX = { 1, 0, -1, 0 };
	private static int[] dY = { 0, 1, 0, -1 };
	private static int cnt = 2; // 2부터 시작하는 이유는 기존의 map에 있는 좌표들이 0과 1로 이루어져 있기 때문에, 헷갈리지 않기 위해서.
	private static int[] sum;

	public static boolean isOut(int x, int y) { // 범위초과하는지 확인
		if (x >= N || y >= N || x < 0 || y < 0) {
			return true;
		} else
			return false;
	}

	public static void dfs(int x, int y) {
		map[x][y] = cnt;
		sum[cnt]++; // 단지 내의 집의 수를 세어주는 것.
		int nx = 0, ny = 0;
		for (int i = 0; i < 4; i++) {

			nx = x + dX[i];
			ny = y + dY[i];

			if (!isOut(nx, ny)) {
				if (map[nx][ny] == 1) {
					dfs(nx, ny);
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		sum = new int[N * N];

		for (int i = 0; i < N; i++) {
			String split[] = br.readLine().split("");
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(split[j]);
			}
		} // 입력

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 1) {
					dfs(i, j);
					cnt++;
				}
			}
		}

		System.out.println(cnt - 2); // 미리 넣어준 cnt값 2를 빼준다.
		Arrays.sort(sum);
		for (int i = 0; i < sum.length; i++) {
			if(sum[i]!=0) {
				System.out.println(sum[i]);
			}
		}
		
	}
}
