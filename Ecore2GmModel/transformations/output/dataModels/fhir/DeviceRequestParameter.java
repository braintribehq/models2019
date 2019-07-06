/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type DeviceRequestParameter of the Data Model fhir.
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
{@link code}, 
{@link valueCodeableConcept}, 
{@link valueQuantity}, 
{@link valueRange}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getValueCodeableConcept},
{@link getValueQuantity},
{@link getValueRange},
{@link setCode},
{@link setValueCodeableConcept},
{@link setValueQuantity},
{@link setValueRange},
 */

@Description("Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.")

public interface DeviceRequestParameter extends GenericEntity, fhir.BackboneElement {

	EntityType<DeviceRequestParameter> T = EntityTypes.T(DeviceRequestParameter.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String valueCodeableConcept = "valueCodeableConcept";
	java.lang.String valueQuantity = "valueQuantity";
	java.lang.String valueRange = "valueRange";

	@Description("A code or string that identifies the device detail being asserted.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getValueCodeableConcept();
	void setValueCodeableConcept(fhir.CodeableConcept valueCodeableConcept);
	@Description("")
	@Mandatory
	fhir.Quantity getValueQuantity();
	void setValueQuantity(fhir.Quantity valueQuantity);
	@Description("")
	@Mandatory
	fhir.Range getValueRange();
	void setValueRange(fhir.Range valueRange);
}
