package baekjoon_DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class b_11724_연결요소의_개수 {

	private static int map[][];
	private static int n, m, cnt;
	private static int[] visit;

	public static void dfs(int node, int cnt) {
		visit[node] = cnt;

		for (int i = 1; i <= n; i++) {
			if (map[node][i] == 1 && visit[i] == 0) {
				dfs(i, cnt);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		map = new int[n + 1][n + 1];
		visit = new int[n + 1];

		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());

			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			map[u][v] = map[v][u] = 1;

		}

		cnt = 1;

		for (int i = 1; i <= n; i++) {
			if (visit[i] == 0) {
				dfs(i, cnt);
				cnt++;
			}
		}

		System.out.println(cnt - 1);

	}
}
