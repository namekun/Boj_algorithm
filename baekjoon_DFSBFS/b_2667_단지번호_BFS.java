package baekjoon_DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;

class Pair {
	int x;
	int y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class b_2667_단지번호_BFS {

	static int[][] map;
	static int[] result;
	static int N, cnt;
	static int[] dX = { 1, 0, -1, 0 };
	static int[] dY = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		result = new int[N * N];

		for (int i = 0; i < N; i++) {
			String split[] = br.readLine().split("");
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(split[j]);
			}
		} // 입력

		cnt = 2;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 1) {
					bfs(i, j);
					cnt++;
				}
			}
		}

		System.out.println(cnt - 2); // 미리 넣어준 cnt값 2를 빼준다.
		Arrays.sort(result);
		for (int i = 0; i < result.length; i++) {
			if (result[i] != 0) {
				System.out.println(result[i]);
			}
		}

	} // 메인 메소드

	public static boolean isOut(int x, int y) { // 범위초과하는지 확인
		if (x >= N || y >= N || x < 0 || y < 0) {
			return true;
		} else
			return false;
	}

	public static void bfs(int x, int y) {
		Queue<Pair> queue = new LinkedList<Pair>();
		queue.add(new Pair(x, y));

		map[x][y] = cnt;

		while (!queue.isEmpty()) {
			Pair temp = queue.poll(); // poll은 head값만 반환하는것이고, remove는 그냥 head요소를 삭제하고, 반환하는것. 큐가 비어있다면 예외발생.
			
			// 단지의 개수 세어주는 것.
			result[cnt]++; 
			
			// BFS 탐색 시작
			for (int i = 0; i < 4; i++) {
				int nx = temp.x + dX[i];
				int ny = temp.y + dY[i];

				if (!isOut(nx, ny)) {
					if (map[nx][ny] == 1) {
						queue.add(new Pair(nx, ny));
						map[nx][ny] = cnt;
					}
				}

			}

		}

	}
}