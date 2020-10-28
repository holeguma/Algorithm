// verification-helper: PROBLEM http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=GRL_1_A
package test;

import java.io.PrintWriter;

import graph.Dijkstra;
import template.InputReader;

public class Dijkstra_test {
    static InputReader ir;
    static PrintWriter out;

    static void solve() {
        int n = ir.nextInt();
        int m = ir.nextInt();
        int r = ir.nextInt();
        Dijkstra d = new Dijkstra(n);
        for (int i = 0; i < m; i++) {
            int a = ir.nextInt();
            int b = ir.nextInt();
            int c = ir.nextInt();
            d.addEdge(a, b, c);
        }
        d.build(r);
        for (int i = 0; i < n; i++) {
            long dist = d.get(i);
            out.println(dist == d.INF ? "INF" : dist);
        }
    }

    public static void main(String[] args) {
        ir = new InputReader(System.in);
        out = new PrintWriter(System.out);
        solve();
        out.flush();
    }
}
