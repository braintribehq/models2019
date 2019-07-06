/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ResearchSubject of the Data Model fhir.
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
{@link period}, 
{@link study}, 
{@link individual}, 
{@link consent}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getPeriod},
{@link getStudy},
{@link getIndividual},
{@link getConsent},
{@link setIdentifier},
{@link setPeriod},
{@link setStudy},
{@link setIndividual},
{@link setConsent},
 */

@Description("A physical entity which is the primary unit of operational and/or administrative interest in a study.If the element is present, it must have either a @value, an @id, or extensions")

public interface ResearchSubject extends GenericEntity, fhir.FhirDomainResource {

	EntityType<ResearchSubject> T = EntityTypes.T(ResearchSubject.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String period = "period";
	java.lang.String study = "study";
	java.lang.String individual = "individual";
	java.lang.String consent = "consent";

	@Description("Identifiers assigned to this research subject for a study.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The dates the subject began and ended their participation in the study.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("Reference to the study the subject is participating in.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getStudy();
	void setStudy(com.braintribe.model.generic.GenericEntity study);
	@Description("The record of the person or animal who is involved in the study.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getIndividual();
	void setIndividual(com.braintribe.model.generic.GenericEntity individual);
	@Description("A record of the patient's informed agreement to participate in the study.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getConsent();
	void setConsent(com.braintribe.model.generic.GenericEntity consent);
}
