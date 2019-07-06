/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type RiskEvidenceSynthesisCertaintySubcomponent of the Data Model fhir.
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
{@link rating}, 
{@link note}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getRating},
{@link getNote},
{@link setType},
{@link setRating},
{@link setNote},
 */

@Description("The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.")

public interface RiskEvidenceSynthesisCertaintySubcomponent extends GenericEntity, fhir.BackboneElement {

	EntityType<RiskEvidenceSynthesisCertaintySubcomponent> T = EntityTypes.T(RiskEvidenceSynthesisCertaintySubcomponent.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String rating = "rating";
	java.lang.String note = "note";

	@Description("Type of subcomponent of certainty rating.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("A rating of a subcomponent of rating certainty.")
	
	java.util.List<fhir.CodeableConcept> getRating();
	void setRating(java.util.List<fhir.CodeableConcept> rating);

	@Description("A human-readable string to clarify or explain concepts about the resource.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

}
