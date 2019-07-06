/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceReferenceInformationGeneElement of the Data Model fhir.
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
{@link element}, 
{@link source}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getElement},
{@link getSource},
{@link setType},
{@link setElement},
{@link setSource},
 */

@Description("Todo.")

public interface SubstanceReferenceInformationGeneElement extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceReferenceInformationGeneElement> T = EntityTypes.T(SubstanceReferenceInformationGeneElement.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String element = "element";
	java.lang.String source = "source";

	@Description("Todo.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Todo.")
	@Mandatory
	fhir.Identifier getElement();
	void setElement(fhir.Identifier element);
	@Description("Todo.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSource();
	void setSource(java.util.List<com.braintribe.model.generic.GenericEntity> source);

}
