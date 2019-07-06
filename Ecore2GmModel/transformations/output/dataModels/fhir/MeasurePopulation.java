/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MeasurePopulation of the Data Model fhir.
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
{@link criteria}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getCriteria},
{@link setCode},
{@link setCriteria},
 */

@Description("The Measure resource provides the definition of a quality measure.")

public interface MeasurePopulation extends GenericEntity, fhir.BackboneElement {

	EntityType<MeasurePopulation> T = EntityTypes.T(MeasurePopulation.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String criteria = "criteria";

	@Description("The type of population criteria.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("An expression that specifies the criteria for the population, typically the name of an expression in a library.")
	@Mandatory
	fhir.Expression getCriteria();
	void setCriteria(fhir.Expression criteria);
}
