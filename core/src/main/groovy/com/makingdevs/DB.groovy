package com.makingdevs

import com.makingdevs.config.Application

@Singleton
class DB{

  def config = Application.getConfig()

}
