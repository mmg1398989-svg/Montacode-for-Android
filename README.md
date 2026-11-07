<div align="center">
<img src="app/src/main/res/drawable-nodpi/staract_logo.png" width="240" alt="STARACT 安徽星执人工智能" />

# STARACT

安卓端 AI 助手 · 安徽星执人工智能

**开发人：马明岗**

</div>

## 功能

STARACT 基于 [Mika v0.1.38](https://github.com/wangzan101/Mika/releases/tag/v0.1.38)，沿用其后台屏幕操作、内置浏览器、定时任务和电脑端 CLI / MCP 等功能。聊天、浏览和文件处理需要 Android 11 或更高版本，操作其他手机 App 需要 Android 12 或更高版本并完成手机操作设置。

## 从源码构建

需要 JDK 17、Android SDK Platform 36 和 Android SDK Build Tools 35.0.0。Windows 下将 `./gradlew` 换成 `gradlew.bat`。

```sh
./gradlew :app:testDebugUnitTest :app:assembleDebug
```

调试 APK 位于 `app/build/outputs/apk/debug/app-debug.apk`。STARACT 使用独立包名 `com.staract.assistant`，可以与 Mika 分开安装。连接电脑时请使用本仓库的 CLI 脚本 `tools/mika/scripts/mika_cli.py`，USB 模式需要匹配 STARACT 的应用目录。

[STARACT 发布页](https://github.com/mmg1398989-svg/STARACT/releases) · [上游使用指南](docs/readme/README.zh-CN.md) · [上游英文文档](README.upstream.md)

## 开源署名

原项目 [Mika](https://github.com/wangzan101/Mika) 由王赞（wangzan101）及其贡献者开发。本衍生版本遵循 [Apache-2.0](LICENSE)，原项目署名见 [NOTICE](NOTICE)，第三方许可见 [licenses](licenses/)。
