# 重构到模式 @Adapter模式
 
## 开发环境
 - JDK1.8+
 
## 业务目标

### 智能家居系统（SH: Smart Home）
为了抢占市场，C门子智能家居产品线计划推出一套智能家居系统，产品经理天价

邀请你作为该系统的软件架构师，你需要在最快时间内做出MVP，MVP功能如下:

1. 开灯
	- Give 供电正常
	- When 主人回家
	- then 灯开启
2. 关灯
	- Give 供电正常
	- When 主人外出
	- then 灯关闭
3. 开空调
	- Give 供电正常，
	- When 主人回家，
	- then 空调打开，温度设置为`26°`
4. 关空调
	- Give 供电正常
	- When 主人外出
	- then 空调关闭，温度值用`-1`表示
5. TV调频
	- Give 供电正常
	- When 主人回家
	- then TV打开，调频至`CCTV-5`
6. 关TV
	- Give 供电正常
	- When 主人外出
	- then TV关闭

	
## 编码路线
`master`分支一共有6个tag（`SH1`，`SH2`，`SH3`，`SH4`，`SH5`，`SH6`），它们分别对应6个功能点。Clone下代码库之后，`checkout`到最开始的提交，一步一步往后面`checkout`即可查看所有步骤，`SH3`与`SH4`之间有6次Refactor的`commit`，如果觉得中间跨度太大，可以逐个查看这些`commit`。

## 参考资料
- [JUnit 5用户指南](https://sjyuan.cc/junit5/user-guide-cn/)
- [Gradle 用户指南](https://docs.gradle.org/current/userguide/userguide.html)