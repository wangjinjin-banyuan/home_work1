# 半圆预备课笔记
## 时间：3月15日
### 搜索打开终端
command+空格 调出搜索栏 输入terminal

### 终端命令行操作
- ls (list)
- pwd
- cd(change directory)
- touch
- mkdir
- rm(remove)
- cp(copy)
- mv(move)
 
### ls
- ls：查看指定目录下的文件及文件夹.
- ls -a（all）:显示隐藏文件和文件夹.
- ls -l(long):显示更多信息.

### pwd
显示当前所在目录。

### cd 文件夹(切换工作目录)
1. cd 不带参数为切换到home目录。
2. cd .. 切换到父目录。
3. cd -  切换到之前目录。

### mkdir
- mkdir:创建一个目录。
- mkdir -p:创建多层目录。

### rm
- rm ：删除普通文件
- rm -rf:删除文件夹及其下面所有文件。

### cp
- cp:复制文件
- cp -r:拷贝文件夹

### mv
移动文件/文件夹或重命名文件或文件夹

### touch
创建一个空文件

### 其他重要命令
1. cat 查看文件内容
2. grep 过滤内容
3. history 查看历史命令记录

## 安装brew
### install
输入 /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install.sh)"
#### brew命令
brew list:查看已经安装的软件
brew install:安装软件
brew uninstall:卸载软件
brew search:查询可供安装的软件

## git与github的使用
- >第一步：安装git
- >第二步：登陆github网站注册账户
- >第三步：配置ssh-key,使用ssh方式和github服务器建立连接

```
1. 查看ssh-key是否为自己生成的，不是的话请删除。
   输入：rm -f ~/.ssh/id_rsa*
2.打开终端，输入命令
   ssh-keygen -t rsa -b 4096 -C "你的标识"
   一路回车
3.输入：cat ~/.ssh/id_rsa.pub
  查看公钥内容然后复制放入github网站上ssh and gpg keys界面key栏中。
4.最后验证是否配置成功
  输入ssh -T git@github.com
  ```
 
 ## git命令
1.  git clone :从github网站上将git仓库地址复制下来，用git clone+复制过来的地址，将仓库下载下来。
2.  git add+目录或文件：是将你的目录中文件添加到git中。
3.  git commit:将变更固化，准备提交。
4.  git push:将之前的变更同步到服务器。

## 最后注意点
- 使用Tab键可以补全
- .是当前目录
- ..是当前目录的上一级目录（父目录）
- ～是home目录
- -是之前的工作目录


  





 

