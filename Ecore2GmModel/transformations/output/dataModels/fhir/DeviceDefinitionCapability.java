/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type DeviceDefinitionCapability of the Data Model fhir.
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
{@link description}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getDescription},
{@link setType},
{@link setDescription},
 */

@Description("The characteristics, operational status and capabilities of a medical-related component of a medical device.")

public interface DeviceDefinitionCapability extends GenericEntity, fhir.BackboneElement {

	EntityType<DeviceDefinitionCapability> T = EntityTypes.T(DeviceDefinitionCapability.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String description = "description";

	@Description("Type of capability.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Description of capability.")
	
	java.util.List<fhir.CodeableConcept> getDescription();
	void setDescription(java.util.List<fhir.CodeableConcept> description);

}
