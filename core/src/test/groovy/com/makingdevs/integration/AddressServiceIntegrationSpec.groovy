package com.makingdevs.integration

import spock.lang.Specification
import java.lang.Void as Should
import com.makingdevs.service.impl.AddressServiceImpl
import com.makingdevs.service.impl.OperationDBAddressServiceImpl
import com.makingdevs.Address

class AddressServiceIntegrationSpec extends Specification{
 
  private AddressServiceImpl addressServiceImpl = new AddressServiceImpl()
  private OperationDBAddressServiceImpl operationDBAddressServiceImpl = new OperationDBAddressServiceImpl()

  Should "insert the address"(){
    given:"the address"
      def address = new Address(colony:"Some colony",
                                town:"A town",
                                state:"An state",
                                city:"A city") 
    when:
      addressServiceImpl.saveAddress(address) 
    then:
      operationDBAddressServiceImpl.findAddresses().size() == 1
    cleanup:
      operationDBAddressServiceImpl.deleteAddresses()
  }

}
