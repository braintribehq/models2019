/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EncounterClassHistory of the Data Model fhir.
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
{@link class_}, 
{@link period}, 

* It provides of then following operations (getters and setters)
{@link getClass_},
{@link getPeriod},
{@link setClass_},
{@link setPeriod},
 */

@Description("An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.")

public interface EncounterClassHistory extends GenericEntity, fhir.BackboneElement {

	EntityType<EncounterClassHistory> T = EntityTypes.T(EncounterClassHistory.class);

	/* Constants for each property name. */
	java.lang.String class_ = "class_";
	java.lang.String period = "period";

	@Description("inpatient | outpatient | ambulatory | emergency +.")
	@Mandatory
	fhir.Coding getClass_();
	void setClass_(fhir.Coding class_);
	@Description("The time that the episode was in the specified class.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
}
