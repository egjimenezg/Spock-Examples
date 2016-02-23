package com.makingdevs

import spock.lang.Specification
import spock.lang.FailsWith
import java.lang.Void as Should
import com.makingdevs.service.impl.CalculatorServiceImpl

class ExceptionSpec extends Specification{

  private CalculatorServiceImpl calculatorService = new CalculatorServiceImpl()

  @FailsWith(RuntimeException)
  Should "fail when the divisor is 0"(){
    given:"the dividend and the divisor"
      def dividend = 0
      def divisor = 0
    when:
      def quotient = calculatorService.divide(dividend,divisor)
    then:
      !quotient
  }
}
