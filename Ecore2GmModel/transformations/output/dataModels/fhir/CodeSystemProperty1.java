/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CodeSystemProperty1 of the Data Model fhir.
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
{@link valueCoding}, 

* It provides of then following operations (getters and setters)
{@link getValueCoding},
{@link setValueCoding},
 */

@Description("The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.")

public interface CodeSystemProperty1 extends GenericEntity, fhir.BackboneElement {

	EntityType<CodeSystemProperty1> T = EntityTypes.T(CodeSystemProperty1.class);

	/* Constants for each property name. */
	java.lang.String valueCoding = "valueCoding";

	@Description("")
	@Mandatory
	fhir.Coding getValueCoding();
	void setValueCoding(fhir.Coding valueCoding);
}
