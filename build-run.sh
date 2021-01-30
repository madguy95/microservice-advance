#!/bin/bash
echo "Building maven project and run docker compose at path " $PWD
mvn clean install -DskipTests
sudo docker-compose build
sudo docker-compose up
