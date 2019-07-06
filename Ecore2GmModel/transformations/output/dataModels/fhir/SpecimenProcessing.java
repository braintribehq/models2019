/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SpecimenProcessing of the Data Model fhir.
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

@Description("A sample to be used for analysis.")

public interface SpecimenProcessing extends GenericEntity, fhir.BackboneElement {

	EntityType<SpecimenProcessing> T = EntityTypes.T(SpecimenProcessing.class);

	/* Constants for each property name. */
	java.lang.String procedure = "procedure";
	java.lang.String additive = "additive";
	java.lang.String timePeriod = "timePeriod";

	@Description("A coded value specifying the procedure used to process the specimen.")
	@Mandatory
	fhir.CodeableConcept getProcedure();
	void setProcedure(fhir.CodeableConcept procedure);
	@Description("Material used in the processing step.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getAdditive();
	void setAdditive(java.util.List<com.braintribe.model.generic.GenericEntity> additive);

	@Description("")
	@Mandatory
	fhir.Period getTimePeriod();
	void setTimePeriod(fhir.Period timePeriod);
}
