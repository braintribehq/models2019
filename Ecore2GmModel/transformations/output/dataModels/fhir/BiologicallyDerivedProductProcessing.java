/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type BiologicallyDerivedProductProcessing of the Data Model fhir.
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
{@link procedure}, 
{@link additive}, 
{@link timePeriod}, 

* It provides of then following operations (getters and setters)
{@link getProcedure},
{@link getAdditive},
{@link getTimePeriod},
{@link setProcedure},
{@link setAdditive},
{@link setTimePeriod},
 */

@Description("A material substance originating from a biological entity intended to be transplanted or infusedinto another (possibly the same) biological entity.")

public interface BiologicallyDerivedProductProcessing extends GenericEntity, fhir.BackboneElement {

	EntityType<BiologicallyDerivedProductProcessing> T = EntityTypes.T(BiologicallyDerivedProductProcessing.class);

	/* Constants for each property name. */
	java.lang.String procedure = "procedure";
	java.lang.String additive = "additive";
	java.lang.String timePeriod = "timePeriod";

	@Description("Procesing code.")
	@Mandatory
	fhir.CodeableConcept getProcedure();
	void setProcedure(fhir.CodeableConcept procedure);
	@Description("Substance added during processing.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAdditive();
	void setAdditive(com.braintribe.model.generic.GenericEntity additive);
	@Description("")
	@Mandatory
	fhir.Period getTimePeriod();
	void setTimePeriod(fhir.Period timePeriod);
}
