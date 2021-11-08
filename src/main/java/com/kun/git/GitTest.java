package com.kun.git;

/**
 * 忽略文件配置成功，灰色
 * 右键项目根目录，Git，add，添加到暂存区，变绿
 * 右键项目根目录，Git,commit diretory,变黑 提交完成
 * 代码修改，文件名变蓝 代表：被追踪过，但是被修改 -->需要add commit(idea中可以直接提交到本地库)
 * head （黄色，控制历史版本，选择分支） master（绿色，当前分支master最新版本）
 * 创建/切换分支（右下角分支图标） 查看历史版本（左下角Git）
 * @author jiakun
 * @create 2021-11-08-14:25
 */
public class GitTest {
    public static void main(String[] args) {
        System.out.println("Hello IDEA Git1");
        System.out.println("Hello IDEA Git2 version reset hard");
        System.out.println("Hello IDEA Git3 version reset hard");
        System.out.println("Hello IDEA Git4 version reset hard");
        System.out.println("Hello IDEA Git4 version reset hard");
        System.out.println("Hello IDEA Git6 version normal merge");
        System.out.println("Hello IDEA Git6 version error  merge");
    }
}
