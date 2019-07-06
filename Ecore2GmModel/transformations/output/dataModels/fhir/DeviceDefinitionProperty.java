/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type DeviceDefinitionProperty of the Data Model fhir.
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
{@link type}, 
{@link valueQuantity}, 
{@link valueCode}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getValueQuantity},
{@link getValueCode},
{@link setType},
{@link setValueQuantity},
{@link setValueCode},
 */

@Description("The characteristics, operational status and capabilities of a medical-related component of a medical device.")

public interface DeviceDefinitionProperty extends GenericEntity, fhir.BackboneElement {

	EntityType<DeviceDefinitionProperty> T = EntityTypes.T(DeviceDefinitionProperty.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String valueQuantity = "valueQuantity";
	java.lang.String valueCode = "valueCode";

	@Description("Code that specifies the property DeviceDefinitionPropetyCode (Extensible).")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Property value as a quantity.")
	
	java.util.List<fhir.Quantity> getValueQuantity();
	void setValueQuantity(java.util.List<fhir.Quantity> valueQuantity);

	@Description("Property value as a code, e.g., NTP4 (synced to NTP).")
	
	java.util.List<fhir.CodeableConcept> getValueCode();
	void setValueCode(java.util.List<fhir.CodeableConcept> valueCode);

}
