/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CoverageException of the Data Model fhir.
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
{@link period}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getPeriod},
{@link setType},
{@link setPeriod},
 */

@Description("Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.")

public interface CoverageException extends GenericEntity, fhir.BackboneElement {

	EntityType<CoverageException> T = EntityTypes.T(CoverageException.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String period = "period";

	@Description("The code for the specific exception.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The timeframe during when the exception is in force.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
}
