#!/bin/sh

source /etc/profile

cd /server/eureke-server

echo "---------------正在启动后台程序---------------"

nohup java -jar eureke-server.jar  >> /logs/eureke-server-log.log 2>&1 &

echo "---------------正在启动后台程序完成---------------"
