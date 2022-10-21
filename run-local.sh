#!/usr/bin/env sh
sync; echo 3 > /proc/sys/vm/drop_caches
sudo sysctl -w vm.drop_caches=3
sudo sync

docker network ls
docker network prune 
#docker network create --driver=bridge --subnet=192.168.0.0/24 redsocial_net

cd /home/ozono/Documents/evaluacion_practica_final/reelsRedSocial
docker-compose up --build

#docker-compose stop
#docker-compose kill
#docker-compose rm -f




