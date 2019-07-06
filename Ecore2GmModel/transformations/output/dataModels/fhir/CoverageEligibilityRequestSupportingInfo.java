/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CoverageEligibilityRequestSupportingInfo of the Data Model fhir.
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
{@link information}, 

* It provides of then following operations (getters and setters)
{@link getInformation},
{@link setInformation},
 */

@Description("The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.")

public interface CoverageEligibilityRequestSupportingInfo extends GenericEntity, fhir.BackboneElement {

	EntityType<CoverageEligibilityRequestSupportingInfo> T = EntityTypes.T(CoverageEligibilityRequestSupportingInfo.class);

	/* Constants for each property name. */
	java.lang.String information = "information";

	@Description("Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getInformation();
	void setInformation(com.braintribe.model.generic.GenericEntity information);
}
