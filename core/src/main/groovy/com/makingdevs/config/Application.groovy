package com.makingdevs.config

@Singleton
class Application{

  def getConfig(){
    String configurationFilePath = "${System.getProperty('user.home')}/.spock/db.groovy"
    File externalConfigurationFile = new File(configurationFilePath)
    if(!externalConfigurationFile.exists()){
      throw new RuntimeException("""
        You most create an external file in USER_HOME/.spock/db.groovy with the dataSource info
      """)
    }
    new ConfigSlurper().parse(externalConfigurationFile.toURL())
  }
}
