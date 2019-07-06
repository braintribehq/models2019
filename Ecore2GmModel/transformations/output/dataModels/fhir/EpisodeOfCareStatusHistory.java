/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EpisodeOfCareStatusHistory of the Data Model fhir.
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
{@link period}, 

* It provides of then following operations (getters and setters)
{@link getPeriod},
{@link setPeriod},
 */

@Description("An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.")

public interface EpisodeOfCareStatusHistory extends GenericEntity, fhir.BackboneElement {

	EntityType<EpisodeOfCareStatusHistory> T = EntityTypes.T(EpisodeOfCareStatusHistory.class);

	/* Constants for each property name. */
	java.lang.String period = "period";

	@Description("The period during this EpisodeOfCare that the specific status applied.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
}
