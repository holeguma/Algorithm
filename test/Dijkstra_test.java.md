---
data:
  _extendedDependsOn:
  - icon: ':heavy_check_mark:'
    path: graph/Dijkstra.java
    title: graph/Dijkstra.java
  - icon: ':heavy_check_mark:'
    path: graph/Graph.java
    title: graph/Graph.java
  - icon: ':heavy_check_mark:'
    path: template/InputReader.java
    title: template/InputReader.java
  - icon: ':heavy_check_mark:'
    path: template/Main.java
    title: template/Main.java
  _extendedRequiredBy:
  - icon: ':heavy_check_mark:'
    path: graph/Dijkstra.java
    title: graph/Dijkstra.java
  - icon: ':heavy_check_mark:'
    path: graph/Graph.java
    title: graph/Graph.java
  - icon: ':heavy_check_mark:'
    path: template/InputReader.java
    title: template/InputReader.java
  - icon: ':heavy_check_mark:'
    path: template/Main.java
    title: template/Main.java
  _extendedVerifiedWith: []
  _pathExtension: java
  _verificationStatusIcon: ':heavy_check_mark:'
  attributes:
    PROBLEM: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=GRL_1_A
  bundledCode: "Traceback (most recent call last):\n  File \"/opt/hostedtoolcache/Python/3.9.0/x64/lib/python3.9/site-packages/onlinejudge_verify/documentation/build.py\"\
    , line 71, in _render_source_code_stat\n    bundled_code = language.bundle(stat.path,\
    \ basedir=basedir).decode()\n  File \"/opt/hostedtoolcache/Python/3.9.0/x64/lib/python3.9/site-packages/onlinejudge_verify/languages/user_defined.py\"\
    , line 70, in bundle\n    return subprocess.check_output(shlex.split(command))\n\
    \  File \"/opt/hostedtoolcache/Python/3.9.0/x64/lib/python3.9/subprocess.py\"\
    , line 420, in check_output\n    return run(*popenargs, stdout=PIPE, timeout=timeout,\
    \ check=True,\n  File \"/opt/hostedtoolcache/Python/3.9.0/x64/lib/python3.9/subprocess.py\"\
    , line 524, in run\n    raise CalledProcessError(retcode, process.args,\nsubprocess.CalledProcessError:\
    \ Command '['false']' returned non-zero exit status 1.\n"
  code: "// verification-helper: PROBLEM http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=GRL_1_A\r\
    \npackage test;\r\n\r\nimport java.io.PrintWriter;\r\n\r\nimport graph.Dijkstra;\r\
    \nimport template.InputReader;\r\n\r\npublic class Dijkstra_test {\r\n    static\
    \ InputReader ir;\r\n    static PrintWriter out;\r\n\r\n    static void solve()\
    \ {\r\n        int n = ir.nextInt();\r\n        int m = ir.nextInt();\r\n    \
    \    int r = ir.nextInt();\r\n        Dijkstra d = new Dijkstra(n);\r\n      \
    \  for (int i = 0; i < m; i++) {\r\n            int a = ir.nextInt();\r\n    \
    \        int b = ir.nextInt();\r\n            int c = ir.nextInt();\r\n      \
    \      d.addEdge(a, b, c);\r\n        }\r\n        d.build(r);\r\n        for\
    \ (int i = 0; i < n; i++) {\r\n            long dist = d.get(i);\r\n         \
    \   out.println(dist == d.INF ? \"INF\" : dist);\r\n        }\r\n    }\r\n\r\n\
    \    public static void main(String[] args) {\r\n        ir = new InputReader(System.in);\r\
    \n        out = new PrintWriter(System.out);\r\n        solve();\r\n        out.flush();\r\
    \n    }\r\n}\r\n"
  dependsOn:
  - graph/Graph.java
  - graph/Dijkstra.java
  - template/InputReader.java
  - template/Main.java
  isVerificationFile: true
  path: test/Dijkstra_test.java
  requiredBy:
  - graph/Graph.java
  - graph/Dijkstra.java
  - template/InputReader.java
  - template/Main.java
  timestamp: '2020-10-29 02:28:04+09:00'
  verificationStatus: TEST_ACCEPTED
  verifiedWith: []
documentation_of: test/Dijkstra_test.java
layout: document
redirect_from:
- /verify/test/Dijkstra_test.java
- /verify/test/Dijkstra_test.java.html
title: test/Dijkstra_test.java
---
