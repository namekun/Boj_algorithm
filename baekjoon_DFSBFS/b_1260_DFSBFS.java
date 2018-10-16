package baekjoon_DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class b_1260_DFSBFS {

	static int n, m, v;
	static int[][] map;
	static boolean[] visit;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		map = new int[n + 1][n + 1];
		visit = new boolean[n + 1];

		while (m-- > 0) {
			String[] nums = br.readLine().split(" ");
			int x = Integer.parseInt(nums[0]);
			int y = Integer.parseInt(nums[1]);
			map[x][y] = map[y][x] = 1;
		}

		dfs(v, n);
		System.out.println();
		bfs(v, n);
	}

	public static void dfs(int v, int n) { // k는 시작점, n은 정점의 개수
		if (visit[v]) {
			return;
		} else {
			visit[v] = true; // visit
			System.out.print(v + " ");

			for (int i = 1; i <= n; i++) {
				if (map[v][i] == 1) {
					dfs(i, n);
				}
			}
		}
	}

	public static void bfs(int v, int n) {
		Queue<Integer> q = new LinkedList<>();

		q.offer(v); // q에 v값 추가

		while (!q.isEmpty()) {
			int tmp = q.poll();
			visit[tmp] = true;
			System.out.print(tmp + " ");
			for (int i = 1; i <= n; i++) {
				if (map[tmp][i] == 1 && !visit[i]) {
					q.offer(i);
					visit[i] = true;
				}
			}
		}
	}

}
