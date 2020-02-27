#!/bin/sh
cd /server/eureke-server

echo "---------------正在启动后台程序---------------"

nohup java -jar eureke-server.jar &
