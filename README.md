Java project for load testing in WildFly and PGSQL.
Main loading function is in TestPiController.java

You must increase your heap size in standalone.conf (standalone.conf.bat on Windows): find JBOSS_JAVA_SIZING setting and change starting and maximum heap size, for example -Xms512M -Xmx2048M
After reaching the heap limit, the app will crash.
