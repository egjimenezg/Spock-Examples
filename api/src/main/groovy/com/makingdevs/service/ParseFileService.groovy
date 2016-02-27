package com.makingdevs.service
import com.makingdevs.Concept
import com.makingdevs.Issuing

interface ParseFileService{

  Concept getConceptFromFile(File file)
  Issuing getIssuingFromFile(File file)
   
}
