---
data:
  _extendedDependsOn:
  - icon: ':heavy_check_mark:'
    path: graph/Graph.java
    title: graph/Graph.java
  - icon: ':heavy_check_mark:'
    path: template/InputReader.java
    title: template/InputReader.java
  - icon: ':heavy_check_mark:'
    path: template/Main.java
    title: template/Main.java
  - icon: ':heavy_check_mark:'
    path: test/Dijkstra_test.java
    title: test/Dijkstra_test.java
  _extendedRequiredBy:
  - icon: ':heavy_check_mark:'
    path: graph/Graph.java
    title: graph/Graph.java
  - icon: ':heavy_check_mark:'
    path: template/InputReader.java
    title: template/InputReader.java
  - icon: ':heavy_check_mark:'
    path: template/Main.java
    title: template/Main.java
  _extendedVerifiedWith:
  - icon: ':heavy_check_mark:'
    path: test/Dijkstra_test.java
    title: test/Dijkstra_test.java
  _pathExtension: java
  _verificationStatusIcon: ':heavy_check_mark:'
  attributes: {}
  bundledCode: "Traceback (most recent call last):\n  File \"/opt/hostedtoolcache/Python/3.9.0/x64/lib/python3.9/site-packages/onlinejudge_verify/documentation/build.py\"\
    , line 71, in _render_source_code_stat\n    bundled_code = language.bundle(stat.path,\
    \ basedir=basedir).decode()\n  File \"/opt/hostedtoolcache/Python/3.9.0/x64/lib/python3.9/site-packages/onlinejudge_verify/languages/user_defined.py\"\
    , line 70, in bundle\n    return subprocess.check_output(shlex.split(command))\n\
    \  File \"/opt/hostedtoolcache/Python/3.9.0/x64/lib/python3.9/subprocess.py\"\
    , line 420, in check_output\n    return run(*popenargs, stdout=PIPE, timeout=timeout,\
    \ check=True,\n  File \"/opt/hostedtoolcache/Python/3.9.0/x64/lib/python3.9/subprocess.py\"\
    , line 524, in run\n    raise CalledProcessError(retcode, process.args,\nsubprocess.CalledProcessError:\
    \ Command '['false']' returned non-zero exit status 1.\n"
  code: "package graph;\r\n\r\nimport java.util.Arrays;\r\nimport java.util.Comparator;\r\
    \nimport java.util.PriorityQueue;\r\n\r\npublic class Dijkstra {\r\n\r\n    public\
    \ Graph[] g;\r\n    public long[] d;\r\n    public final long INF = 1L << 60;\r\
    \n\r\n    public Dijkstra(int n) {\r\n        g = new Graph[n];\r\n        for\
    \ (int i = 0; i < n; i++) {\r\n            g[i] = new Graph();\r\n        }\r\n\
    \        d = new long[n];\r\n    }\r\n\r\n    public void addEdge(int from, int\
    \ to, long cost) {\r\n        g[from].add(new long[] { to, cost });\r\n    }\r\
    \n\r\n    public void build(int s) {\r\n        PriorityQueue<long[]> pq = new\
    \ PriorityQueue<long[]>(new Comparator<long[]>() {\r\n            public int compare(long[]\
    \ a, long[] b) {\r\n                return Long.compare(a[1], b[1]);\r\n     \
    \       }\r\n        });\r\n        Arrays.fill(d, INF);\r\n        d[s] = 0;\r\
    \n        pq.offer(new long[] { s, 0 });\r\n        while (!pq.isEmpty()) {\r\n\
    \            long[] p = pq.poll();\r\n            int from = (int) p[0];\r\n \
    \           if (d[from] != p[1])\r\n                continue;\r\n            for\
    \ (int i = 0; i < g[from].size(); i++) {\r\n                long[] e = g[from].get(i);\r\
    \n                int to = (int) e[0];\r\n                if (d[to] > d[from]\
    \ + e[1]) {\r\n                    d[to] = d[from] + e[1];\r\n               \
    \     pq.offer(new long[] { to, d[to] });\r\n                }\r\n           \
    \ }\r\n        }\r\n    }\r\n\r\n    public long get(int to) {\r\n        return\
    \ d[to];\r\n    }\r\n\r\n}"
  dependsOn:
  - test/Dijkstra_test.java
  - graph/Graph.java
  - template/InputReader.java
  - template/Main.java
  isVerificationFile: false
  path: graph/Dijkstra.java
  requiredBy:
  - graph/Graph.java
  - template/InputReader.java
  - template/Main.java
  timestamp: '2020-10-29 02:28:04+09:00'
  verificationStatus: LIBRARY_ALL_AC
  verifiedWith:
  - test/Dijkstra_test.java
documentation_of: graph/Dijkstra.java
layout: document
redirect_from:
- /library/graph/Dijkstra.java
- /library/graph/Dijkstra.java.html
title: graph/Dijkstra.java
---
