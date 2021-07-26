To Create Jar File
---------------------

It will be placed in the target folder

    mvn -DskipTests=true package

Hub Script
---------------------

It will run on the hub machine

    java -cp boutiquerugs-selenium-capability-matcher-1.0-SNAPSHOT.jar;selenium-server-standalone-3.141.59.jar org.openqa.grid.selenium.GridLauncherV3 -role hub -hubConfig "C:\Users\16193\Desktop\hubConfig.json"

Hub Config file is placed in the resource folder


Node Script
---------------------

It will run on the node machine

    java -jar selenium-server-standalone-3.141.59.jar -role node -nodeConfig "C:\Users\Boutique Rugs\Desktop\nodeConfig.json"

Node Config
---------------------

It is placed in the resource folder


Required Jars
---------------------
- selenium-server-standalone-3.141.59
- boutiquerugs-selenium-capability-matcher-1.0-SNAPSHOT.jar
- depended jars as chromedriver along with relevant maven dependencies. 
