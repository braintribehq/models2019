/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ImmunizationRecommendationDateCriterion of the Data Model fhir.
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

* It provides of then following operations (getters and setters)
{@link getCode},
{@link setCode},
 */

@Description("A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification.")

public interface ImmunizationRecommendationDateCriterion extends GenericEntity, fhir.BackboneElement {

	EntityType<ImmunizationRecommendationDateCriterion> T = EntityTypes.T(ImmunizationRecommendationDateCriterion.class);

	/* Constants for each property name. */
	java.lang.String code = "code";

	@Description("Date classification of recommendation.  For example, earliest date to give, latest date to give, etc.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
}
