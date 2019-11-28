### 概念
主机（或端系统）通过通信链路和分组交换机连接到一起组成了计算机网络

当一台端系统向另一台端系统发送信息（报文）时，发送端需要将数据分段发送，并为每个分段添加首部字节，由此生成的数据包称为分组。

分组交换机分为两类：路由器和链路层交换机

链路层通常用于接入网中，而路由器通常位于网络核心。

TCP/IP是因特网最重要的协议。

因特网是为应用程序提供服务的基础设施。

### 分组交换

多数分组交换机在链路的输入端会使用存储转发传输机制：即指交换机要开始向输出链路传输该分组第一个比特之前，必须接收到整个分组。

由于以上机制，端到端转发时延：假设长度为L的分组要通过N条速率为R组成的路径时延为：NL/R

分组交换机的每条链路上会有一个输出缓存，用于存储发往该链路的分组。

由于输出缓存容量限制，就会出现排队时延和分组丢失的问题。

交换机发送分组时需要转发表和路由选择协议。

每台路由器具有一个转发表，当一个分组需要转发时，路由器会检查分组的目的地址来索引转发表，并决定映射至适当的输出链路。


### 电路交换
通过网路连接和交换机移动数据有两种基本方式：电路交换和分组交换

电路交换网路里，在端系统通信会话期间，会预留端系统间的通信链路所需的资源（缓存，传输速率等）

电路交换网路复用：频分复用和时分复用

与分组交换对比：优点：无需排队，实时传输，缺点：浪费链路资源


### 分组交换概述

***时延*** 包括处理时延，排队时延， 传输时延， 传播时延
处理时延：检查分组首部以及决定导向输出链路时延；差错检测
排队时延：网络拥堵，传输队列阻塞
传输时延：数据被推送到网路的速度快慢
传播时延：信号在物理介质里的传输速率, 接近光速，一般忽略不计

https://media.pearsoncmg.com/aw/ecs_kurose_compnetwork_7/cw/content/interactiveanimations/transmission-vs-propogation-delay/transmission-propagation-delay-ch1/index.html

https://media.pearsoncmg.com/aw/ecs_kurose_compnetwork_7/cw/content/interactiveanimations/message-segmentation/index.html


### 网络分层
自上而下分为：应用层，表示层， 会话层， 传输层， 网络层， 数据链路层， 物理层

应用层：HTTP, DNS, FTP; 该层分组称为报文
传输层： TCP, UDP; 该层分组称为报文段
网络层：IP和一些路由选择协议; 该层分组称为数据报
链路层：特定链路层协议； 该层分组称为帧


***封装***，一个应用层报文需要经过各个层次的协议栈层层封装，然后发送至目的系统再层层解封，
每一层分组都包含两个字段：首部字段和有效载荷。


### 网络安全

Dos(拒绝服务攻击）， 包含弱点攻击， 带宽洪泛， 连接洪泛

DDos(分布式Dos攻击）









