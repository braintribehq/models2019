/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EffectEvidenceSynthesisCertainty of the Data Model fhir.
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
{@link rating}, 
{@link note}, 
{@link certaintySubcomponent}, 

* It provides of then following operations (getters and setters)
{@link getRating},
{@link getNote},
{@link getCertaintySubcomponent},
{@link setRating},
{@link setNote},
{@link setCertaintySubcomponent},
 */

@Description("The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a population where the effect estimate is derived from a combination of research studies.")

public interface EffectEvidenceSynthesisCertainty extends GenericEntity, fhir.BackboneElement {

	EntityType<EffectEvidenceSynthesisCertainty> T = EntityTypes.T(EffectEvidenceSynthesisCertainty.class);

	/* Constants for each property name. */
	java.lang.String rating = "rating";
	java.lang.String note = "note";
	java.lang.String certaintySubcomponent = "certaintySubcomponent";

	@Description("A rating of the certainty of the effect estimate.")
	
	java.util.List<fhir.CodeableConcept> getRating();
	void setRating(java.util.List<fhir.CodeableConcept> rating);

	@Description("A human-readable string to clarify or explain concepts about the resource.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("A description of a component of the overall certainty.")
	
	java.util.List<fhir.EffectEvidenceSynthesisCertaintySubcomponent> getCertaintySubcomponent();
	void setCertaintySubcomponent(java.util.List<fhir.EffectEvidenceSynthesisCertaintySubcomponent> certaintySubcomponent);

}
