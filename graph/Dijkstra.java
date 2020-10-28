package graph;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Dijkstra {

    public Graph[] g;
    public long[] d;
    public final long INF = 1L << 60;

    public Dijkstra(int n) {
        g = new Graph[n];
        for (int i = 0; i < n; i++) {
            g[i] = new Graph();
        }
        d = new long[n];
    }

    public void addEdge(int from, int to, long cost) {
        g[from].add(new long[] { to, cost });
    }

    public void build(int s) {
        PriorityQueue<long[]> pq = new PriorityQueue<long[]>(new Comparator<long[]>() {
            public int compare(long[] a, long[] b) {
                return Long.compare(a[1], b[1]);
            }
        });
        Arrays.fill(d, INF);
        d[s] = 0;
        pq.offer(new long[] { s, 0 });
        while (!pq.isEmpty()) {
            long[] p = pq.poll();
            int from = (int) p[0];
            if (d[from] != p[1])
                continue;
            for (int i = 0; i < g[from].size(); i++) {
                long[] e = g[from].get(i);
                int to = (int) e[0];
                if (d[to] > d[from] + e[1]) {
                    d[to] = d[from] + e[1];
                    pq.offer(new long[] { to, d[to] });
                }
            }
        }
    }

    public long get(int to) {
        return d[to];
    }

}