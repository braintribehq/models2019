/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type AdverseEventCausality of the Data Model fhir.
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
{@link assessment}, 
{@link author}, 
{@link method}, 

* It provides of then following operations (getters and setters)
{@link getAssessment},
{@link getAuthor},
{@link getMethod},
{@link setAssessment},
{@link setAuthor},
{@link setMethod},
 */

@Description("Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death.")

public interface AdverseEventCausality extends GenericEntity, fhir.BackboneElement {

	EntityType<AdverseEventCausality> T = EntityTypes.T(AdverseEventCausality.class);

	/* Constants for each property name. */
	java.lang.String assessment = "assessment";
	java.lang.String author = "author";
	java.lang.String method = "method";

	@Description("Assessment of if the entity caused the event.")
	@Mandatory
	fhir.CodeableConcept getAssessment();
	void setAssessment(fhir.CodeableConcept assessment);
	@Description("AdverseEvent.suspectEntity.causalityAuthor.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAuthor();
	void setAuthor(com.braintribe.model.generic.GenericEntity author);
	@Description("ProbabilityScale | Bayesian | Checklist.")
	@Mandatory
	fhir.CodeableConcept getMethod();
	void setMethod(fhir.CodeableConcept method);
}
