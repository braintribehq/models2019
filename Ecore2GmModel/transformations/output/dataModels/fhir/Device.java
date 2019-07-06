/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Device of the Data Model fhir.
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
{@link definition}, 
{@link udiCarrier}, 
{@link statusReason}, 
{@link deviceName}, 
{@link type}, 
{@link specialization}, 
{@link version}, 
{@link property}, 
{@link patient}, 
{@link owner}, 
{@link contact}, 
{@link location}, 
{@link note}, 
{@link safety}, 
{@link parent}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getDefinition},
{@link getUdiCarrier},
{@link getStatusReason},
{@link getDeviceName},
{@link getType},
{@link getSpecialization},
{@link getVersion},
{@link getProperty},
{@link getPatient},
{@link getOwner},
{@link getContact},
{@link getLocation},
{@link getNote},
{@link getSafety},
{@link getParent},
{@link setIdentifier},
{@link setDefinition},
{@link setUdiCarrier},
{@link setStatusReason},
{@link setDeviceName},
{@link setType},
{@link setSpecialization},
{@link setVersion},
{@link setProperty},
{@link setPatient},
{@link setOwner},
{@link setContact},
{@link setLocation},
{@link setNote},
{@link setSafety},
{@link setParent},
 */

@Description("A type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.If the element is present, it must have either a @value, an @id, or extensions")

public interface Device extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Device> T = EntityTypes.T(Device.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String definition = "definition";
	java.lang.String udiCarrier = "udiCarrier";
	java.lang.String statusReason = "statusReason";
	java.lang.String deviceName = "deviceName";
	java.lang.String type = "type";
	java.lang.String specialization = "specialization";
	java.lang.String version = "version";
	java.lang.String property = "property";
	java.lang.String patient = "patient";
	java.lang.String owner = "owner";
	java.lang.String contact = "contact";
	java.lang.String location = "location";
	java.lang.String note = "note";
	java.lang.String safety = "safety";
	java.lang.String parent = "parent";

	@Description("Unique instance identifiers assigned to a device by manufacturers other organizations or owners.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The reference to the definition for the device.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getDefinition();
	void setDefinition(com.braintribe.model.generic.GenericEntity definition);
	@Description("Unique device identifier (UDI) assigned to device label or package.  Note that the Device may include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have been sold.")
	
	java.util.List<fhir.DeviceUdiCarrier> getUdiCarrier();
	void setUdiCarrier(java.util.List<fhir.DeviceUdiCarrier> udiCarrier);

	@Description("Reason for the dtatus of the Device availability.")
	
	java.util.List<fhir.CodeableConcept> getStatusReason();
	void setStatusReason(java.util.List<fhir.CodeableConcept> statusReason);

	@Description("This represents the manufacturer's name of the device as provided by the device, from a UDI label, or by a person describing the Device.  This typically would be used when a person provides the name(s) or when the device represents one of the names available from DeviceDefinition.")
	
	java.util.List<fhir.DeviceDeviceName> getDeviceName();
	void setDeviceName(java.util.List<fhir.DeviceDeviceName> deviceName);

	@Description("The kind or type of device.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The capabilities supported on a  device, the standards to which the device conforms for a particular purpose, and used for the communication.")
	
	java.util.List<fhir.DeviceSpecialization> getSpecialization();
	void setSpecialization(java.util.List<fhir.DeviceSpecialization> specialization);

	@Description("The actual design of the device or software version running on the device.")
	
	java.util.List<fhir.DeviceVersion> getVersion();
	void setVersion(java.util.List<fhir.DeviceVersion> version);

	@Description("The actual configuration settings of a device as it actually operates, e.g., regulation status, time properties.")
	
	java.util.List<fhir.DeviceProperty> getProperty();
	void setProperty(java.util.List<fhir.DeviceProperty> property);

	@Description("Patient information, If the device is affixed to a person.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPatient();
	void setPatient(com.braintribe.model.generic.GenericEntity patient);
	@Description("An organization that is responsible for the provision and ongoing maintenance of the device.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getOwner();
	void setOwner(com.braintribe.model.generic.GenericEntity owner);
	@Description("Contact details for an organization or a particular human that is responsible for the device.")
	
	java.util.List<fhir.ContactPoint> getContact();
	void setContact(java.util.List<fhir.ContactPoint> contact);

	@Description("The place where the device can be found.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getLocation();
	void setLocation(com.braintribe.model.generic.GenericEntity location);
	@Description("Descriptive information, usage information or implantation information that is not captured in an existing element.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("Provides additional safety characteristics about a medical device.  For example devices containing latex.")
	
	java.util.List<fhir.CodeableConcept> getSafety();
	void setSafety(java.util.List<fhir.CodeableConcept> safety);

	@Description("The parent device.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getParent();
	void setParent(com.braintribe.model.generic.GenericEntity parent);
}
