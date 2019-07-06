/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductPackagedPackageItem of the Data Model fhir.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package fhir;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link identifier}, 
{@link type}, 
{@link quantity}, 
{@link material}, 
{@link alternateMaterial}, 
{@link device}, 
{@link manufacturedItem}, 
{@link packageItem}, 
{@link physicalCharacteristics}, 
{@link otherCharacteristics}, 
{@link shelfLifeStorage}, 
{@link manufacturer}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getType},
{@link getQuantity},
{@link getMaterial},
{@link getAlternateMaterial},
{@link getDevice},
{@link getManufacturedItem},
{@link getPackageItem},
{@link getPhysicalCharacteristics},
{@link getOtherCharacteristics},
{@link getShelfLifeStorage},
{@link getManufacturer},
{@link setIdentifier},
{@link setType},
{@link setQuantity},
{@link setMaterial},
{@link setAlternateMaterial},
{@link setDevice},
{@link setManufacturedItem},
{@link setPackageItem},
{@link setPhysicalCharacteristics},
{@link setOtherCharacteristics},
{@link setShelfLifeStorage},
{@link setManufacturer},
 */

@Description("A medicinal product in a container or package.")

public interface MedicinalProductPackagedPackageItem extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicinalProductPackagedPackageItem> T = EntityTypes.T(MedicinalProductPackagedPackageItem.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String type = "type";
	java.lang.String quantity = "quantity";
	java.lang.String material = "material";
	java.lang.String alternateMaterial = "alternateMaterial";
	java.lang.String device = "device";
	java.lang.String manufacturedItem = "manufacturedItem";
	java.lang.String packageItem = "packageItem";
	java.lang.String physicalCharacteristics = "physicalCharacteristics";
	java.lang.String otherCharacteristics = "otherCharacteristics";
	java.lang.String shelfLifeStorage = "shelfLifeStorage";
	java.lang.String manufacturer = "manufacturer";

	@Description("Including possibly Data Carrier Identifier.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The physical type of the container of the medicine.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The quantity of this package in the medicinal product, at the current level of packaging. The outermost is always 1.")
	@Mandatory
	fhir.Quantity getQuantity();
	void setQuantity(fhir.Quantity quantity);
	@Description("Material type of the package item.")
	
	java.util.List<fhir.CodeableConcept> getMaterial();
	void setMaterial(java.util.List<fhir.CodeableConcept> material);

	@Description("A possible alternate material for the packaging.")
	
	java.util.List<fhir.CodeableConcept> getAlternateMaterial();
	void setAlternateMaterial(java.util.List<fhir.CodeableConcept> alternateMaterial);

	@Description("A device accompanying a medicinal product.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getDevice();
	void setDevice(java.util.List<com.braintribe.model.generic.GenericEntity> device);

	@Description("The manufactured item as contained in the packaged medicinal product.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getManufacturedItem();
	void setManufacturedItem(java.util.List<com.braintribe.model.generic.GenericEntity> manufacturedItem);

	@Description("Allows containers within containers.")
	
	java.util.List<fhir.MedicinalProductPackagedPackageItem> getPackageItem();
	void setPackageItem(java.util.List<fhir.MedicinalProductPackagedPackageItem> packageItem);

	@Description("Dimensions, color etc.")
	@Mandatory
	fhir.ProdCharacteristic getPhysicalCharacteristics();
	void setPhysicalCharacteristics(fhir.ProdCharacteristic physicalCharacteristics);
	@Description("Other codeable characteristics.")
	
	java.util.List<fhir.CodeableConcept> getOtherCharacteristics();
	void setOtherCharacteristics(java.util.List<fhir.CodeableConcept> otherCharacteristics);

	@Description("Shelf Life and storage information.")
	
	java.util.List<fhir.ProductShelfLife> getShelfLifeStorage();
	void setShelfLifeStorage(java.util.List<fhir.ProductShelfLife> shelfLifeStorage);

	@Description("Manufacturer of this Package Item.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getManufacturer();
	void setManufacturer(java.util.List<com.braintribe.model.generic.GenericEntity> manufacturer);

}
