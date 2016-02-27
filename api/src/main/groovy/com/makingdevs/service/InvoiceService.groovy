package com.makingdevs.service
import com.makingdevs.Invoice

interface InvoiceService{
  
  Invoice getInvoiceFromFile(String filePath) 

}
