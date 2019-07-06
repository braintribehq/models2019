/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type AccountGuarantor of the Data Model fhir.
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
{@link party}, 
{@link period}, 

* It provides of then following operations (getters and setters)
{@link getParty},
{@link getPeriod},
{@link setParty},
{@link setPeriod},
 */

@Description("A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.")

public interface AccountGuarantor extends GenericEntity, fhir.BackboneElement {

	EntityType<AccountGuarantor> T = EntityTypes.T(AccountGuarantor.class);

	/* Constants for each property name. */
	java.lang.String party = "party";
	java.lang.String period = "period";

	@Description("The entity who is responsible.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getParty();
	void setParty(com.braintribe.model.generic.GenericEntity party);
	@Description("The timeframe during which the guarantor accepts responsibility for the account.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
}
