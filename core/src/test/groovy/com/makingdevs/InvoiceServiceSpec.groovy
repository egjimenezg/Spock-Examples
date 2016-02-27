package com.makingdevs

import spock.lang.Specification
import java.lang.Void as Should
import com.makingdevs.service.impl.InvoiceServiceImpl
import com.makingdevs.service.ParseFileService
import com.makingdevs.Concept
import com.makingdevs.Issuing

class InvoiceServiceSpec extends Specification{

  InvoiceServiceImpl service

  def setup(){
    service = new InvoiceServiceImpl()
  }

  Should "get the invoice from a file"(){
    given:"the file's path"
      def path = "${System.getProperty('user.home')}/.spock/InvoiceFile.txt"
    and:"the collaborators"
      def parseFileServiceMock = Mock(ParseFileService)      
      service.parseFileServiceImpl = parseFileServiceMock
    when:
      service.getInvoiceFromFile(path)
    then:
      1 * parseFileServiceMock.getConceptFromFile(_) >> new Concept() 
      1 * parseFileServiceMock.getIssuingFromFile(_) >> new Issuing()
      
  }
}
