package com.makingdevs.service.impl
import com.makingdevs.DB
import com.makingdevs.Address
import com.makingdevs.service.OperationDBAddressService

class OperationDBAddressServiceImpl implements OperationDBAddressService{
  
  def insertAddress(Address address){
    def addressInfo = [:]
    address.class.declaredFields.findAll{ !it.synthetic }.each{ attribute ->
      addressInfo[attribute.name] = address[attribute.name]
    }
   
    def dataSet = DB.instance.sqlDestination.dataSet('address')
    dataSet.add addressInfo
  }

  def findAddresses(){
    def query = "select * from address" 
    DB.instance.sqlDestination.rows(query,[]) 
  }
  
  def deleteAddresses(){
    def query = "delete from address"
    DB.instance.sqlDestination.execute(query,[])
  } 
}
