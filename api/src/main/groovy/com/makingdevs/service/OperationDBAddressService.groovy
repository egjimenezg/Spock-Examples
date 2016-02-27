package com.makingdevs.service
import com.makingdevs.Address

interface OperationDBAddressService{

  def insertAddress(Address address)
  def findAddresses()
  
}
