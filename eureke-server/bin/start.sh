#!/bin/sh
cd /server/eureke-server

echo "---------------正在启动后台程序---------------"
ll  eureke-server.jar

nohup java -jar eureke-server.jar &

echo "---------------正在启动后台程序完成---------------"
