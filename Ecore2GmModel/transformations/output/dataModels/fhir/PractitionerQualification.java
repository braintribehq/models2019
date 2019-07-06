/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type PractitionerQualification of the Data Model fhir.
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
{@link code}, 
{@link period}, 
{@link issuer}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getCode},
{@link getPeriod},
{@link getIssuer},
{@link setIdentifier},
{@link setCode},
{@link setPeriod},
{@link setIssuer},
 */

@Description("A person who is directly or indirectly involved in the provisioning of healthcare.")

public interface PractitionerQualification extends GenericEntity, fhir.BackboneElement {

	EntityType<PractitionerQualification> T = EntityTypes.T(PractitionerQualification.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String code = "code";
	java.lang.String period = "period";
	java.lang.String issuer = "issuer";

	@Description("An identifier that applies to this person's qualification in this role.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Coded representation of the qualification.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("Period during which the qualification is valid.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("Organization that regulates and issues the qualification.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getIssuer();
	void setIssuer(com.braintribe.model.generic.GenericEntity issuer);
}
