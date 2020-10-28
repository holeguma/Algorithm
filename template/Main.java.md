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
    path: test/Dijkstra_test.java
    title: test/Dijkstra_test.java
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
  code: "package template;\r\n\r\nimport java.io.PrintWriter;\r\nimport java.util.Arrays;\r\
    \n\r\npublic class Main {\r\n\r\n\tstatic InputReader ir;\r\n\tstatic PrintWriter\
    \ out;\r\n\r\n\tstatic void solve() {\r\n\t\t// Place your solution here.\r\n\t\
    }\r\n\r\n\tpublic static void main(String[] args) {\r\n\t\tir = new InputReader(System.in);\r\
    \n\t\tout = new PrintWriter(System.out);\r\n\t\tsolve();\r\n\t\tout.flush();\r\
    \n\t}\r\n\r\n\tstatic void tr(Object... o) {\r\n\t\tSystem.out.println(Arrays.deepToString(o));\r\
    \n\t}\r\n}\r\n"
  dependsOn:
  - test/Dijkstra_test.java
  - graph/Graph.java
  - graph/Dijkstra.java
  - template/InputReader.java
  isVerificationFile: false
  path: template/Main.java
  requiredBy:
  - graph/Graph.java
  - graph/Dijkstra.java
  - template/InputReader.java
  timestamp: '2020-10-29 02:28:04+09:00'
  verificationStatus: LIBRARY_ALL_AC
  verifiedWith:
  - test/Dijkstra_test.java
documentation_of: template/Main.java
layout: document
redirect_from:
- /library/template/Main.java
- /library/template/Main.java.html
title: template/Main.java
---
