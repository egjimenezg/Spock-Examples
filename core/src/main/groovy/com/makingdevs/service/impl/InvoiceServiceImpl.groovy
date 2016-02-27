package com.makingdevs.service.impl
import com.makingdevs.service.InvoiceService
import com.makingdevs.service.ParseFileService
import com.makingdevs.Invoice

class InvoiceServiceImpl implements InvoiceService{

  ParseFileService parseFileServiceImpl = new ParseFileServiceImpl() 

  Invoice getInvoiceFromFile(String filePath){
    def file = new File(filePath)
    def invoice = new Invoice()
    invoice.concept = parseFileServiceImpl.getConceptFromFile(file)
    invoice.issuing = parseFileServiceImpl.getIssuingFromFile(file)
    invoice
  }

}
