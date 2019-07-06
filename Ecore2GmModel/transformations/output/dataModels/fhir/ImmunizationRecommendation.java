/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ImmunizationRecommendation of the Data Model fhir.
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
{@link identifier}, 
{@link patient}, 
{@link authority}, 
{@link recommendation}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getPatient},
{@link getAuthority},
{@link getRecommendation},
{@link setIdentifier},
{@link setPatient},
{@link setAuthority},
{@link setRecommendation},
 */

@Description("A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification.If the element is present, it must have either a @value, an @id, or extensions")

public interface ImmunizationRecommendation extends GenericEntity, fhir.FhirDomainResource {

	EntityType<ImmunizationRecommendation> T = EntityTypes.T(ImmunizationRecommendation.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String patient = "patient";
	java.lang.String authority = "authority";
	java.lang.String recommendation = "recommendation";

	@Description("A unique identifier assigned to this particular recommendation record.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The patient the recommendation(s) are for.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPatient();
	void setPatient(com.braintribe.model.generic.GenericEntity patient);
	@Description("Indicates the authority who published the protocol (e.g. ACIP).")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAuthority();
	void setAuthority(com.braintribe.model.generic.GenericEntity authority);
	@Description("Vaccine administration recommendations.")
	
	java.util.List<fhir.ImmunizationRecommendationRecommendation> getRecommendation();
	void setRecommendation(java.util.List<fhir.ImmunizationRecommendationRecommendation> recommendation);

}
