package com.makingdevs

import spock.lang.Specification
import java.lang.Void as Should
import com.makingdevs.service.impl.DistanceServiceImpl

class DistanceSpec extends Specification{

  private DistanceServiceImpl distanceService = new DistanceServiceImpl()

  Should "calculate the distance between two points"(){
    given:"two points"
      def point1 = new Point(x:2,y:11)
      def point2 = new Point(x:5,y:15)
    when:
      Long distance = distanceService.calculateDistance(point1,point2)
    then:
      distance == 5
  }

}
