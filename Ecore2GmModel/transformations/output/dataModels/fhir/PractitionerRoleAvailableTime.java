/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type PractitionerRoleAvailableTime of the Data Model fhir.
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

* It provides of then following operations (getters and setters)
 */

@Description("A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time.")

public interface PractitionerRoleAvailableTime extends GenericEntity, fhir.BackboneElement {

	EntityType<PractitionerRoleAvailableTime> T = EntityTypes.T(PractitionerRoleAvailableTime.class);

	/* Constants for each property name. */

}
