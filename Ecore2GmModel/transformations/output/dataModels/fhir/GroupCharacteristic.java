/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type GroupCharacteristic of the Data Model fhir.
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
{@link period}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getValueCodeableConcept},
{@link getValueQuantity},
{@link getValueRange},
{@link getValueReference},
{@link getPeriod},
{@link setCode},
{@link setValueCodeableConcept},
{@link setValueQuantity},
{@link setValueRange},
{@link setValueReference},
{@link setPeriod},
 */

@Description("Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.")

public interface GroupCharacteristic extends GenericEntity, fhir.BackboneElement {

	EntityType<GroupCharacteristic> T = EntityTypes.T(GroupCharacteristic.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String valueCodeableConcept = "valueCodeableConcept";
	java.lang.String valueQuantity = "valueQuantity";
	java.lang.String valueRange = "valueRange";
	java.lang.String valueReference = "valueReference";
	java.lang.String period = "period";

	@Description("A code that identifies the kind of trait being asserted.")
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
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getValueReference();
	void setValueReference(com.braintribe.model.generic.GenericEntity valueReference);
	@Description("The period over which the characteristic is tested; e.g. the patient had an operation during the month of June.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
}
