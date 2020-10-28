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
    path: template/Main.java
    title: template/Main.java
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
  code: "package template;\r\n\r\nimport java.io.IOException;\r\nimport java.io.InputStream;\r\
    \nimport java.util.InputMismatchException;\r\nimport java.util.NoSuchElementException;\r\
    \n\r\npublic class InputReader {\r\n\r\n    private InputStream in;\r\n    private\
    \ byte[] buffer = new byte[1024];\r\n    private int curbuf;\r\n    private int\
    \ lenbuf;\r\n\r\n    public InputReader(InputStream in) {\r\n        this.in =\
    \ in;\r\n        this.curbuf = this.lenbuf = 0;\r\n    }\r\n\r\n    public boolean\
    \ hasNextByte() {\r\n        if (curbuf >= lenbuf) {\r\n            curbuf = 0;\r\
    \n            try {\r\n                lenbuf = in.read(buffer);\r\n         \
    \   } catch (IOException e) {\r\n                throw new InputMismatchException();\r\
    \n            }\r\n            if (lenbuf <= 0)\r\n                return false;\r\
    \n        }\r\n        return true;\r\n    }\r\n\r\n    private int readByte()\
    \ {\r\n        if (hasNextByte())\r\n            return buffer[curbuf++];\r\n\
    \        else\r\n            return -1;\r\n    }\r\n\r\n    private boolean isSpaceChar(int\
    \ c) {\r\n        return !(c >= 33 && c <= 126);\r\n    }\r\n\r\n    private void\
    \ skip() {\r\n        while (hasNextByte() && isSpaceChar(buffer[curbuf]))\r\n\
    \            curbuf++;\r\n    }\r\n\r\n    public boolean hasNext() {\r\n    \
    \    skip();\r\n        return hasNextByte();\r\n    }\r\n\r\n    public String\
    \ next() {\r\n        if (!hasNext())\r\n            throw new NoSuchElementException();\r\
    \n        StringBuilder sb = new StringBuilder();\r\n        int b = readByte();\r\
    \n        while (!isSpaceChar(b)) {\r\n            sb.appendCodePoint(b);\r\n\
    \            b = readByte();\r\n        }\r\n        return sb.toString();\r\n\
    \    }\r\n\r\n    public int nextInt() {\r\n        if (!hasNext())\r\n      \
    \      throw new NoSuchElementException();\r\n        int c = readByte();\r\n\
    \        while (isSpaceChar(c))\r\n            c = readByte();\r\n        boolean\
    \ minus = false;\r\n        if (c == '-') {\r\n            minus = true;\r\n \
    \           c = readByte();\r\n        }\r\n        int res = 0;\r\n        do\
    \ {\r\n            if (c < '0' || c > '9')\r\n                throw new InputMismatchException();\r\
    \n            res = res * 10 + c - '0';\r\n            c = readByte();\r\n   \
    \     } while (!isSpaceChar(c));\r\n        return (minus) ? -res : res;\r\n \
    \   }\r\n\r\n    public long nextLong() {\r\n        if (!hasNext())\r\n     \
    \       throw new NoSuchElementException();\r\n        int c = readByte();\r\n\
    \        while (isSpaceChar(c))\r\n            c = readByte();\r\n        boolean\
    \ minus = false;\r\n        if (c == '-') {\r\n            minus = true;\r\n \
    \           c = readByte();\r\n        }\r\n        long res = 0;\r\n        do\
    \ {\r\n            if (c < '0' || c > '9')\r\n                throw new InputMismatchException();\r\
    \n            res = res * 10 + c - '0';\r\n            c = readByte();\r\n   \
    \     } while (!isSpaceChar(c));\r\n        return (minus) ? -res : res;\r\n \
    \   }\r\n\r\n    public double nextDouble() {\r\n        return Double.parseDouble(next());\r\
    \n    }\r\n\r\n    public int[] nextIntArray(int n) {\r\n        int[] a = new\
    \ int[n];\r\n        for (int i = 0; i < n; i++)\r\n            a[i] = nextInt();\r\
    \n        return a;\r\n    }\r\n\r\n    public long[] nextLongArray(int n) {\r\
    \n        long[] a = new long[n];\r\n        for (int i = 0; i < n; i++)\r\n \
    \           a[i] = nextLong();\r\n        return a;\r\n    }\r\n\r\n    public\
    \ char[][] nextCharMap(int n, int m) {\r\n        char[][] map = new char[n][m];\r\
    \n        for (int i = 0; i < n; i++)\r\n            map[i] = next().toCharArray();\r\
    \n        return map;\r\n    }\r\n}"
  dependsOn:
  - test/Dijkstra_test.java
  - graph/Graph.java
  - graph/Dijkstra.java
  - template/Main.java
  isVerificationFile: false
  path: template/InputReader.java
  requiredBy:
  - graph/Graph.java
  - graph/Dijkstra.java
  - template/Main.java
  timestamp: '2020-10-29 02:28:04+09:00'
  verificationStatus: LIBRARY_ALL_AC
  verifiedWith:
  - test/Dijkstra_test.java
documentation_of: template/InputReader.java
layout: document
redirect_from:
- /library/template/InputReader.java
- /library/template/InputReader.java.html
title: template/InputReader.java
---
