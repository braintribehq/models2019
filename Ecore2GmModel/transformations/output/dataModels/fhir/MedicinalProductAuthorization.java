/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductAuthorization of the Data Model fhir.
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
{@link subject}, 
{@link country}, 
{@link jurisdiction}, 
{@link status}, 
{@link validityPeriod}, 
{@link dataExclusivityPeriod}, 
{@link legalBasis}, 
{@link jurisdictionalAuthorization}, 
{@link holder}, 
{@link regulator}, 
{@link procedure}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getSubject},
{@link getCountry},
{@link getJurisdiction},
{@link getStatus},
{@link getValidityPeriod},
{@link getDataExclusivityPeriod},
{@link getLegalBasis},
{@link getJurisdictionalAuthorization},
{@link getHolder},
{@link getRegulator},
{@link getProcedure},
{@link setIdentifier},
{@link setSubject},
{@link setCountry},
{@link setJurisdiction},
{@link setStatus},
{@link setValidityPeriod},
{@link setDataExclusivityPeriod},
{@link setLegalBasis},
{@link setJurisdictionalAuthorization},
{@link setHolder},
{@link setRegulator},
{@link setProcedure},
 */

@Description("The regulatory authorization of a medicinal product.If the element is present, it must have either a @value, an @id, or extensions")

public interface MedicinalProductAuthorization extends GenericEntity, fhir.FhirDomainResource {

	EntityType<MedicinalProductAuthorization> T = EntityTypes.T(MedicinalProductAuthorization.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String subject = "subject";
	java.lang.String country = "country";
	java.lang.String jurisdiction = "jurisdiction";
	java.lang.String status = "status";
	java.lang.String validityPeriod = "validityPeriod";
	java.lang.String dataExclusivityPeriod = "dataExclusivityPeriod";
	java.lang.String legalBasis = "legalBasis";
	java.lang.String jurisdictionalAuthorization = "jurisdictionalAuthorization";
	java.lang.String holder = "holder";
	java.lang.String regulator = "regulator";
	java.lang.String procedure = "procedure";

	@Description("Business identifier for the marketing authorization, as assigned by a regulator.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The medicinal product that is being authorized.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The country in which the marketing authorization has been granted.")
	
	java.util.List<fhir.CodeableConcept> getCountry();
	void setCountry(java.util.List<fhir.CodeableConcept> country);

	@Description("Jurisdiction within a country.")
	
	java.util.List<fhir.CodeableConcept> getJurisdiction();
	void setJurisdiction(java.util.List<fhir.CodeableConcept> jurisdiction);

	@Description("The status of the marketing authorization.")
	@Mandatory
	fhir.CodeableConcept getStatus();
	void setStatus(fhir.CodeableConcept status);
	@Description("The beginning of the time period in which the marketing authorization is in the specific status shall be specified A complete date consisting of day, month and year shall be specified using the ISO 8601 date format.")
	@Mandatory
	fhir.Period getValidityPeriod();
	void setValidityPeriod(fhir.Period validityPeriod);
	@Description("A period of time after authorization before generic product applicatiosn can be submitted.")
	@Mandatory
	fhir.Period getDataExclusivityPeriod();
	void setDataExclusivityPeriod(fhir.Period dataExclusivityPeriod);
	@Description("The legal framework against which this authorization is granted.")
	@Mandatory
	fhir.CodeableConcept getLegalBasis();
	void setLegalBasis(fhir.CodeableConcept legalBasis);
	@Description("Authorization in areas within a country.")
	
	java.util.List<fhir.MedicinalProductAuthorizationJurisdictionalAuthorization> getJurisdictionalAuthorization();
	void setJurisdictionalAuthorization(java.util.List<fhir.MedicinalProductAuthorizationJurisdictionalAuthorization> jurisdictionalAuthorization);

	@Description("Marketing Authorization Holder.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getHolder();
	void setHolder(com.braintribe.model.generic.GenericEntity holder);
	@Description("Medicines Regulatory Agency.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRegulator();
	void setRegulator(com.braintribe.model.generic.GenericEntity regulator);
	@Description("The regulatory procedure for granting or amending a marketing authorization.")
	@Mandatory
	fhir.MedicinalProductAuthorizationProcedure getProcedure();
	void setProcedure(fhir.MedicinalProductAuthorizationProcedure procedure);
}
