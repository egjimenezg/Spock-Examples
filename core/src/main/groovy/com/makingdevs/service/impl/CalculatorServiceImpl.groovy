package com.makingdevs.service.impl

class CalculatorServiceImpl{

  def divide(Double dividend,Double divisor){
    if(divisor == 0)
      throw new RuntimeException("Cannot divide by zero")

    dividend/divisor
  }

}
