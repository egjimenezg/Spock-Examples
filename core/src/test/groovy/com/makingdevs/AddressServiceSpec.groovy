package com.makingdevs

import spock.lang.*
import java.lang.Void as Should
import com.makingdevs.service.impl.AddressServiceImpl
import com.makingdevs.service.impl.SepomexServiceImpl
import com.makingdevs.service.SepomexService


class AddressServiceSpec extends Specification{

  private AddressServiceImpl addressService = new AddressServiceImpl()

  Should "get the address from sepomex web service"(){
    given:"the postal code"
      def postalCode = "6700"
    and:"the collaborator class"
      SepomexService sepomexServiceMock = Mock(SepomexService)
      addressService.sepomexService = sepomexServiceMock
      sepomexServiceMock.getDataForPostalCode(_) >> [colony:"Roma Norte",town:"Cuauhtémoc",state:"Distrito Federal",city:"Ciudad de México"]
    when:
      def address = addressService.getAddressByPostalCode(postalCode)
    then:
      address.colony
      address.town
      address.state
      address.city
  }

}
