package com.makingdevs

import com.makingdevs.config.Application
import groovy.sql.*
import org.apache.commons.dbcp2.BasicDataSource

@Singleton(strict=false)
class DB{

  def config = Application.instance.getConfig()
  def sqlDestination

  private DB(){
    BasicDataSource dataSource = new BasicDataSource(config.dataSource)
    sqlDestination = Sql.newInstance(dataSource) 
  } 

}
