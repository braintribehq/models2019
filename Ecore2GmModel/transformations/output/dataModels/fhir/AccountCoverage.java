/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type AccountCoverage of the Data Model fhir.
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
{@link coverage}, 

* It provides of then following operations (getters and setters)
{@link getCoverage},
{@link setCoverage},
 */

@Description("A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.")

public interface AccountCoverage extends GenericEntity, fhir.BackboneElement {

	EntityType<AccountCoverage> T = EntityTypes.T(AccountCoverage.class);

	/* Constants for each property name. */
	java.lang.String coverage = "coverage";

	@Description("The party(s) that contribute to payment (or part of) of the charges applied to this account (including self-pay).A coverage may only be responsible for specific types of charges, and the sequence of the coverages in the account could be important when processing billing.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getCoverage();
	void setCoverage(com.braintribe.model.generic.GenericEntity coverage);
}
