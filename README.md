Use mavens properties for depending versions:
mvn versions:display-plugin-updates
mvn versions:update-properties

mvn versions:display-dependency-updates
mvn versions:use-latest-versions

mvn clean test -Dtest=LoginTest
mvn clean test -Dtest=LoginTest#loginTest

mvn clean test -Dtest=LoginTest -DtestPassword=qwerty11 // for password
mvn clean test -Dtest=LoginTest -DtestLogin=m.a.i.lundtest.1-6c4s@force.com -DtestPassword=qwerty11 // for User+password




