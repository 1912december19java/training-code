#!/bin/sh

cd comicappv2
mvn package
sudo rm -f /var/lib/tomcat/webapps/comicappv2.war
sudo cp target/comicappv2.war /var/lib/tomcat/webapps/
sudo service tomcat restart
