/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MarketingStatus of the Data Model fhir.
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
{@link country}, 
{@link jurisdiction}, 
{@link status}, 
{@link dateRange}, 

* It provides of then following operations (getters and setters)
{@link getCountry},
{@link getJurisdiction},
{@link getStatus},
{@link getDateRange},
{@link setCountry},
{@link setJurisdiction},
{@link setStatus},
{@link setDateRange},
 */

@Description("The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions")

public interface MarketingStatus extends GenericEntity, fhir.BackboneElement {

	EntityType<MarketingStatus> T = EntityTypes.T(MarketingStatus.class);

	/* Constants for each property name. */
	java.lang.String country = "country";
	java.lang.String jurisdiction = "jurisdiction";
	java.lang.String status = "status";
	java.lang.String dateRange = "dateRange";

	@Description("The country in which the marketing authorisation has been granted shall be specified It should be specified using the ISO 3166 ? 1 alpha-2 code elements.")
	@Mandatory
	fhir.CodeableConcept getCountry();
	void setCountry(fhir.CodeableConcept country);
	@Description("Where a Medicines Regulatory Agency has granted a marketing authorisation for which specific provisions within a jurisdiction apply, the jurisdiction can be specified using an appropriate controlled terminology The controlled term and the controlled term identifier shall be specified.")
	@Mandatory
	fhir.CodeableConcept getJurisdiction();
	void setJurisdiction(fhir.CodeableConcept jurisdiction);
	@Description("This attribute provides information on the status of the marketing of the medicinal product See ISO/TS 20443 for more information and examples.")
	@Mandatory
	fhir.CodeableConcept getStatus();
	void setStatus(fhir.CodeableConcept status);
	@Description("The date when the Medicinal Product is placed on the market by the Marketing Authorisation Holder (or where applicable, the manufacturer/distributor) in a country and/or jurisdiction shall be provided A complete date consisting of day, month and year shall be specified using the ISO 8601 date format NOTE ?Placed on the market? refers to the release of the Medicinal Product into the distribution chain.")
	@Mandatory
	fhir.Period getDateRange();
	void setDateRange(fhir.Period dateRange);
}
