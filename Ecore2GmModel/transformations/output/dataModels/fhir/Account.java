/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Account of the Data Model fhir.
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
{@link type}, 
{@link subject}, 
{@link servicePeriod}, 
{@link coverage}, 
{@link owner}, 
{@link guarantor}, 
{@link partOf}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getType},
{@link getSubject},
{@link getServicePeriod},
{@link getCoverage},
{@link getOwner},
{@link getGuarantor},
{@link getPartOf},
{@link setIdentifier},
{@link setType},
{@link setSubject},
{@link setServicePeriod},
{@link setCoverage},
{@link setOwner},
{@link setGuarantor},
{@link setPartOf},
 */

@Description("A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.If the element is present, it must have either a @value, an @id, or extensions")

public interface Account extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Account> T = EntityTypes.T(Account.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String type = "type";
	java.lang.String subject = "subject";
	java.lang.String servicePeriod = "servicePeriod";
	java.lang.String coverage = "coverage";
	java.lang.String owner = "owner";
	java.lang.String guarantor = "guarantor";
	java.lang.String partOf = "partOf";

	@Description("Unique identifier used to reference the account.  Might or might not be intended for human use (e.g. credit card number).")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Categorizes the account for reporting and searching purposes.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Identifies the entity which incurs the expenses. While the immediate recipients of services or goods might be entities related to the subject, the expenses were ultimately incurred by the subject of the Account.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSubject();
	void setSubject(java.util.List<com.braintribe.model.generic.GenericEntity> subject);

	@Description("The date range of services associated with this account.")
	@Mandatory
	fhir.Period getServicePeriod();
	void setServicePeriod(fhir.Period servicePeriod);
	@Description("The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account.")
	
	java.util.List<fhir.AccountCoverage> getCoverage();
	void setCoverage(java.util.List<fhir.AccountCoverage> coverage);

	@Description("Indicates the service area, hospital, department, etc. with responsibility for managing the Account.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getOwner();
	void setOwner(com.braintribe.model.generic.GenericEntity owner);
	@Description("The parties responsible for balancing the account if other payment options fall short.")
	
	java.util.List<fhir.AccountGuarantor> getGuarantor();
	void setGuarantor(java.util.List<fhir.AccountGuarantor> guarantor);

	@Description("Reference to a parent Account.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPartOf();
	void setPartOf(com.braintribe.model.generic.GenericEntity partOf);
}
