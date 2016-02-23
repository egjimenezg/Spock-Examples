package com.makingdevs.service.impl
import com.makingdevs.Point

class DistanceServiceImpl{

  Long calculateDistance(Point p1,Point p2){
    Long distance = Math.sqrt(Math.pow(p2.x-p1.x,2)+Math.pow(p2.y-p1.y,2))  // ((x2-x1)^2 - (y2-y1)^2)^1/2
  }

}
