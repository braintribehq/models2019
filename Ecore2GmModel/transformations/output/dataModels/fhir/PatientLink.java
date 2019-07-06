/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type PatientLink of the Data Model fhir.
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
{@link other}, 

* It provides of then following operations (getters and setters)
{@link getOther},
{@link setOther},
 */

@Description("Demographics and other administrative information about an individual or animal receiving care or other health-related services.")

public interface PatientLink extends GenericEntity, fhir.BackboneElement {

	EntityType<PatientLink> T = EntityTypes.T(PatientLink.class);

	/* Constants for each property name. */
	java.lang.String other = "other";

	@Description("The other patient resource that the link refers to.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getOther();
	void setOther(com.braintribe.model.generic.GenericEntity other);
}
