/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type UsageContext of the Data Model fhir.
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
{@link valueReference}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getValueCodeableConcept},
{@link getValueQuantity},
{@link getValueRange},
{@link getValueReference},
{@link setCode},
{@link setValueCodeableConcept},
{@link setValueQuantity},
{@link setValueRange},
{@link setValueReference},
 */

@Description("Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions")

public interface UsageContext extends GenericEntity {

	EntityType<UsageContext> T = EntityTypes.T(UsageContext.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String valueCodeableConcept = "valueCodeableConcept";
	java.lang.String valueQuantity = "valueQuantity";
	java.lang.String valueRange = "valueRange";
	java.lang.String valueReference = "valueReference";

	@Description("A code that identifies the type of context being specified by this usage context.")
	@Mandatory
	fhir.Coding getCode();
	void setCode(fhir.Coding code);
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
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getValueReference();
	void setValueReference(com.braintribe.model.generic.GenericEntity valueReference);
}
