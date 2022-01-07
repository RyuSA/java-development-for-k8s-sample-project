Java開発 for Kubernetes サンプルプロジェクト
===

このリポジトリは[Java開発 for Kubernetes]()で登場するサンプルのプロジェクトです。このプロジェクトはSpring Bootでのアプリケーションサーバーを実装することを前提に構成されています。

## ディレクトリ
```bash
.
├── README.md
├── k8s # Kubernetesマニフェスト
└── src # Javaコード
```

## 事前定義済みのAPI

    GET /version
    アプリケーションのビルドバージョンを確認できます。

    GET /ping?sleep={msec}
    指定したミリ秒後にpongが返ってきます。(デフォルト: 0)

    GET /dig?query={domain}
    指定したドメイン名で名前解決を試み、IPアドレスの一覧が返ってきます。ipv4/ipv6どちららも解決する……はずです。
