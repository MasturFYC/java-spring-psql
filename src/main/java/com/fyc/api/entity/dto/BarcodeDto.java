package com.fyc.api.entity.dto;

public class BarcodeDto {
  private final String barcode;

  public String getBarcode() {
    return barcode;
  }

  public BarcodeDto(String barcode) {
    this.barcode = barcode;
  }
}
