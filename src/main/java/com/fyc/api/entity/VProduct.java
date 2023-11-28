package com.fyc.api.entity;

import org.hibernate.annotations.Immutable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "v_product")
@Immutable
public class VProduct {
	@Id
	private long id;

	@Column(name = "category_id")
	private int categoryId;

	@Column(name = "parent_id")
	private int parentId;

	@Column(name = "is_active")
	private Boolean isActive;

	@Column(name = "is_for_sale")
	private Boolean isForSale;

	@Column(name = "is_inventory")
	private Boolean isInventory;

	@Column(name = "variant_name")
	private String variantName;

	@Column(name = "category_name")
	private String categoryName;

	@Column(name = "unit_in_stock")
	private Double unitInStock;

	// @Column(name = "name")
	private String name;

	// @Column(name = "barcode")
	private String barcode;

	// @Column(name = "unit")
	private String unit;

	// @Column(name = "content")
	private Double content;

	// @Column(name = "hpp")
	private Double hpp;

	// @Column(name = "ppn")
	private Double ppn;

	// @Column(name = "margin")
	private Double margin;

	// @Column(name = "price")
	private Double price;

	// @Column(name = "descriptions")
	private String descriptions;

	public VProduct() {
		super();
	}

	public long getId() {
		return id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public int getParentId() {
		return parentId;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public Boolean getIsForSale() {
		return isForSale;
	}

	public Boolean getIsInventory() {
		return isInventory;
	}

	public String getVariantName() {
		return variantName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public Double getUnitInStock() {
		return unitInStock;
	}

	public String getName() {
		return name;
	}

	public String getBarcode() {
		return barcode;
	}

	public String getUnit() {
		return unit;
	}

	public Double getContent() {
		return content;
	}

	public Double getHpp() {
		return hpp;
	}

	public Double getPpn() {
		return ppn;
	}

	public Double getMargin() {
		return margin;
	}

	public Double getPrice() {
		return price;
	}

	public String getDescriptions() {
		return descriptions;
	}
}
