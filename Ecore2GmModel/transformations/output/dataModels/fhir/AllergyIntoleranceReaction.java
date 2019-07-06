/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type AllergyIntoleranceReaction of the Data Model fhir.
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
{@link substance}, 
{@link manifestation}, 
{@link exposureRoute}, 
{@link note}, 

* It provides of then following operations (getters and setters)
{@link getSubstance},
{@link getManifestation},
{@link getExposureRoute},
{@link getNote},
{@link setSubstance},
{@link setManifestation},
{@link setExposureRoute},
{@link setNote},
 */

@Description("Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.")

public interface AllergyIntoleranceReaction extends GenericEntity, fhir.BackboneElement {

	EntityType<AllergyIntoleranceReaction> T = EntityTypes.T(AllergyIntoleranceReaction.class);

	/* Constants for each property name. */
	java.lang.String substance = "substance";
	java.lang.String manifestation = "manifestation";
	java.lang.String exposureRoute = "exposureRoute";
	java.lang.String note = "note";

	@Description("Identification of the specific substance (or pharmaceutical product) considered to be responsible for the Adverse Reaction event. Note: the substance for a specific reaction may be different from the substance identified as the cause of the risk, but it must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite product that includes the identified substance. It must be clinically safe to only process the 'code' and ignore the 'reaction.substance'.  If a receiving system is unable to confirm that AllergyIntolerance.reaction.substance falls within the semantic scope of AllergyIntolerance.code, then the receiving system should ignore AllergyIntolerance.reaction.substance.")
	@Mandatory
	fhir.CodeableConcept getSubstance();
	void setSubstance(fhir.CodeableConcept substance);
	@Description("Clinical symptoms and/or signs that are observed or associated with the adverse reaction event.")
	
	java.util.List<fhir.CodeableConcept> getManifestation();
	void setManifestation(java.util.List<fhir.CodeableConcept> manifestation);

	@Description("Identification of the route by which the subject was exposed to the substance.")
	@Mandatory
	fhir.CodeableConcept getExposureRoute();
	void setExposureRoute(fhir.CodeableConcept exposureRoute);
	@Description("Additional text about the adverse reaction event not captured in other fields.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

}
