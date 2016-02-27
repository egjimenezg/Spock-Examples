package com.makingdevs.service.impl

import com.makingdevs.service.AddressService
import com.makingdevs.service.SepomexService
import com.makingdevs.service.OperationDBAddressService
import com.makingdevs.Address

class AddressServiceImpl implements AddressService{

  SepomexService sepomexService = new SepomexServiceImpl()
  OperationDBAddressService operationDBAddressServiceImpl = new OperationDBAddressServiceImpl()

  def getAddressByPostalCode(postalCode){
    def addressInfo = sepomexService.getDataForPostalCode(postalCode)

    new Address(colony:addressInfo.colony,
                town:addressInfo.town,
                state:addressInfo.state,
                city:addressInfo.city)
  }

  def saveAddress(Address address){
    operationDBAddressServiceImpl.insertAddress(address)
  }

}
