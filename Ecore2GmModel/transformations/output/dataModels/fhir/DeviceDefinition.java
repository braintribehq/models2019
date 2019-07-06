/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type DeviceDefinition of the Data Model fhir.
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
{@link udiDeviceIdentifier}, 
{@link manufacturerReference}, 
{@link deviceName}, 
{@link type}, 
{@link specialization}, 
{@link safety}, 
{@link shelfLifeStorage}, 
{@link physicalCharacteristics}, 
{@link languageCode}, 
{@link capability}, 
{@link property}, 
{@link owner}, 
{@link contact}, 
{@link note}, 
{@link quantity}, 
{@link parentDevice}, 
{@link material}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getUdiDeviceIdentifier},
{@link getManufacturerReference},
{@link getDeviceName},
{@link getType},
{@link getSpecialization},
{@link getSafety},
{@link getShelfLifeStorage},
{@link getPhysicalCharacteristics},
{@link getLanguageCode},
{@link getCapability},
{@link getProperty},
{@link getOwner},
{@link getContact},
{@link getNote},
{@link getQuantity},
{@link getParentDevice},
{@link getMaterial},
{@link setIdentifier},
{@link setUdiDeviceIdentifier},
{@link setManufacturerReference},
{@link setDeviceName},
{@link setType},
{@link setSpecialization},
{@link setSafety},
{@link setShelfLifeStorage},
{@link setPhysicalCharacteristics},
{@link setLanguageCode},
{@link setCapability},
{@link setProperty},
{@link setOwner},
{@link setContact},
{@link setNote},
{@link setQuantity},
{@link setParentDevice},
{@link setMaterial},
 */

@Description("The characteristics, operational status and capabilities of a medical-related component of a medical device.If the element is present, it must have either a @value, an @id, or extensions")

public interface DeviceDefinition extends GenericEntity, fhir.FhirDomainResource {

	EntityType<DeviceDefinition> T = EntityTypes.T(DeviceDefinition.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String udiDeviceIdentifier = "udiDeviceIdentifier";
	java.lang.String manufacturerReference = "manufacturerReference";
	java.lang.String deviceName = "deviceName";
	java.lang.String type = "type";
	java.lang.String specialization = "specialization";
	java.lang.String safety = "safety";
	java.lang.String shelfLifeStorage = "shelfLifeStorage";
	java.lang.String physicalCharacteristics = "physicalCharacteristics";
	java.lang.String languageCode = "languageCode";
	java.lang.String capability = "capability";
	java.lang.String property = "property";
	java.lang.String owner = "owner";
	java.lang.String contact = "contact";
	java.lang.String note = "note";
	java.lang.String quantity = "quantity";
	java.lang.String parentDevice = "parentDevice";
	java.lang.String material = "material";

	@Description("Unique instance identifiers assigned to a device by the software, manufacturers, other organizations or owners. For example: handle ID.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Unique device identifier (UDI) assigned to device label or package.  Note that the Device may include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have been sold.")
	
	java.util.List<fhir.DeviceDefinitionUdiDeviceIdentifier> getUdiDeviceIdentifier();
	void setUdiDeviceIdentifier(java.util.List<fhir.DeviceDefinitionUdiDeviceIdentifier> udiDeviceIdentifier);

	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getManufacturerReference();
	void setManufacturerReference(com.braintribe.model.generic.GenericEntity manufacturerReference);
	@Description("A name given to the device to identify it.")
	
	java.util.List<fhir.DeviceDefinitionDeviceName> getDeviceName();
	void setDeviceName(java.util.List<fhir.DeviceDefinitionDeviceName> deviceName);

	@Description("What kind of device or device system this is.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The capabilities supported on a  device, the standards to which the device conforms for a particular purpose, and used for the communication.")
	
	java.util.List<fhir.DeviceDefinitionSpecialization> getSpecialization();
	void setSpecialization(java.util.List<fhir.DeviceDefinitionSpecialization> specialization);

	@Description("Safety characteristics of the device.")
	
	java.util.List<fhir.CodeableConcept> getSafety();
	void setSafety(java.util.List<fhir.CodeableConcept> safety);

	@Description("Shelf Life and storage information.")
	
	java.util.List<fhir.ProductShelfLife> getShelfLifeStorage();
	void setShelfLifeStorage(java.util.List<fhir.ProductShelfLife> shelfLifeStorage);

	@Description("Dimensions, color etc.")
	@Mandatory
	fhir.ProdCharacteristic getPhysicalCharacteristics();
	void setPhysicalCharacteristics(fhir.ProdCharacteristic physicalCharacteristics);
	@Description("Language code for the human-readable text strings produced by the device (all supported).")
	
	java.util.List<fhir.CodeableConcept> getLanguageCode();
	void setLanguageCode(java.util.List<fhir.CodeableConcept> languageCode);

	@Description("Device capabilities.")
	
	java.util.List<fhir.DeviceDefinitionCapability> getCapability();
	void setCapability(java.util.List<fhir.DeviceDefinitionCapability> capability);

	@Description("The actual configuration settings of a device as it actually operates, e.g., regulation status, time properties.")
	
	java.util.List<fhir.DeviceDefinitionProperty> getProperty();
	void setProperty(java.util.List<fhir.DeviceDefinitionProperty> property);

	@Description("An organization that is responsible for the provision and ongoing maintenance of the device.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getOwner();
	void setOwner(com.braintribe.model.generic.GenericEntity owner);
	@Description("Contact details for an organization or a particular human that is responsible for the device.")
	
	java.util.List<fhir.ContactPoint> getContact();
	void setContact(java.util.List<fhir.ContactPoint> contact);

	@Description("Descriptive information, usage information or implantation information that is not captured in an existing element.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("The quantity of the device present in the packaging (e.g. the number of devices present in a pack, or the number of devices in the same package of the medicinal product).")
	@Mandatory
	fhir.Quantity getQuantity();
	void setQuantity(fhir.Quantity quantity);
	@Description("The parent device it can be part of.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getParentDevice();
	void setParentDevice(com.braintribe.model.generic.GenericEntity parentDevice);
	@Description("A substance used to create the material(s) of which the device is made.")
	
	java.util.List<fhir.DeviceDefinitionMaterial> getMaterial();
	void setMaterial(java.util.List<fhir.DeviceDefinitionMaterial> material);

}
